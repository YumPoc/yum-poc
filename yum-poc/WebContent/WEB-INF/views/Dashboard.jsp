<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="resources/css/deshboard.css">
    <link rel="stylesheet" href="resources/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--Serve para a rsolução de imagem de acordo com o dispositivo-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--para a resoução de zoom-->

    <title>Document</title>

  
</head>

<body>
<header>
        <!-- Barra de navegação -->
        <div id="barraDeNavegacao">
          <ul>
          <!-- Botao fechar a barra -->
           <button id="botaoFechar" class="btn-fechar"><img src="resources/img/close.png" class="img-rounded" alt="Responsive image"></button>

           <!-- Imagem do Perfil -->
          <img src="resources/img/dog.jpg" class="img-circle img-perfil" alt="Responsive image">

          <!-- Lis da barra de Navegação -->
           <li class="li-principal" href="" data-toggle="modal" data-target="#caixa-perfil" data-whatever="@mdo" data-target="#myModal"><img src="resources/img/perfil.png" class="img-responsive" alt="Responsive image">Prefil</li>
            <li href=""><img src="resources/img/ajuda.png" class="img-responsive" alt="Responsive image">Ajuda</li>
            <li href=""><img src="resources/img/hospital.png" class="img-responsive" alt="Responsive image">Departamento</li>
            <li href=""><img src="resources/img/phone.png" class="img-responsive" alt="Responsive image">Abrir Chamado</li>
          </ul>
        </div>

    <!-- FAIXA DE NAVEGAÇÃO -->    
    <div id="faixa-navegacao">
        <!-- Toggle -->
        <div class="toogle-btn" id="toggle">
          <span></span>
          <span></span>
          <span></span>
        </div>

        <!-- Imagem Logo -->
     
    </div>
     
</header>


<!--/////////////////////////////////////////CAIXAS COM GRAFICOS //////////////////////////////////////////////-->
<main>
    <section class="departamento1">
                  <div class="container-fluid">
                                <div class="row">                               
                                    <div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
                                        <div class="panel-danger1" id="caixaComputador">
                                            <div class="container-fluid">

                                                <h2>Computador 1</h2>

                                                    <!--ONDE FICARA O GRAFICO-->
                                                    <div class="chart-container">
                                                       <canvas id="chart" style="height: 370px;"></canvas>
                                                     </div>
                                                    
                                                    <br>
                                                    <!--ONDE FICARA O GRAFICO-->

                                                    <!--Caixa componentes-->
                                                    <button type="button" class="btn btn-primary btn-componentes2" data-toggle="modal" data-target="#texto-caixa1" data-whatever="@mdo" data-target="#myModal">Componentes</button>

                                                    <div class="modal fade" id="texto-caixa1" tabindex="-1" role="dialog" aria-labelledby="texto-caixa1">
                                                        <div class="modal-dialog" role="document">
                                                            <div class="modal-content">
                                                                <div class="modal-header">
                                                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                        <span aria-hidden="true">&times;</span>
                                                                    </button>
                                                                    <h4 class="modal-title" id="texto-caixa">Componentes do computador 1</h4>
                                                                </div>
                                                                <div class="modal-body">
                                                                    <form>
                                                                        <div class="checkbox">
                                                                            <label>
                                                                                <input type="checkbox" value="">1 Opção
                                                                            </label>
                                                                        </div>
                                                                        <div class="checkbox">
                                                                                <label>
                                                                                    <input type="checkbox" value="">1 Opção
                                                                                </label>
                                                                            </div>

                                                                    </form>
                                                                    <div class="modal-footer">
                                                                        <button type="button" class="btn btn-default" data-dismiss="modal">Voltar</button>
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
</main>
<!--/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-->
<section class="departamento2">
              <div class="container-fluid">
                            <div class="row">                               
                                <div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
                                    <div class="panel-danger2" id="caixaComputador2">
                                        <div class="container-fluid">

                                            <h2>Computador 2</h2>

                                                <!--ONDE FICARA O GRAFICO-->                                           
                                                    
                                            <div class="chart-container">
                                                <canvas id="chart2" style="height: 370px;"></canvas>
                                            </div>
                                                    
                                               
                                               
                                                <!--ONDE FICARA O GRAFICO-->

                                                <!--Caixa componentes-->
                                                <button type="button" class="btn btn-primary btn-componentes2" data-toggle="modal" data-target="#texto-caixa3" data-whatever="@mdo" data-target="#myModal">Componentes</button>

                                                <div class="modal fade" id="texto-caixa3" tabindex="-1" role="dialog" aria-labelledby="texto-caixa3">
                                                    <div class="modal-dialog" role="document">
                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                    <span aria-hidden="true">&times;</span>
                                                                </button>
                                                                <h4 class="modal-title" id="texto-caixa">Componentes do computador 3</h4>
                                                            </div>
                                                            <div class="modal-body">
                                                                <form>
                                                                    <div class="checkbox">
                                                                        <label>
                                                                            <input type="checkbox" value="">1 Opção
                                                                        </label>
                                                                    </div>
                                                                    <div class="checkbox">
                                                                            <label>
                                                                                <input type="checkbox" value="">1 Opção
                                                                            </label>
                                                                        </div>

                                                                </form>
                                                                <div class="modal-footer">
                                                                    <button type="button" class="btn btn-default" data-dismiss="modal">Voltar</button>
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











    <!--////////////////////////////////////// SCRIPTS//////////////////////////////////////-->
    <script src="resources/js/jquery-3.3.1.min.js"></script>
    <script src="resources/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="resources/js/java.js"></script>
    <script type = "text / javascript" src = "https://www.gstatic.com/charts/loader.js" > </script>
     <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
     <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>





    <script type="text/javascript">
  var data = {
  labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"],
  datasets: [{
    label: "Dataset #1",
    backgroundColor: "rgba(255,99,132,0.2)",
    borderColor: "rgba(255,99,132,1)",
    borderWidth: 2,
    hoverBackgroundColor: "rgba(255,99,132,0.4)",
    hoverBorderColor: "rgba(255,99,132,1)",
    data: [65, 59, 20, 81, 56, 55, 40],
  }]
};

var options = {
  maintainAspectRatio: false,
  scales: {
    yAxes: [{
      stacked: true,
      gridLines: {
        display: true,
        color: "rgba(255,99,132,0.2)"
      }
    }],
    xAxes: [{
      gridLines: {
        display: false
      }
    }]
  }
};

Chart.Bar('chart', {
  options: options,
  data: data
});

    </script>





    <script type="text/javascript">
 var data = {
  labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"],
  datasets: [{
    label: "Dataset #1",
    backgroundColor: "rgba(255,99,132,0.2)",
    borderColor: "rgba(255,99,132,1)",
    borderWidth: 2,
    hoverBackgroundColor: "rgba(255,99,132,0.4)",
    hoverBorderColor: "rgba(255,99,132,1)",
    data: [65, 59, 20, 81, 56, 55, 40],
  }]
};

var options = {
  maintainAspectRatio: false,
  scales: {
    yAxes: [{
      stacked: true,
      gridLines: {
        display: true,
        color: "rgba(255,99,132,0.2)"
      }
    }],
    xAxes: [{
      gridLines: {
        display: false
      }
    }]
  }
};

Chart.Bar('chart2', {
  options: options,
  data: data
});
    </script>



</body>

</html>