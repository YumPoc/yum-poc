<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<!DOCTYPE html>
<html lang="br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="resources/css/deshboard2.css">
    <link rel="stylesheet" href="resources/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="icon" href="resources/img/Logo4.png" type="image/3"
	sizes="30x20">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--Serve para a rsolução de imagem de acordo com o dispositivo-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--para a resolução de zoom-->

    <title>Dashboard2</title>

  
</head>

<body>
<header>
        <!-- Barra de navegaÃ§Ã£o -->
        <div id="barraDeNavegacao">
          <ul>
          <!-- Botao fechar a barra -->
           <button id="botaoFechar" class="btn-fechar"><img src="resources/img/close.png" class="img-rounded" alt="Responsive image"></button>

		<img src="resources/img/people.png" class="img-responsive img-users" alt="Responsive image">
		
		<h2 id="texto">Welcome Urser</h2>
		
		
          <!-- Lis da barra de NavegaÃ§Ã£o -->
           <li class="li-principal"><img src="resources/img/relatorio.png" class="img-responsive" alt="Responsive image">Relatorios</li>
           <li href=""><img src="resources/img/ajuda.png" class="img-responsive" alt="Responsive image">Ajuda</li>
           <li href=""><img src="resources/img/phone.png" class="img-responsive" alt="Responsive image">Abrir Chamado</li>
           <li href=""><img src="resources/img/logout.png" class="img-responsive" alt="Responsive image">Sair</li>
            
           
          </ul>
        </div>

    <!-- FAIXA DE NAVEGAÃ‡ÃƒO -->    
    <div id="faixa-navegacao">
        <!-- Toggle -->
        <div class="toogle-btn" id="toggle">

          <span></span>
          <span></span>
          <span></span>
        </div>
        
          <!-- Imagem do Logo -->
         
        <img src="resources/img/Logo2.png" class="img-responsive center-block" alt="Responsive image" id="img-logo">
     
    </div>
     
</header>

<!--/////////////////////////RELATORIO/////////////////////-->

<section>
    <div class="container">
        <div class="row">
            <div id="caixaRelatorio" class="col-md-8 col-sm-12 col-xs-12 col-lg-8 caixa_Relatorio">
                <h1>AAAAAAAAAAAA</h1>
               	<div class="container-fluid">
               	
               	
	                <div class="textoCaixa1">
	                	<div class="container-fluid">
			                <p>aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</p>
		                </div>
	                </div>
	                
	                
	                <div class="textoCaixa2">
	                	<div class="container-fluid">
			                <p>aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</p>
		                </div>
	                </div>
	                
	                 <div class="textoCaixa3">
	                	<div class="container-fluid">
			                <div class="chart-container">
                                   <canvas id="chart" style="height: 220px;"></canvas>                                                    
                            </div>
		                </div>
	                </div>
	                
	                <div class="textoCaixa4">
	                	<div class="container-fluid">
			                <div class="chart-container">
                                <canvas id="doughnut-chart" width="800" height="500"></canvas>
                            </div>
		                </div>
	                </div>
	                
	                    <button type="button" class="btn btn-primary"  onclick="window.print()">Vizualizar</button>
	                
	             </div>
                
            </div>
            
            
        </div>
        
    </div>
</section>



   

    <!--////////////////////////////////////// SCRIPTS//////////////////////////////////////-->
    <script src="resources/js/jquery-3.3.1.min.js"></script>
    <script src="resources/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="resources/js/java2.js"></script>
    <script type = "text / javascript" src = "https://www.gstatic.com/charts/loader.js" > </script>
     <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
     <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
    
    
   
    <script type="text/javascript">
  var data = {
  labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"],
  datasets: [{
    label: "Dataset #1",
    backgroundColor: "#ADFF2F",
    borderColor: "#9ACD32",
    borderWidth: 2,
    hoverBackgroundColor: "#ADFF2F",
    hoverBorderColor: "#9ACD32",
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

new Chart(document.getElementById("doughnut-chart"), {
    type: 'doughnut',
    data: {
      labels: ["Africa", "Asia", "Europe", "Latin America", "North America"],
      datasets: [
        {
          label: "Population (millions)",
          backgroundColor: ["#3e95cd", "#8e5ea2","#3cba9f","#e8c3b9","#c45850"],
          data: [2478,5267,734,784,433]
        }
      ]
    },
    options: {
      title: {
        display: true,
        text: 'Predicted world population (millions) in 2050'
      }
    }
});

</script>



</body>

</html>