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

</head>
<body>
	<div class="text-center">
		<ul class="list-unstyled" style="padding-top: 10px">
			<li><images:getImage id="${institute?.logo?.id}" width="60px"
					height="60px" /></li>
			<li>
				<h2 class="page-title" style="color: #000">
					${institute?.name }
					<br> <small>Affiliated to: ${institute?.affiliatedTo }</small>
				</h2>
				<h2>-: Fees Receipt :-</h2>
			</li>
		</ul>
	</div>
	<table>
		<thead>
			<tr>
				<th>Fee Detail</th>
				<th>Due Amount</th>
				<th>Amount Paid</th>
			</tr>
		</thead>
		<tbody>


			<g:each in="${b}" var="fInstance" status="i">
				<tr>

					<td>
						${fInstance.instFeeTypeT}
					</td>
					<td>
						${fInstance.dueT}
					</td>
					<td>
						${fInstance.amountPaidT}
					</td>
				</tr>
			</g:each>
		</tbody>
	</table>

</body>
</html>