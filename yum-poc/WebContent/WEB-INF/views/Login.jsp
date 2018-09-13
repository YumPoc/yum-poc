<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Login Yum-Poc</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="WEB-INF/resources/css/style.css" />
    <link rel="icon" href="WEB-INF/resources/img/Logo5.png" type="image/png" sizes="30x20"> 
    <script src="main.js"></script>
</head>
<body>
   <!-- <div class="caixa1">-->
    <form title="login" action="#.jsp">
        <img src="Logo.png" class="logo">
        <br><br>
        <input type="text" name="email" placeholder="Email/CNPJ"/>
        <br/>
        <input type="password" name="senha" placeholder="Senha"/>
        <br>
        <button>Entrar</button>
      <div class="caixa_senha"><a href="#">Esqueci a senha</a></div>
    </form>         

</body>
</html>