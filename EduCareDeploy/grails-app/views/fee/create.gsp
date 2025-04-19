<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
<meta charset="utf-8" />
<title>Hi-Educare | Admin</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link
	href="assets1/global/plugins/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="assets1/global/plugins/simple-line-icons/simple-line-icons.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/global/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/global/plugins/uniform/css/uniform.default.css"
	rel="stylesheet" type="text/css" />

<link href="assets1/global/css/components.min.css" rel="stylesheet"
	id="style_components" type="text/css" />
<link href="assets1/global/css/plugins.min.css" rel="stylesheet"
	type="text/css" />

<link href="assets1/layouts/layout/css/layout.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets1/layouts/layout/css/themes/darkblue.min.css"
	rel="stylesheet" type="text/css" id="style_color" />
<link href="assets1/layouts/layout/css/custom.min.css" rel="stylesheet"
	type="text/css" />
<link
	href="assets1/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker6.min.css"
	type="text/css" rel="stylesheet">
<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon" href="assets1/layouts/layout/img/favicon.png" />
</head>
<!-- END HEAD -->

<body
	class="page-header-fixed page-sidebar-closed-hide-logo page-content-white">
	<!-- BEGIN HEADER -->
	<div class="page-header navbar navbar-fixed-top">
		<!-- BEGIN HEADER INNER -->
		<div class="page-header-inner ">
			<g:render template="/header/logo"></g:render>
			<!-- BEGIN RESPONSIVE MENU TOGGLER -->
			<a href="javascript:;" class="menu-toggler responsive-toggler"
				data-toggle="collapse" data-target=".navbar-collapse"> </a>
			<g:render template="/header/topBar"></g:render>
		</div>
	</div>

	<div class="clearfix"></div>
	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<g:render template="/header/leftSide"
					model="[activ:[feeStructure:'start active open',fee:'active']]"></g:render>

			</div>
			<!-- END SIDEBAR -->
		</div>

		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>

					</ul>

				</div>

				<div class="panel">
					<div class="panel-body">
				<h5>
					<b>Student Name : ${student?.studentName}</b>
				</h5>
				<h5>
					<b>Class : <g:each in="${student?.academicyear}">
							<g:if test="${it.status == 'current'}">
							</g:if>
						</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set> ${pclass.classname }</b>
				</h5>
				<h5>
					<b>Section : <g:each in="${student?.academicyear}">
							<g:if test="${it.status == 'current'}">
							</g:if>
						</g:each> <g:set value="${it?.section}" var="pclass"></g:set> ${pclass?.sectionName}</b>
				</h5>
				<h5>
					<b>Academc year : <g:each in="${student?.academicyear}">
							<g:if test="${it.status == 'current'}">
							</g:if>
						</g:each> <g:set value="${it}" var="pclass"></g:set> ${pclass?.academicyear}</b>
				</h5>
				

				<div class="row">
					<div class="col-md-12">
						<g:if test="${flash.message}">
							<div class="message" role="status">
								${flash.message}
							</div>
						</g:if>
						<g:if test="${flash.msg}">
									<h4 class="message" role="status" style="color: red">
										${flash.msg}
									</h4>
								</g:if>

								<g:if test="${flash.msgtcfee}">
									<h4 class="message" role="status" style="color: red">
										${tcDetails?.studentName}
										${flash.msgtcfee}
									</h4>
								</g:if>
						<g:hasErrors bean="${feeInstance}">
							<ul class="errors" role="alert">
								<g:eachError bean="${feeInstance}" var="error">
									<li
										<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
											error="${error}" /></li>
								</g:eachError>
							</ul>
						</g:hasErrors>
						<g:form url="[resource:feeInstance, action:'save']" name="myform">
							<fieldset class="form">
								<g:render template="form" />
							</fieldset>
							<fieldset class="pull-right">
								<g:submitButton name="create" class="btn blue" id="paypal"
									value="${message(code: 'default.button.Add Fees .label', default: 'Pay Fees')}" />
								<g:submitButton name="Skip" value="skip" class="btn green" />
							</fieldset>
						</g:form>
					</div>


				</div>
			</div>
		</div>
	</div>
	</div>
	</div>

	<g:render template="/footer/footer"></g:render>


	<script type="text/javascript">
		$('#sum_table tr:first td').each(
				function() {
					var $td = $(this);

					var colTotal = 0;
					$('#sum_table tr:not(:first,.totalColumn)').each(
							function() {
								if ($td.index() != 0 && $td.index() != 1
										&& $td.index() != 5)
									colTotal += parseInt($(this).children().eq(
											$td.index()).html(), 10);

							});
					if ($td.index() != 0 && $td.index() != 1
							&& $td.index() != 5)
						$('#sum_table tr.totalColumn').children().eq(
								$td.index()).html('Total: ' + colTotal);
				});
	</script>
	<script type="text/javascript">
		function doMath(vv) {
			// Capture the entered values of two input boxes
			var nn = vv.name.split("_")[1]
			var totalamount = document.getElementById('totalamount-' + nn).value;
			var payamount = document.getElementById('payamount_' + nn).value;

			// Add them together and display
			var sum = parseInt(totalamount) - parseInt(payamount);

			document.getElementById('paid_' + nn).innerHTML = payamount;
			document.getElementById('result_' + nn).innerHTML = sum;
			var amt1 = 0
			var amt2 = 0

			$('#sum_table tr:first td')
					.each(
							function() {
								var $td = $(this);

								var colTotal = 0;
								$('#sum_table tr:not(:first,.totalColumn)')
										.each(
												function() {
													if ($td.index() != 0
															&& $td.index() != 1
															&& $td.index() != 5)
														colTotal += parseInt(
																$(this)
																		.children()
																		.eq(
																				$td
																						.index())
																		.html(),
																10);

												});
								if ($td.index() != 0 && $td.index() != 1
										&& $td.index() != 5)
									$('#sum_table tr.totalColumn').children()
											.eq($td.index()).html(
													'Total: ' + colTotal);

								var totalPaid = 0;
								var due = 0;
								var totalFee = 0;
								var admissionfee = $("#admissionfee").val()
								var paidadmissionfee = $("#admissionfee1")
										.val()

								if ($td.index() == 2) {
									var admission = parseInt($('#admissionfee')
											.val())
									totalFee = colTotal + admission;
									amt1 = parseInt(totalFee)
									$('#totalFee').val(totalFee);
								}

								if ($td.index() == 3) {
									var paidadmfee = parseInt($(
											'#admissionfee1').val())
									totalPaid = colTotal + paidadmfee;
									amt2 = parseInt(totalPaid)
									$('#totalPaid').val(totalPaid);
								}

								if ($td.index() == 4) {
									due = colTotal;
									$('#pending').val(parseInt(amt1 - amt2));
								}

								$('#penalty').val(0);
								$('#discount').val(0);

							});
		}
	</script>
	<script src="assets1/global/plugins/jquery.min.js"
		type="text/javascript"></script>

	<script src="assets1/global/plugins/bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/js.cookie.min.js"
		type="text/javascript"></script>
	<script
		src="assets1/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js"
		type="text/javascript"></script>
	<script
		src="assets1/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/jquery.blockui.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/uniform/jquery.uniform.min.js"
		type="text/javascript"></script>
	<script
		src="assets1/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"
		type="text/javascript"></script>
	
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	
	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>
	
	<script type="text/javascript">
		Date.prototype.addDays = function(days) {
		    this.setDate(this.getDate() + days);
		    return this;
		};
		$(function() {
		var currentDate = new Date();
		// to add 4 days to current date
		var myDate = currentDate;
		        $('#datepicker').datepicker();
		    $('#datepicker').datepicker('setDate', myDate);
		});
		</script>
	
	<script>
		/*-----------validation for payment method-------------*/
		$(document).ready(function() {
			$('#paypal').click(function() {
				var date = $('#paypels').val();

				if ($.trim(date) == 0) {
					$('#selectpayment').show();
					return false;
				}

			});

			$('[id="paypels"]').on('change', function() {
				if ($(this).val() == "") {
					$('#selectpayment').show();
				} else {
					$('#selectpayment').hide();

				}
			});
		});
		/*-------------Start validation for "DD number"-------------*/
		$(document).ready(function() {
			var input = $('#paypels').val();
			if (input == 'DD') {
				alert("hhhhh");
				$("#Returntype1").show();
				return false;
			}
		});

		$('select[name=paymentType]').change(function(e) {
			if ($('select[name=paymentType]').val() == 'DD') {
				$('#Returntype').show();
			} else {
				$('#Returntype').hide();
			}
		});

		///*-----------Validation for DD number'---------*/////

		$(document).ready(function() {
			$('#paypal').click(function() {
				var date = $('#ddNumber');
				var regexp = /^.{1,}$/;
				var check = regexp.test(date.val());
				if (check == false) {
					var input = $('#paypels').val();
					if (input == 'DD') {
						// alert("hhhhh");
						$("#PddNumber").show();
						return false;
					} else {
						$("#PddNumber").hide();
					}
				}
			});
			$('[id="ddNumber"]').on('change', function() {
				var date = $('#ddNumber');
				var regexp = /^.{1,}$/;
				var check = regexp.test(date.val());
				if (check == false) {
					$('#PddNumber').show();
				} else {
					$('#PddNumber').hide();
					return true;
				}
			});
		});

		/*-------------Start validation for "Check number"-------------*/

		$(document).ready(function() {
			var input = $('#paypels').val();
			if (input == 'CHECK') {
				alert("hhhhh");
				$("#Returntype1").show();
				return false;
			}
		});

		$('select[name=paymentType]').change(function(e) {
			if ($('select[name=paymentType]').val() == 'CHECK') {
				$('#Returntype1').show();
			} else {
				$('#Returntype1').hide();
			}
		});
		///*-----------Validation for Check number'---------*/////

		$(document).ready(function() {
			$('#paypal').click(function() {
				var date = $('#checkNumber');
				var regexp = /^.{1,}$/;
				var check = regexp.test(date.val());
				if (check == false) {
					var input = $('#paypels').val();
					if (input == 'CHECK') {
						// alert("hhhhh");
						$("#PcheckNumber").show();
						return false;
					} else {
						$("#PcheckNumber").hide();
					}
				}
			});
			$('[id="checkNumber"]').on('change', function() {
				var date = $('#checkNumber');
				var regexp = /^.{1,}$/;
				var check = regexp.test(date.val());
				if (check == false) {
					$('#PcheckNumber').show();
				} else {
					$('#PcheckNumber').hide();
					return true;
				}
			});
		});

		///*-----------Validation for Account Number number'---------*/////

		$(document).ready(function() {

			$('#paypal').click(function() {
				var date = $('#accNo');
				var regexp = /^[0-9a-zA-Z]{1,1000}$/;
				var check = regexp.test(date.val());
				if (check == false) {
					var input = $('#paypels').val();
					if (input == 'CHECK' || input == 'DD') {
						// alert("hhhhh");
						$("#PaccNo").show();
						return false;
					} else {
						$("#PaccNo").hide();
					}
				}
			});
			$('[id="accNo"]').on('change', function() {
				var date = $('#accNo');
				var regexp = /^[0-9a-zA-Z]{1,1000}$/;
				var check = regexp.test(date.val());
				if (check == false) {
					$('#PaccNo').show();
				} else {
					$('#PaccNo').hide();
					return true;
				}
			});
		});

		///*-----------Validation for Bank Name number'---------*/////

		$(document).ready(function() {

			$('#paypal').click(function() {
				var date = $('#bankName');
				var regexp = /^.{1,}$/;
				var check = regexp.test(date.val());
				if (check == false) {
					var input = $('#paypels').val();
					if (input == 'CHECK' || input == 'DD') {
						// alert("hhhhh");
						$("#PbankName").show();
						return false;
					} else {
						$("#PbankName").hide();
					}
				}
			});
			$('[id="bankName"]').on('change', function() {
				var date = $('#bankName');
				var regexp = /^.{1,}$/;
				var check = regexp.test(date.val());
				if (check == false) {
					$('#PbankName').show();
				} else {
					$('#PbankName').hide();
					return true;
				}
			});
		});

		///*-----------Validation for Pin Code Number number'---------*/////

		$(document).ready(function() {

			$('#paypal').click(function() {
				var date = $('#pinCode');
				var regexp = /^[0-9]{1,1000}$/;
				var check = regexp.test(date.val());
				if (check == false) {
					var input = $('#paypels').val();
					if (input == 'CHECK' || input == 'DD') {
						// alert("hhhhh");
						$("#PpinCode").show();
						return false;
					} else {
						$("#PpinCode").hide();
					}
				}
			});
			$('[id="pinCode"]').on('change', function() {
				var date = $('#pinCode');
				var regexp = /^[0-9]{1,1000}$/;
				var check = regexp.test(date.val());
				if (check == false) {
					$('#PpinCode').show();
				} else {
					$('#PpinCode').hide();
					return true;
				}
			});
		});

		var input = $('#paypels').val();

		function funnew(sel) {
			if (sel.value == 'DD') {
				$('#Returntype').show();
				$('#Returntype1').hide();
				$('#ReturntypeA').show();
				$('#ReturntypeB').show();
				$('#ReturntypeC').show();
				$('#ReturntypeD').show();
				$('#ReturntypeE').show();
			} else if (sel.value == 'CHECK') {
				$('#Returntype').hide();
				$('#ReturntypeA').show();
				$('#ReturntypeB').show();
				$('#ReturntypeC').show();
				$('#ReturntypeD').show();
				$('#ReturntypeE').show();
			} else {
				$('#Returntype').hide();
				$('#Returntype1').hide();

				$('#ReturntypeA').hide();
				$('#ReturntypeB').hide();
				$('#ReturntypeC').hide();
				$('#ReturntypeD').hide();
				$('#ReturntypeE').hide();
			}
		}
	</script>
	<script type="text/javascript">
	var discountvariable = 0;
	var penalaultyvalue = 0;

	function dopenalty(vv) {
		if (isNaN(penalaultyvalue)) {
			penalaultyvalue = 0;
		}
		if (isNaN(parseInt($('#penalty').val()))) {
			$('#penalty').val(0)
		}
		var pen = parseInt($('#penalty').val()) - penalaultyvalue
		var pend = parseInt($('#pending').val())
		var dis = parseInt($('#discount').val())
		var tot = parseInt($('#totalFee').val())
		var tt = parseInt(pen) + parseInt(tot)
		penalaultyvalue = parseInt($('#penalty').val())
		$('#totalFee').val(tt)

		if (pend <= 0) {
			pend = tot
		}
		$('#pending').val(parseInt(pend) + parseInt(pen))

		//alert("Pendiingg"+(parseInt(pend))+";"+(parseInt(pen)))
	}

	function dodiscount(vv) {
	
		if (isNaN(discountvariable)) {
			discountvariable = 0;
		}
		if (isNaN(parseInt($('#discount').val()))) {
			$('#discount').val(0)
		}
		var tt = 0;
		var dis = parseInt($('#discount').val()) - (discountvariable)


		if ($("#admisionfeeDec").val()) {
			var due = parseInt($(vv).val())
			var adm1 = parseInt($("#admissionfee1").val())
			var admfee = parseInt($("#admissionfee").val())
			
			var totals = ((admfee-adm1)-due)
			
			
			$('#admissionfeedue').val(totals)
		}

		var tot = $('#totalFee').val()
		var totalPaid = parseInt($('#totalPaid').val())
		tt = (parseInt(tot) - parseInt(dis))
		$('#totalFee').val(tt)
		$('#pending').val(tt - totalPaid)
		discountvariable = parseInt($('#discount').val())
		$('#discount1').val(discountvariable)
	}
</script>

<script type="text/javascript">
	function dodiscount1(vv) {
		var colvalue = 0;
		$('#sum_table tr:first td').each(
				function() {
					var $td = $(this);

					var colTotal = 0;
					$('#sum_table tr:not(:first,.totalColumn)').each(
							function() {
								if ($td.index() == 3) {
									colTotal += parseInt($(this).children()
											.eq($td.index()).html(), 10);
									colvalue = colTotal
								}
							});
				});
		var admission = parseInt($('#admissionfee').val())
		var admission1 = parseInt($('#admissionfee1').val())
		var paidfee = parseInt($('#paidadmissionfee').val())
		var paidfee1 = parseInt($('#paidadmissionfee1').val())
		var tot = $('#totalFee').val()
		var totalPaid = parseInt(colvalue)
		var tt = (tot - admission)
		var ttpaid = (admission1 + paidfee1)
		var tf = parseInt($('#totalFee').val())
		var gt = parseInt(tf)
		$('#totalPaid').val(totalPaid + ttpaid)
		$('#pending').val(gt - (totalPaid + ttpaid))
		$('#admissionfeedue').val(admission - (ttpaid))
		$('#paidadmissionfee').val(ttpaid)

		$('#penalty').val(0);
		$('#discount').val(0);
	}
</script>

<script type="text/javascript">
	function dodiscount2(vv) {
		var colvalue = 0;
		$('#sum_table tr:first td').each(
				function() {
					var $td = $(this);

					var colTotal = 0;
					$('#sum_table tr:not(:first,.totalColumn)').each(
							function() {
								if ($td.index() == 3) {
									colTotal += parseInt($(this).children()
											.eq($td.index()).html(), 10);
									colvalue = colTotal
								}
							});
				});

		var admission = parseInt($('#admissionfee').val())
		var admission1 = parseInt($('#admissionfee1').val())
		var paidfee = parseInt($('#paidadmissionfee').val())
		var tot = $('#totalFee').val()
		var totalPaid = parseInt(colvalue)//parseInt($('#totalPaid').val())
		var tt = (tot - admission)
		var ttpaid = admission1
		var tf = parseInt($('#totalFee').val())
		var gt = parseInt(tf)
		$('#totalPaid').val(totalPaid + admission1)
		$('#pending').val(gt - (admission1 + totalPaid))
		$('#admissionfeedue').val(admission - (ttpaid))
		$('#paidadmissionfee').val(ttpaid)
		$('#penalty').val(0);
		$('#discount').val(0);
	}
</script>
<script
		src="assets1/global/plugins/bootstrap-datepicker/js/jquery.ui.datepicker1.js"></script>	
		<script type="text/javascript">
	$(function() {
		$(".date-picker").datepicker({
			changeMonth : true,
			changeYear : true,
			yearRange : "1800:3000",
		});
	});
</script>

</body>

</html>




