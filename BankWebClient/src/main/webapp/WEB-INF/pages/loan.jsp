<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/fetchOffers">
		<center>
			<table border="1px solid black" style="background-color: #0CB88E">
				<h1 style="color: #616509">Loan Application</h1>
				<tr>
					<th>LoanAmount:</th>
					<th><input type="text" name="loan_amount" /></th>
				</tr>
				</br>
				<tr>
					<th>Area Code:</th>
					<th><input type="text" name="area_code" /></th>
				</tr>
				</br>
				<tr>
					<th>Area Size:</th>
					<th><input type="text" name="area_size" /></th>
				</tr>
				</br>
				<tr>
					<th>Legal Residency :</th>
					<th><input type="radio" name="legal_residence" value="Indian"
						checked> Indian</input> <input type="radio" name="legal_residence"
						value="NRI"> NRI </input></th>
				</tr>
				</br>
				<tr>
					<th>Credit Score:</th>
					<th><input type="text" name="creditScore" value="${credit_score}" /></th>
				</tr>
				</br>

			</table>
			<input type="submit" value="DashBoard" />

		</center>
	</form>
</body>
</html>