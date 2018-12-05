
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><%@taglib
	prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="resources/css/relatorios.css">
<link rel="stylesheet"
	href="resources/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<link rel="icon" href="resources/img/Logo4.png" type="image/3"
	sizes="30x20">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--Serve para a resolução de imagem de acordo com o dispositivo-->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--para a resoução de zoom-->
<script src="resources/js/jquery-3.3.1.min.js"></script>
<title>Relatorios</title>
</head>

<body>



	<section class="container">
		<div class="panel-danger1" id="caixaComputador">
			<div class="container-fluid">


				<h2>Computador ${computador.idComputador}</h2>

				<h3>${computador.nome}</h3>

				<p>${computador.numeroIp}</p>
				<p>${computador.enderecoMac}</p>
				<p>${computador.tipoProcessador}</p>
				<p>${computador.tamanhoHd}</p>
				<p>${computador.sistemaOperacional}</p>



				<table class="table">
					<thead>
						<tr>
							<th scope="col"></th>
							<th scope="col">CPU</th>
							<th scope="col">Uso do HD</th>
							<th scope="col">Download</th>
							<th scope="col">Upload</th>
							<th scope="col">Memória RAM</th>
							<th scope="col">Bateria Usada</th>
						</tr>
					</thead>
					<tbody>
						<tr class="active">
							<th scope="row">Max</th>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
							<td>@mdo</td>
							<td>@mdo</td>
							<td>@mdo</td>
						</tr>

						<tr>
							<th scope="row">Med</th>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
							<td>@mdo</td>
							<td>@mdo</td>
							<td>@mdo</td>
						</tr>

						<tr class="active">
							<th scope="row">Min</th>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
							<td>@mdo</td>
							<td>@mdo</td>
							<td>@mdo</td>
						</tr>

					</tbody>
				</table>
				
				<button type="button" class="btn btn-primary" onclick="window.print()">Gerar PDF</button>
				
				<div class="caixa-img-seta">
							<a
								href="dashboard"><img
								src="resources/img/seta.png"
								class="rounded float-right img-seta" alt="Responsive image"></a>
						</div>
				
				
			</div>
		</div>

	</section>




	<!--////////////////////////////////////// SCRIPTS//////////////////////////////////////-->

	<script
		src="resources/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script src="resources/js/java.js"></script>
	<script type="text / javascript"
		src="https://www.gstatic.com/charts/loader.js"> </script>
	<script type="text/javascript"
		src="https://www.gstatic.com/charts/loader.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
</body>
</html>