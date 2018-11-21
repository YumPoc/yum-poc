<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



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

				<h2 id="texto">Welcome User</h2>


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
				<div class="col-md-6 col-sm-12 col-xs-12 col-lg-6">

					<div class="panel-danger1" id="caixaComputador">
						<div class="container-fluid">

							<h2>Computador 1</h2>

							<!--ONDE FICARA O GRAFICO-->

							<div class="chart-container">
								<canvas id="line-chart"></canvas>
							</div>


							<br>
							<!--ONDE FICARA O GRAFICO-->

							<!--Caixa componentes-->
							<button type="button" class="btn btn-primary btn-componentes2"
								data-toggle="modal" data-target="#texto-caixa1"
								data-whatever="@mdo" data-target="#myModal" >Gerar
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
												computador 1</h4>
										</div>
										<div class="modal-body">

											<div class="textoCaixa1">
												<div class="row">
													<div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
														<div class="container-fluid">
															<h1>AAAAAAAAAAAAAAA</h1>
															<p>aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
																aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
																aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
																aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
																aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</p>
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

				<div class="col-md-6 col-sm-12 col-xs-12 col-lg-6">
					<div class="panel-danger2" id="caixaComputador2">
						<div class="container-fluid">

							<h2>Computador 2</h2>

							<!--ONDE FICARA O GRAFICO-->

							<div class="chart-container" style="margin-bottom: 15px;">
								<canvas id="line-chart2" style="height: 2px; "></canvas>
							</div>




							<!--ONDE FICARA O GRAFICO-->

							<!--Caixa componentes-->
							<button type="button" class="btn btn-primary btn-componentes2"
								data-toggle="modal" data-target="#texto-caixa2"
								data-whatever="@mdo" data-target="#myModal">Gerar
								Relátorio</button>

							<div class="modal fade" id="texto-caixa2" tabindex="-1"
								role="dialog" aria-labelledby="texto-caixa2">
								<div class="modal-dialog" role="document">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
											<h4 class="modal-title" id="texto-caixa">Relátorio do
												computador 2</h4>
										</div>
										<div class="modal-body">
												<div class="textoCaixa1">
												<div class="row">
													<div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
														<div class="container-fluid">
															<h1>AAAAAAAAAAAAAAA</h1>
															<p>aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
																aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
																aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
																aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
																aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</p>
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


											</div>



											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">Voltar</button>
												<button type="button" class="btn btn-primary">Vizualizar</button>
											</div>

										</div>
									</div>
								</div>
							</div>
							<!--Caixa componentes-->
						</div>
					</div>
				</div>



			</div>
		</div>

	</section>

	<!--/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-->
	<section class="departamento2">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-6 col-sm-12 col-xs-12 col-lg-6">
					<div class="panel-danger3" id="caixaComputador3">
						<div class="container-fluid">

							<h2>Computador 3</h2>

							<!--ONDE FICARA O GRAFICO-->

							<div class="chart-container" style="margin-bottom: 15px;">
								<canvas id="line-chart3" style="height: 2px;"></canvas>
							</div>



							<!--ONDE FICARA O GRAFICO-->

							<!--Caixa componentes-->
							<button type="button" class="btn btn-primary btn-componentes2"
								data-toggle="modal" data-target="#texto-caixa3"
								data-whatever="@mdo" data-target="#myModal">Gerar
								Relátorio</button>
								
										<div class="modal fade" id="texto-caixa3" tabindex="-1"
								role="dialog" aria-labelledby="texto-caixa3">
								<div class="modal-dialog" role="document">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
											<h4 class="modal-title" id="texto-caixa">Relátorio do
												computador 3</h4>
										</div>
										<div class="modal-body">
												<div class="textoCaixa1">
												<div class="row">
													<div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
														<div class="container-fluid">
															<h1>AAAAAAAAAAAAAAA</h1>
															<p>aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
																aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
																aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
																aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
																aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</p>
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
											</div>



											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">Voltar</button>
												<button type="button" class="btn btn-primary">Vizualizar</button>
											</div>

										</div>
									</div>
								</div>

				
							<!--Caixa componentes-->
						</div>
					</div>
				</div>



				<div class="col-md-6 col-sm-12 col-xs-12 col-lg-6">
					<div class="panel-danger4" id="caixaComputador4">
						<div class="container-fluid">

							<h2>Adicionar Computador</h2>

							<!--ONDE FICARA O BOTAO-->

							<img src="resources/img/mais.png" class="center-block img-circle imgAdicionar" alt="Responsive image">



							<!--ONDE FICARA O BOTAO-->

						
						</div>
					</div>
				</div>


			</div>
		</div>

	</section>


	</main>


	<!--////////////////////////////////////// SCRIPTS//////////////////////////////////////-->
	<script src="resources/js/jquery-3.3.1.min.js"></script>
	<script
		src="resources/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script src="resources/js/java.js"></script>
	<script type="text / javascript"
		src="https://www.gstatic.com/charts/loader.js"> </script>
	<script type="text/javascript"
		src="https://www.gstatic.com/charts/loader.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
	<script src="resources/js/Graficos.js"></script>
</body>
</html>
