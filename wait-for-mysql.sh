#!/bin/bash

echo "Waiting for MySQL at $DB_HOST:$DB_PORT..."
until mysql -h "$DB_HOST" -P "$DB_PORT" -u "$DB_USER" -p"$DB_PASSWORD" -e "SELECT 1;" &>/dev/null; do
  echo "MySQL is unavailable - sleeping"
  sleep 3
done

echo "MySQL is up - starting Tomcat"
exec catalina.sh run
