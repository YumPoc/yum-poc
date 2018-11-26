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
<link rel="stylesheet" href="resources/css/deshboard.css">
<link rel="stylesheet"
	href="resources/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<link rel="icon" href="resources/img/Logo4.png" type="image/3"
	sizes="30x20">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--Serve para a resolução de imagem de acordo com o dispositivo-->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--para a resoução de zoom-->
<script src="resources/js/jquery-3.3.1.min.js"></script>
<title>Dashboard</title>
</head>

<body>
	<header>
		<!-- Barra de navegaÃ§Ã£o -->
		<div id="barraDeNavegacao">
			<ul>
				<!-- Botao fechar a barra -->
				<button id="botaoFechar" class="btn-fechar">
					<img src="resources/img/close.png" class="img-rounded"
						alt="Responsive image">
				</button>

				<img src="resources/img/people.png" class="img-responsive img-users"
					alt="Responsive image">

				<h2 id="texto">Welcome ${idUsuario.idHospital}</h2>



				<!-- Lis da barra de NavegaÃ§Ã£o -->
				<li class="li-principal"><img src="resources/img/relatorio.png"
					class="img-responsive" alt="Responsive image">Relatorios</li>
				<li href=""><img src="resources/img/phone.png"
					class="img-responsive" alt="Responsive image">Abrir Chamado</li>
				<a href="logout"><li><img src="resources/img/logout.png"
						class="img-responsive" alt="Responsive image">Sair</li></a>


			</ul>
		</div>

		<!-- FAIXA DE NAVEGAÃÃO -->
		<div id="faixa-navegacao">
			<!-- Toggle -->
			<div class="toogle-btn" id="toggle">
				<span></span> <span></span> <span></span>
			</div>

			<!-- Imagem do Logo -->

			<img src="resources/img/Logo2.png"
				class="img-responsive center-block" alt="Responsive image"
				id="img-logo">

		</div>

	</header>


	<!--/////////////////////////////////////////CAIXAS COM GRAFICOS //////////////////////////////////////////////-->

	<main id="caixaPrincipal">

	<section class="departamento1">
		<div class="container-fluid">
			<div class="row">
				<c:forEach items="${computadores}" var="computador">
					<div class="col-md-6 col-sm-12 col-xs-12 col-lg-6">

						<div class="panel-danger1" id="caixaComputador">
							<div class="container-fluid">


								<h2>Computador ${computador.idComputador}</h2>


								<!--ONDE FICARA O GRAFICO-->

								<div class="chart-container">
									<canvas id="<c:out value="${computador.idComputador}"/>"></canvas>
								</div>
								<br>
								<!--ONDE FICARA O GRAFICO-->

								<!--Caixa componentes-->
								<button type="button" class="btn btn-primary"
									data-toggle="modal" data-target="#texto-caixa1"
									data-whatever="@mdo" data-target="#myModal">Gerar
									Relatorio</button>

								<div class="modal fade" id="texto-caixa1" tabindex="-1"
									role="dialog" aria-labelledby="texto-caixa1">
									<div class="modal-dialog" role="document">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal"
													aria-label="Close">
													<span aria-hidden="true">&times;</span>
												</button>
												<h4 class="modal-title" id="texto-caixa">Relátorio do
													computador</h4>
											</div>
											<div class="modal-body">

												<div class="textoCaixa1">
													<div class="row">
														<div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
															<div class="container-fluid">
																<h1>${computador.nome}</h1>

																<p>${computador.numeroIp}</p>
																<p>${computador.enderecoMac}</p>
																<p>${computador.tipoProcessador}</p>
																<p>${computador.tamanhoHd}</p>
																<p>${computador.sistemaOperacional}</p>

															</div>
														</div>
													</div>
												</div>



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


												<div class="modal-footer">
													<button type="button" class="btn btn-default"
														data-dismiss="modal">Voltar</button>
													<button type="button" class="btn btn-primary"
														onclick="window.print()">Gerar PDF</button>
												</div>
											</div>
										</div>
									</div>
								</div>
								<!--Caixa componentes-->

							</div>

						</div>
					</div>
				</c:forEach>
				<c:forEach items="${computadores}" var="computador">
				<script>
					var grafico<c:out value="${computador.idComputador}"/>;
					$(window).on('load', function(){
							// GRAFICOS////
							//////grafico i////////////
							grafico<c:out value="${computador.idComputador}"/> = new Chart(document.getElementById("${computador.idComputador}"), {
								type : 'line',
								data : {
									labels : [],
									datasets : [ {
										data : [],
										label : "Uso CPU",
										borderColor : "  #330011",
										fill : false
									}, {
										data : [],
										label : "Uso Disco",
										borderColor : "#ff80aa",
										fill : false
									}, {
										data : [],
										label : "Uso Ram",
										borderColor : "#1ab2ff",
										fill : false
									}, {
										data : [],
										label : "Bateria",
										borderColor : "#66ff66",
										fill : false
									} ]
								},
								options : {
									title : {
										display : true,
										text : 'Atualização dos Dados (Em Aprox.5s)',
										fontColor : 'black'
									},
									scales: {
								        yAxes: [{
								            ticks: {
								            	min: 0,
								                max: 100,
								                stepSize: 10
								            }
								        }]
								    }
								}
							});
							//////////////////// AJAX E JSON //////////////////////////////////////
							//////////////////////WITHOUT XMLHR
						
					function AtualizaGraficoAJAX<c:out value="${computador.idComputador}"/>() {
						// JSON transforma em array
							var json = null;
							$.ajax({
									url : 'computador/dinamica/<c:out value="${computador.idComputador}"/>',
									type : 'GET',
									dataType : 'json',
									contentType: "application/json",
									timeout : 120000,//2min de tolerância
									success : function(data) {
										console.log("funcionouuuuuuu");
										json = data;
										console.log(data);
										// criando um variavel onde
										// recebe o diretorio do grafico e a sua posição
										// nisso gar o Objeto do Json
										grafico=grafico<c:out value="${computador.idComputador}"/>;//referencia para os graficos daquela numeração
										var i = 0;
										if(grafico.data.labels.length>10){//Limite de resultados visualizaveis
											grafico.data.labels.shift(0);
											grafico.data.datasets[0].data.shift(0);
											grafico.data.datasets[1].data.shift(0);
											grafico.data.datasets[2].data.shift(0);
											grafico.data.datasets[3].data.shift(0);
										}
										grafico.data.labels.push(new Date().getMinutes()+"min "+new Date().getSeconds()+"seg");
										grafico.data.datasets[0].data.push(data.usoCpu);
										grafico.data.datasets[1].data.push(data.usoDisco);
										grafico.data.datasets[2].data.push(data.usoRam);
										grafico.data.datasets[3].data.push(data.quantidadeBateriaUsada);
										i++;
										grafico.update();
										setTimeout(AtualizaGraficoAJAX<c:out value="${computador.idComputador}"/>,5000);
									},
									error : function(e) {
										console.log("ERROR: ", e);
										alert("Algum erro de conexao ocorreu, recarregue a página. Se persistir, contate o suporte");
										display(e);
									},
									done : function(e) {
										console.log("DONE");
									}
								});
							}
							AtualizaGraficoAJAX<c:out value="${computador.idComputador}"/>();
					});
					</script>
				</c:forEach>

				<div class="col-md-6 col-sm-12 col-xs-12 col-lg-6">
					<div class="panel-danger4" id="caixaComputador4">
						<div class="container-fluid">

							<h2>Adicionar Computador</h2>

							<!--ONDE FICARA O BOTAO-->

							<img src="resources/img/mais.png"
								class="center-block img-circle imgAdicionar"
								alt="Responsive image">



							<!--ONDE FICARA O BOTAO-->


						</div>
					</div>
				</div>


			</div>
		</div>

	</section>


	</main>


	<!--////////////////////////////////////// SCRIPTS//////////////////////////////////////-->
	
	<script
		src="resources/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script src="resources/js/java.js"></script>
	<script type="text / javascript" src="https://www.gstatic.com/charts/loader.js"> </script>
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
</body>
</html>
