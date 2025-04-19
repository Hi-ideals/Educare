class UrlMappings {

	static mappings = {
        "/$controller/$action?"{///$id?(.$format)?
            constraints {
                // apply constraints here
            }
        }
        "/"(controller:"home") 
        "500"(view:'/error')
		
		"/ShowUserList"(controller:'userList', action:'show')
		"500"(view:'/error')
		
		"/CreateUserList"(controller:'userList', action:'create')
		"500"(view:'/error')
		
		"/EditUserList"(controller:'userList', action:'edit')
		"500"(view:'/error')
		
		"/userList"(controller:'userList', action:'index')
		"500"(view:'/error')
		
		"/editRoles"(controller:'roles', action:'edit')
		"500"(view:'/error')
		
		"/viewRoles"(controller:'roles', action:'show')
		"500"(view:'/error')
		
		"/createRoles"(controller:'roles', action:'create')
		"500"(view:'/error')
		
		"/roles"(controller:'roles', action:'index')
		"500"(view:'/error')
		
		//specificviewfeedetail
		"/specificviewfeedetail"(controller:'student', action:'specificviewfeedetail')
		"500"(view:'/error')
		
		//classgetfeelistprint
		"/listofFeeTypesclassgetfeelistprint"(controller:'listofFeeTypes', action:'classgetfeelistprint')
		"500"(view:'/error')
		
		
		//transportBill
		"/transportBill"(controller:'transportFee', action:'transportBill')
		"500"(view:'/error')
		
		//feezeroPaid.gsp
		"/feezeroPaid"(controller:'fee', action:'feezeroPaid')
		"500"(view:'/error')
		
		//printfeezeroPaid.gsp
		"/printfeezeroPaid"(controller:'fee', action:'printOfUnpaid')
		"500"(view:'/error')
		
		
		//transportFeedetailsPrint
		"/transportfeePrint"(controller:'transportReport', action:'transportFeedetailsPrint')
		"500"(view:'/error')
		
		//tAllocationPrint
		"/transportallocationPrint"(controller:'transportReport', action:'tAllocationPrint')
		"500"(view:'/error')
		
		//availableRoutesPrint
		"/routePrint"(controller:'transportReport', action:'availableRoutesPrint')
		"500"(view:'/error')
		
		
		//availableDriversPrint
		"/tdriversPrint"(controller:'transportReport', action:'availableDriversPrint')
		"500"(view:'/error')
		
		
		//availableVehiclesPrint
		"/tvehiclesPrint"(controller:'transportReport', action:'availableVehiclesPrint')
		"500"(view:'/error')
		
		//TransportReport
		"/transportReport"(controller:'transportReport', action:'index')
		"500"(view:'/error')
		
		//getreportCardPrint
		"/marksgetreportCardPrint"(controller:'marks', action:'getreportCardPrint')
		"500"(view:'/error')
		
		//getExamTTPrint
		"/marksgetExamTTPrint"(controller:'marks', action:'getExamTTPrint')
		"500"(view:'/error')
		
		//staffTimeTablePrint
		"/timetableDisplaystaffTimeTablePrint"(controller:'timetableDisplay', action:'staffTimeTablePrint')
		"500"(view:'/error')
		
		//showTimeTablePrint TimetableDisplay
		"/timetableDisplayshowTimeTablePrint"(controller:'timetableDisplay', action:'showTimeTablePrint')
		"500"(view:'/error')
		
		
		//getBystaffWisePrint
		"/libraryReportsgetBystaffWisePrint"(controller:'libraryReports', action:'getBystaffWisePrint')
		"500"(view:'/error')
		
		//getBystudentWisePrint
		"/libraryReportsgetBystudentWisePrint"(controller:'libraryReports', action:'getBystudentWisePrint')
		"500"(view:'/error')
		
		//getByReturnDatePrint
		"/libraryReportsgetByReturnDatePrint"(controller:'libraryReports', action:'getByReturnDatePrint')
		"500"(view:'/error')
		
		//getByIssuedDatePrint
		"/libraryReportsgetByIssuedDatePrint"(controller:'libraryReports', action:'getByIssuedDatePrint')
		"500"(view:'/error')
		
		//availableMagazinesPrint
		"/libraryReportsavailableMagazinesPrint"(controller:'libraryReports', action:'availableMagazinesPrint')
		"500"(view:'/error')
		
		//availableNewsPapersPrint
		"/libraryReportsavailableNewsPapersPrint"(controller:'libraryReports', action:'availableNewsPapersPrint')
		"500"(view:'/error')
		
		//availableBooksPrint
		"/libraryReportsBooksPrint"(controller:'libraryReports', action:'availableBooksPrint')
		"500"(view:'/error')
		
		//libraryReports
		"/libraryReports"(controller:'libraryReports', action:'index')
		"500"(view:'/error')
		
		//studentmagazineprintone
		"/issueDetailsStudentstudentmagazineprintone"(controller:'issueDetailsStudent', action:'studentmagazineprintone')
		"500"(view:'/error')
		
		//studentmagazineprint
		"/issueDetailsStudentstudentmagazineprint"(controller:'issueDetailsStudent', action:'studentmagazineprint')
		"500"(view:'/error')
		
		//staffmagazineprint
		"/issueDetailsStaffstaffmagazineprint"(controller:'issueDetailsStaff', action:'staffmagazineprint')
		"500"(view:'/error')
		
		//staffmagazineprintone  
		"/issueDetailsStaffstaffmagazineprintone"(controller:'issueDetailsStaff', action:'staffmagazineprintone')
		"500"(view:'/error')
		
		
		//studentnewspaperprintone
		"/issueDetailsStudentstudentnewspaperprintone"(controller:'issueDetailsStudent', action:'studentnewspaperprintone')
		"500"(view:'/error')
		
		//studentnewspaperprint
		"/issueDetailsStudentstudentnewspaperprint"(controller:'issueDetailsStudent', action:'studentnewspaperprint')
		"500"(view:'/error')
		
		//staffnewspaperprintone
		"/issueDetailsStaffstaffnewspaperprintone"(controller:'issueDetailsStaff', action:'staffnewspaperprintone')
		"500"(view:'/error')
		
		//staffnewspaperprint
		"/issueDetailsStaff"(controller:'issueDetailsStaff', action:'staffnewspaperprint')
		"500"(view:'/error')
		
		//printissueDetailsList
		"/issueDetailsprintissueDetailsList"(controller:'issueDetails', action:'printissueDetailsList')
		"500"(view:'/error')
		
		//printNewspaperList
		"/newspaperprintNewspaperList"(controller:'newspaper', action:'printNewspaperList')
		"500"(view:'/error')
		
		//printMagazineList
		"/magazineprintMagazineList"(controller:'magazine', action:'printMagazineList')
		"500"(view:'/error')
		
		
		//modules
		"/moduleslist"(controller:'admin', action:'modulesList')
		"500"(view:'/error')
		
		//Exams
		
		
		"/examcreate"(controller:'exam', action:'create')
		"500"(view:'/error')
		
		"/exam"(controller:'exam', action:'index')
		"500"(view:'/error')
		
		"/examedit"(controller:'exam', action:'edit')
		"500"(view:'/error')
		
		"/examdelete"(controller:'exam', action:'delete')
		"500"(view:'/error')
		
		"/examshow"(controller:'exam', action:'show')
		"500"(view:'/error')
		
		
		//examdetails
		
		"/examdetailscreate"(controller:'examDetails', action:'create')
		"500"(view:'/error')
		
		"/examdetailsindex"(controller:'examDetails', action:'index')
		"500"(view:'/error')
		
		"/examdetailsedit"(controller:'examDetails', action:'edit')
		"500"(view:'/error')
		
		"/examdetailsdelete"(controller:'examDetails', action:'delete')
		"500"(view:'/error')
		
		"/examdetailsshow"(controller:'examDetails', action:'show')
		"500"(view:'/error')
		
		//marks
		
		"/markscreate"(controller:'marks', action:'create')
		"500"(view:'/error')
		
		"/marksindex"(controller:'marks', action:'index')
		"500"(view:'/error')
		
		"/marksedit"(controller:'marks', action:'edit')
		"500"(view:'/error')
		
		"/marksdelete"(controller:'marks', action:'delete')
		"500"(view:'/error')
		
		"/marksshow"(controller:'marks', action:'show')
		"500"(view:'/error')
		
		"/marksreports"(controller:'marks', action:'studentReports')
		"500"(view:'/error')
		

		//printBooksList
		"/booksprintBooksList"(controller:'books', action:'printBooksList')
		"500"(view:'/error')
		
		//timetable
		"/TimeTable"(controller:'timeTable', action:'index')
		"500"(view:'/error')
		
		"/CreateTimeTable"(controller:'timeTable', action:'create')
		"500"(view:'/error')
		
		"/ShowTimeTable"(controller:'timeTable', action:'show')
		"500"(view:'/error')
		
		"/EditTimeTable"(controller:'timeTable', action:'edit')
		"500"(view:'/error')
		
		"/SelectTimeTableDate"(controller:'timetableDisplay', action:'timeTableDate')
		"500"(view:'/error')
		
		"/SelectedTimeTable"(controller:'timetableDisplay', action:'timeTableDetails')
		"500"(view:'/error')
		
		"/TimeTableDisplay"(controller:'timetableDisplay', action:'showTimeTable')
		"500"(view:'/error')
		
		"/StaffTimeTable"(controller:'timetableDisplay', action:'staffTimeTable')
		"500"(view:'/error')
		
		
		//periodsTimings
		"/PeriodsTimimgs"(controller:'period_Timings', action:'index')
		"500"(view:'/error')
		
		"/CreatePeriodsTimimgs"(controller:'period_Timings', action:'create')
		"500"(view:'/error')
		
		"/ShowPeriodsTimimgs"(controller:'period_Timings', action:'show')
		"500"(view:'/error')
		
		"/EditPeriodsTimimgs"(controller:'period_Timings', action:'edit')
		"500"(view:'/error')
		
		"/issuedBooksstaffprint"(controller:'issuedBooks', action:'booksIssuedstaff')
		"500"(view:'/error')
		
		"/issuedBooksstprint"(controller:'issuedBooks', action:'booksIssuedstudents')
		"500"(view:'/error')
		
		"/listofFeesbyYearPrint"(controller:'listofFees', action:'byYearPrint')
		"500"(view:'/error')
		
		"/listofFeeTypesgetfeelistprint"(controller:'listofFeeTypes', action:'getfeelistprint')
		"500"(view:'/error')
		
		"/listofFeeTypes"(controller:'listofFeeTypes', action:'index')
		"500"(view:'/error')

		"/listofStudentsgetBygender"(controller:'listofStudents', action:'getBygender')
		"500"(view:'/error')
	
		"/listofStudentsgetBycast"(controller:'listofStudents', action:'getBycast')
		"500"(view:'/error')

		"/listofStudentsgetByClass"(controller:'listofStudents', action:'getByClass')
		"500"(view:'/error')		

		//reports
		"/StaffLibraryReport"(controller:'issuedBooks', action:'issuedStaff')
		"500"(view:'/error')
		
		"/StudentLibraryReport"(controller:'issuedBooks', action:'issuedStudents')
		"500"(view:'/error')
		
		
		"/IssuedBooksissuedStudents"(controller:'issuedBooks', action:'issuedStudents')
		"500"(view:'/error')
		
		"/studentfeedetailprint"(controller:'student', action:'feedetailprint')
		"500"(view:'/error')
		
			"/studentReadmissionList"(controller:'student', action:'readmissionList')
		"500"(view:'/error')
		
		//feeinstallmentdetails
		"/studentfeeinstallmentdetails"(controller:'student', action:'feeinstallmentdetails')
		"500"(view:'/error')
		
		
		//newFeeupdate
		"/feenewFeeupdate"(controller:'fee', action:'newFeeupdate')
		"500"(view:'/error')
		
		
		//newfeepay
		"/feenewfeepay"(controller:'fee', action:'newfeepay')
		"500"(view:'/error')
		
		
		//individualstfee
		"/feeindividualstfee"(controller:'fee', action:'individualstfee')
		"500"(view:'/error')
		
		"/feequickstudentfeelist"(controller:'fee', action:'quickstudentfeelist')
		"500"(view:'/error')
		
		
		//printmothlystaffattendance
		"/stafftattendanceprintattendencestaffmonthly"(controller:'staffAttendance', action:'printattendencestaffmonthly')
		"500"(view:'/error')
		
		
		//printattendencestaffdaily
		"/stafftattendanceprintattendencestaffdaily"(controller:'staffAttendance', action:'printattendencestaffdaily')
		"500"(view:'/error')
		
		//printattendencedaily
		"/studentattendanceprintattendencedaily"(controller:'studentAttendance', action:'printattendencedaily')
		"500"(view:'/error')
		
		
		//printtransfercertificate
		"/transfercertificateprinttransfercertificate"(controller:'transfercertificate', action:'printtransfercertificate')
		"500"(view:'/error')
		
		//Transfercertificate
		"/transfercertificate"(controller:'transfercertificate', action:'index')
		"500"(view:'/error')
		
		//Lata
		"/transfer"(controller:'student', action:'transfer')
		"500"(view:'/error')
		
		
		//viewfeedetail
		"/listofFeesviewfeedetail"(controller:'listofFees', action:'viewfeedetail')
		"500"(view:'/error')
		
		//individualstudentFees
		"/individualstudentFeeslistofFeesgetfeelist"(controller:'listofFees', action:'individualstudentFees')
		"500"(view:'/error')
		
		//SMS
		"/sms"(controller:'SMS', action:'index')
		"500"(view:'/error')
		
		//printattendance
		"/studentattendanceprintattendance"(controller:'studentAttendance', action:'printattendance')
		"500"(view:'/error')
		
		//getfeelist
		"/listofFeesgetfeelist"(controller:'listofFees', action:'getfeelist')
		"500"(view:'/error')
		
		"/listofFeesOndate"(controller:'listofFees', action:'getOndatefeereportprint')
		"500"(view:'/error')
		
		//ListofFees
		"/listofFees"(controller:'listofFees', action:'index')
		"500"(view:'/error')
		
		
		//getstlist
		"/listofStudentsgetstlist"(controller:'listofStudents', action:'getstlist')
		"500"(view:'/error')
		
		
		//getstudentlist
		"/listofStudentsgetstudentlist"(controller:'listofStudents', action:'getstudentlist')
		"500"(view:'/error')
		
		//studentList
		"/listofStudents"(controller:'listofStudents',action:'index')
		"500"(view:'/error')
		
		//feenotice
		"/feefeenotice"(controller:'fee', action:'feenotice')
		"500"(view:'/error')
		
		//printcharactercrt
		"/charactercertificateprintcharactercrt"(controller:'charactercertificate', action:'printcharactercrt')
		"500"(view:'/error')
		
		//charactercertificate
		"/charactercertificate"(controller:'charactercertificate', action:'index')
		"500"(view:'/error')		


		//printholiday
		"/holidayprintholiday"(controller:'holiday', action:'printholiday')
		"500"(view:'/error')
		
		//holiday
		"/holiday"(controller:'holiday', action:'index')
		"500"(view:'/error')
		
		//printstudycertificate
		"/studycertificateprintstudycertificate"(controller:'studycertificate', action:'printstudycertificate')
		"500"(view:'/error')
		
		//studycertificate
		"/studycertificate"(controller:'studycertificate', action:'index')
		"500"(view:'/error')
		
		//printbonafied
		"/bonafiedcrtprintbonafied"(controller:'bonafiedcrt', action:'printbonafied')
		"500"(view:'/error')
		
		//Bonafiedcrt
		"/bonafiedcrt"(controller:'bonafiedcrt', action:'index')
		"500"(view:'/error')
		
		//viewfeedetail
		"/studentviewfeedetail"(controller:'student', action:'viewfeedetail')
		"500"(view:'/error')
		
		"/staffedit"(controller:'staff', action:'edit')
		"500"(view:'/error')
		
		"/staffcreate"(controller:'staff', action:'create')
		"500"(view:'/error')
		
		
		
			"/Admissionfeeshow"(controller:'admissionfee', action:'show')
		"500"(view:'/error')
		
		"/AdmissionfeeCreate"(controller:'admissionfee', action:'create')
		"500"(view:'/error')
		
		"/AdmissionfeeEdit"(controller:'admissionfee', action:'edit')
		"500"(view:'/error')
		
		"/Admissionfee"(controller:'admissionfee', action:'index')
		"500"(view:'/error')

		
		
		
		
		//attendance
		
		"/studentattendancecreate"(controller:'studentAttendance', action:'create')
		"500"(view:'/error')
		
		"/stafftattendancecreate"(controller:'staffAttendance', action:'create')
		"500"(view:'/error')
		
		"/studentAttendanceSheet"(controller:'studentAttendance', action:'getStudentAttendanceSheet')
		"500"(view:'/error')
		
		"/staffAttendanceSheet"(controller:'staffAttendance', action:'getStaffAttendanceSheet')
		"500"(view:'/error')
		
		"/studentAttendanceList"(controller:'studentAttendance', action:'studentsAttendanceList')
		"500"(view:'/error')
		
		"/staffAttendanceList"(controller:'staffAttendance', action:'staffAttendanceList')
		"500"(view:'/error')
		
		"/studentReadmission"(controller:'student', action:'reAdmission')
		"500"(view:'/error')
		
		"/studentRepeate"(controller:'student', action:'repeate')
		"500"(view:'/error')
		
		
		//complete
		
		"/staffshow"(controller:'staff', action:'show')
		"500"(view:'/error')
		
		"/staff"(controller:'staff', action:'index')
		"500"(view:'/error')
		
		"/batchcreate"(controller:'batch', action:'create')
		"500"(view:'/error')
		
		"/batchedit"(controller:'batch', action:'edit')
		"500"(view:'/error')
		
		"/batch"(controller:'batch', action:'index')
		"500"(view:'/error')
		
		"/subjectcreate"(controller:'subject', action:'create')
		"500"(view:'/error')
		
		"/subjectedit"(controller:'subject', action:'edit')
		"500"(view:'/error')
		
		"/subject"(controller:'subject', action:'index')
		"500"(view:'/error')
		//new changessssssssss
		
		"/gallery"(controller:'gallery', action:'index')
		"500"(view:'/error')
		
		//getlistofdues
		"/feegetlistofdues"(controller:'fee', action:'getlistofdues')
		"500"(view:'/error')
		
		//studentstudentprofile
		"/studentshowstudentprofile"(controller:'student', action:'showstudentprofile')
		"500"(view:'/error')
		
		"/feeshow"(controller:'fee', action:'show')
		"500"(view:'/error')
		
		"/feeedit"(controller:'fee', action:'edit')
		"500"(view:'/error')
		
		"/feecreate"(controller:'fee', action:'create')
		"500"(view:'/error')
		
		"/fee"(controller:'fee')
		"500"(view:'/error')
		
		"/preEducationshow"(controller:'preEducation', action:'show')
		"500"(view:'/error')
		
		"/preEducationcreate"(controller:'preEducation', action:'create')
		"500"(view:'/error')
		
		"/preEducationedit"(controller:'preEducation', action:'edit')
		"500"(view:'/error')
		
		"/preEducation"(controller:'preEducation')
		"500"(view:'/error')
		
		"/instFeeTypesshow"(controller:'instFeeTypes', action:'show')
		"500"(view:'/error')
		
		"/instFeeTypescreate"(controller:'instFeeTypes', action:'create')
		"500"(view:'/error')
		
		"/instFeeTypesedit"(controller:'instFeeTypes', action:'edit')
		"500"(view:'/error')
		
		"/instFeeTypes"(controller:'instFeeTypes')
		"500"(view:'/error')

		"/studentList"(controller:'studentList')
		"500"(view:'/error')

		"/student"(controller:'student')
		"500"(view:'/error')

		"/studentshow"(controller:'student', action:'show')
		"500"(view:'/error')

		"/studentedit"(controller:'student', action:'edit')
		"500"(view:'/error')

		"/studentcreate"(controller:'student', action:'create')
		"500"(view:'/error')


		"/sectionshow"(controller:'section', action:'show')
		"500"(view:'/error')

		"/sectionedit"(controller:'section', action:'edit')
		"500"(view:'/error')

		"/sectioncreate"(controller:'section', action:'create')
		"500"(view:'/error')
		
		"/section"(controller:'section')
		"500"(view:'/error')


		"/parentDetailsshow"(controller:'parentDetails', action:'show')
		"500"(view:'/error')

		"/parentDetailsedit"(controller:'parentDetails', action:'edit')
		"500"(view:'/error')

		"/parentDetailscreate"(controller:'parentDetails', action:'create')
		"500"(view:'/error')

		"/parentDetails"(controller:'parentDetails')
		"500"(view:'/error')

		"/instituiteshow"(controller:'instituite', action:'show')
		"500"(view:'/error')

		"/instituiteedit"(controller:'instituite', action:'edit')
		"500"(view:'/error')

		"/instituitecreate"(controller:'instituite', action:'create')
		"500"(view:'/error')

		"/instituite"(controller:'instituite')
		"500"(view:'/error')

		"/IClassshow"(controller:'IClass', action:'show')
		"500"(view:'/error')

		"/IClassedit"(controller:'IClass', action:'edit')
		"500"(view:'/error')

		"/IClasscreate"(controller:'IClass', action:'create')
		"500"(view:'/error')

		"/IClass"(controller:'IClass')
		"500"(view:'/error')

		"/coursesshow"(controller:'courses', action:'show')
		"500"(view:'/error')

		"/coursesedit"(controller:'courses', action:'edit')
		"500"(view:'/error')

		"/coursescreate"(controller:'courses', action:'create')
		"500"(view:'/error')

		"/courses"(controller:'courses')
		"500"(view:'/error')

		"/addressshow"(controller:'address', action:'show')
		"500"(view:'/error')

		"/addressedit"(controller:'address', action:'edit')
		"500"(view:'/error')

		"/addresscreate"(controller:'address', action:'create')
		"500"(view:'/error')

		"/address"(controller:'address')
		"500"(view:'/error')

		"/adminshow"(controller:'admin', action:'show')
		"500"(view:'/error')

		"/adminedit"(controller:'admin', action:'edit')
		"500"(view:'/error')

		"/admincreate"(controller:'admin', action:'create')
		"500"(view:'/error')

		"/admin"(controller:'admin')
		"500"(view:'/error')

		"/studentProfile"(controller:'studentProfile', action:'index')
		"500"(view:'/error')

		"/dashboard"(controller:'dashboard', action:'index')
		"500"(view:'/error')
		
		"/issueDetails"(controller:'issueDetails', action:'index')
		"500"(view:'/error')
		
		"/studentDetails"(controller:'issueDetails', action:'studentDetails')
		"500"(view:'/error')
		
		"/staffDetails"(controller:'issueDetails', action:'staffDetails')
		"500"(view:'/error')
		
		"/IssuetoStudent"(controller:'issueDetails', action:'issueToStudent')
		"500"(view:'/error')
		
		"/IssuetoStaff"(controller:'issueDetails', action:'issueToStaff')
		"500"(view:'/error')
		
		"/issueDetailssshow"(controller:'issueDetails', action:'show')
		"500"(view:'/error')

		"/issueDetailsedit"(controller:'issueDetails', action:'edit')
		"500"(view:'/error')

		"/issueDetailscreate"(controller:'issueDetails', action:'create')
		"500"(view:'/error')
		
		"/issueDetailsbookReturn"(controller:'issueDetails', action:'bookReturn')
		"500"(view:'/error')
		
		"/issueDetailsbookReturnStaff"(controller:'issueDetails', action:'bookReturnStaff')
		"500"(view:'/error')
		
		"/magazine"(controller:'magazine', action:'index')
		"500"(view:'/error')
		
		"/magazineshow"(controller:'magazine', action:'show')
		"500"(view:'/error')

		"/magazineedit"(controller:'magazine', action:'edit')
		"500"(view:'/error')

		"/magazinecreate"(controller:'magazine', action:'create')
		"500"(view:'/error')
		
		"/newspaper"(controller:'newspaper', action:'index')
		"500"(view:'/error')
		
		"/newspapershow"(controller:'newspaper', action:'show')
		"500"(view:'/error')

		"/newspaperedit"(controller:'newspaper', action:'edit')
		"500"(view:'/error')

		"/newspapercreate"(controller:'newspaper', action:'create')
		"500"(view:'/error')
		
		"/book"(controller:'books', action:'index')
		"500"(view:'/error')
		
		"/bookshow"(controller:'books', action:'show')
		"500"(view:'/error')

		"/bookedit"(controller:'books', action:'edit')
		"500"(view:'/error')

		"/bookcreate"(controller:'books', action:'create')
		"500"(view:'/error')
		
		"/IssueDetailsform1"(controller:'issueDetailsStaff', action:'form1')
		"500"(view:'/error')
		
		"/IssueDetailsstaffnewspaperrep"(controller:'issueDetailsStaff', action:'staffnewspaperrep')
		"500"(view:'/error')
		
		"/IssueDetailsnewspaperreport"(controller:'issueDetailsStaff', action:'newspaperreport')
		"500"(view:'/error')
		
		"/IssueDetailsform"(controller:'issueDetailsStaff', action:'form')
		"500"(view:'/error')
		
		"/IssueDetailsStaffstaffmagazinerep"(controller:'issueDetailsStaff', action:'staffmagazinerep')
		"500"(view:'/error')
		
		"/IssueDetailsmagazinereport"(controller:'issueDetailsStaff', action:'magazinereport')
		"500"(view:'/error')
		
		
		"/IssueDetailsforms"(controller:'issueDetailsStudent', action:'form')
		"500"(view:'/error')
		
		"/IssueDetailsstudentmagazinereport"(controller:'issueDetailsStudent', action:'studentmagazinereport')
		"500"(view:'/error')
		
		"/IssueDetailsreport"(controller:'issueDetailsStudent', action:'report')
		"500"(view:'/error')
		
		
		"/IssueDetailsforms1"(controller:'issueDetailsStudent', action:'form1')
		"500"(view:'/error')
		
		"/IssueDetailsnewsreport"(controller:'issueDetailsStudent', action:'newsreport')
		"500"(view:'/error')
		
		"/IssueDetailsstudentnewsreport"(controller:'issueDetailsStudent', action:'studentnewsreport')
		"500"(view:'/error')
		
		"/Birthdays"(controller:'birthday', action:'index')
		"500"(view:'/error')
		
		"/VehicleDetail"(controller:'vehicleDetails', action:'index')
		"500"(view:'/error')
		
		"/VehicleDetailshow"(controller:'vehicleDetails', action:'show')
		"500"(view:'/error')
		
		"/VehicleDetailedit"(controller:'vehicleDetails', action:'edit')
		"500"(view:'/error')
		
		"/VehicleDetailcreate"(controller:'vehicleDetails', action:'create')
		"500"(view:'/error')
		
		"/DriverDetail"(controller:'driverDetails', action:'index')
		"500"(view:'/error')
		
		"/DriverDetailcreate"(controller:'driverDetails', action:'create')
		"500"(view:'/error')
		
		"/DriverDetailshow"(controller:'driverDetails', action:'show')
		"500"(view:'/error')
		
		"/DriverDetailedit"(controller:'driverDetails', action:'edit')
		"500"(view:'/error')
		
		"/RouteDetail"(controller:'routeDetails', action:'index')
		"500"(view:'/error')
		
		"/RouteDetailshow"(controller:'routeDetails', action:'show')
		"500"(view:'/error')
		
		"/RouteDetailcreate"(controller:'routeDetails', action:'create')
		"500"(view:'/error')
		
		"/RouteDetailedit"(controller:'routeDetails', action:'edit')
		"500"(view:'/error')
		
		"/DestinationDetails"(controller:'destinationDetails', action:'index')
		"500"(view:'/error')
		
		"/DestinationDetailshow"(controller:'destinationDetails', action:'show')
		"500"(view:'/error')
		
		"/DestinationDetailedit"(controller:'destinationDetails', action:'edit')
		"500"(view:'/error')
		
		"/DestinationDetailcreate"(controller:'destinationDetails', action:'create')
		"500"(view:'/error')
		
		"/Transports"(controller:'transport', action:'index')
		"500"(view:'/error')
		
		"/Transportsshow"(controller:'transport', action:'show')
		"500"(view:'/error')
		
		"/Transportsedit"(controller:'transport', action:'edit')
		"500"(view:'/error')
		
		"/Transportscreate"(controller:'transport', action:'create')
		"500"(view:'/error')
		
		"/TransportFees"(controller:'transportFee', action:'index')
		"500"(view:'/error')
		
		"/TransportFeeshow"(controller:'transportFee', action:'show')
		"500"(view:'/error')
		
		"/TransportFeeedit"(controller:'transportFee', action:'edit')
		"500"(view:'/error')
		
		"/TransportFeecreate"(controller:'transportFee', action:'create')
		"500"(view:'/error')
		
		"/PayHeads"(controller:'payHead', action:'index')
		"500"(view:'/error')
		
		"/PayHeadscreate"(controller:'payHead', action:'create')
		"500"(view:'/error')
		
		"/PayHeadsedit"(controller:'payHead', action:'edit')
		"500"(view:'/error')
		
		"/PayHeadsshow"(controller:'payHead', action:'show')
		"500"(view:'/error')
		
		"/SalarySettings"(controller:'salarySetting', action:'index')
		"500"(view:'/error')
		
		"/SalarySettingscreate"(controller:'salarySetting', action:'create')
		"500"(view:'/error')
		
		"/SalarySettingsshow"(controller:'salarySetting', action:'show')
		"500"(view:'/error')
		
		"/SalarySettingsedit"(controller:'salarySetting', action:'edit')
		"500"(view:'/error')
		
		"/StaffSalarys"(controller:'staffSalary', action:'index')
		"500"(view:'/error')
		
		"/StaffSalaryscreate"(controller:'staffSalary', action:'create')
		"500"(view:'/error')
		
		"/StaffSalarysedit"(controller:'staffSalary', action:'edit')
		"500"(view:'/error')
		
		"/StaffSalarysshow"(controller:'staffSalary', action:'show')
		"500"(view:'/error')
		
		"/PaySlips"(controller:'paySlip', action:'index')
		"500"(view:'/error')
		
		
		"/BulkSMS"(controller:'bulkSMS', action:'index')
		"500"(view:'/error')
		
		"/transferlist"(controller:'student', action:'transferlist')
		"500"(view:'/error')
		
		"/studentPopfeedetailprint"(controller:'student', action:'popfeeprint')
		"500"(view:'/error')
		
		
		"/studentid"(controller:'student', action:'studentid')
		"500"(view:'/error')
		
		"/idcard"(controller:'student', action:'idcard')
		"500"(view:'/error')
		
		"/idcard"(controller:'student', action:'idcard')
		"500"(view:'/error')
		
		"/studenttttt"(controller:'student', action:'studentIdss')
		"500"(view:'/error')
	}
}
