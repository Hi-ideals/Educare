import com.hiideals.instituite.student.Student
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_studentshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',70,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',79,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',83,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',92,['template':("/header/leftSide"),'model':([activ:[studentInfo:'start active open',studentList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',104,['controller':("studentList"),'action':("index")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',107,['action':("create")],2)
printHtmlPart(13)
invokeTag('getImage','images',122,['id':(instituite?.logo?.id),'width':("100px")],-1)
printHtmlPart(14)
expressionOut.print(instituite?.name)
printHtmlPart(15)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(16)
expressionOut.print(studentInstance?.studentName)
printHtmlPart(17)
expressionOut.print(studentInstance?.fatherDetails?.parentName)
printHtmlPart(18)
for( _it528776606 in (studentInstance?.academicyear) ) {
changeItVariable(_it528776606)
printHtmlPart(19)
if(true && (it.status == 'current')) {
printHtmlPart(19)
}
printHtmlPart(20)
}
printHtmlPart(20)
invokeTag('set','g',143,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(21)
expressionOut.print(pclass.classname)
printHtmlPart(22)
createClosureForHtmlPart(23, 2)
invokeTag('link','g',161,['class':("edit"),'action':("edit"),'id':(LookUpED.encod(studentInstance.id))],2)
printHtmlPart(24)
createClosureForHtmlPart(25, 2)
invokeTag('link','g',165,['controller':("student"),'action':("showstudentprofile"),'id':(studentInstance.id),'target':("blank")],2)
printHtmlPart(26)
createClosureForHtmlPart(27, 2)
invokeTag('link','g',168,['action':("reAdmission"),'id':(studentInstance.id)],2)
printHtmlPart(28)
if(true && (flash.message)) {
printHtmlPart(29)
expressionOut.print(flash.message)
printHtmlPart(30)
}
printHtmlPart(31)
if(true && (studentInstance?.profilePic !=null)) {
printHtmlPart(32)
invokeTag('getImage','images',206,['id':(studentInstance?.profilePic?.id),'class':("img-responsive")],-1)
printHtmlPart(33)
}
else {
printHtmlPart(34)
}
printHtmlPart(35)
expressionOut.print(studentInstance?.registrationNo)
printHtmlPart(36)
for( _it1023469953 in (studentInstance?.academicyear) ) {
changeItVariable(_it1023469953)
printHtmlPart(37)
if(true && (it.status == 'current')) {
printHtmlPart(37)
}
printHtmlPart(38)
}
printHtmlPart(39)
invokeTag('set','g',239,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(38)
invokeTag('set','g',240,['value':(it.feeId),'var':("feeid")],-1)
printHtmlPart(40)
expressionOut.print(pclass.classname)
printHtmlPart(41)
for( _it1650828616 in (studentInstance?.academicyear) ) {
changeItVariable(_it1650828616)
printHtmlPart(37)
if(true && (it.status == 'current')) {
printHtmlPart(37)
}
printHtmlPart(38)
}
printHtmlPart(39)
invokeTag('set','g',249,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(42)
expressionOut.print(pclass.sectionName)
printHtmlPart(43)
expressionOut.print(studentInstance?.studentId)
printHtmlPart(44)
expressionOut.print(studentInstance?.mediumOfInstruction)
printHtmlPart(45)
expressionOut.print(studentInstance?.studentName)
printHtmlPart(46)
expressionOut.print(studentInstance?.lastName)
printHtmlPart(47)
expressionOut.print(studentInstance?.fatherDetails?.parentName)
printHtmlPart(48)
expressionOut.print(studentInstance?.motherDetails?.parentName)
printHtmlPart(49)
invokeTag('formatDate','g',308,['date':(studentInstance?.studentDOJ),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(50)
expressionOut.print(studentInstance?.stsSystem)
printHtmlPart(51)
expressionOut.print(studentInstance?.studentAdharNo)
printHtmlPart(52)
invokeTag('formatDate','g',352,['date':(studentInstance?.studentDOB),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(53)
expressionOut.print(studentInstance?.gender)
printHtmlPart(54)
expressionOut.print(studentInstance?.motherTongue)
printHtmlPart(55)
expressionOut.print(studentInstance?.bloodgroup)
printHtmlPart(56)
expressionOut.print(studentInstance?.religion)
printHtmlPart(57)
expressionOut.print(studentInstance?.nationality)
printHtmlPart(58)
expressionOut.print(studentInstance?.fatherDetails?.occupation)
printHtmlPart(59)
expressionOut.print(studentInstance?.fatherDetails?.mobileNumber)
printHtmlPart(60)
expressionOut.print(studentInstance?.fatherDetails?.parentName)
printHtmlPart(61)
expressionOut.print(studentInstance?.fatherDetails?.parentAdharNo)
printHtmlPart(62)
expressionOut.print(studentInstance?.fatherDetails?.parentVoterId)
printHtmlPart(63)
expressionOut.print(studentInstance?.motherDetails?.parentAdharNo)
printHtmlPart(64)
expressionOut.print(studentInstance?.motherDetails?.parentName)
printHtmlPart(65)
expressionOut.print(studentInstance?.email)
printHtmlPart(66)
expressionOut.print(studentInstance?.motherDetails?.occupation)
printHtmlPart(67)
expressionOut.print(studentInstance?.motherDetails?.mobileNumber)
printHtmlPart(68)
expressionOut.print(studentInstance?.guardianDetails?.parentName)
printHtmlPart(69)
expressionOut.print(studentInstance?.guardianDetails?.occupation)
printHtmlPart(70)
expressionOut.print(studentInstance?.guardianDetails?.mobileNumber)
printHtmlPart(71)
expressionOut.print(studentInstance?.category)
printHtmlPart(72)
expressionOut.print(studentInstance?.guardianDetails?.parentAdharNo)
printHtmlPart(73)
expressionOut.print(studentInstance?.guardianDetails?.parentVoterId)
printHtmlPart(74)
expressionOut.print(studentInstance?.presentAddress?.hsno)
printHtmlPart(39)
expressionOut.print(studentInstance?.presentAddress?.street)
printHtmlPart(75)
expressionOut.print(studentInstance?.presentAddress?.city)
printHtmlPart(76)
expressionOut.print(studentInstance?.presentAddress?.pinCode)
printHtmlPart(77)
expressionOut.print(studentInstance?.presentAddress?.state)
printHtmlPart(78)
expressionOut.print(studentInstance?.presentAddress?.country)
printHtmlPart(79)
expressionOut.print(studentInstance?.permenentAddres?.hsno)
printHtmlPart(39)
expressionOut.print(studentInstance?.permenentAddres?.street)
printHtmlPart(75)
expressionOut.print(studentInstance?.permenentAddres?.city)
printHtmlPart(76)
expressionOut.print(studentInstance?.presentAddress?.pinCode)
printHtmlPart(77)
expressionOut.print(studentInstance?.permenentAddres?.state)
printHtmlPart(78)
expressionOut.print(studentInstance?.permenentAddres?.country)
printHtmlPart(80)
expressionOut.print(studentInstance?.studentPhNumber)
printHtmlPart(81)
expressionOut.print(studentInstance?.registrationNo)
printHtmlPart(82)
for( acdemic in (studentInstance?.academicyear?.academicyear) ) {
printHtmlPart(83)
expressionOut.print(acdemic)
printHtmlPart(84)
}
printHtmlPart(85)
expressionOut.print(studentInstance?.studentId)
printHtmlPart(86)
for( _it777121249 in (studentInstance?.academicyear) ) {
changeItVariable(_it777121249)
printHtmlPart(87)
if(true && (it.status == 'current')) {
printHtmlPart(87)
}
printHtmlPart(87)
}
printHtmlPart(87)
invokeTag('set','g',608,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(88)
expressionOut.print(pclass.classname)
printHtmlPart(89)
expressionOut.print(preeducation?.schoolname)
printHtmlPart(90)
expressionOut.print(preeducation?.qualification)
printHtmlPart(91)
expressionOut.print(preeducation?.marksPercentage)
printHtmlPart(92)
expressionOut.print(preeducation?.transferCertificatId)
printHtmlPart(93)
expressionOut.print(preeducation?.schoolAddress?.hsno)
printHtmlPart(94)
expressionOut.print(preeducation?.schoolAddress?.street)
printHtmlPart(94)
expressionOut.print(preeducation?.schoolAddress?.city)
printHtmlPart(94)
expressionOut.print(preeducation?.schoolAddress?.state)
printHtmlPart(94)
expressionOut.print(preeducation?.schoolAddress?.country)
printHtmlPart(94)
expressionOut.print(preeducation?.schoolAddress?.mobileNumber)
printHtmlPart(94)
expressionOut.print(preeducation?.schoolAddress?.phno)
printHtmlPart(95)
if(true && (feeid == null)) {
printHtmlPart(96)
expressionOut.print(studentInstance.studentName)
printHtmlPart(97)
createClosureForHtmlPart(98, 3)
invokeTag('link','g',669,['controller':("fee"),'action':("create"),'id':(LookUpED.encod(studentInstance.id)),'title':("")],3)
printHtmlPart(99)
}
else {
printHtmlPart(100)
if(true && (studentInstance?.academicyear.size()>0)) {
printHtmlPart(101)
invokeTag('render','g',673,['template':("/studentList/studenttable"),'model':([academicyears:studentInstance?.academicyear])],-1)
printHtmlPart(99)
}
printHtmlPart(102)
}
printHtmlPart(103)
if(true && (studentInstance?.academicyear.size()>0)) {
printHtmlPart(104)
createClosureForHtmlPart(105, 3)
invokeTag('link','g',684,['class':("btn blue"),'controller':("student"),'action':("feedetailprint"),'id':(studentInstance.id),'target':("_blank")],3)
printHtmlPart(19)
}
printHtmlPart(106)
loop:{
int k = 0
for( tr in (tracker) ) {
printHtmlPart(107)
expressionOut.print(tr.instalment)
printHtmlPart(108)
expressionOut.print(tr?.invoiceNo)
printHtmlPart(109)
expressionOut.print(tr.paymentType)
printHtmlPart(110)
if(true && (tr.paymentType=='CHECK' || tr.paymentType=='DD')) {
printHtmlPart(111)
expressionOut.print(tr?.paymentType)
printHtmlPart(112)
expressionOut.print(tr?.ddNumber)
printHtmlPart(113)
expressionOut.print(tr?.accNo)
printHtmlPart(114)
expressionOut.print(tr?.ddNumber)
printHtmlPart(115)
expressionOut.print(tr?.ddNumber)
printHtmlPart(116)
expressionOut.print(tr?.ddNumber)
printHtmlPart(117)
}
else {
printHtmlPart(118)
}
printHtmlPart(111)
invokeTag('formatDate','g',727,['format':("dd-MMM-yyyy"),'date':(tr.dateCreated)],-1)
printHtmlPart(119)
expressionOut.print(k)
printHtmlPart(120)
createClosureForHtmlPart(121, 3)
invokeTag('link','g',730,['controller':("student"),'action':("viewfeedetail"),'params':([id:studentInstance.id,stid:tr.id]),'target':("_blank")],3)
printHtmlPart(122)
createClosureForHtmlPart(121, 3)
invokeTag('link','g',732,['controller':("student"),'action':("specificviewfeedetail"),'params':([id:studentInstance.id,stid:tr.id]),'target':("_blank")],3)
printHtmlPart(123)
k++
}
}
printHtmlPart(124)
loop:{
int j = 0
for( tr in (tracker) ) {
printHtmlPart(99)
invokeTag('render','g',738,['template':("/student/feePopup"),'model':([feeInstance:tr,i:j])],-1)
printHtmlPart(99)
j++
}
}
printHtmlPart(125)
createClosureForHtmlPart(105, 2)
invokeTag('link','g',746,['class':("btn blue"),'controller':("student"),'action':("feeinstallmentdetails"),'params':([id:studentInstance.id]),'target':("_blank")],2)
printHtmlPart(126)
createTagBody(2, {->
printHtmlPart(127)
expressionOut.print(LookUpED.encod(studentInstance?.id))
printHtmlPart(128)
invokeTag('getImage','images',759,['id':(studentInstance?.profilePic?.id),'width':("250px"),'height':("250px")],-1)
printHtmlPart(129)
invokeTag('submitButton','g',770,['name':("Submit"),'class':("btn blue")],-1)
printHtmlPart(130)
})
invokeTag('form','g',772,['name':("ss"),'controller':("gallery"),'action':("editImage"),'enctype':("multipart/form-data")],2)
printHtmlPart(131)
loop:{
int y = 0
for( dc in (docList?.documents) ) {
printHtmlPart(132)
expressionOut.print(createLink(controller:'student', action:'downloadFile', id:dc?.id))
printHtmlPart(133)
expressionOut.print(dc?.fileName)
printHtmlPart(134)
y++
}
}
printHtmlPart(135)
createTagBody(2, {->
printHtmlPart(136)
invokeTag('hiddenField','g',800,['name':("stId"),'value':(studentInstance?.id)],-1)
printHtmlPart(19)
loop:{
int i = 0
for( documentFile in (1..4) ) {
printHtmlPart(137)
expressionOut.print(i)
printHtmlPart(138)
i++
}
}
printHtmlPart(139)
invokeTag('submitButton','g',812,['name':("create"),'class':("btn blue"),'id':("Educationcreate"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(140)
})
invokeTag('form','g',817,['url':([controller:'student', action:'saveDocuments']),'enctype':("multipart/form-data")],2)
printHtmlPart(141)
invokeTag('render','g',839,['template':("/footer/footer")],-1)
printHtmlPart(142)
})
invokeTag('captureBody','sitemesh',863,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(143)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000379L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
