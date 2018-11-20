<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
										placeholder="Nome Fantasia" name="nomeFantasia" maxlength="30" required>
								</div>
								<div class="form-group col-md-6">
									<input type="text" class="form-control" placeholder="CNPJ" maxlength="14"
										name="cnpj" required>
								</div>
								<div class="form-group col-md-6">
									<input type="text" class="form-control"
										placeholder="Razão Social" name="nome" maxlength="30" required>
								</div>
								<div class="form-group col-md-6">
									<input type="tel" class="form-control" placeholder="Telefone" maxlength="14"
										name="telefone" required>
								</div>
								<div class="form-group col-md-6">
									<input type="text" class="form-control" placeholder="CEP" pattern="[0-9]{5}-[0-9]{3}" title="deve corresponder o modelo 12345-123" maxlength="12"
										name="cep" required>
								</div>
								<div class="form-group col-md-6">
									<input type="text" class="form-control" placeholder="Endereço" 
										name="rua" required>
								</div>
								<div class="form-group col-md-6 ">
									<input type="text" class="form-control" placeholder="Bairro" maxlength="60"
										name="bairro" required>
								</div>
								<div class="form-group col-md-2 col-lg-2">
									<input type="number" class="form-control" placeholder="Número" max="9999"
										name="numero" required>
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
									<input type="text" class="form-control" placeholder="Cidade" maxlength="60"
										name="cidade" required>
								</div>
								<div class="form-group col-md-6">
									<input type="email" class="form-control" id="inputEmail4"
										placeholder="Email Comercial" name="emailComercial" maxlength="64" required>
								</div>
								<div class="form-group col-md-6">
									<input type="password" class="form-control" id="inputPassword4"
										placeholder="Senha" name="senha" pattern=".{5,}" maxlength="45" title="A senha deve ter mais de 4 caracteres" required>
								</div>
								<div class="form-group col-md-6">
									<input type="password" class="form-control" id="inputPassword4" name="senhaConfirmada"
										placeholder="Confirmar Senha" required>
								</div>
							</div>

							<h3 id="AVISO"></h3>
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
<script>
//name="cnpj"
//name="nome"
//name="telefone"
//name="cep"
//name="rua"
//name="bairro"
//name="numero"
//name="cidade"
//name="emailComercial"
//name="senha"
	$(document).ready(function() {
	     $(':input[type="submit"]').prop('disabled', true);//O botao de cadastro ja vem desabilitado
	     $('input[class="form-control"]').keyup(function() {
	     	if(
	     	$('input[name="nomeFantasia"]').val().length==0||
	     	$('input[name="cnpj"]').val().length==0||
	     	$('input[name="nome"]').val().length==0||
	     	$('input[name="telefone"]').val().length==0||
	     	$('input[name="rua"]').val().length==0||
	     	$('input[name="bairro"]').val().length==0||
	     	$('input[name="numero"]').val().length==0||
	     	$('input[name="cidade"]').val().length==0||
	     	$('input[name="emailComercial"]').val().length==0||
	     	$('input[name="senha"]').val().length==0
	     	){//se há campos vazios, alerta e não ativa botão
	     		$('h3[id="AVISO"]').text("Preencha todos os campos");
	     		$(':input[type="submit"]').prop('disabled', true);
	     	}else if($('input[name="senhaConfirmada"').val()!=$('input[name="senha"').val()){//se senha não coincide, não ativa botão
	    		 $('h3[id="AVISO"]').text("Senhas não coincidem");
	    		 $(':input[type="submit"]').prop('disabled', true);
	    	}else{//se todos os campos estão preenchidos, habilita botão de cadastro
	    		 $('h3[id="AVISO"]').text("");
	    		 $(':input[type="submit"]').prop('disabled', false);
	     	}
	    
	     }
	     );
	});
</script>
</body>
</html>