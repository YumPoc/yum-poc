<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" type="text/css" href="resources/css/home.css">
<link rel="stylesheet" href="resources/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--Serve para a resolu��o de imagem de acordo com o dispositivo-->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--para a resou��o de zoom-->
<link rel="icon" href="resources/img/Logo4.png" type="image/x-icon" />
<!-- Para funcionar o Carrossel -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>YumPoc</title>

</head>

<body>
	<!--/////////////////////////cabe�alho da pagina/////////////////////////////////////-->
	<header>

		<div class="barra-navegation">
			<nav class="navbar navbar-incluid navbar-fixed-top ">
				<div class="container-fluid">

					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse" data-target="#barra-navegation"
							aria-expanded="false" id="toogle-caixa">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span> <span class="icon-bar"></span>
						</button>
						<img class="navbar-brand" id="img-logo">
					</div>


					<div class="caixa-li">
						<div class="container-fluid">
							<div class="collapse navbar-collapse" id="barra-navegation">
								<!--div para desaparecer o menu em resolu��o pequena-->


								<ul class="nav navbar-nav sidebar-nav navbar-left" id="caixa-a">
									<!--Classe para o espe�amento da navbar-->
									<div class="logotipo">
										<li><a href="http://localhost:8080/yum-poc/index" id="logo"> <img src="resources/img/Logo5.png">
										</a></li>
									</div>
								</ul>


								<ul class="nav navbar-nav sidebar-nav navbar-right" id="caixa-a">
									<!--Classe para o espe�amento da navbar-->

									<li><a class="active" href="#section-home" id="text-1">Home</a></li>
									<li><a href="#section-produto-parallax" id="text-1">Produto</a></li>
									<li><a href="#section-inovacao" id="text-1">inovação</a></li>
									<li><a href="#section-pacotes" id="text-1">Pacotes</a></li>
									<li><a href="https://assistant-chat-us-south.watsonplatform.net/web/public/0c0d93f5-5dc8-4bd2-8529-9b8488e7d4e4" id="text-1">SAC Yumi</a></li>
									<li><a href="#sobre-nos" id="text-1">About us</a></li>
									<li><a href="cadastro" id="text-2">Cadastro</a></li>
									<a href="login">
									<button class="btn btn-primary" type="submit" id="btn-login">
										Login
									</button>
									</a>

								</ul>
							</div>


						</div>
					</div>
				</div>

			</nav>
		</div>




		<section class="center" id="section-home">

			<div id="carousel-example-generic" class="carousel slide"
				data-ride="carousel">
				<!--data-ride sgnifica que vai recer a anima��o assim que a pagina e carregada-->
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<!--indicaor de slides-->
					<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
					<!--a calass actve sgnifica uma unica vez -->
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<!-- O dataside-to significa a ordem ds carrossel-->
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<!--listagem do carrosel e o a u��o de cada slide-->

					<div class="item active">
						<!--para receber algum tipo de item teto o imagens-->
						<div class="img">
							<img src="resources/img/carousel3.jpg">
						</div>
						<div class="carousel-caption">
							<!--são as legedas do carossel-->
							<h1>IoT</h1>
							<p>Raspberry - usado como inovação principal da nossa solução.</p>
						</div>
					</div>

					<div class="item">
						<div class="img">
							<img src="resources/img/carousel2.jpg">
						</div>
						<div class="carousel-caption">
							<h1>Monitoração dos leitos</h1>
							<p>Cuidado, tecnologia e agilidade - o foco desta solução.</p>
						</div>
					</div>

					<div class="item">
						<div class="img">
							<img src="resources/img/carousel1.jpg">
						</div>
						<div class="carousel-caption">
							<h1>Energia de negócio</h1>
							<p>Trabalhamos para que seu foco seja as pessoas, e nosso
								foco a tecnologia.</p>
						</div>
					</div>
				</div>

				<!-- Controls -->
				<a class="left carousel-control" href="#carousel-example-generic" data-slide="prev"> 
					<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
				<a class="right carousel-control" href="#carousel-example-generic" data-slide="next"> 
					<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>

			</div>

		</section>


	</header>

	<!--/////////////////////////cabe�alho da pagina/////////////////////////////////////-->
	<!--Inicio das divs sections-->


	<section id="section-produto-parallax">
		<div
			class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center"></div>
		<br> <br> <br>
		<h1 class="produto-text-1">
			<center>NOSSO SERVIÇO DE MONITORAMENTO</center>
		</h1>
		<p class="lead text-center">Prestamos monitoramento dos seus
			devices, veja como a YumPoc otimiza seu processo atual</p>
		<br> <br>

		<div class="container">
			<div class="row">
				<div
					class="col-lg-5 col-md-5 col-sm-4 col-xs-12 caixa-monitoramento1">
					<h2>NOC intenso para seus devices estrem sempre em segurança</h2>
					<p>
						Você reconhece a importância de ter seu HD, memória ram entre
						outros em constante monitoramento? <br> Num hospital isso se
						torna cada vez mais necessário, pois o foco tem que quer no
						cuidado humano,<br> Deixe que cuidamos dessa parte da
						tecnologia por você! <br> Pois sabemos o quanto valorizar as
						pessoas é importante e o tanto que a tecnologia favorece os
						pacientes...
					</p>
				</div>


				<div
					class="col-lg-5 col-md-5 col-sm-4 col-xs-12 caixa-monitoramento2">
					<img src="resources/img/medico2.jpg" class="img-responsive medico2"
						alt="Responsive image">
				</div>

			</div>

		</div>

	</section>


	<section>
		<div
			class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center"></div>
		<br>
		<div id="section-inovacao">

			<h1 class="inovacao-text-2">
				<center>NOSSA INOVAÇÃO</center>
			</h1>
			<p class="lead text-center">Simples....Prático e Atual... Uma das
				mais novas tecnologias no seu hospital</p>
			<br> <br> <br> <br>

			<div class="container">
				<div class="row">
					<div
						class="col-lg-5 col-md-5 col-sm-4 col-xs-12 caixa-monitoramento2">
						<img src="resources/img/rasp1.png" class="img-responsive rasp1"
							alt="Responsive image">
					</div>

					<div
						class="col-lg-5 col-md-5 col-sm-4 col-xs-12 caixa-monitoramento2">
						<h2>
							IoT no seu hospital!<br> Utilizado na monitoração dos leitos
							hospitalares
						</h2>
						<p>
							Buscamos tarzer o melhor para nossos clientes, com isso
							utilizando a internet das coisas (IoT) <br> Raspberry além
							de ser muito atual e open source, oferemos nosso serviço com o
							monitoramento dos leitos hospitalares através dele.. <br> Se
							quiser saber mais, fale com um dos nossos desenvolvedores!!
						</p>
					</div>
				</div>

			</div>
		</div>



	</section>


	<section id="section-pacotes">

		<div
			class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center"></div>
		<h1 class="display-4">
			<center>Pacotes</center>
		</h1>
		<p class="lead text-center">Se você se interessou pela nossa
			solução, pode adquirir um de nossos planos que se encaixem com a sua
			necessidade.</p>
		</div>

		<div class="container">
			<div class=" mb-3 text-center">
				<!--o problema era .col-md-6 e não col-md-6 -->
				<div class="col-md-5 mypanel">
					<div>
						<h1 class="font-weight-normal">Basic</h1>
					</div>


					<h1 class="">
						R$100.000,50 <small class="text-muted">/mês</small>
					</h1>
					<ul class="list-unstyled mt-3 mb-4">
						<li>20 usuários inclusos</li>
						<br>
						<li>Monitorameto dos devices</li>
						<br>
						<li>Relatórios diários</li>
						<br>
						<li>Gerência de risco</li>
					</ul>
					<button type="button" class="btn btn-lg btn-block btn-primary">COMPRE-ME</button>

				</div>

				<div class="col-md-2"></div>
				<div class="col-md-5 mypanel">
					<div>
						<h1 class=" font-weight-normal">Full Health</h1>
					</div>


					<h1 class="">
						R$500.000,50 <small class="text-muted">/mês</small>
					</h1>
					<ul class="list-unstyled mt-3 mb-4">
						<li>Monitoramento de leitos hospitalares</li>
						<br>
						<li>Sistema de alerta a quedas de pacientes</li>
						<br>
						<li>Relatórios diários</li>
						<br>
						<li>Gerencia de risco</li>
					</ul>
					<button type="button" class="btn btn-lg btn-block btn-primary">COMPRE-ME</button>


				</div>
			</div>


		</div>


		<!-- Bootstrap core JavaScript
            ================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
			integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
			crossorigin="anonymous"></script>
		<script>
			Holder.addTheme('thumb', {
				bg : '#55595c',
				fg : '#eceeef',
				text : 'Thumbnail'
			});
		</script>
	</section>


	<section id="sobre-nos">


		<h1 class="display-4" style="text-align: center">About us</h1>
		<p style="text-align: center">Por trás desta do YumPoc há uma
			equipe de desenvolvedores sonhadores e apaixonados por tecnologia!</p>
		<br>


		<div class="img-circle imagem" alt="Responsive image" id="profile">
			<div class="texto">
				<h2>BIANCA GOMES</h2>
				<h4>Desenvolvedora FullStack</h4>
			</div>
		</div>

		<div class="img-circle imagem1" alt="Responsive image" id="profile">
			<div class="texto1">
				<h2>JUVENCIO JOSE</h2>
				<h4>Desenvolvedor e SCRUM</h4>
			</div>
		</div>


		<div class="img-circle imagem2" alt="Responsive image" id="profile">
			<div class="texto2">
				<h2>ANA BEATRIZ</h2>
				<h4>Desenvolvedora Full Stack</h4>
			</div>
		</div>

		<div class="img-circle imagem3" alt="Responsive image" id="profile">
			<div class="texto3">
				<h2>GUI</h2>
				<h4>Desenvolvedor Full Stack</h4>
			</div>
		</div>

		<div class="img-circle imagem4" alt="Responsive image" id="profile">
			<div class="texto4">
				<h2>GERMANO</h2>
				<h4>Desenvolvedor Full Stack</h4>
			</div>
		</div>
	</section>


	<footer class="footer">
		<div class="container">
			<div class="row">
				<div class="col-lg-5 col-md-5 col-sm-4 col-xs-12 footer">
					<ul class="frase-footer">YUM Processos Operacionais Centrais
					</ul>
				</div>

			</div>
	</footer>



	<!--/////////////////////////scripts do Java/////////////////////////////////////-->
	<script src="jquery-3.3.1.min.js"></script>
	<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</body>

</html>