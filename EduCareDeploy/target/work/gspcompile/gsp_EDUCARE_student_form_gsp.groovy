import com.hiideals.instituite.student.ParentDetails
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_student_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
if(true && (studentInstance?.registrationNo !=null)) {
printHtmlPart(2)
invokeTag('textField','g',29,['name':("registrationNo"),'class':("form-control"),'id':("registrationNo"),'required':(""),'value':(studentInstance?.registrationNo)],-1)
printHtmlPart(3)
}
else {
printHtmlPart(2)
invokeTag('getRegId','regId',34,['Inst':(instituite)],-1)
printHtmlPart(4)
}
printHtmlPart(5)
invokeTag('message','g',37,['code':("student.studentId.label"),'default':("Registration Number")],-1)
printHtmlPart(6)
if(true && (studentInstance?.academicyear && studentInstance?.academicyear[0].academicyear !=null)) {
printHtmlPart(7)
expressionOut.print(studentInstance?.academicyear[0]?.academicyear)
printHtmlPart(8)
expressionOut.print(studentInstance?.academicyear[0]?.academicyear)
printHtmlPart(9)
}
else {
printHtmlPart(10)
}
printHtmlPart(2)
for( batch in (batchList) ) {
printHtmlPart(7)
expressionOut.print(batch?.batchName)
printHtmlPart(8)
expressionOut.print(batch?.batchName)
printHtmlPart(9)
}
printHtmlPart(11)
invokeTag('message','g',71,['code':("student.studentId.label"),'default':("Select Batch")],-1)
printHtmlPart(12)
if(true && (params.action=='edit')) {
printHtmlPart(13)
expressionOut.print(remoteFunction(controller:'student',action: 'classSections',
                       update: 'updateSections',
                       params: '\'classId=\' + this.value'))
printHtmlPart(14)
expressionOut.print(remoteFunction(controller:'student',action:'admissionfee', 
	                params: '\'classId=\' + this.value',update:'updatefee'))
printHtmlPart(15)
if(true && (studentInstance?.academicyear?.presentclass !=null)) {
printHtmlPart(7)
expressionOut.print(studentInstance?.academicyear?.presentclass.id.last())
printHtmlPart(8)
expressionOut.print(studentInstance?.academicyear?.presentclass.classname.last())
invokeTag('set','g',91,['var':("classId"),'value':(studentInstance?.academicyear?.presentclass.id.last())],-1)
printHtmlPart(9)
}
else {
printHtmlPart(10)
}
printHtmlPart(2)
for( cls in (IClass.findAllByInstituite(instituite)) ) {
printHtmlPart(7)
expressionOut.print(cls.id)
printHtmlPart(8)
expressionOut.print(cls.classname)
printHtmlPart(9)
}
printHtmlPart(16)
invokeTag('message','g',106,['code':("student.studentId.label"),'default':("Select a Class")],-1)
printHtmlPart(17)
}
else {
printHtmlPart(13)
expressionOut.print(remoteFunction(controller:'student',action: 'classSections',
                       update: 'updateSections',
                       params: '\'classId=\' + this.value'))
printHtmlPart(14)
expressionOut.print(remoteFunction(controller:'student',action:'admissionfee', 
	                params: '\'classId=\' + this.value',update:'updatefee'))
printHtmlPart(15)
if(true && (studentInstance?.academicyear?.presentclass !=null)) {
printHtmlPart(7)
expressionOut.print(studentInstance?.academicyear?.presentclass.id.last())
printHtmlPart(8)
expressionOut.print(studentInstance?.academicyear?.presentclass.classname.last())
invokeTag('set','g',128,['var':("classId"),'value':(studentInstance?.academicyear?.presentclass.id.last())],-1)
printHtmlPart(9)
}
else {
printHtmlPart(10)
}
printHtmlPart(2)
for( cls in (IClass.findAllByInstituite(instituite)) ) {
printHtmlPart(7)
expressionOut.print(cls.id)
printHtmlPart(8)
expressionOut.print(cls.classname)
printHtmlPart(9)
}
printHtmlPart(16)
invokeTag('message','g',142,['code':("student.studentId.label"),'default':("Select a Class")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
invokeTag('render','g',148,['template':("classSections"),'model':([classId:classId,studentInstance:studentInstance])],-1)
printHtmlPart(19)
invokeTag('render','g',155,['template':("admissionfee"),'model':([classId:classId,studentInstance:studentInstance])],-1)
printHtmlPart(20)
invokeTag('textField','g',167,['name':("mediumOfInstruction"),'class':("form-control"),'id':("mediumOfInstruction"),'required':(""),'value':(studentInstance?.mediumOfInstruction)],-1)
printHtmlPart(21)
invokeTag('message','g',169,['code':("student.studentId.label"),'default':("Registration Number")],-1)
printHtmlPart(22)
invokeTag('message','g',184,['code':("student.studentName.label"),'default':("First Name")],-1)
printHtmlPart(23)
invokeTag('textField','g',200,['name':("stsSystem"),'class':("form-control"),'id':("stsSystem"),'value':(studentInstance?.stsSystem)],-1)
printHtmlPart(24)
invokeTag('message','g',210,['code':("student.studentName.label"),'default':("First Name")],-1)
printHtmlPart(25)
invokeTag('render','g',229,['template':("studentIdtemp")],-1)
printHtmlPart(26)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentName', 'error'))
printHtmlPart(27)
invokeTag('textField','g',245,['name':("studentName"),'class':("form-control"),'id':("studentName"),'required':(""),'value':(studentInstance?.studentName)],-1)
printHtmlPart(28)
invokeTag('message','g',246,['code':("student.studentName.label"),'default':("First Name")],-1)
printHtmlPart(29)
expressionOut.print(hasErrors(bean: studentInstance, field: 'lastName', 'error'))
printHtmlPart(27)
invokeTag('textField','g',263,['name':("lastName"),'class':("form-control"),'id':("lastName"),'required':(""),'value':(studentInstance?.lastName)],-1)
printHtmlPart(30)
invokeTag('message','g',265,['code':("student.studentName.label"),'default':("Last Name")],-1)
printHtmlPart(31)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentDOB', 'error'))
printHtmlPart(32)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:studentInstance?.studentDOB))
printHtmlPart(33)
invokeTag('message','g',285,['code':("student.studentDOB.label"),'default':("Student DOB")],-1)
printHtmlPart(34)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentDOJ', 'error'))
printHtmlPart(35)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:studentInstance?.studentDOJ))
printHtmlPart(36)
invokeTag('message','g',308,['code':("student.studentDOJ.label"),'default':("Student DOJ")],-1)
printHtmlPart(37)
expressionOut.print(hasErrors(bean: studentInstance?.presentAddress, field: 'bloodgroup', 'error'))
printHtmlPart(38)
invokeTag('textField','g',326,['name':("bloodgroup"),'class':("form-control"),'value':(studentInstance?.bloodgroup)],-1)
printHtmlPart(39)
invokeTag('message','g',328,['code':("address.bloodgroup.label"),'default':("Bloodgroup")],-1)
printHtmlPart(40)
expressionOut.print(hasErrors(bean: studentInstance?.presentAddress, field: 'motherTongue', 'error'))
printHtmlPart(38)
invokeTag('textField','g',338,['name':("motherTongue"),'class':("form-control"),'value':(studentInstance?.motherTongue)],-1)
printHtmlPart(41)
invokeTag('message','g',344,['code':("address.motherTongue.label"),'default':("Mother Tongue")],-1)
printHtmlPart(42)
expressionOut.print(hasErrors(bean: studentInstance?.presentAddress, field: 'religion', 'error'))
printHtmlPart(38)
invokeTag('textField','g',352,['name':("religion"),'class':("form-control"),'value':(studentInstance?.religion)],-1)
printHtmlPart(43)
invokeTag('message','g',358,['code':("address.religion.label"),'default':("Religion")],-1)
printHtmlPart(44)
if(true && (studentInstance?.gender !=null)) {
printHtmlPart(45)
expressionOut.print(studentInstance?.gender)
printHtmlPart(46)
expressionOut.print(studentInstance?.gender)
printHtmlPart(47)
}
printHtmlPart(48)
for( gen in (studentInstance.constraints.gender.inList) ) {
printHtmlPart(45)
expressionOut.print(gen)
printHtmlPart(46)
expressionOut.print(gen)
printHtmlPart(47)
}
printHtmlPart(49)
invokeTag('message','g',385,['code':("student.gender.label"),'default':("Select Gender")],-1)
printHtmlPart(50)
expressionOut.print(hasErrors(bean: studentInstance, field: 'email', 'error'))
printHtmlPart(51)
invokeTag('textField','g',396,['name':("email"),'class':("form-control"),'value':(studentInstance?.email)],-1)
printHtmlPart(52)
invokeTag('message','g',399,['code':("student.email.label"),'default':("Email")],-1)
printHtmlPart(53)
expressionOut.print(hasErrors(bean: studentInstance, field: 'category', 'error'))
printHtmlPart(54)
if(true && (studentInstance?.category !=null)) {
printHtmlPart(7)
expressionOut.print(studentInstance?.category)
printHtmlPart(8)
expressionOut.print(studentInstance?.category)
printHtmlPart(9)
}
printHtmlPart(55)
for( cat in (studentInstance.constraints.category.inList) ) {
printHtmlPart(7)
expressionOut.print(cat)
printHtmlPart(8)
expressionOut.print(cat)
printHtmlPart(9)
}
printHtmlPart(56)
invokeTag('textField','g',419,['name':("category"),'class':("form-control"),'value':(studentInstance?.category)],-1)
printHtmlPart(57)
invokeTag('message','g',422,['code':("student.category.label"),'default':("Select Category")],-1)
printHtmlPart(58)
expressionOut.print(hasErrors(bean: studentInstance?.presentAddress, field: 'nationality', 'error'))
printHtmlPart(38)
invokeTag('textField','g',435,['name':("nationality"),'class':("form-control"),'value':(studentInstance?.nationality)],-1)
printHtmlPart(59)
invokeTag('message','g',437,['code':("address.nationality.label"),'default':("Nationality")],-1)
printHtmlPart(60)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentAdharNo', 'error'))
printHtmlPart(61)
invokeTag('textField','g',450,['name':("studentAdharNo"),'class':("form-control"),'value':(studentInstance?.studentAdharNo),'maxlength':("12")],-1)
printHtmlPart(62)
invokeTag('message','g',451,['code':("student.gender.label"),'default':("Select Gender")],-1)
printHtmlPart(63)
expressionOut.print(hasErrors(bean: studentInstance, field: 'identificationMark', 'error'))
printHtmlPart(61)
invokeTag('textField','g',464,['name':("identificationMark"),'class':("form-control"),'value':(studentInstance?.identificationMark)],-1)
printHtmlPart(62)
invokeTag('message','g',467,['code':("student.gender.label"),'default':("Select Gender")],-1)
printHtmlPart(64)
invokeTag('render','g',482,['template':("presentaddress"),'model':([addr:'presentAddress',address:studentInstance?.presentAddress])],-1)
printHtmlPart(65)
invokeTag('checkBox','g',490,['name':("PPA"),'id':("ppa")],-1)
printHtmlPart(66)
invokeTag('render','g',507,['template':("presentaddress"),'model':([addr:'permenentAddres',address:studentInstance?.permenentAddres])],-1)
printHtmlPart(67)
invokeTag('render','g',522,['template':("/parentDetails/parentForm"),'model':([parentDetailsInstance:studentInstance?.fatherDetails,petails:'fatherDetails',parent:'Father'])],-1)
printHtmlPart(68)
invokeTag('render','g',537,['template':("/parentDetails/parentForm"),'model':([parentDetailsInstance:studentInstance?.motherDetails,petails:'motherDetails',parent:'Mother'])],-1)
printHtmlPart(69)
invokeTag('render','g',555,['template':("/parentDetails/parentForm"),'model':([parentDetailsInstance:studentInstance?.guardianDetails,petails:'guardianDetails',parent:'Guardian'])],-1)
printHtmlPart(70)
invokeTag('message','g',575,['code':("transport.route.label"),'default':("Bus Route")],-1)
printHtmlPart(71)
for( _it385013891 in (rut) ) {
changeItVariable(_it385013891)
printHtmlPart(72)
expressionOut.print(it?.id)
printHtmlPart(73)
expressionOut.print(it?.startPlace)
printHtmlPart(74)
expressionOut.print(it?.stopPlace)
printHtmlPart(75)
expressionOut.print(it?.routeCode)
printHtmlPart(76)
}
printHtmlPart(77)
invokeTag('message','g',592,['code':("transport.destination.label"),'default':("Student Route")],-1)
printHtmlPart(78)
for( _it1904241764 in (dst) ) {
changeItVariable(_it1904241764)
printHtmlPart(72)
expressionOut.print(it?.id)
printHtmlPart(73)
expressionOut.print(it?.fromPlace)
printHtmlPart(74)
expressionOut.print(it?.toPlace)
printHtmlPart(79)
expressionOut.print(it?.amount)
printHtmlPart(76)
}
printHtmlPart(80)
invokeTag('message','g',608,['code':("transport.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(81)
expressionOut.print(transportInstance?.startDate)
printHtmlPart(82)
invokeTag('message','g',622,['code':("transport.endDate.label"),'default':("End Date")],-1)
printHtmlPart(83)
expressionOut.print(transportInstance?.endDate)
printHtmlPart(84)
if(true && (studentInstance?.profilePic != null)) {
printHtmlPart(85)
invokeTag('getImage','images',653,['id':(studentInstance?.profilePic?.id),'width':("150px")],-1)
printHtmlPart(86)
}
else {
printHtmlPart(87)
}
printHtmlPart(88)
expressionOut.print(hasErrors(bean: sectionInstance, field: 'instituite', 'error'))
printHtmlPart(89)
expressionOut.print(instituite?.id)
printHtmlPart(90)
expressionOut.print(instituite?.name)
printHtmlPart(91)
invokeTag('message','g',692,['code':("instituite.admin.label"),'default':("instituite")],-1)
printHtmlPart(92)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000581L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
