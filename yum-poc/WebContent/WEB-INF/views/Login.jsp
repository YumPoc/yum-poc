<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Login Yum-Poc</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" media="screen" href="resources/css/login.css" />
        <link rel="icon" href="resources/img/Logo4.png" type="image/3" sizes="30x20"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <body>
       <!-- <div class="caixa1">-->
    
    <div class="container">
        <form>    
            <div class="container-fluid">        
                <div class="row">
                <div class="col-xs-1 col-sm-12 caixa-divisao"></div>
                  <div class="col-lg-3 col-md-2 col-sm-2 col-xs-2"></div>
                    <div class="col-lg-6 col-md-8 col-sm-12 col-xs-6 caixafundo">
                            <img src="resources/img/Logo2.png" class="rounded mx-auto d-block" alt="Responsive image" id="caixa-img">
                            <br>
                    <div class="container">
                        <div class="form-group">
                                <input type="email" class="form-control" aria-describedby="emailHelp" placeholder="E-mail">                  
                        </div>
    
                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="Password">
                        </div> 
                    </div>
    
                        <div class="col-lg-12">
                                <button type="submit" class="btn btn-outline-primary btn-lg btn-block" id="butao">Entrar</button>
                        </div> 
                        <div class="caixa_senha"><a href="#">Esqueci a senha</a></div>
    
                        <div class="caixa-img-seta"><a href="https://www.flaticon.com/free-icon/left-arrow_271218#term=arrow&page=1&position=10"><img src="resources/img/seta.png" class="rounded float-right img-seta" alt="Responsive image"></a></div>
    
    
                    </div>
                </div>
            </div>
        </form>  
    </div>       
    
    
    
    <!--/////////////////////////////////////////////scripts////////////////////////////////////-->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
    </html>