package school.menu
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class StudentProfileController {

    def index() { }
}
