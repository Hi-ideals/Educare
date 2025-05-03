pipeline {
    agent any

    triggers {
        githubPush()
    }

    environment {
        DOCKER_IMAGE = "jaicswamy962/educare:latest"
        AWS_HOST = "65.0.251.176"
    }

    stages {
        stage('Checkout Code') {
            steps {
                 checkout([
                     $class: 'GitSCM',
                     branches: [[name: '*/main']],
                     userRemoteConfigs: [[
                         url: 'git@github.com:jaiswamy/Educare.git',
                         credentialsId: 'git-credentials'
                     ]]
                 ])
            }
        }

        stage('Build and Push Docker Image') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-credentials',
                    usernameVariable: 'DOCKERHUB_USERNAME',
                    passwordVariable: 'DOCKERHUB_PASSWORD'
                )]) {
                    sh '''
                    docker-compose build --no-cache
                    echo "$DOCKERHUB_PASSWORD" | docker login -u "$DOCKERHUB_USERNAME" --password-stdin
                    docker push jaicswamy962/educareimage:latest
                    '''
                }
            }
        }

        stage('Deploy to AWS') {
            steps {
                sshagent(['aws-ssh-key']) {
                    sh '''
                    ssh -o StrictHostKeyChecking=no ubuntu@${AWS_HOST} '
                        if [ ! -d ~/Educare ]; then
                            git clone git@github.com:jaiswamy/Educare.git
                        else
                            cd ~/Educare && git pull origin main
                        fi
                        cd ~/Educare
                        docker pull ${DOCKER_IMAGE} && echo "Docker image pulled successfully"
                        docker compose up -d --force-recreate && echo "Docker Compose containers started successfully"
                        docker image prune -f
                    '
                    '''
                }
            }
        }
    }
}
