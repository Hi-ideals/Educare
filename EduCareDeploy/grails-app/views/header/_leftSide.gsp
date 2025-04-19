<ul class="page-sidebar-menu  page-header-fixed "
	data-keep-expanded="false" data-auto-scroll="true"
	data-slide-speed="200" style="padding-top: 20px">
	<li class="sidebar-toggler-wrapper hide">
		<div class="sidebar-toggler"></div>
	</li>

	<sec:ifAnyGranted roles="ROLE_ADMIN,ROLE_USERR">

		<regId:getModule name="dashboard" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('dashboard')} "><g:link
					controller="dashboard" action="index" class="nav-link nav-toggle">
					<i class="icon-home"></i>
					<span class="title">Dashboard</span>
					<g:if test="${activ?.getAt('dashboard')}">
						<span class="selected"></span>
					</g:if>
				</g:link></li>
		</g:if>
		<sec:ifAnyGranted roles="ROLE_ADMIN">
			<!--  <li class="nav-item ${activ?.getAt('dashboard')} "><a
			href="javascript:;" class="nav-link nav-toggle"> <i
				class="icon-home"></i> <span class="title">Dashboard</span> <g:if
					test="${activ?.getAt('dashboard')}">
					<span class="selected"></span>
					<span class="arrow open"></span>
				</g:if> <g:else>
					<span class="arrow "></span>
				</g:else>

		</a>
			<ul class="sub-menu">
				<li class="nav-item ${activ?.getAt('dashboard')}"><g:link
						controller="dashboard" class="nav-link ">
						<i class="icon-bar-chart"></i>
						<span class="title">Dashboard </span>

					</g:link></li>

			</ul></li>-->


			<li class="nav-item ${activ?.getAt('roles')} "><g:link
					controller="roles" action="index" class="nav-link nav-toggle">
					<i class="icon-user"></i>
					<span class="title">Create Roles</span>
					<g:if test="${activ?.getAt('roles')}">
						<span class="selected"></span>
					</g:if>
				</g:link></li>

			<li class="nav-item ${activ?.getAt('userlist')} "><g:link
					controller="userList" action="index" class="nav-link nav-toggle">
					<i class="icon-users"></i>
					<span class="title">Create Users</span>
					<g:if test="${activ?.getAt('userlist')}">
						<span class="selected"></span>
					</g:if>
				</g:link></li>
		</sec:ifAnyGranted>

		<regId:getModule name="admission" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('adminssion')} "><g:link
					controller="student" action="create" class="nav-link nav-toggle">
					<i class="fa fa-file"></i>
					<span class="title">Admission Form </span>
					<g:if test="${activ?.getAt('adminssion')}">
						<span class="selected"></span>
					</g:if>

				</g:link></li>
		</g:if>



		<regId:getModule name="readmission" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('readminssion')} "><g:link
					controller="student" action="readmissionList"
					class="nav-link nav-toggle">
					<i class="fa fa-file"></i>
					<span class="title">Readmission Form </span>
					<g:if test="${activ?.getAt('readminssion')}">
						<span class="selected"></span>
					</g:if>

				</g:link></li>
		</g:if>

		<regId:getModule name="student" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('studentInfo')} "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="fa fa-user"></i> <span class="title">Student
						Management</span> <g:if test="${activ?.getAt('studentInfo')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>
			</a>
				<ul class="sub-menu">

					<li class="nav-item ${activ?.getAt('studentList')} "><g:link
							controller="studentList" class="nav-link ">
							<span class="title">Student Details</span>
						</g:link></li>





				</ul></li>
		</g:if>

		<regId:getModule name="feemanagement" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('feeStructure')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="fa fa-rupee"></i> <span class="title">Fee Management</span>
					<g:if test="${activ?.getAt('feeStructure')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('fee')} "><g:link
							controller="fee" class="nav-link ">
							<span class="title">Students Fee Statement</span>
						</g:link></li>
						<li class="nav-item ${activ?.getAt('fee2')} "><g:link
							controller="fee" action="feezeroPaid" class="nav-link ">
							<span class="title">Unpaid student List</span>
						</g:link></li>
						

					<li class="nav-item ${activ?.getAt('fee1')} "><g:link
							controller="fee" action="individualstfee" class="nav-link ">
							<span class="title">Collect Student Fees</span>
						</g:link></li>
						
						<li class="nav-item ${activ?.getAt('fee3')} "><g:link
							controller="fee" action="quickstudentfeelist" class="nav-link ">
							<span class="title">Quick Collect Student Fees</span>
						</g:link></li>

					
					<li class="nav-item ${activ?.getAt('instFeeTypesList')} "><g:link
							controller="instFeeTypes" action="index" class="nav-link ">
							<span class="title">List of Fee Types </span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('instFeeTypes')} "><g:link
							controller="instFeeTypes" action="create" class="nav-link ">
							<span class="title">Add Fee Types </span>
						</g:link></li>


					<li class="nav-item ${activ?.getAt('admissionfeelist')} "><g:link
							controller="admissionfee" action="index" class="nav-link ">
							<span class="title">Admission Fee List</span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('admissionfeecreate')} "><g:link
							controller="admissionfee" action="create" class="nav-link ">
							<span class="title">Add Admission Fee </span>
						</g:link></li>



				</ul></li>
		</g:if>

		<!-- Exam -->
		<regId:getModule name="Exams" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('exams')} "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="icon-home"></i> <span class="title">Exams</span> <g:if
						test="${activ?.getAt('dashboard')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('exam')}"><g:link
							controller="exam" class="nav-link ">
							<i class="icon-bar-chart"></i>
							<span class="title">Exam</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('examDetails')}"><g:link
							controller="examDetails" class="nav-link ">
							<i class="icon-bar-chart"></i>
							<span class="title">Exam Details</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('marks')}"><g:link
							controller="marks" class="nav-link ">
							<i class="icon-bar-chart"></i>
							<span class="title">Marks</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('reports')}"><g:link
							controller="marks" action="studentReports" class="nav-link ">
							<i class="icon-bar-chart"></i>
							<span class="title">Reports</span>
						</g:link></li>
				</ul></li>
		</g:if>
		<!-- EndExam -->
		<!-- library -->
		<regId:getModule name="library" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('LibraryManagement')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="fa fa-book"></i> <span class="title">Library
						Management</span> <g:if test="${activ?.getAt('LibraryManagement')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('books')} "><g:link
							controller="books" action="index" class="nav-link ">
							<span class="title">Books details</span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('magazine')} "><g:link
							controller="magazine" action="index" class="nav-link ">
							<span class="title">Magazine details</span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('newspaper')} "><g:link
							controller="newspaper" action="index" class="nav-link ">
							<span class="title">News Papers details </span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('issueDetails')} "><g:link
							controller="issueDetails" action="index" class="nav-link ">
							<span class="title"> Issued to Student Details </span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('staffissueDetails')} "><g:link
							controller="issueDetails" action="index" class="nav-link "
							params="[staff:true]">
							<span class="title"> Issued to Staff Details </span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('Bookretuen')} "><g:link
							controller="issueDetails" action="bookReturn" class="nav-link ">
							<span class="title">Return by Student</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('bookReturnStaff')} "><g:link
							controller="issueDetails" action="bookReturnStaff"
							class="nav-link ">
							<span class="title">Return By Staff</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('libraryInfo')} "><g:link
							controller="libraryReports" action="index" class="nav-link ">
							<span class="title">Library Details</span>
						</g:link></li>
				</ul></li>
		</g:if>

		<regId:getModule name="booksreport" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('BooksReport')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="icon-notebook"></i> <span class="title">Library
						Reports</span> <g:if test="${activ?.getAt('BooksReport')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>


				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('issuedStudentss')} "><g:link
							controller="issuedBooks" action="issuedStudents"
							class="nav-link ">
							<span class="title">List of Books Issued to Students </span>
						</g:link></li>

					<li
						class="nav-item ${activ?.getAt('issueDetailsStudentNewspaper')} "><g:link
							controller="issueDetailsStudent" action="studentnewsreport"
							class="nav-link ">
							<span class="title">List of Newspaper Issued to Students</span>
						</g:link></li>
					<li
						class="nav-item ${activ?.getAt('issueDetailsStudentManagine')} "><g:link
							controller="issueDetailsStudent" action="studentmagazinereport"
							class="nav-link ">
							<span class="title">List of Magazines Issued to Students </span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('issuedStaffs')} "><g:link
							controller="issuedBooks" action="issuedStaff" class="nav-link ">
							<span class="title"> List of Books Issued to Staff</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('issueDetailsStaffNewspaper')} "><g:link
							controller="issueDetailsStaff" action="staffnewspaperrep"
							class="nav-link ">
							<span class="title">List of Newspaper Issued to Staff</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('issueDetailsStaffManagine')} "><g:link
							controller="issueDetailsStaff" action="staffmagazinerep"
							class="nav-link ">
							<span class="title">List of Magazines Issued to Staff</span>
						</g:link></li>
				</ul></li>
		</g:if>
		<!-- library -->

		<!-- Transport -->
		<regId:getModule name="transport" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('TransportManagement')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="fa fa-bus"></i> <span class="title">Transport
						Management</span> <g:if test="${activ?.getAt('TransportManagement')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('AddVechile')} "><g:link
							controller="vehicleDetails" action="create" class="nav-link ">
							<span class="title">Add Vechile</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('DriverDetails')} "><g:link
							controller="driverDetails" action="create" class="nav-link ">
							<span class="title">Add Driver</span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('RouteDetails')} "><g:link
							controller="routeDetails" action="create" class="nav-link ">
							<span class="title">Add Route</span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('DestinationDetails')} "><g:link
							controller="destinationDetails" action="create" class="nav-link ">
							<span class="title">Add Destination & Fee</span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('Transport')} "><g:link
							controller="transport" action="create" class="nav-link ">
							<span class="title">Transport Allocation</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('TransportFee')} "><g:link
							controller="transportFee" action="create" class="nav-link ">
							<span class="title">Fee Collection</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('TransportFeer')} "><g:link
							controller="transportReport" action="index" class="nav-link ">
							<span class="title">Transport Report</span>
						</g:link></li>



				</ul></li>
		</g:if>


		<regId:getModule name="attendence" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('studentAttendance')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="fa fa-calendar"></i> <span class="title">Attendance
						Management</span> <g:if test="${activ?.getAt('studentAttendance')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('studentattendancecreate')} "><g:link
							controller="studentAttendance" action="create" class="nav-link ">
							<span class="title">Student Attendance</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('studentAttendanceList')} "><g:link
							controller="studentAttendance" action="studentsAttendanceList"
							class="nav-link ">
							<span class="title">Student Attendance List</span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('stafftattendancecreate')} "><g:link
							controller="staffAttendance" action="create" class="nav-link ">
							<span class="title">Staff Attendance</span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('staffAttendanceList')} "><g:link
							controller="staffAttendance" action="staffAttendanceList"
							class="nav-link ">
							<span class="title">Staff Attendance List</span>
						</g:link></li>


				</ul></li>
		</g:if>

		<!-- Payroll -->
		<regId:getModule name="payroll" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('payroll')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="icon-eye"></i> <span class="title">Payroll</span> <g:if
						test="${activ?.getAt('payroll')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('payheadList')} "><g:link
							controller="payHead" action="index" class="nav-link ">
							<span class="title">Staff Pay Head List</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('payheadcreate')} "><g:link
							controller="payHead" action="create" class="nav-link ">
							<span class="title">Add Pay Head</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('salarysettingList')} "><g:link
							controller="salarySetting" action="index" class="nav-link ">
							<span class="title">Staff Salary Setting List</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('salarysettingcreate')} "><g:link
							controller="salarySetting" action="create" class="nav-link ">
							<span class="title">Add Salary Setting</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('staffList')} "><g:link
							controller="staffSalary" action="index" class="nav-link ">
							<span class="title">Staff Salary List</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('staffcreate')} "><g:link
							controller="staffSalary" action="create" class="nav-link ">
							<span class="title">Add Staff Salary</span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('paySlip')} "><g:link
							controller="paySlip" action="index" class="nav-link ">
							<span class="title">Generate Pay Slip</span>
						</g:link></li>

				</ul></li>
		</g:if>

		<!-- End Payroll -->

		<!-- Settings -->
		<regId:getModule name="settings" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('Settings')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="icon-settings"></i> <span class="title">Settings</span> <g:if
						test="${activ?.getAt('Settings')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<%--
				<li class="nav-item ${activ?.getAt('coursesList')} "><g:link
						controller="courses" action="index" class="nav-link ">
						<span class="title">List of Course</span>
					</g:link></li>
				<li class="nav-item ${activ?.getAt('courses')} "><g:link
						controller="courses" action="create" class="nav-link ">
						<span class="title">Add Course</span>
					</g:link></li>
				 --%>
					<li class="nav-item ${activ?.getAt('IClassList')} "><g:link
							controller="IClass" action="index" class="nav-link ">
							<span class="title">List of Class</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('IClass')} "><g:link
							controller="IClass" action="create" class="nav-link ">
							<span class="title">Add Class</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('sectionList')} "><g:link
							controller="section" action="index" class="nav-link ">
							<span class="title">LIst of Section</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('section')} "><g:link
							controller="section" action="create" class="nav-link ">
							<span class="title">Add Section</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('instituiteList')} "><g:link
							controller="instituite" class="nav-link ">
							<span class="title">Institute Details</span>

						</g:link></li>


				</ul></li>
		</g:if>
		<!-- End settings -->

		<!-- Staff -->
		<regId:getModule name="staff" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('staff')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="fa fa-group"></i> <span class="title">Staff</span> <g:if
						test="${activ?.getAt('staff')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('staffList')} "><g:link
							controller="staff" action="index" class="nav-link ">
							<span class="title">Staff List</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('staffcreate')} "><g:link
							controller="staff" action="create" class="nav-link ">
							<span class="title">Add Staff</span>
						</g:link></li>

				</ul></li>
		</g:if>

		<!-- End Staff -->



		<!-- Batch/Academic Year -->
		<regId:getModule name="academicyear" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('batch')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="fa fa-calendar"></i> <span class="title">Academic
						Year</span> <g:if test="${activ?.getAt('batch')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('batchList')} "><g:link
							controller="batch" action="index" class="nav-link ">
							<span class="title">List of Academic Year </span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('batchcreate')} "><g:link
							controller="batch" action="create" class="nav-link ">
							<span class="title">Add Academic Year</span>
						</g:link></li>

				</ul></li>
		</g:if>

		<!-- End Batch/Academic Year -->

		<!-- Subjects -->
		<regId:getModule name="subjects" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('subject')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="fa fa-pencil"></i> <span class="title">Subjects</span> <g:if
						test="${activ?.getAt('subject')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('subjectList')} "><g:link
							controller="subject" action="index" class="nav-link ">
							<span class="title">List of subjects </span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('subjectcreate')} "><g:link
							controller="subject" action="create" class="nav-link ">
							<span class="title">Add subject</span>
						</g:link></li>

				</ul></li>
		</g:if>

		<!-- End Subjects -->

		<!-- Super Admin -->
		<sec:ifAnyGranted roles="ROLE_SUPERADMIN">
			<li class="nav-item ${activ?.getAt('superAdmin')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="icon-settings"></i> <span class="title">Admin
						Settings </span> <g:if test="${activ?.getAt('superAdmin')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('adminList')} "><g:link
							controller="admin" action="index" class="nav-link ">
							<span class="title">Admin List</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('createAdmin')} "><g:link
							controller="admin" action="create" class="nav-link ">
							<span class="title">Add Admin</span>
						</g:link></li>

				</ul></li>
		</sec:ifAnyGranted>

		<%--
		<sec:ifAllGranted roles="ROLE_STUDENT">
			<li class="nav-item ${activ?.getAt('gallery')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="fa fa-image"></i> <span class="title">Gallery </span> <g:if
						test="${activ?.getAt('gallery')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('galleryList')} "><g:link
							controller="gallery" class="nav-link ">
							<span class="title">Gallery List</span>
						</g:link></li>


				</ul></li>
		</sec:ifAllGranted>
		 --%>

<!-- Transfered Students -->
<regId:getModule name="admission" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('transfer')} ">
			<g:link
					controller="student" action="transferlist" class="nav-link nav-toggle">
					<i class="fa fa-file"></i>
					<span class="title">Transferred Student List</span>
					<g:if test="${activ?.getAt('transfer')}">
						<span class="selected"></span>
					</g:if>

				</g:link></li>
		</g:if>


		<!-- Certificates -->
		<regId:getModule name="certificates" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('Certificates')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="fa fa-file"></i> <span class="title">Certificates</span> <g:if
						test="${activ?.getAt('Certificates')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('bonafiedcertificate')} "><g:link
							controller="bonafiedcrt" action="index" class="nav-link ">
							<span class="title">Bonafied certificate</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('studycertificate')} "><g:link
							controller="studycertificate" action="index" class="nav-link ">
							<span class="title">Study Certificate</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('holidaynotice')} "><g:link
							controller="holiday" action="index" class="nav-link ">
							<span class="title">Holiday Notice</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('charactercertificate')} "><g:link
							controller="charactercertificate" action="index"
							class="nav-link ">
							<span class="title">Character Certificate</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('transfercertificate')} "><g:link
							controller="transfercertificate" action="index" class="nav-link ">
							<span class="title">Transfer Certificate</span>
						</g:link></li>
				</ul></li>
		</g:if>
		<!--End Of Certificates -->

		<!-- Reports -->
		<regId:getModule name="reports" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('reports')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="fa fa-files-o"></i> <span class="title">Reports</span> <g:if
						test="${activ?.getAt('Reports')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('GetStudentList1')} "><g:link
							controller="listofStudents" action="index" class="nav-link ">
							<span class="title">Student list</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('feelist1')} "><g:link
							controller="listofFees" action="index" class="nav-link ">
							<span class="title">Fees List</span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('feetypes1')} "><g:link
							controller="listofFeeTypes" action="index" class="nav-link ">
							<span class="title">Fee Types</span>
						</g:link></li>
				</ul></li>
		</g:if>
		<regId:getModule name="BirthDays" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('BirthDays')} "><g:link
					controller="birthday" action="index" class="nav-link nav-toggle">
					<i class="fa fa-birthday-cake"></i>
					<span class="title">Birth Day's</span>
					<g:if test="${activ?.getAt('BirthDays')}">
						<span class="selected"></span>
					</g:if>

				</g:link></li>
		</g:if>

		<!--End Of Reports -->

		<!-- Time Table -->
		<regId:getModule name="timetable" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('tt')}  "><a
				href="javascript:;" class="nav-link nav-toggle"> <i
					class="fa fa-table"></i> <span class="title">Time Table</span> <g:if
						test="${activ?.getAt('tt')}">
						<span class="selected"></span>
						<span class="arrow open"></span>
					</g:if> <g:else>
						<span class="arrow "></span>
					</g:else>

			</a>
				<ul class="sub-menu">
					<li class="nav-item ${activ?.getAt('ttList')} "><g:link
							controller="timetableDisplay" action="timeTableDate"
							class="nav-link ">
							<span class="title">Class TimeTable </span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('ttstaffList')} "><g:link
							uri="/StaffTimeTable" class="nav-link ">
							<span class="title">Staff TimeTable </span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('ttcreate')} "><g:link
							controller="timeTable" action="create" class="nav-link ">
							<span class="title">Add TimeTable</span>
						</g:link></li>

					<li class="nav-item ${activ?.getAt('ptList')} "><g:link
							controller="period_Timings" action="index" class="nav-link ">
							<span class="title">Listof Periods </span>
						</g:link></li>
					<li class="nav-item ${activ?.getAt('ptcreate')} "><g:link
							controller="period_Timings" action="create" class="nav-link ">
							<span class="title">Add Period Timings</span>
						</g:link></li>

				</ul></li>
		</g:if>
		<!-- End Staff -->


		<!-- Bulk SMS -->
		<regId:getModule name="BulkSMS" />
		<g:if test="${module}">
			<li class="nav-item ${activ?.getAt('BulkSMS')} "><g:link
					controller="bulkSMS" action="index" class="nav-link nav-toggle">
					<i class="fa fa-envelope"></i>
					<span class="title">Bulk SMS</span>
					<g:if test="${activ?.getAt('BulkSMS')}">
						<span class="selected"></span>
					</g:if>

				</g:link></li>
		</g:if>

		<!-- End Bulk SMS -->

      <!-- Student Idcard -->
		
			<li class="nav-item ${activ?.getAt('idcard')} "><g:link
					controller="student" action="idcard" class="nav-link nav-toggle">
					<i class="fa fa-envelope"></i>
					<span class="title">Student Id</span>
					<g:if test="${activ?.getAt('idcard')}">
						<span class="selected"></span>
					</g:if>

				</g:link></li>
		

		<!-- Student Idcard -->


	</sec:ifAnyGranted>

</ul>

