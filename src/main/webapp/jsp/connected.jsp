<!DOCTYPE html>
<html>
	<head> 
		<title> L'Eau qui germe </title>
		<meta charset="UTF-8"/>
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="Boostrap/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link type="text/css" rel="stylesheet" href="css/css.css"/>
		<link rel="icon" href="img/eau.png" />
    <!-- Basic stylesheet -->
<link rel="stylesheet" href="owl-carousel/owl.carousel.css">
 <link rel="stylesheet" href="owl-carousel/owl.transitions.css">
 <!-- Default Theme -->
<link rel="stylesheet" href="owl-carousel/owl.theme.css">


	</head>






	<body>
	
<!-- NAVIGATION -->
	
<header>
	<%@include file="nav.jsp" %>
</header>


<h1> Congratulations! You just connected as: <% request.getSession().getAttribute("identifiant"); %></h1>

<!--  PLAN DU SITE  -->

<footer>


 <%@include file="foot.jsp" %>



</footer>