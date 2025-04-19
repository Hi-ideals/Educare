                                                                                          
/*-------------------------------------------------start validation student create---------------------------------*/
/*-----------validation for mEDIUM oF iNSTRUCTION-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#mediumOfInstruction');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#mInstruction').show();
			return false;
		} else {
			$('#mInstruction').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="mediumOfInstruction"]').on('change', function() {

		var input = $('#mediumOfInstruction');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#mInstruction').show();

		} else {
			$('#mInstruction').hide();

		}
	});
});
/*------eND oF mEDIUM oF iNSTRUCTION--------*/
/*-----------validation for Registration number-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#registrationNo');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SregistrationNo').show();
			return false;
		} else {
			$('#SregistrationNo').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="registrationNo"]').on('change', function() {

		var input = $('#registrationNo');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SregistrationNo').show();

		} else {
			$('#SregistrationNo').hide();

		}
	});
});

/*-----------validation for Batch number-------------
$(document).ready(function() {
	$('#student').click(function() {
		var date = $('#batchno').val();

		if ($.trim(date) == 0) {
			$('#Sbatchno').show();
			return false;
		}

	});

	$('[id="batchno"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Sbatchno').show();
		} else {
			$('#Sbatchno').hide();

		}
	});
});*/
/*-----------validation for PresentClass-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		var date = $('#presentclass').val();

		if ($.trim(date) == 0) {
			$('#Spresentclass').show();
			return false;
		}

	});

	$('[id="presentclass"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Spresentclass').show();
		} else {
			$('#Spresentclass').hide();

		}
	});
});

/*-----------validation for Add Academic year-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#academicyear');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Sacademicyear').show();
			return false;
		} else {
			$('#Sacademicyear').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="academicyear"]').on('change', function() {

		var input = $('#academicyear');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Sacademicyear').show();

		} else {
			$('#Sacademicyear').hide();

		}
	});
});

/*-----------validation for Student id-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#studentId');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SstudentId').show();
			return false;
		} else {
			$('#SstudentId').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="studentId"]').on('change', function() {
		var input = $('#studentId');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SstudentId').show();

		} else {
			$('#SstudentId').hide();

		}
	});
});

/*-----------validation for Student Firt namer-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#studentName');
		var regexp = /^([a-zA-Z]+\s?){3,50}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SstudentName').show();
			return false;
		} else {
			$('#SstudentName').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="studentName"]').on('change', function() {

		var input = $('#studentName');
		var regexp = /^([a-zA-Z]+\s?){3,50}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SstudentName').show();

		} else {
			$('#SstudentName').hide();

		}
	});
});

/*-----------validation for Last Name-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#lastName');
		var regexp = /^([a-zA-Z]+\s?){3,50}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SlastName').show();
			return false;
		} else {
			$('#SlastName').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="lastName"]').on('change', function() {

		var input = $('#lastName');
		var regexp = /^([a-zA-Z]+\s?){3,50}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SlastName').show();

		} else {
			$('#SlastName').hide();

		}
	});
});
/*-----------validation for datepicke-------------*/
$(document).ready(function() {
 	$('#student').click(function() {
 		var input = $('#datepicker').val();
 		if (input == '') {
 			$('#Sdatepickerdob').show();
			return false;
 		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
 			$('#Sdatepickerdob1').show();
 		} else {
 			$('#Sdatepickerdob').hide();
 			$('#Sdatepickerdob1').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="datepicker"]').on('change', function() {
 		var input = $('#datepicker').val();
 		if (input == '') {
 			$('#Sdatepickerdob1').hide();
 			$('#Sdatepickerdob').show();
 		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
 			$('#Sdatepickerdob1').show();
 			$('#Sdatepickerdob').hide();
 		} else {
 			$('#Sdatepickerdob').hide();
 			$('#Sdatepickerdob1').hide();
 		}
 	});
 }); 	
/*-----------validation for datepicker1-------------*/
 $(document).ready(function() {
	 	$('#student').click(function() {
	 		var input = $('#datepicker1').val();
	 		if (input == '') {
	 			$('#Sdatepickerdoj').show();
				return false;
	 		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
	 			$('#Sdatepickerdoj1').show();
	 		} else {
	 			$('#Sdatepickerdoj').hide();
	 			$('#Sdatepickerdoj1').hide();
	 		}
	 	});
	 });
	 $(document).ready(function() {
	 	$('[id="datepicker1"]').on('change', function() {
	 		var input = $('#datepicker1').val();
	 		if (input == '') {
	 			$('#Sdatepickerdoj1').hide();
	 			$('#Sdatepickerdoj').show();
	 		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
	 			$('#Sdatepickerdoj1').show();
	 			$('#Sdatepickerdoj').hide();
	 		} else {
	 			$('#Sdatepickerdoj').hide();
	 			$('#Sdatepickerdoj1').hide();
	 		}
	 	});
	 }); 	
/*-----------validation for Blood Group-------------*/
	 /*
	 $(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#bloodgroup');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Sbloodgroup').show();
			return false;
		} else {
			$('#Sbloodgroup').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="bloodgroup"]').on('change', function() {

		var input = $('#bloodgroup');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Sbloodgroup').show();

		} else {
			$('#Sbloodgroup').hide();

		}
	});
});
*/
/*-----------validation for Mother Tonge-------------*/
/*$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#motherTongue');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SmotherTongue').show();
			return false;
		} else {
			$('#SmotherTongue').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="motherTongue"]').on('change', function() {

		var input = $('#motherTongue');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SmotherTongue').show();

		} else {
			$('#SmotherTongue').hide();

		}
	});
});
*/
/*-----------validation for Religion-------------*/
/*$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#religion');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {

			$('#Sreligion').show();
			return false;
		} else {
			$('#Sreligion').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="religion"]').on('change', function() {

		var input = $('#religion');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Sreligion').show();

		} else {
			$('#Sreligion').hide();

		}
	});
});*/
/*-----------validation for gender-------------
$(document).ready(function() {
	$('#student').click(function() {
		var date = $('#gender').val();

		if ($.trim(date) == 0) {
			$('#Sgender').show();
			return false;
		}

	});

	$('[id="gender"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Sgender').show();
		} else {
			$('#Sgender').hide();

		}
	});
});
*/
/*-----------validation for Father name-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#parentNamefatherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {

			$('#SparentNamefatherDetails').show();
			return false;
		} else {
			$('#SparentNamefatherDetails').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="parentNamefatherDetails"]').on('change', function() {

		var input = $('#parentNamefatherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SparentNamefatherDetails').show();

		} else {
			$('#SparentNamefatherDetails').hide();

		}
	});
});



/*-----------validation for Father Mobile number-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#mobileNumberfatherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {

			$('#SmobileNumberfatherDetails').show();
			return false;
		} else {
			$('#SmobileNumberfatherDetails').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="mobileNumberfatherDetails"]').on('change', function() {

		var input = $('#mobileNumberfatherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SmobileNumberfatherDetails').show();

		} else {
			$('#SmobileNumberfatherDetails').hide();

		}
	});
});


/*-----------validation for Mother name-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#parentNamemotherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {

			$('#SparentNamemotherDetails').show();
			return false;
		} else {
			$('#SparentNamemotherDetails').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="parentNamemotherDetails"]').on('change', function() {

		var input = $('#parentNamemotherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SparentNamemotherDetails').show();

		} else {
			$('#SparentNamemotherDetails').hide();

		}
	});
});


/*-----------validation for GUARDIAN name-------------*/
/*$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#parentNameguardianDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {

			$('#SparentNameguardianDetails').show();
			return false;
		} else {
			$('#SparentNameguardianDetails').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="parentNameguardianDetails"]').on('change', function() {

		var input = $('#parentNameguardianDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SparentNameguardianDetails').show();

		} else {
			$('#SparentNameguardianDetails').hide();

		}
	});
});*/

function guardian() {
	var age = document.getElementById('parentNameguardianDetails').value
	if (age == "" || age == null) {
		document.getElementById('errorguardianDetails').innerHTML=""
	} else {
		var age = document.getElementById('parentNameguardianDetails').value
		var re = /^.{3,}$/
		if (!new RegExp(re).test(age)) {
			document.getElementById('errorguardianDetails').innerHTML="Provide your guardian name"
		}else{
			document.getElementById('errorguardianDetails').innerHTML=""
			}
	}
}

/*-----------validation for Father Occupation-------------*/
/*$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#OccupationfatherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {

			$('#SOccupationfatherDetails').show();
			return false;
		} else {
			$('#SOccupationfatherDetails').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="OccupationfatherDetails"]').on('change', function() {

		var input = $('#OccupationfatherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SOccupationfatherDetails').show();

		} else {
			$('#SOccupationfatherDetails').hide();

		}
	});
});*/
/*-----------validation for Mother Occupation-------------*/
/*$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#OccupationmotherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {

			$('#SOccupationmotherDetails').show();
			return false;
		} else {
			$('#SOccupationmotherDetails').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="OccupationmotherDetails"]').on('change', function() {

		var input = $('#OccupationmotherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SOccupationmotherDetails').show();

		} else {
			$('#SOccupationmotherDetails').hide();

		}
	});
});*/

/*-----------validation for GUARDIAN Occupation-------------*/
/*$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#OccupationguardianDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {

			$('#SOccupationguardianDetails').show();
			return false;
		} else {
			$('#SOccupationguardianDetails').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="OccupationguardianDetails"]').on('change', function() {

		var input = $('#OccupationguardianDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SOccupationguardianDetails').show();

		} else {
			$('#SOccupationguardianDetails').hide();

		}
	});
});*/
function Occupation() {
	var age = document.getElementById('OccupationguardianDetails').value
	if (age == "" || age == null) {
		document.getElementById('error1guardianDetails').innerHTML=""
	} else {
		var age = document.getElementById('OccupationguardianDetails').value
		var re = /^.{2,}$/
		if (!new RegExp(re).test(age)) {
			document.getElementById('error1guardianDetails').innerHTML="Provide your guardian Occupation"
		}else{
			document.getElementById('error1guardianDetails').innerHTML=""
			}
	}
}


/*-----------validation for Father Relation-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#RelationfatherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {

			$('#SRelationfatherDetails').show();
			return false;
		} else {
			$('#SRelationfatherDetails').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="RelationfatherDetails"]').on('change', function() {

		var input = $('#RelationfatherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SRelationfatherDetails').show();

		} else {
			$('#SRelationfatherDetails').hide();

		}
	});
});

/*-----------validation for Mother Relation-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#RelationmotherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {

			$('#SRelationmotherDetails').show();
			return false;
		} else {
			$('#SRelationmotherDetails').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="RelationmotherDetails"]').on('change', function() {

		var input = $('#RelationmotherDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SRelationmotherDetails').show();

		} else {
			$('#SRelationmotherDetails').hide();

		}
	});
});

/*-----------validation for GUARDIAN Relation-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		
		var input = $('#RelationguardianDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {

			$('#SRelationguardianDetails').show();
			return false;
		} else {
			$('#SRelationguardianDetails').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="RelationguardianDetails"]').on('change', function() {

		var input = $('#RelationguardianDetails');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SRelationguardianDetails').show();

		} else {
			$('#SRelationguardianDetails').hide();

		}
	});
});


/*-----------validation for house number presentaddress-------------*/
/*$(document).ready(function() {
	$('#student').click(function() {
		var input = $('#presentAddressh');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SpresentAddress').show();
			return false;
		} else {
			$('#SpresentAddress').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="presentAddressh"]').on('change', function() {

		var input = $('#presentAddressh');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SpresentAddress').show();

		} else {
			$('#SpresentAddress').hide();

		}
	});
});*/


/*-----------validation for house number permenentaddress-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		var input = $('#permenentAddresh');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SpermenentAddres').show();
			return false;
		} else {
			$('#SpermenentAddres').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="permenentAddresh"]').on('change', function() {

		var input = $('#permenentAddresh');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SpermenentAddres').show();

		} else {
			$('#SpermenentAddres').hide();

		}
	});
});



/*-----------validation for Street-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		var input = $('#presentAddresssr');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#StpresentAddress').show();
			return false;
		} else {
			$('#StpresentAddress').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="presentAddresssr"]').on('change', function() {

		var input = $('#presentAddresssr');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#StpresentAddress').show();

		} else {
			$('#StpresentAddress').hide();

		}
	});
});





/*-----------validation for Street1-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		var input = $('#permenentAddressr');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#StpermenentAddres').show();
			return false;
		} else {
			$('#StpermenentAddres').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="permenentAddressr"]').on('change', function() {

		var input = $('#permenentAddressr');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#StpermenentAddres').show();

		} else {
			$('#StpermenentAddres').hide();

		}
	});
});

/*-----------validation for City-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		var input = $('#presentAddressci');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#CpresentAddress').show();
			return false;
		} else {
			$('#CpresentAddress').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="presentAddressci"]').on('change', function() {

		var input = $('#presentAddressci');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#CpresentAddress').show();

		} else {
			$('#CpresentAddress').hide();

		}
	});
});


/*-----------validation for City1-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		var input = $('#permenentAddresci');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#CpermenentAddres').show();
			return false;
		} else {
			$('#CpermenentAddres').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="permenentAddresci"]').on('change', function() {

		var input = $('#permenentAddresci');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#CpermenentAddres').show();

		} else {
			$('#CpermenentAddres').hide();

		}
	});
});

/*-----------validation for state-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		var input = $('#presentAddressst');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#StatpresentAddress').show();
			return false;
		} else {
			$('#StatpresentAddress').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="presentAddressst"]').on('change', function() {

		var input = $('#presentAddressst');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#StatpresentAddress').show();

		} else {
			$('#StatpresentAddress').hide();

		}
	});
});

/*-----------validation for state1-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		var input = $('#permenentAddresst');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#StatpermenentAddres').show();
			return false;
		} else {
			$('#StatpermenentAddres').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="permenentAddresst"]').on('change', function() {

		var input = $('#permenentAddresst');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#StatpermenentAddres').show();

		} else {
			$('#StatpermenentAddres').hide();

		}
	});
});


/*-----------validation for Country-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		var input = $('#presentAddressc');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#CoupresentAddress').show();
			return false;
		} else {
			$('#CoupresentAddresss').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="presentAddressc"]').on('change', function() {

		var input = $('#presentAddressc');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#CoupresentAddress').show();

		} else {
			$('#CoupresentAddress').hide();

		}
	});
});

/*-----------validation for Country1-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		var input = $('#permenentAddresc');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#CoupermenentAddres').show();
			return false;
		} else {
			$('#CoupermenentAddres').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="permenentAddresc"]').on('change', function() {

		var input = $('#permenentAddresc');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#CoupermenentAddres').show();

		} else {
			$('#CoupermenentAddres').hide();

		}
	});
});

/*-----------validation for pincode-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		var input = $('#presentAddressp');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#pinpresentAddress').show();
			return false;
		} else {
			$('#pinpresentAddress').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="presentAddressp"]').on('change', function() {

		var input = $('#presentAddressp');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#pinpresentAddress').show();

		} else {
			$('#pinpresentAddress').hide();

		}
	});
});


/*-----------validation for pincode1-------------*/
$(document).ready(function() {
	$('#student').click(function() {
		var input = $('#permenentAddresp');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#pinpermenentAddres').show();
			return false;
		} else {
			$('#pinpermenentAddres').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="permenentAddresp"]').on('change', function() {

		var input = $('#permenentAddresp');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#pinpermenentAddres').show();

		} else {
			$('#pinpermenentAddres').hide();

		}
	});
});


/*-------------------------------------------------End validation student create ---------------------------------*/
/*-------------------------------------------------Start validation FILL PREVIOUS STUDY DETAILS ---------------------------------*/
/*-----------validation for Schoolname-------------*/
$(document).ready(function() {
	$('#Educationcreate').click(function() {
		var input = $('#schoolname');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Eschoolname').show();
			return false;
		} else {
			$('#Eschoolname').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="schoolname"]').on('change', function() {

		var input = $('#schoolname');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Eschoolname').show();

		} else {
			$('#Eschoolname').hide();

		}
	});
});

/*-----------validation for qualification-------------*/
$(document).ready(function() {
	$('#Educationcreate').click(function() {
		var input = $('#qualification');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Equalification').show();
			return false;
		} else {
			$('#Equalification').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="qualification"]').on('change', function() {

		var input = $('#qualification');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Equalification').show();

		} else {
			$('#Equalification').hide();

		}
	});
});

/*-----------validation for EmarksPercentage-------------*/
$(document).ready(function() {
	$('#Educationcreate').click(function() {
		var input = $('#marksPercentage');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#EmarksPercentage').show();
			return false;
		} else {
			$('#EmarksPercentage').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="marksPercentage"]').on('change', function() {

		var input = $('#marksPercentage');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#EmarksPercentage').show();

		} else {
			$('#EmarksPercentage').hide();

		}
	});
});


/*-----------validation for transferCertificatId------------*/
$(document).ready(function() {
	$('#Educationcreate').click(function() {
		var input = $('#transferCertificatId');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#EtransferCertificatId').show();
			return false;
		} else {
			$('#EtransferCertificatId').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="transferCertificatId"]').on('change', function() {

		var input = $('#transferCertificatId');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#EtransferCertificatId').show();

		} else {
			$('#EtransferCertificatId').hide();

		}
	});
});


/*-----------validation for House number-------------*/
$(document).ready(function() {
	$('#Educationcreate').click(function() {
		var input = $('#schoolAddress');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#EschoolAddress').show();
			return false;
		} else {
			$('#EschoolAddress').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="schoolAddress"]').on('change', function() {

		var input = $('#schoolAddress');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#EschoolAddress').show();

		} else {
			$('#EschoolAddress').hide();

		}
	});
});


/*-----------validation for Starte-------------*/
$(document).ready(function() {
	$('#Educationcreate').click(function() {
		var input = $('#SStreet');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#ESStreet').show();
			return false;
		} else {
			$('#ESStreet').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="SStreet"]').on('change', function() {

		var input = $('#SStreet');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#ESStreet').show();

		} else {
			$('#ESStreet').hide();

		}
	});
});


/*-----------validation for City-------------*/
$(document).ready(function() {
	$('#Educationcreate').click(function() {
		var input = $('#SCity');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#ESCity').show();
			return false;
		} else {
			$('#ESCity').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="SCity"]').on('change', function() {

		var input = $('#SCity');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#ESCity').show();

		} else {
			$('#ESCity').hide();

		}
	});
});


/*-----------validation for State-------------*/
$(document).ready(function() {
	$('#Educationcreate').click(function() {
		var input = $('#SState');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#ESState').show();
			return false;
		} else {
			$('#ESState').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="SState"]').on('change', function() {

		var input = $('#SState');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#ESState').show();

		} else {
			$('#ESState').hide();

		}
	});
});


/*-----------validation for Country-------------*/
$(document).ready(function() {
	$('#Educationcreate').click(function() {
		var input = $('#Scountry');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#EScountry').show();
			return false;
		} else {
			$('#EScountry').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="Scountry"]').on('change', function() {

		var input = $('#Scountry');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#EScountry').show();

		} else {
			$('#EScountry').hide();

		}
	});
});
/*-------------------------------------------------End validation FILL PREVIOUS STUDY DETAILS ---------------------------------*/


/*------------------------------------------------Start validation Fee Details ---------------------------------*/
/*-----------validation for Registration number-------------*/
$(document).ready(function() {
	$('#createnewfee').click(function() {
		
		var input = $('#feetypename');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Afeetypename').show();
			return false;
		} else {
			$('#Afeetypename').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="feetypename"]').on('change', function() {

		var input = $('#feetypename');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Afeetypename').show();

		} else {
			$('#Afeetypename').hide();

		}
	});
});

/*-----------validation for Batch number-------------*/
$(document).ready(function() {
	$('#createnewfee').click(function() {
		var date = $('#iclass').val();

		if ($.trim(date) == 0) {
			$('#Aiclass').show();
			return false;
		}

	});

	$('[id="iclass"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Aiclass').show();
		} else {
			$('#Aiclass').hide();

		}
	});
});



$(document).ready(function() {
	$('#createnewfee').click(function() {
		
		var input = $('#Description');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#ADescription').show();
			return false;
		} else {
			$('#ADescription').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="Description"]').on('change', function() {

		var input = $('#Description');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#ADescription').show();

		} else {
			$('#ADescription').hide();

		}
	});
});

$(document).ready(function() {
	$('#createnewfee').click(function() {
		
		var input = $('#totalamount');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Atotalamount').show();
			return false;
		} else {
			$('#Atotalamount').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="totalamount"]').on('change', function() {

		var input = $('#totalamount');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Atotalamount').show();

		} else {
			$('#Atotalamount').hide();

		}
	});
});
/*------------------------------------------------End validation Fee Details ---------------------------------*/


/*------------------------------------------------Start validation CREATE CLASS ---------------------------------*/
/*-----------validation for State-------------*/
$(document).ready(function() {
	$('#createclass').click(function() {
		var input = $('#classID');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());	
		if (check == false) {
			$('#SclassID').show();
			return false;
		} else {
			$('#SclassID').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="classID"]').on('change', function() {
		var input = $('#classID');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SclassID').show();

		} else {
			$('#SclassID').hide();

		}
	});
});


/*-----------validation for State-------------*/
$(document).ready(function() {
	$('#createclass').click(function() {
		var input = $('#Classname');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SClassname').show();
			return false;
		} else {
			$('#SClassname').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="Classname"]').on('change', function() {
		var input = $('#Classname');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SClassname').show();

		} else {
			$('#SClassname').hide();

		}
	});
});

/*------------------------------------------------End validation CREATE CLASS ---------------------------------*/


/*------------------------------------------------Start validation CREATE SECTIONS ---------------------------------*/
/*-----------validation for State-------------*/
$(document).ready(function() {
	$('#Createsecation').click(function() {
		
		var input = $('#SectionName');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SSectionName').show();
			return false;
		} else {
			$('#SSectionName').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="SectionName"]').on('change', function() {

		var input = $('#SectionName');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SSectionName').show();

		} else {
			$('#SSectionName').hide();

		}
	});
});


/*-----------validation for State-------------*/
$(document).ready(function() {
	$('#Createsecation').click(function() {
		
		var input = $('#sec');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Ssec').show();
			return false;
		} else {
			$('#Ssec').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="sec"]').on('change', function() {

		var input = $('#sec');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Ssec').show();

		} else {
			$('#Ssec').hide();

		}
	});
});
/*------------------------------------------------End validation CREATE SECTIONS ---------------------------------*/

/*------------------------------------------------Start validation ADD STAFF---------------------------------*/
/*-----------validation for Staffid-------------*/
$(document).ready(function() {
	$('#CreateStaf').click(function() {
		
		var input = $('#staffID');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SstaffID').show();
			return false;
		} else {
			$('#SstaffID').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="staffID"]').on('change', function() {

		var input = $('#staffID');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SstaffID').show();

		} else {
			$('#SstaffID').hide();

		}
	});
});
/*-----------validation for Staff name-------------*/
$(document).ready(function() {
	$('#CreateStaf').click(function() {
		
		var input = $('#staffName');
		var regexp = /^.{1,}[a-zA-Z]$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SstaffName').show();
			return false;
		} else {
			$('#SstaffName').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="staffName"]').on('change', function() {

		var input = $('#staffName');
		var regexp = /^.{1,}[a-zA-Z]$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SstaffName').show();

		} else {
			$('#SstaffName').hide();

		}
	});
});

/*-----------validation for Quliofication-------------*/
$(document).ready(function() {
	$('#CreateStaf').click(function() {
		
		var input = $('#Qualification');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SQualification').show();
			return false;
		} else {
			$('#SQualification').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="Qualification"]').on('change', function() {

		var input = $('#Qualification');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SQualification').show();

		} else {
			$('#SQualification').hide();

		}
	});
});

/*-----------validation for Select a Subjeact-------------*/
$(document).ready(function() {
	$('#CreateStaf').click(function() {
		var date = $('#teachingSubject').val();

		if ($.trim(date) == 0) {
			$('#SteachingSubject').show();
			return false;
		}

	});

	$('[id="teachingSubject"]').on('change', function() {
		if ($(this).val() == "") {
			$('#SteachingSubject').show();
		} else {
			$('#SteachingSubject').hide();

		}
	});
});
/*-----------validation for H.no-------------*/
$(document).ready(function() {
	$('#CreateStaf').click(function() {
		
		var input = $('#address');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Saddress').show();
			return false;
		} else {
			$('#Saddress').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="address"]').on('change', function() {

		var input = $('#address');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Saddress').show();

		} else {
			$('#Saddress').hide();

		}
	});
});

/*-----------validation for Street-------------*/
$(document).ready(function() {
	$('#CreateStaf').click(function() {
		
		var input = $('#Street');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SStreet').show();
			return false;
		} else {
			$('#SStreet').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="Street"]').on('change', function() {

		var input = $('#Street');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SStreet').show();

		} else {
			$('#SStreet').hide();

		}
	});
});

/*-----------validation for City-------------*/
$(document).ready(function() {
	$('#CreateStaf').click(function() {
		
		var input = $('#City');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SCity').show();
			return false;
		} else {
			$('#SCity').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="City"]').on('change', function() {

		var input = $('#City');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SCity').show();

		} else {
			$('#SCity').hide();

		}
	});
});

/*-----------validation for State-------------*/
$(document).ready(function() {
	$('#CreateStaf').click(function() {
		
		var input = $('#State');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SState').show();
			return false;
		} else {
			$('#SState').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="State"]').on('change', function() {

		var input = $('#State');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SState').show();

		} else {
			$('#SState').hide();

		}
	});
});

/*-----------validation for Country-------------*/
$(document).ready(function() {
	$('#CreateStaf').click(function() {
		
		var input = $('#Country');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#SCountry').show();
			return false;
		} else {
			$('#SCountry').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="Country"]').on('change', function() {

		var input = $('#Country');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#SCountry').show();

		} else {
			$('#SCountry').hide();

		}
	});
});

/*-----------validation for phone number-------------*/
$(document).ready(function() {
	$('#CreateStaf').click(function() {		
		var input = $('#phone');
		var regexp = /\+?\d[\d -]{8,15}\d/;
		var check = regexp.test(input.val());		
		if (check == false) {
			$('#Sphone').show();
			return false;
		} else {
			$('#Sphone').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="phone"]').on('change', function() {
		var input = $('#phone');
		var regexp = /\+?\d[\d -]{8,15}\d/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Sphone').show();
		} else {
			$('#Sphone').hide();

		}
	});
});


/*-----------validation for Select a Staff Type-------------*/
$(document).ready(function() {
	$('#CreateStaf').click(function() {
		var date = $('#institute').val();
		if ($.trim(date) == 0) {
			$('#Sinstitute').show();
			return false;
		}
	});
	$('[id="institute"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Sinstitute').show();
		} else {
			$('#Sinstitute').hide();
		}
	});
});



/*------------------------------------------------End validation ADD STAFF ---------------------------------*/
/*------------------------------------------------Start validation ADD BATCH ---------------------------------*/
/*-----------validation for Last Name-------------*/
$(document).ready(function() {
	$('#Createbatch').click(function() {
		
		var input = $('#batchname');
		var regexp = /^.{1,}[0-9 @!#\$\^%&*()+=\-\[\]\\\';,\.\/\{\}\|\":<>\? ]$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Sbatchname').show();
			return false;
		} else {
			$('#Sbatchname').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="batchname"]').on('change', function() {

		var input = $('#batchname');
		var regexp = /^.{1,}[0-9 @!#\$\^%&*()+=\-\[\]\\\';,\.\/\{\}\|\":<>\? ]$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Sbatchname').show();

		} else {
			$('#Sbatchname').hide();

		}
	});
});

/*-----------validation for datepicke-------------*/
$(document).ready(function() {
	$('#Createbatch').click(function() {
		
		var input = $('#datepicker');
		var regexp = /^\d{2}\/\d{2}\/\d{4}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Sdatepicker').show();
			return false;
		} else {
			$('#Sdatepicker').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="datepicker"]').on('change', function() {

		var input = $('#datepicker');
		var regexp = /^\d{2}\/\d{2}\/\d{4}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Sdatepicker').show();

		} else {
			$('#Sdatepicker').hide();

		}
	});
});



/*-----------validation for datepicke-------------*/




$(document).ready(function() {
	$('#Createbatch').click(function() {
		var date = $('#datepicker1').val();

		if ($.trim(date) == 0) {
			$('#Sdatepicker1').show();
			return false;
		}

	});

	$('[id="datepicker1"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Sdatepicker1').show();
		} else {
			$('#Sdatepicker1').hide();

		}
	});
});
/*------------------------------------------------End validation ADD BATCH---------------------------------*/
/*------------------------------------------------Start validation ADD SUBJECT ---------------------------------*/
/*-----------validation for datepicke-------------*/
$(document).ready(function() {
	$('#Createsubjeact').click(function() {
		
		var input = $('#subjectname');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Ssubjectname').show();
			return false;
		} else {
			$('#Ssubjectname').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="subjectname"]').on('change', function() {

		var input = $('#subjectname');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Ssubjectname').show();

		} else {
			$('#Ssubjectname').hide();

		}
	});
});



/*-----------validation for datepicke-------------*/
$(document).ready(function() {
	$('#Createsubjeact').click(function() {
		var date = $('#iclass').val();

		if ($.trim(date) == 0) {
			$('#Siclass').show();
			return false;
		}

	});

	$('[id="iclass"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Siclass').show();
		} else {
			$('#Siclass').hide();

		}
	});
});

/*------------------------------------------------End validation ADD SUBJECT ---------------------------------*/

/*------------------------------------------------Start  validation Transport Management ---------------------------------*/
/*-----------Start validation for vehicle Details-------------*/
/*-----------validation for vehicle No-------------*/
$(document).ready(function() {
	$('#vehicleDetails').click(function() {
		
		var input = $('#vehicleNo');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#VvehicleNo').show();
			return false;
		} else {
			$('#VvehicleNo').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="vehicleNo"]').on('change', function() {

		var input = $('#vehicleNo');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#VvehicleNo').show();

		} else {
			$('#VvehicleNo').hide();

		}
	});
});

/*-----------validation for no Of Seats-------------*/
$(document).ready(function() {
	$('#vehicleDetails').click(function() {
		var input = $('#noOfSeats').val();
		if (input == '') {
			$('#VnoOfSeats').show();
			return false;
		} else if (!input.match(/^[0-9]{1,10000}$/)) {
			$('#VnoOfSeats1').show();
		} else {
			$('#VnoOfSeats').hide();
			$('#VnoOfSeats1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="noOfSeats"]').on('change', function() {
		var input = $('#noOfSeats').val();
		if (input == '') {
			$('#VnoOfSeats1').hide();
			$('#VnoOfSeats').show();
		} else if (!input.match(/^[0-9]{1,10000}$/)) {
			$('#VnoOfSeats1').show();
			$('#VnoOfSeats').hide();
		} else {
			$('#VnoOfSeats').hide();
			$('#VnoOfSeats1').hide();
		}
	});
});

/*-----------validation for maxiumAllowed-------------*/
$(document).ready(function() {
	$('#vehicleDetails').click(function() {
		var input = $('#maxiumAllowed').val();
		if (input == '') {
			$('#VmaxiumAllowed').show();
			return false;
		} else if (!input.match(/^[0-9]{1,10000}$/)) {
			$('#VmaxiumAllowed1').show();
		} else {
			$('#VmaxiumAllowed').hide();
			$('#VmaxiumAllowed1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="maxiumAllowed"]').on('change', function() {
		var input = $('#maxiumAllowed').val();
		if (input == '') {
			$('#VmaxiumAllowed1').hide();
			$('#VmaxiumAllowed').show();
		} else if (!input.match(/^[0-9]{1,10000}$/)) {
			$('#VmaxiumAllowed1').show();
			$('#VmaxiumAllowed').hide();
		} else {
			$('#VmaxiumAllowed').hide();
			$('#VmaxiumAllowed1').hide();
		}
	});
});
/*-----------validation for vehicleType-------------*/
$(document).ready(function() {
	$('#vehicleDetails').click(function() {
		
		var input = $('#vehicleType');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#VvehicleType').show();
			return false;
		} else {
			$('#VvehicleType').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="vehicleType"]').on('change', function() {

		var input = $('#vehicleType');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#VvehicleType').show();

		} else {
			$('#VvehicleType').hide();

		}
	});
});

/*-----------validation for contactPerson-------------*/
$(document).ready(function() {
	$('#vehicleDetails').click(function() {
		
		var input = $('#contactPerson');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#VcontactPerson').show();
			return false;
		} else {
			$('#VcontactPerson').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="contactPerson"]').on('change', function() {

		var input = $('#contactPerson');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#VcontactPerson').show();

		} else {
			$('#VcontactPerson').hide();

		}
	});
});

/*-----------validation for insuranceRenewalDate-------------*/
$(document).ready(function() {
 	$('#vehicleDetails').click(function() {
 		var input = $('#insuranceRenewalDate1').val();
 		if (input == '') {
 			$('#VinsuranceRenewalDate1').show();
 			return false;
 		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
 			$('#VinsuranceRenewalDate2').show();
 			
 		} else {
 			$('#VinsuranceRenewalDate1').hide();
 			$('#VinsuranceRenewalDate2').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="insuranceRenewalDate1"]').on('change', function() {
 		var input = $('#insuranceRenewalDate1').val();
 		if (input == '') {
 			$('#VinsuranceRenewalDate2').hide();
 			$('#VinsuranceRenewalDate1').show();
 		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
 			$('#VinsuranceRenewalDate2').show();
 			$('#VinsuranceRenewalDate1').hide();
 		} else {
 			$('#VinsuranceRenewalDate1').hide();
 			$('#VinsuranceRenewalDate2').hide();
 		}
 	});
 }); 	
/*-----------End validation for Vehicle Details-------------*/
/*-----------Start validation for Driver Details-------------*/
/*-----------validation for vehicle-------------*/
$(document).ready(function() {
	$('#driverDetails').click(function() {
		var date = $('#vehicle').val();

		if ($.trim(date) == 0) {
			$('#Vvehicle').show();
			return false;
		}

	});

	$('[id="vehicle"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Vvehicle').show();

		} else {
			$('#Vvehicle').hide();

		}
	});
});


/*-----------validation for namedriver-------------*/
$(document).ready(function() {
	$('#driverDetails').click(function() {
		
		var input = $('#namedriver');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Vnamedriver').show();
			return false;
		} else {
			$('#Vnamedriver').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="namedriver"]').on('change', function() {

		var input = $('#namedriver');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Vnamedriver').show();

		} else {
			$('#Vnamedriver').hide();

		}
	});
});
/*-----------validation for namedriver-------------*/
$(document).ready(function() {
	$('#driverDetails').click(function() {
		
		var input = $('#namedriver');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Vnamedriver').show();
			return false;
		} else {
			$('#Vnamedriver').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="namedriver"]').on('change', function() {

		var input = $('#namedriver');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Vnamedriver').show();

		} else {
			$('#Vnamedriver').hide();

		}
	});
});
/*-----------validation for hsno-------------*/
$(document).ready(function() {
	$('#driverDetails').click(function() {
		
		var input = $('#hsno');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Vhsno').show();
			return false;
		} else {
			$('#Vhsno').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="hsno"]').on('change', function() {

		var input = $('#hsno');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Vhsno').show();

		} else {
			$('#Vhsno').hide();

		}
	});
});
/*-----------validation for street-------------*/
$(document).ready(function() {
	$('#driverDetails').click(function() {
		
		var input = $('#street');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Vstreet').show();
			return false;
		} else {
			$('#Vstreet').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="street"]').on('change', function() {

		var input = $('#street');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Vstreet').show();

		} else {
			$('#Vstreet').hide();

		}
	});
});

/*-----------validation for city-------------*/
$(document).ready(function() {
	$('#driverDetails').click(function() {
		
		var input = $('#city');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Vcity').show();
			return false;
		} else {
			$('#Vcity').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="city"]').on('change', function() {

		var input = $('#city');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Vcity').show();

		} else {
			$('#Vcity').hide();

		}
	});
});
/*-----------validation for state-------------*/
$(document).ready(function() {
	$('#driverDetails').click(function() {
		
		var input = $('#state');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Vstate').show();
			return false;
		} else {
			$('#Vstate').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="state"]').on('change', function() {

		var input = $('#state');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Vstate').show();

		} else {
			$('#Vstate').hide();

		}
	});
});
/*-----------validation for country-------------*/
$(document).ready(function() {
	$('#driverDetails').click(function() {
		
		var input = $('#country');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Vcountry').show();
			return false;
		} else {
			$('#Vcountry').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="country"]').on('change', function() {

		var input = $('#country');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Vcountry').show();

		} else {
			$('#Vcountry').hide();

		}
	});
});
/*-----------validation for phno-------------*/
$(document).ready(function() {
	$('#driverDetails').click(function() {
		
		var input = $('#phno');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Vphno').show();
			return false;
		} else {
			$('#Vphno').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="phno"]').on('change', function() {

		var input = $('#phno');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Vphno').show();

		} else {
			$('#Vphno').hide();

		}
	});
});
/*-----------validation for dob1-------------*/
$(document).ready(function() {
 	$('#driverDetails').click(function() {
 		var input = $('#dob1').val();
 		if (input == '') {
 			$('#Vdob1').show();
			return false;
 		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
 			$('#Vdob2').show();
 		} else {
 			$('#Vdob1').hide();
 			$('#Vdob2').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="dob1"]').on('change', function() {
 		var input = $('#dob1').val();
 		if (input == '') {
 			$('#Vdob2').hide();
 			$('#Vdob1').show();
 		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
 			$('#Vdob2').show();
 			$('#Vdob1').hide();
 		} else {
 			$('#Vdob1').hide();
 			$('#Vdob2').hide();
 		}
 	});
 }); 	

/*-----------validation for licenseNumber-------------*/
$(document).ready(function() {
	$('#driverDetails').click(function() {
		
		var input = $('#licenseNumber');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#VlicenseNumber').show();
			return false;
		} else {
			$('#VlicenseNumber').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="licenseNumber"]').on('change', function() {

		var input = $('#licenseNumber');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#VlicenseNumber').show();

		} else {
			$('#VlicenseNumber').hide();

		}
	});
});
/*-----------End validation for Driver Details-------------*/
/*-----------Start validation for Route Details-------------*/
/*-----------validation for vehicle-------------*/
$(document).ready(function() {
	$('#routeDetails').click(function() {
		var date = $('#vehicle1').val();

		if ($.trim(date) == 0) {
			$('#Vvehicle1').show();
			return false;
		}

	});

	$('[id="vehicle1"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Vvehicle1').show();

		} else {
			$('#Vvehicle1').hide();

		}
	});
});

/*-----------validation for routeCode-------------*/
$(document).ready(function() {
	$('#routeDetails').click(function() {
		
		var input = $('#routeCode');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#VrouteCode').show();
			return false;
		} else {
			$('#VrouteCode').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="routeCode"]').on('change', function() {

		var input = $('#routeCode');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#VrouteCode').show();

		} else {
			$('#VrouteCode').hide();

		}
	});
});

/*-----------validation for startPlace-------------*/
$(document).ready(function() {
	$('#routeDetails').click(function() {
		
		var input = $('#startPlace');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#VstartPlace').show();
			return false;
		} else {
			$('#VstartPlace').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="startPlace"]').on('change', function() {

		var input = $('#startPlace');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#VstartPlace').show();

		} else {
			$('#VstartPlace').hide();

		}
	});
});

/*-----------validation for stopPlace-------------*/
$(document).ready(function() {
	$('#routeDetails').click(function() {
		
		var input = $('#stopPlace');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#VstopPlace').show();
			return false;
		} else {
			$('#VstopPlace').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="stopPlace"]').on('change', function() {

		var input = $('#stopPlace');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#VstopPlace').show();

		} else {
			$('#VstopPlace').hide();

		}
	});
});
/*-----------End validation for Route Details-------------*/
/*-----------Start validation for Route Details-------------*/
/*-----------validation for route-------------*/
$(document).ready(function() {
	$('#destinationDetails').click(function() {
		var date = $('#route').val();

		if ($.trim(date) == 0) {
			$('#Vroute').show();
			return false;
		}

	});

	$('[id="route"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Vroute').show();

		} else {
			$('#Vroute').hide();

		}
	});
});

/*-----------validation for fromPlace-------------*/
$(document).ready(function() {
	$('#destinationDetails').click(function() {
		
		var input = $('#fromPlace');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#VfromPlace').show();
			return false;
		} else {
			$('#VfromPlace').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="fromPlace"]').on('change', function() {

		var input = $('#fromPlace');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#VfromPlace').show();

		} else {
			$('#VfromPlace').hide();

		}
	});
});
/*-----------validation for toPlace-------------*/
$(document).ready(function() {
	$('#destinationDetails').click(function() {
		
		var input = $('#toPlace');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#VtoPlace').show();
			return false;
		} else {
			$('#VtoPlace').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="toPlace"]').on('change', function() {

		var input = $('#toPlace');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#VtoPlace').show();

		} else {
			$('#VtoPlace').hide();

		}
	});
});
/*-----------validation for stopTime-------------*/
$(document).ready(function() {
	$('#destinationDetails').click(function() {
		
		var input = $('#stopTime');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#VstopTime').show();
			return false;
		} else {
			$('#VstopTime').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="stopTime"]').on('change', function() {

		var input = $('#stopTime');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#VstopTime').show();

		} else {
			$('#VstopTime').hide();

		}
	});
});
/*-----------validation for Vamount-------------*/
$(document).ready(function() {
	$('#destinationDetails').click(function() {
		
		var input = $('#amount');
		var regexp = /^[0-9.,]{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Vamount').show();
			return false;
		} else {
			$('#Vamount').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="amount"]').on('change', function() {

		var input = $('#amount');
		var regexp = /^[0-9.,]{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Vamount').show();

		} else {
			$('#Vamount').hide();

		}
	});
});
/*-----------End validation for Destination Details-------------*/
/*-----------Start validation for Transport fee Details-------------*/
/*-----------validation for transport-------------*/
$(document).ready(function() {
	$('#transportFee').click(function() {
		var date = $('#transport').val();

		if ($.trim(date) == 0) {
			$('#Vtransport').show();
			return false;
		}

	});

	$('[id="transport"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Vtransport').show();

		} else {
			$('#Vtransport').hide();

		}
	});
});

/*-----------validation for student-------------*/
$(document).ready(function() {
	$('#transportFee').click(function() {
		var date = $('#TransportSelect').val();

		if ($.trim(date) == 0) {
			$('#VTransportSelect').show();
			return false;
		}

	});

	$('[id="TransportSelect"]').on('change', function() {
		if ($(this).val() == "") {
			$('#VTransportSelect').show();

		} else {
			$('#VTransportSelect').hide();

		}
	});
});

/*-----------validation for student select-------------*/
$(document).ready(function() {
	var input = $('#TransportSelect').val();
	if (input == 'student') {
		$("#stu").show();
		return false;
	}
});

$('select[name=tt]').change(function(e) {
	if ($('select[name=tt]').val() == 'student') {
		$('#stu').show();
		$('#sta').hide();
	} else {
		$('#stu').hide();
		$('#sta').show();
	}
});


 $(document).ready(function() { $('#transportFee').click(function() { var date =
	  $('#student1').val(); if ($.trim(date) == 0) { var input =
	  $('#TransportSelect').val(); if(input=='student'){ //alert("hhhhh");
	 $("#Vstudent").show(); return false; } else{ $("#Vstudent").hide(); } } });
	  
	  $('[id="student1"]').on('change', function() { if ($(this).val() == "") {
	  $('#Vstudent').show();
	  } else { $('#Vstudent').hide(); } }); });

 /*-----------validation for Staff select-------------*/
$(document).ready(function() {
	var input = $('#TransportSelect').val();
	if (input == 'staff') {
		 //alert("hhhhh");
		$("#sta").show();
		return false;
	}
});


 $(document).ready(function() { $('#transportFee').click(function() { var date =
	  $('#employee').val(); if ($.trim(date) == 0) { var input =
	  $('#TransportSelect').val(); if(input=='staff'){ //alert("hhhhh");
	 $("#Vstaff").show(); return false; } else{ $("#Vstaff").hide(); } } });
	  $('[id="employee"]').on('change', function() { if ($(this).val() == "") {
	  $('#Vstaff').show();
	  } else { $('#Vstaff').hide(); } }); });
 
/*-----------validation for stopTime-------------*/
$(document).ready(function() {
	$('#transportFee').click(function() {
		
		var input = $('#paying');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		
		if (check == false) {
			$('#Vpaying').show();
			return false;
		} else {
			$('#Vpaying').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="paying"]').on('change', function() {

		var input = $('#paying');
		var regexp = /^.{1,}$/;
		var check = regexp.test(input.val());
		if (check == false) {
			$('#Vpaying').show();

		} else {
			$('#Vpaying').hide();

		}
	});
});
/*-----------End validation for Transport fee Details-------------*/
/*-----------Start validation for Transport  Details-------------*/
/*-----------validation for route-------------*/
$(document).ready(function() {
	$('#transportInstance').click(function() {
		var date = $('#route').val();

		if ($.trim(date) == 0) {
			$('#Vroute').show();
			return false;
		}

	});

	$('[id="route"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Vroute').show();

		} else {
			$('#Vroute').hide();

		}
	});
});
/*-----------validation for Destination-------------*/
$(document).ready(function() {
	$('#transportInstance').click(function() {
		var date = $('#destination').val();

		if ($.trim(date) == 0) {
			$('#Vdestination').show();
			return false;
		}

	});

	$('[id="destination"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Vdestination').show();

		} else {
			$('#Vdestination').hide();

		}
	});
});
/*-----------validation for startDate-------------*/
$(document).ready(function() {
 	$('#transportInstance').click(function() {
 		var input = $('#startDate1').val();
 		if (input == '') {
 			$('#VstartDate1').show();
			return false;
 		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
 			$('#VstartDate2').show();
 		} else {
 			$('#VstartDate1').hide();
 			$('#VstartDate2').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="startDate1"]').on('change', function() {
 		var input = $('#startDate1').val();
 		if (input == '') {
 			$('#VstartDate2').hide();
 			$('#VstartDate1').show();
 		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
 			$('#VstartDate2').show();
 			$('#VstartDate1').hide();
 		} else {
 			$('#VstartDate1').hide();
 			$('#VstartDate2').hide();
 		}
 	});
 }); 
/*-----------validation for endDate-------------*/
 $(document).ready(function() {
	 	$('#transportInstance').click(function() {
	 		var input = $('#endDate1').val();
	 		if (input == '') {
	 			$('#VendDate1').show();
				return false;
	 		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
	 			$('#VendDate2').show();
	 		} else {
	 			$('#VendDate1').hide();
	 			$('#VendDate2').hide();
	 		}
	 	});
	 });
	 $(document).ready(function() {
	 	$('[id="endDate1"]').on('change', function() {
	 		var input = $('#endDate1').val();
	 		if (input == '') {
	 			$('#VendDate2').hide();
	 			$('#VendDate1').show();
	 		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
	 			$('#VendDate2').show();
	 			$('#VendDate1').hide();
	 		} else {
	 			$('#VendDate1').hide();
	 			$('#VendDate2').hide();
	 		}
	 	});
	 }); 
/*-----------validation for type-------------*/
$(document).ready(function() {
	$('#transportInstance').click(function() {
		var date = $('#type').val();

		if ($.trim(date) == 0) {
			$('#Vtype').show();
			return false;
		}

	});

	$('[id="type"]').on('change', function() {
		if ($(this).val() == "") {
			$('#Vtype').show();

		} else {
			$('#Vtype').hide();

		}
	});
});


/*-----------validation for Classes-------------*/
$(document).ready(function() {
	var input = $('#type').val();
	if (input == 'Student') {
		 alert("hhhhh");
		$("#Returntype").show();
		return false;
	}
});

$('select[name=type]').change(function(e) {
	if ($('select[name=type]').val() == 'Student') {
		$('#Returntype').show();
	} else {
		$('#Returntype').hide();
	}
});


 $(document).ready(function() { $('#transportInstance').click(function() { var date =
	  $('#classes').val(); if ($.trim(date) == 0) { var input =
	  $('#type').val(); if(input=='Student'){ //alert("hhhhh");
	 $("#Vclasses").show(); return false; } else{ $("#Vclasses").hide(); } } });
	  
	  $('[id="classes"]').on('change', function() { if ($(this).val() == "") {
	  $('#Vclasses').show();
	  } else { $('#Vclasses').hide(); } }); });
  
 /*-----------validation for Section-------------*/
 $(document).ready(function() { $('#transportInstance').click(function() { var date =
	  $('#section').val(); if ($.trim(date) == 0) { var input =
	  $('#type').val(); if(input=='Student'){ //alert("hhhhh");
	 $("#Vsection").show(); return false; } else{ $("#Vsection").hide(); } } });
	  
	  $('[id="section"]').on('change', function() { if ($(this).val() == "") {
	  $('#Vsection').show();
	  } else { $('#Vsection').hide(); } }); });
  
 /*-----------validation for Student-------------*/
 $(document).ready(function() { $('#transportInstance').click(function() { var date =
	  $('#student').val(); if ($.trim(date) == 0) { var input =
	  $('#type').val(); if(input=='Student'){ //alert("hhhhh");
	 $("#Vstudent").show(); return false; } else{ $("#Vstudent").hide(); } } });
	  
	  $('[id="student"]').on('change', function() { if ($(this).val() == "") {
	  $('#Vstudent').show();
	  } else { $('#Vstudent').hide(); } }); });


 /*-----------validation for employ-------------*/
$(document).ready(function() {
	var input = $('#type').val();
	if (input == 'Employee') {
		 alert("hhhhh");
		$("#Returntype1").show();
		return false;
	}
});

$('select[name=type]').change(function(e) {
	if ($('select[name=type]').val() == 'Employee') {
		$('#Returntype1').show();
	} else {
		$('#Returntype1').hide();
	}
});

 $(document).ready(function() { $('#transportInstance').click(function() { var date =
	  $('#employee').val(); if ($.trim(date) == 0) { var input =
	  $('#type').val(); if(input=='Employee'){ //alert("hhhhh");
	 $("#Vemployee").show(); return false; } else{ $("#Vemployee").hide(); } } });
	  
	  $('[id="employee"]').on('change', function() { if ($(this).val() == "") {
	  $('#Vemployee').show();
	  } else { $('#Vemployee').hide(); } }); });

 /*-----------End validation for Transport  Details-------------*/
 /*------------------------------------------------End  validation Transport Management ---------------------------------*/
 
 /*------------------------------------------------Start validation Payroll Management ---------------------------------*/
 /*-----------Start validation for Pay head Details-------------*/
 /*-----------validation for licenseNumber-------------*/
 $(document).ready(function() {
 	$('#payHead').click(function() {
 		
 		var input = $('#payHeadName');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		
 		if (check == false) {
 			$('#PpayHeadName').show();
 			return false;
 		} else {
 			$('#PpayHeadName').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="payHeadName"]').on('change', function() {

 		var input = $('#payHeadName');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		if (check == false) {
 			$('#PpayHeadName').show();

 		} else {
 			$('#PpayHeadName').hide();

 		}
 	});
 });
 
 /*-----------End validation for Pay head Details-------------*/
 /*-----------Start validation for Salart Setting Details-------------*/
 /*-----------validation for staff-------------*/
 $(document).ready(function() {
 	$('#salarySetting').click(function() {
 		var date = $('#staff').val();

 		if ($.trim(date) == 0) {
 			$('#Pstaff').show();
 			return false;
 		}

 	});

 	$('[id="staff"]').on('change', function() {
 		if ($(this).val() == "") {
 			$('#Pstaff').show();

 		} else {
 			$('#Pstaff').hide();

 		}
 	});
 });
 /*-----------validation for payhead-------------*/
 $(document).ready(function() {
 	$('#salarySetting').click(function() {
 		var date = $('#payhead').val();

 		if ($.trim(date) == 0) {
 			$('#Ppayhead').show();
 			return false;
 		}

 	});

 	$('[id="payhead"]').on('change', function() {
 		if ($(this).val() == "") {
 			$('#Ppayhead').show();

 		} else {
 			$('#Ppayhead').hide();

 		}
 	});
 });
 /*-----------validation for unit-------------*/
 $(document).ready(function() {
 	$('#salarySetting').click(function() {
 		var input = $('#aunit').val();
 		if (input == '') {
 			$('#Paunit').show();
 			return false;
 		} else if (!input.match(/^[0-9]{1,10000}$/)) {
 			$('#Paunit1').show();
 		} else {
 			$('#Paunit').hide();
 			$('#Paunit1').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="aunit"]').on('change', function() {
 		var input = $('#aunit').val();
 		if (input == '') {
 			$('#Paunit1').hide();
 			$('#Paunit').show();
 		} else if (!input.match(/^[0-9]{1,10000}$/)) {
 			$('#Paunit1').show();
 			$('#Paunit').hide();
 		} else {
 			$('#Paunit').hide();
 			$('#Paunit1').hide();
 		}
 	});
 });
 /*-----------End validation for Salart Setting Details-------------*/
 /*-----------Start validation for Staff Salart Details-------------*/
 /*-----------validation for staff-------------*/
 $(document).ready(function() {
 	$('#staffSalary').click(function() {
 		var date = $('#staff').val();

 		if ($.trim(date) == 0) {
 			$('#Sstaff').show();
 			return false;
 		}

 	});

 	$('[id="staff"]').on('change', function() {
 		if ($(this).val() == "") {
 			$('#Sstaff').show();

 		} else {
 			$('#Sstaff').hide();

 		}
 	});
 });
 
 /*-----------validation for Sacademicyear-------------*/
 $(document).ready(function() {
 	$('#staffSalary').click(function() {
 		var date = $('#academicyear').val();

 		if ($.trim(date) == 0) {
 			$('#Sacademicyear').show();
 			return false;
 		}

 	});

 	$('[id="academicyear"]').on('change', function() {
 		if ($(this).val() == "") {
 			$('#Sacademicyear').show();

 		} else {
 			$('#Sacademicyear').hide();

 		}
 	});
 });
 /*-----------End validation for Staff Salart Details-------------*/
 /*------------------------------------------------End validation Payroll Management ---------------------------------*/
 /*------------------------------------------------Start validation Library Management ---------------------------------*/
 /*-----------Start validation for book Details-------------*/
 /*-----------validation for author-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		
 		var input = $('#author');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		
 		if (check == false) {
 			$('#Bauthor').show();
 			return false;
 		} else {
 			$('#Bauthor').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="author"]').on('change', function() {

 		var input = $('#author');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		if (check == false) {
 			$('#Bauthor').show();

 		} else {
 			$('#Bauthor').hide();

 		}
 	});
 });
 
 /*-----------validation for title-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		
 		var input = $('#title');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		
 		if (check == false) {
 			$('#Btitle').show();
 			return false;
 		} else {
 			$('#Btitle').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="title"]').on('change', function() {

 		var input = $('#title');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		if (check == false) {
 			$('#Btitle').show();

 		} else {
 			$('#Btitle').hide();

 		}
 	});
 });
 /*-----------validation for publisher-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		
 		var input = $('#publisher');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		
 		if (check == false) {
 			$('#Bpublisher').show();
 			return false;
 		} else {
 			$('#Bpublisher').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="publisher"]').on('change', function() {

 		var input = $('#publisher');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		if (check == false) {
 			$('#Bpublisher').show();

 		} else {
 			$('#Bpublisher').hide();

 		}
 	});
 });
 /*-----------validation for place-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		
 		var input = $('#place');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		
 		if (check == false) {
 			$('#Bplace').show();
 			return false;
 		} else {
 			$('#Bplace').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="place"]').on('change', function() {

 		var input = $('#place');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		if (check == false) {
 			$('#Bplace').show();

 		} else {
 			$('#Bplace').hide();

 		}
 	});
 });
 /*-----------validation for subject-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		
 		var input = $('#subject');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		
 		if (check == false) {
 			$('#Bsubject').show();
 			return false;
 		} else {
 			$('#Bsubject').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="subject"]').on('change', function() {

 		var input = $('#subject');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		if (check == false) {
 			$('#Bsubject').show();

 		} else {
 			$('#Bsubject').hide();

 		}
 	});
 });
 /*-----------validation for edition-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		
 		var input = $('#edition');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		
 		if (check == false) {
 			$('#Bedition').show();
 			return false;
 		} else {
 			$('#Bedition').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="edition"]').on('change', function() {

 		var input = $('#edition');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		if (check == false) {
 			$('#Bedition').show();

 		} else {
 			$('#Bedition').hide();

 		}
 	});
 });
 /*-----------validation for status-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		
 		var input = $('#status');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		
 		if (check == false) {
 			$('#Bstatus').show();
 			return false;
 		} else {
 			$('#Bstatus').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="status"]').on('change', function() {

 		var input = $('#status');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		if (check == false) {
 			$('#Bstatus').show();

 		} else {
 			$('#Bstatus').hide();

 		}
 	});
 });
 /*-----------validation for volume-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		var input = $('#volume').val();
 		if (input == '') {
 			$('#Bvolume').show();
 			return false;
 		} else if (!input.match(/^[0-9]{1,10000}$/)) {
 			$('#Bvolume1').show();
 		} else {
 			$('#Bvolume').hide();
 			$('#Bvolume1').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="volume"]').on('change', function() {
 		var input = $('#volume').val();
 		if (input == '') {
 			$('#Bvolume1').hide();
 			$('#Bvolume').show();
 		} else if (!input.match(/^[0-9.,]{1,10000}$/)) {
 			$('#Bvolume1').show();
 			$('#Bvolume').hide();
 		} else {
 			$('#Bvolume').hide();
 			$('#Bvolume1').hide();
 		}
 	});
 });
 /*-----------validation for year-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		var input = $('#year').val();
 		if (input == '') {
 			$('#Byear').show();
 			return false;
 		} else if (!input.match(/^[0-9]{1,10000}$/)) {
 			$('#Byear1').show();
 		} else {
 			$('#Byear').hide();
 			$('#Byear1').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="year"]').on('change', function() {
 		var input = $('#year').val();
 		if (input == '') {
 			$('#Byear1').hide();
 			$('#Byear').show();
 		} else if (!input.match(/^[0-9.,-]{1,10000}$/)) {
 			$('#Byear1').show();
 			$('#Byear').hide();
 		} else {
 			$('#Byear').hide();
 			$('#Byear1').hide();
 		}
 	});
 });
 /*-----------validation for pages-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		var input = $('#pages').val();
 		if (input == '') {
 			$('#Bpages').show();
 			return false;
 		} else if (!input.match(/^[0-9]{1,10000}$/)) {
 			$('#Bpages1').show();
 		} else {
 			$('#Bpages').hide();
 			$('#Bpages1').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="pages"]').on('change', function() {
 		var input = $('#pages').val();
 		if (input == '') {
 			$('#Bpages1').hide();
 			$('#Bpages').show();
 		} else if (!input.match(/^[0-9.,-]{1,10000}$/)) {
 			$('#Bpages1').show();
 			$('#Bpages').hide();
 		} else {
 			$('#Bpages').hide();
 			$('#Bpages1').hide();
 		}
 	});
 });
 /*-----------validation for cost-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		var input = $('#cost').val();
 		if (input == '') {
 			$('#Bcost').show();
 			return false;
 		} else if (!input.match(/^[0-9]{1,10000}$/)) {
 			$('#Bcost1').show();
 		} else {
 			$('#Bcost').hide();
 			$('#Bcost1').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="cost"]').on('change', function() {
 		var input = $('#cost').val();
 		if (input == '') {
 			$('#Bcost1').hide();
 			$('#Bcost').show();
 		} else if (!input.match(/^[0-9.,-]{1,10000}$/)) {
 			$('#Bcost1').show();
 			$('#Bcost').hide();
 		} else {
 			$('#Bcost').hide();
 			$('#Bcost1').hide();
 		}
 	});
 });
 /*-----------validation for billNumber-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		var input = $('#billNumber').val();
 		if (input == '') {
 			$('#BbillNumber').show();
 			return false;
 		} else if (!input.match(/^[0-9]{1,10000}$/)) {
 			$('#BbillNumber1').show();
 		} else {
 			$('#BbillNumber').hide();
 			$('#BbillNumber1').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="billNumber"]').on('change', function() {
 		var input = $('#billNumber').val();
 		if (input == '') {
 			$('#BbillNumber1').hide();
 			$('#BbillNumber').show();
 		} else if (!input.match(/^[0-9.,-]{1,10000}$/)) {
 			$('#BbillNumber1').show();
 			$('#BbillNumber').hide();
 		} else {
 			$('#BbillNumber').hide();
 			$('#BbillNumber1').hide();
 		}
 	});
 });
 /*-----------validation for BbookSource-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		
 		var input = $('#bookSource');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		
 		if (check == false) {
 			$('#BbookSource').show();
 			return false;
 		} else {
 			$('#BbookSource').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="bookSource"]').on('change', function() {

 		var input = $('#bookSource');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		if (check == false) {
 			$('#BbookSource').show();

 		} else {
 			$('#BbookSource').hide();

 		}
 	});
 });
 /*-----------validation for moreInfo-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		
 		var input = $('#moreInfo');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		
 		if (check == false) {
 			$('#BmoreInfo').show();
 			return false;
 		} else {
 			$('#BmoreInfo').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="moreInfo"]').on('change', function() {

 		var input = $('#moreInfo');
 		var regexp = /^.{1,}$/;
 		var check = regexp.test(input.val());
 		if (check == false) {
 			$('#BmoreInfo').show();

 		} else {
 			$('#BmoreInfo').hide();

 		}
 	});
 });
 
 /*-----------validation for accessionNumber-------------*/
 $(document).ready(function() {
 	$('#books').click(function() {
 		var input = $('#accessionNumber').val();
 		if (input == '') {
 			$('#BaccessionNumber').show();
 			return false;
 		} else if (!input.match(/^[0-9]{1,10000}$/)) {
 			$('#BaccessionNumber1').show();
 		} else {
 			$('#BaccessionNumber').hide();
 			$('#BaccessionNumber1').hide();
 		}
 	});
 });
 $(document).ready(function() {
 	$('[id="accessionNumber"]').on('change', function() {
 		var input = $('#accessionNumber').val();
 		if (input == '') {
 			$('#BaccessionNumber1').hide();
 			$('#BaccessionNumber').show();
 		} else if (!input.match(/^[0-9.,-]{1,10000}$/)) {
 			$('#BaccessionNumber1').show();
 			$('#BaccessionNumber').hide();
 		} else {
 			$('#BaccessionNumber').hide();
 			$('#BaccessionNumber1').hide();
 		}
 	});
 });
 /*-----------validation for purchasedOn-------------*/
 $(document).ready(function() {
	 	$('#books').click(function() {
	 		var input = $('#purchasedOn1').val();
	 		if (input == '') {
	 			$('#BpurchasedOn1').show();
				return false;
	 		} else if (!input.match(/^(?:(0[1-9]|1[012])[\/.](0[1-9]|[12][0-9]|3[01])[\/.](18|19|20|21|22|23|24|25|26|27|28|29|30)[0-9]{2})$/)) {
	 			$('#BpurchasedOn2').show();
				return false;
	 		} else {
	 			$('#BpurchasedOn1').hide();
	 			$('#BpurchasedOn2').hide();
	 		}
	 	});
	 });
	 $(document).ready(function() {
	 	$('[id="purchasedOn1"]').on('change', function() {
	 		var input = $('#purchasedOn1').val();
	 		if (input == '') {
	 			$('#BpurchasedOn2').hide();
	 			$('#BpurchasedOn1').show();
	 		} else if (!input.match(/^(?:(0[1-9]|1[012])[\/.](0[1-9]|[12][0-9]|3[01])[\/.](18|19|20|21|22|23|24|25|26|27|28|29|30)[0-9]{2})$/)) {
	 			$('#BpurchasedOn2').show();
	 			$('#BpurchasedOn1').hide();
	 		} else {
	 			$('#BpurchasedOn1').hide();
	 			$('#BpurchasedOn2').hide();
	 		}
	 	});
	 }); 	
 /*-----------End validation for Books Details-------------*/
 /*-----------Start validation for magazineName Details-------------*/
 /*-----------validation for magazineName-------------*/
 $(document).ready(function() {
	 	$('#magazine').click(function() {
	 		
	 		var input = $('#magazineName');
	 		var regexp = /^.{1,}$/;
	 		var check = regexp.test(input.val());
	 		
	 		if (check == false) {
	 			$('#MmagazineName').show();
	 			return false;
	 		} else {
	 			$('#MmagazineName').hide();
	 		}
	 	});
	 });
	 $(document).ready(function() {
	 	$('[id="magazineName"]').on('change', function() {

	 		var input = $('#magazineName');
	 		var regexp = /^.{1,}$/;
	 		var check = regexp.test(input.val());
	 		if (check == false) {
	 			$('#MmagazineName').show();

	 		} else {
	 			$('#MmagazineName').hide();

	 		}
	 	});
	 });
	 /*-----------validation for author-------------*/
	 $(document).ready(function() {
		 	$('#magazine').click(function() {
		 		
		 		var input = $('#catagory');
		 		var regexp = /^.{1,}$/;
		 		var check = regexp.test(input.val());
		 		
		 		if (check == false) {
		 			$('#Mcatagory').show();
		 			return false;
		 		} else {
		 			$('#Mcatagory').hide();
		 		}
		 	});
		 });
		 $(document).ready(function() {
		 	$('[id="catagory"]').on('change', function() {

		 		var input = $('#catagory');
		 		var regexp = /^.{1,}$/;
		 		var check = regexp.test(input.val());
		 		if (check == false) {
		 			$('#Mcatagory').show();

		 		} else {
		 			$('#Mcatagory').hide();

		 		}
		 	});
		 });
		 /*-----------validation for volume-------------*/
		 $(document).ready(function() {
		 	$('#magazine').click(function() {
		 		var input = $('#volume').val();
		 		if (input == '') {
		 			$('#Mvolume').show();
		 			return false;
		 		} else if (!input.match(/^[0-9]{1,10000}$/)) {
		 			$('#Mvolume1').show();
		 		} else {
		 			$('#Mvolume').hide();
		 			$('#Mvolume1').hide();
		 		}
		 	});
		 });
		 $(document).ready(function() {
		 	$('[id="volume"]').on('change', function() {
		 		var input = $('#volume').val();
		 		if (input == '') {
		 			$('#Mvolume1').hide();
		 			$('#Mvolume').show();
		 		} else if (!input.match(/^[0-9.,]{1,10000}$/)) {
		 			$('#Mvolume1').show();
		 			$('#Mvolume').hide();
		 		} else {
		 			$('#Mvolume').hide();
		 			$('#Mvolume1').hide();
		 		}
		 	});
		 });
		 /*-----------validation for cost-------------*/
		 $(document).ready(function() {
		 	$('#magazine').click(function() {
		 		var input = $('#cost').val();
		 		if (input == '') {
		 			$('#Mcost').show();
		 			return false;
		 		} else if (!input.match(/^[0-9]{1,10000}$/)) {
		 			$('#Mcost1').show();
		 		} else {
		 			$('#Mcost').hide();
		 			$('#Mcost1').hide();
		 		}
		 	});
		 });
		 $(document).ready(function() {
		 	$('[id="cost"]').on('change', function() {
		 		var input = $('#cost').val();
		 		if (input == '') {
		 			$('#Mcost1').hide();
		 			$('#Mcost').show();
		 		} else if (!input.match(/^[0-9.,-]{1,10000}$/)) {
		 			$('#Mcost1').show();
		 			$('#Mcost').hide();
		 		} else {
		 			$('#Mcost').hide();
		 			$('#Mcost1').hide();
		 		}
		 	});
		 }); 
		 /*-----------validation for purchasedOn-------------*/
		  $(document).ready(function() {
			 	$('#magazine').click(function() {
			 		var input = $('#purchasedOn1').val();
			 		if (input == '') {
			 			$('#MpurchasedOn1').show();
						return false;
			 		} else if (!input.match(/^(?:(0[1-9]|1[012])[\/.](0[1-9]|[12][0-9]|3[01])[\/.](18|19|20|21|22|23|24|25|26|27|28|29|30)[0-9]{2})$/)) {
			 			$('#MpurchasedOn2').show();
						return false;
			 		} else {
			 			$('#MpurchasedOn1').hide();
			 			$('#MpurchasedOn2').hide();
			 		}
			 	});
			 });
			 $(document).ready(function() {
			 	$('[id="purchasedOn1"]').on('change', function() {
			 		var input = $('#purchasedOn1').val();
			 		if (input == '') {
			 			$('#MpurchasedOn2').hide();
			 			$('#MpurchasedOn1').show();
			 		} else if (!input.match(/^(?:(0[1-9]|1[012])[\/.](0[1-9]|[12][0-9]|3[01])[\/.](18|19|20|21|22|23|24|25|26|27|28|29|30)[0-9]{2})$/)) {
			 			$('#MpurchasedOn2').show();
			 			$('#MpurchasedOn1').hide();
			 		} else {
			 			$('#MpurchasedOn1').hide();
			 			$('#MpurchasedOn2').hide();
			 		}
			 	});
			 }); 	
		 
		 /*-----------validation for Mnummagazine-------------*/
		 $(document).ready(function() {
		 	$('#magazine').click(function() {
		 		var input = $('#nummagazine').val();
		 		if (input == '') {
		 			$('#Mnummagazine').show();
		 			return false;
		 		} else if (!input.match(/^[0-9]{1,10000}$/)) {
		 			$('#Mnummagazine1').show();
		 		} else {
		 			$('#Mnummagazine').hide();
		 			$('#Mnummagazine1').hide();
		 		}
		 	});
		 });
		 $(document).ready(function() {
		 	$('[id="nummagazine"]').on('change', function() {
		 		var input = $('#nummagazine').val();
		 		if (input == '') {
		 			$('#Mnummagazine1').hide();
		 			$('#Mnummagazine').show();
		 		} else if (!input.match(/^[0-9.,-]{1,10000}$/)) {
		 			$('#Mnummagazine1').show();
		 			$('#Mnummagazine').hide();
		 		} else {
		 			$('#Mnummagazine').hide();
		 			$('#Mnummagazine1').hide();
		 		}
		 	});
		 }); 
/*-----------End validation for magazineName Details-------------*/	
/*-----------Start validation for Newspaper Details-------------*/
/*-----------validation for Newspaper-------------*/	
		 $(document).ready(function() {
			 	$('#newspaper').click(function() {
			 		
			 		var input = $('#name');
			 		var regexp = /^.{1,}$/;
			 		var check = regexp.test(input.val());
			 		
			 		if (check == false) {
			 			$('#Nname').show();
			 			return false;
			 		} else {
			 			$('#Nname').hide();
			 		}
			 	});
			 });
			 $(document).ready(function() {
			 	$('[id="name"]').on('change', function() {

			 		var input = $('#name');
			 		var regexp = /^.{1,}$/;
			 		var check = regexp.test(input.val());
			 		if (check == false) {
			 			$('#Nname').show();

			 		} else {
			 			$('#Nname').hide();

			 		}
			 	});
			 });
			 /*-----------validation for Newspaper-------------*/	
			  $(document).ready(function() {
						$('#newspaper').click(function() {
							var input = $('#dateofnewspaper1').val();
							if (input == '') {
								$('#Ndateofnewspaper1').show();
								return false;
							} else if (!input.match(/^(?:(0[1-9]|1[012])[\/.](0[1-9]|[12][0-9]|3[01])[\/.](18|19|20|21|22|23|24|25|26|27|28|29|30)[0-9]{2})$/)) {
								$('#Ndateofnewspaper2').show();
								return false;
							} else {
								$('#Ndateofnewspaper1').hide();
								$('#Ndateofnewspaper2').hide();
							}
						});
					});
					$(document).ready(function() {
						$('[id="dateofnewspaper1"]').on('change', function() {
							var input = $('#dateofnewspaper1').val();
							if (input == '') {
								$('#Ndateofnewspaper2').hide();
								$('#Ndateofnewspaper1').show();
							} else if (!input.match(/^(?:(0[1-9]|1[012])[\/.](0[1-9]|[12][0-9]|3[01])[\/.](18|19|20|21|22|23|24|25|26|27|28|29|30)[0-9]{2})$/)) {
								$('#Ndateofnewspaper2').show();
								$('#Ndateofnewspaper1').hide();
							} else {
								$('#Ndateofnewspaper1').hide();
								$('#Ndateofnewspaper2').hide();
							}
						});
					});
				 
			 /*-----------validation for Mnummagazine-------------*/
			 $(document).ready(function() {
			 	$('#newspaper').click(function() {
			 		var input = $('#cost').val();
			 		if (input == '') {
			 			$('#Ncost').show();
			 			return false;
			 		} else if (!input.match(/^[0-9]{1,10000}$/)) {
			 			$('#Ncost1').show();
			 		} else {
			 			$('#Ncost').hide();
			 			$('#Ncost1').hide();
			 		}
			 	});
			 });
			 $(document).ready(function() {
			 	$('[id="cost"]').on('change', function() {
			 		var input = $('#cost').val();
			 		if (input == '') {
			 			$('#Ncost1').hide();
			 			$('#Ncost').show();
			 		} else if (!input.match(/^[0-9.,-]{1,10000}$/)) {
			 			$('#Ncost1').show();
			 			$('#Ncost').hide();
			 		} else {
			 			$('#Ncost').hide();
			 			$('#Ncost1').hide();
			 		}
			 	});
			 }); 	
/*-----------End validation for Newspaper Details-------------*/	
 /*------------------------------------------------End validation Library Management ---------------------------------*/
 /*------------------------------------------------Start validation Exam Management ---------------------------------*/
/*-----------Start validation for Exam Details-------------*/	
			 /*-----------validation for Exam-------------*/	
			 $(document).ready(function() {
				 	$('#exam').click(function() {
				 		var input = $('#examName');
				 		var regexp = /^.{1,}$/;
				 		var check = regexp.test(input.val());
				 		
				 		if (check == false) {
				 			$('#EexamName').show();
				 			return false;
				 		} else {
				 			$('#EexamName').hide();
				 		}
				 	});
				 });
				 $(document).ready(function() {
				 	$('[id="examName"]').on('change', function() {

				 		var input = $('#examName');
				 		var regexp = /^.{1,}$/;
				 		var check = regexp.test(input.val());
				 		if (check == false) {
				 			$('#EexamName').show();

				 		} else {
				 			$('#EexamName').hide();

				 		}
				 	});
				 });	
				 
				 /*-----------validation for iclass-------------*/	
				 $(document).ready(function() {
					 	$('#examDetails').click(function() {
					 		var date = $('#iclass').val();

					 		if ($.trim(date) == 0) {
					 			$('#Eiclass').show();
					 			return false;
					 		}

					 	});

					 	$('[id="iclass"]').on('change', function() {
					 		if ($(this).val() == "") {
					 			$('#Eiclass').show();

					 		} else {
					 			$('#Eiclass').hide();

					 		}
					 	});
					 });	 
				 /*-----------validation for year-------------*/	
				 $(document).ready(function() {
					 	$('#examDetails').click(function() {
					 		var date = $('#year').val();

					 		if ($.trim(date) == 0) {
					 			$('#Eyear').show();
					 			return false;
					 		}

					 	});

					 	$('[id="year"]').on('change', function() {
					 		if ($(this).val() == "") {
					 			$('#Eyear').show();

					 		} else {
					 			$('#Eyear').hide();

					 		}
					 	});
					 });	 
				 /*-----------validation for exam-------------*/	
				 $(document).ready(function() {
					 	$('#examDetails').click(function() {
					 		var date = $('#exam').val();

					 		if ($.trim(date) == 0) {
					 			$('#Eexam').show();
					 			return false;
					 		}

					 	});

					 	$('[id="exam"]').on('change', function() {
					 		if ($(this).val() == "") {
					 			$('#Eexam').show();

					 		} else {
					 			$('#Eexam').hide();

					 		}
					 	});
					 });	 
				 
				 
				 /*-----------validation for iclass-------------*/	
				 $(document).ready(function() {
					 	$('#marks').click(function() {
					 		var date = $('#iclass').val();

					 		if ($.trim(date) == 0) {
					 			$('#Eiclass').show();
					 			return false;
					 		}

					 	});

					 	$('[id="iclass"]').on('change', function() {
					 		if ($(this).val() == "") {
					 			$('#Eiclass').show();

					 		} else {
					 			$('#Eiclass').hide();

					 		}
					 	});
					 });	 
				 /*-----------validation for year-------------*/	
				 $(document).ready(function() {
					 	$('#marks').click(function() {
					 		var date = $('#year').val();

					 		if ($.trim(date) == 0) {
					 			$('#Eyear').show();
					 			return false;
					 		}

					 	});

					 	$('[id="year"]').on('change', function() {
					 		if ($(this).val() == "") {
					 			$('#Eyear').show();

					 		} else {
					 			$('#Eyear').hide();

					 		}
					 	});
					 });	 
				 /*-----------validation for exam-------------*/	
				 $(document).ready(function() {
					 	$('#marks').click(function() {
					 		var date = $('#exam').val();

					 		if ($.trim(date) == 0) {
					 			$('#Eexam').show();
					 			return false;
					 		}

					 	});

					 	$('[id="exam"]').on('change', function() {
					 		if ($(this).val() == "") {
					 			$('#Eexam').show();

					 		} else {
					 			$('#Eexam').hide();

					 		}
					 	});
					 });	 
				 
				 /*-----------validation for student-------------*/	
				 $(document).ready(function() {
					 	$('#marks').click(function() {
					 		var date = $('#student').val();

					 		if ($.trim(date) == 0) {
					 			$('#Estudent').show();
					 			return false;
					 		}

					 	});

					 	$('[id="student"]').on('change', function() {
					 		if ($(this).val() == "") {
					 			$('#Estudent').show();

					 		} else {
					 			$('#Estudent').hide();

					 		}
					 	});
					 });
/*-----------End validation for Exam Details-------------*/					 
/*------------------------------------------------End validation Exam Management ---------------------------------*/
/*------------------------------------------------Start validation Cirtificate ---------------------------------*/
/*-----------Start validation for bonafied Cirtificate-------------*/
				 /*-----------validation for Registration Number-------------*/
				 $(document).ready(function() {
					 	$('#bonafied').click(function() {
					 		
					 		var input = $('#registrationNo');
					 		var regexp = /^.{1,}$/;
					 		var check = regexp.test(input.val());
					 		
					 		if (check == false) {
					 			$('#BregistrationNo').show();
					 			return false;
					 		} else {
					 			$('#BregistrationNo').hide();
					 		}
					 	});
					 });
					 $(document).ready(function() {
					 	$('[id="registrationNo"]').on('change', function() {

					 		var input = $('#registrationNo');
					 		var regexp = /^.{1,}$/;
					 		var check = regexp.test(input.val());
					 		if (check == false) {
					 			$('#BregistrationNo').show();

					 		} else {
					 			$('#BregistrationNo').hide();

					 		}
					 	});
					 });				 
				 
					 /*-----------validation for studentName-------------*/
					 $(document).ready(function() {
						 	$('#bonafied').click(function() {
						 		
						 		var input = $('#studentName');
						 		var regexp = /^.{1,}$/;
						 		var check = regexp.test(input.val());
						 		
						 		if (check == false) {
						 			$('#BstudentName').show();
						 			return false;
						 		} else {
						 			$('#BstudentName').hide();
						 		}
						 	});
						 });
						 $(document).ready(function() {
						 	$('[id="studentName"]').on('change', function() {

						 		var input = $('#studentName');
						 		var regexp = /^.{1,}$/;
						 		var check = regexp.test(input.val());
						 		if (check == false) {
						 			$('#BstudentName').show();

						 		} else {
						 			$('#BstudentName').hide();

						 		}
						 	});
						 });				 
					 				 
						 /*-----------validation for academicyear-------------*/	
						 $(document).ready(function() {
							 	$('#bonafied').click(function() {
							 		var date = $('#academicyear').val();

							 		if ($.trim(date) == 0) {
							 			$('#Bacademicyear').show();
							 			return false;
							 		}

							 	});

							 	$('[id="academicyear"]').on('change', function() {
							 		if ($(this).val() == "") {
							 			$('#Bacademicyear').show();

							 		} else {
							 			$('#Bacademicyear').hide();

							 		}
							 	});
							 });
/*-----------End validation for bonafied Cirtificate-------------*/	
						 
						 
						 
						 /*-----------Start validation for Crate Role -------------*/				 
						 /*-----------validation for User name-------------*/
							$(document).ready(function() {
								$('#CreateUserList').click(function() {
									
									var input = $('#userName');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									
									if (check == false) {
										$('#CuserName').show();
										return false;
									} else {
										$('#CuserName').hide();
									}
								});
							});
							$(document).ready(function() {
								$('[id="userName"]').on('change', function() {

									var input = $('#userName');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									if (check == false) {
										$('#CuserName').show();

									} else {
										$('#CuserName').hide();

									}
								});
							});


							/*-----------validation forPassword-------------*/
							$(document).ready(function() {
								$('#CreateUserList').click(function() {
									
									var input = $('#Password');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									
									if (check == false) {
										$('#CPassword').show();
										return false;
									} else {
										$('#CPassword').hide();
									}
								});
							});
							$(document).ready(function() {
								$('[id="Password"]').on('change', function() {

									var input = $('#Password');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									if (check == false) {
										$('#CPassword').show();

									} else {
										$('#CPassword').hide();

									}
								});
							});


							/*-----------validation for Role-------------*/
							$(document).ready(function() {
								$('#CreateUserList').click(function() {
									var date = $('#secrole').val();

									if ($.trim(date) == 0) {
										$('#Csecrole').show();
										return false;
									}

								});

								$('[id="secrole"]').on('change', function() {
									if ($(this).val() == "") {
										$('#Csecrole').show();
									} else {
										$('#Csecrole').hide();

									}
								});
							});


							/*-----------validation for H.no-------------*/
							$(document).ready(function() {
								$('#CreateUserList').click(function() {
									
									var input = $('#hsno');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									
									if (check == false) {
										$('#Chsno').show();
										return false;
									} else {
										$('#Chsno').hide();
									}
								});
							});
							$(document).ready(function() {
								$('[id="hsno"]').on('change', function() {

									var input = $('#hsno');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									if (check == false) {
										$('#Chsno').show();

									} else {
										$('#Chsno').hide();

									}
								});
							});


							/*-----------validation for Street-------------*/
							$(document).ready(function() {
								$('#CreateUserList').click(function() {
									
									var input = $('#street');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									
									if (check == false) {
										$('#Cstreet').show();
										return false;
									} else {
										$('#Cstreet').hide();
									}
								});
							});
							$(document).ready(function() {
								$('[id="street"]').on('change', function() {

									var input = $('#street');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									if (check == false) {
										$('#Cstreet').show();

									} else {
										$('#Cstreet').hide();

									}
								});
							});


							/*-----------validation for City-------------*/
							$(document).ready(function() {
								$('#CreateUserList').click(function() {
									
									var input = $('#city');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									
									if (check == false) {
										$('#Ccity').show();
										return false;
									} else {
										$('#Ccity').hide();
									}
								});
							});
							$(document).ready(function() {
								$('[id="city"]').on('change', function() {

									var input = $('#city');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									if (check == false) {
										$('#Ccity').show();

									} else {
										$('#Ccity').hide();

									}
								});
							});


							/*-----------validation for State-------------*/
							$(document).ready(function() {
								$('#CreateUserList').click(function() {
									
									var input = $('#state');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									
									if (check == false) {
										$('#Cstate').show();
										return false;
									} else {
										$('#Cstate').hide();
									}
								});
							});
							$(document).ready(function() {
								$('[id="state"]').on('change', function() {

									var input = $('#state');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									if (check == false) {
										$('#Cstate').show();

									} else {
										$('#Cstate').hide();

									}
								});
							});

							/*-----------validation for Country-------------*/
							$(document).ready(function() {
								$('#CreateUserList').click(function() {
									
									var input = $('#country');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									
									if (check == false) {
										$('#Ccountry').show();
										return false;
									} else {
										$('#Ccountry').hide();
									}
								});
							});
							$(document).ready(function() {
								$('[id="country"]').on('change', function() {

									var input = $('#country');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									if (check == false) {
										$('#Ccountry').show();

									} else {
										$('#Ccountry').hide();

									}
								});
							});

							/*-----------validation for Mobilre Number-------------*/
							$(document).ready(function() {
								$('#CreateUserList').click(function() {
									
									var input = $('#mobileNumber');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									
									if (check == false) {
										$('#CmobileNumber').show();
										return false;
									} else {
										$('#CmobileNumber').hide();
									}
								});
							});
							$(document).ready(function() {
								$('[id="mobileNumber"]').on('change', function() {

									var input = $('#mobileNumber');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									if (check == false) {
										$('#CmobileNumber').show();

									} else {
										$('#CmobileNumber').hide();

									}
								});
							});


							/*-----------validation for Check box-------------*/
							  $(function () {
								            $('.form-control').change(function () {
								                if ($(this).is(":checked")) {
								                    $('#CreateUserList').removeAttr('disabled');
								                }
								                else {
								                    var isChecked = false;
								                    $('.form-control').each(function () {
								                        if ($(this).is(":checked")) {
								                            $('#CreateUserList').removeAttr('disabled');
								                            isChecked = true;
								                        }
								                    });
								                    if (!isChecked) {
								                        $('#CreateUserList').attr('disabled', 'disabled');
								                    }
								                }
								 
								 
								            })
								        });
							
							
							/*-----------validation for Create Role -------------*/
							$(document).ready(function() {
								$('#createrole').click(function() {
									var input = $('#roleName');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());

									if (check == false) {
										$('#CroleName').show();
										return false;
									} else {
										$('#CroleName').hide();
									}
								});
							});
							$(document).ready(function() {
								$('[id="roleName"]').on('change', function() {

									var input = $('#roleName');
									var regexp = /^.{1,}$/;
									var check = regexp.test(input.val());
									if (check == false) {
										$('#CroleName').show();

									} else {
										$('#CroleName').hide();

									}
								});
							});
						 
						 
							 /*-----------End validation for Crate Role -------------*/						 
						 
/*------------------------------------------------End validation Cirtificate ---------------------------------*/
/*------------------------------------------------Start validation Collect Student Fee ---------------------------------*/
						 /*-----------Start validation for SEARCH STUDENT FOR FEES-------------*/
						 				 /*-----------validation for Registration Number-------------*/
						 				/* $(document).ready(function() {
						 					 	$('#Collectstudentfee').click(function() {
						 					 		
						 					 		var input = $('#registrationNo');
						 					 		var regexp = /^.{1,}$/;
						 					 		var check = regexp.test(input.val());
						 					 		
						 					 		if (check == false) {
						 					 			$('#CregistrationNo').show();
						 					 			return false;
						 					 		} else {
						 					 			$('#CregistrationNo').hide();
						 					 		}
						 					 	});
						 					 });
						 					 $(document).ready(function() {
						 					 	$('[id="registrationNo"]').on('change', function() {

						 					 		var input = $('#registrationNo');
						 					 		var regexp = /^.{1,}$/;
						 					 		var check = regexp.test(input.val());
						 					 		if (check == false) {
						 					 			$('#CregistrationNo').show();

						 					 		} else {
						 					 			$('#CregistrationNo').hide();

						 					 		}
						 					 	});
						 					 });				 
						 				 
						 					 -----------validation for studentName-------------
						 					 $(document).ready(function() {
						 						 	$('#Collectstudentfee').click(function() {
						 						 		
						 						 		var input = $('#studentName');
						 						 		var regexp = /^.{1,}$/;
						 						 		var check = regexp.test(input.val());
						 						 		
						 						 		if (check == false) {
						 						 			$('#CstudentName').show();
						 						 			return false;
						 						 		} else {
						 						 			$('#CstudentName').hide();
						 						 		}
						 						 	});
						 						 });
						 						 $(document).ready(function() {
						 						 	$('[id="studentName"]').on('change', function() {

						 						 		var input = $('#studentName');
						 						 		var regexp = /^.{1,}$/;
						 						 		var check = regexp.test(input.val());
						 						 		if (check == false) {
						 						 			$('#CstudentName').show();

						 						 		} else {
						 						 			$('#CstudentName').hide();

						 						 		}
						 						 	});
						 						 });				 
						 					 				 
						 						 -----------validation for academicyear-------------	
						 						 $(document).ready(function() {
						 							 	$('#Collectstudentfee').click(function() {
						 							 		var date = $('#academicyear').val();

						 							 		if ($.trim(date) == 0) {
						 							 			$('#Cacademicyear').show();
						 							 			return false;
						 							 		}

						 							 	});

						 							 	$('[id="academicyear"]').on('change', function() {
						 							 		if ($(this).val() == "") {
						 							 			$('#Cacademicyear').show();

						 							 		} else {
						 							 			$('#Cacademicyear').hide();

						 							 		}
						 							 	});
						 							 });*/
						 /*-----------End validation for SEARCH STUDENT FOR FEES-------------*/	
						 /*------------------------------------------------End validation Collect Student Fee ---*/