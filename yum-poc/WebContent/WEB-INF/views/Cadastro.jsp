<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Cadastro Yum-Poc</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--para a resouÃ§Ã£o de zoom-->
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" type="text/css" href="resources/css/cadastro.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!--Serve para a resolução de imagem de acordo com o dispositivo-->
<link rel="icon" href="resources/img/Logo4.png" type="image/png">
<link rel="stylesheet" type="text/css" href="resources/cadastro.css">

</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<!--<div class="col-xs-1 col-sm-12 caixa-divisao"></div>-->
			<div class="col-md-12 caixa-principal">
				<div class="col-12 janela">

					<img src="resources/img/Logo2.png" class="rounded mx-auto d-block"
						alt="YUM POC" id="caixa-img">

					<form action="sucesso-cadastro" method="post">
						<div class="center">
							<div class="form-row">

								<div class="form-group col-md-6">
									<input type="text" class="form-control"
										placeholder="Nome Fantasia" name="nomeFantasia">
								</div>
								<div class="form-group col-md-6">
									<input type="text" class="form-control" placeholder="CNPJ"
										name="cnpj">
								</div>
								<div class="form-group col-md-6">
									<input type="text" class="form-control"
										placeholder="Razão Social" name="nome">
								</div>
								<div class="form-group col-md-6">
									<input type="tel" class="form-control" placeholder="Telefone"
										name="telefone">
								</div>
								<div class="form-group col-md-6">
									<input type="number" class="form-control" placeholder="CEP"
										name="cep">
								</div>
								<div class="form-group col-md-6">
									<input type="text" class="form-control" placeholder="Endereço"
										name="rua">
								</div>
								<div class="form-group col-md-6 ">
									<input type="text" class="form-control" placeholder="Bairro"
										name="bairro">
								</div>
								<div class="form-group col-md-2 col-lg-2">
									<input type="text" class="form-control" placeholder="Número"
										name="numero">
								</div>

								<div class="form-group col-md-4 col-lg-4">
									<select class="form-control" name="estado">
										<option value="">Estado</option>
										<option value="AC">Acre</option>
										<option value="AL">Alagoas</option>
										<option value="AP">Amapá</option>
										<option value="AM">Amazonas</option>
										<option value="BA">Bahia</option>
										<option value="CE">Ceará</option>
										<option value="DF">Distrito Federal</option>
										<option value="ES">Espírito Santo</option>
										<option value="GO">Goiás</option>
										<option value="MA">Maranhão</option>
										<option value="MT">Mato Grosso</option>
										<option value="MS">Mato Grosso do Sul</option>
										<option value="MG">Minas Gerais</option>
										<option value="PA">Pará</option>
										<option value="PB">Paraíba</option>
										<option value="PR">Paraná</option>
										<option value="PE">Pernambuco</option>
										<option value="PI">Piauí</option>
										<option value="RJ">Rio de Janeiro</option>
										<option value="RN">Rio Grande do Norte</option>
										<option value="RS">Rio Grande do Sul</option>
										<option value="RO">Rondônia</option>
										<option value="RR">Roraima</option>
										<option value="SC">Santa Catarina</option>
										<option value="SP">São Paulo</option>
										<option value="SE">Sergipe</option>
										<option value="TO">Tocantins</option>
									</select>
								</div>

								<div class="form-group col-md-6">
									<input type="text" class="form-control" placeholder="Cidade"
										name="cidade">
								</div>
								<div class="form-group col-md-6">
									<input type="email" class="form-control" id="inputEmail4"
										placeholder="Email Comercial" name="emailComercial">
								</div>
								<div class="form-group col-md-6">
									<input type="password" class="form-control" id="inputPassword4"
										placeholder="Senha" name="senha">
								</div>
								<div class="form-group col-md-6">
									<input type="password" class="form-control" id="inputPassword4"
										placeholder="Confirmar Senha">
								</div>
							</div>


							<div class="row">
								<div class="col-md-6 col-sm-12 col-xs-12 caixa-botao">
									<button type="submit" class="btn btn-outline-primary butao"
										value="adicionar">Cadastrar</button>
								</div>

								<br>

								<div class="col-md-6 col-sm-12 col-xs-12 caixa-botao">
									<button type="button" class="btn btn-outline-danger butao2">
										Cancelar</button>
								</div>

							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!--/////////////////////////////SCRIPT ////////////////////////////////////////////-->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>

</body>
</html>