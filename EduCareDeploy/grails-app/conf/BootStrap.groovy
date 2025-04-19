import com.hiideals.instituite.admin.Admin;
import com.hiideals.instituite.users.SecRole;
import com.hiideals.instituite.users.SecUser;
import com.hiideals.instituite.users.SecUserSecRole;

class BootStrap {

	def init = { servletContext ->
		def superadminRole = SecRole.findByAuthority('ROLE_SUPERADMIN') ?: new SecRole(authority: 'ROLE_SUPERADMIN').save(flush: true,failOnError:true)
		def adminRole = SecRole.findByAuthority('ROLE_ADMIN') ?: new SecRole(authority: 'ROLE_ADMIN').save(flush: true,failOnError:true)
		def studentRole = SecRole.findByAuthority('ROLE_STUDENT') ?: new SecRole(authority: 'ROLE_STUDENT').save(flush: true,failOnError:true)
		def UserRole = SecRole.findByAuthority('ROLE_USERR') ?: new SecRole(authority: 'ROLE_USERR').save(flush: true,failOnError:true)
		
		def user = SecUser.findByUsername('userr') ?:new SecUser(username: 'userr', password: '123123123').save(flush: true)
		if(!user.authorities.contains(UserRole)){
			SecUserSecRole.create(user, UserRole) ;
		}
		
		def studentUser = SecUser.findByUsername('student') ?:new SecUser(username: 'student', password: '123123123').save(flush: true)
		if(!studentUser.authorities.contains(studentRole)){
			SecUserSecRole.create(studentUser, studentRole) ;
		}
		
		Admin admin = Admin.findByAdminName("admin") ?: new Admin(adminName:"admin", password:123123123,adminID:"1").save(flush: true)

		def adminUser = SecUser.findByUsername('admin') ?:new SecUser(username: 'admin', password: '123123123',adminID:admin).save(flush: true)
		if(!adminUser.authorities.contains(adminRole)){
			SecUserSecRole.create(adminUser, adminRole) ;
		}
		if(!adminUser.authorities.contains(studentRole)){
			SecUserSecRole.create( adminUser, studentRole) ;
		}

		def superadminUser = SecUser.findByUsername('superadmin') ?:new SecUser(username: 'Superadmin', password:'5upe6Admin789o',adminID:admin).save(flush: true)
		if(!superadminUser.authorities.contains(superadminRole)){
			SecUserSecRole.create(superadminUser, superadminRole) ;
		}
		if(!superadminUser.authorities.contains(adminRole)){
			SecUserSecRole.create(superadminUser, adminRole) ;
		}
		if(!superadminUser.authorities.contains(studentRole)){
			SecUserSecRole.create(superadminUser, studentRole) ;
		}
	}
	def destroy = {
		
	}
}


