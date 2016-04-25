<!DOCTYPE html>
<html>
<head>
<title>Association | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/asso.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/asso_cmp.js" type="application/javascript"></script>

</head>



<body>



	<!--   NAVIGATION   -->
	<header>

		<%@include file="asso_nav.jsp"%>

	</header>




	<span id="globalcontent"> 
		<span id="content"> 
			
			<span id="col_00">
			<div id="titre_00">
					<h1>
						Mes Comptes
					<h1>
					<br/>
			</div>
					
			<span id="comptes_tri">
				Trier par :
			
				<select id="comptes_sel">
					<option selected>Choisissez une option</option>
					<option>Mois</option>
					<option>Nombre de commandes</option>
					<option>Quantité</option>
					<option>Recette</option>
					<option>Bénéfice L'Eau Qui Germe</option>
				</select>			
			</span>
			<br/>
			
			<table id="livre_compte">
				<tr>
					<th>Mois</th>
					<th>Nombre de commandes</th>
					<th>Volume livré</th>
					<th>Recette</th>
					<th>Bénéfice</th>
				</tr>
				<tr>
					<td>Janvier</td>
					<td>2</td>
					<td>10kg</td>
					<td>1032€</td>
					<td>103€</td>
				</tr>
				<tr>
					<td>Janvier</td>
					<td>2</td>
					<td>10kg</td>
					<td>1032€</td>
					<td>103€</td>
				</tr>
				<tr>
					<td>Janvier</td>
					<td>2</td>
					<td>10kg</td>
					<td>1032€</td>
					<td>103€</td>
				</tr>
			</table>
					
					
			</span>		
			
		</span>
	</span>


</body>

</html>