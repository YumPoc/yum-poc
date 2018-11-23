// GRAFICOS////

//////grafico 1////////////





var grafico1 = new Chart(document.getElementById("line-chart"), {
	type : 'line',
	data : {
		labels : [ 0, 5, 10, 15, 30, 35, 40, 45, 50, 55, 60 ],
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
		},
		 {
			data : [] ,
			label : "Uso Ram",
			borderColor : "#1ab2ff",
			fill : false
		},{
			data : [],
			label : "Bateria",
			borderColor : "#66ff66",
			fill : false
		}]
	},
	options : {
		title : {
			display : true,
			text : 'Atualização dos Dados (Em 5s)',
			 fontColor: 'black'
		}
	}
});

// ///////// grafico 2//////////////////////////
var grafico2 = new Chart(document.getElementById("line-chart2"), {
	type : 'line',
	data : {
		labels : [ 0, 5, 10, 15, 30, 35, 40, 45, 50, 55, 60 ],
		datasets : [ {
			data : [ 0, 20, 10, 50, 30, 40, 60, 98, 80, 70, 9 ],
			label : "Uso CPU",
			borderColor : "  #330011",
			fill : false
		}, {
			data : [ 0, 86, 14, 15, 68, 25, 55, 15, 48, 45, 73 ],
			label : "Uso Disco",
			borderColor : "#ff80aa",
			fill : false
		},
		 {
			data : [ 0, 13, 37, 14, 44, 25, 82, 35, 81, 3, 57 ],
			label : "Uso Ram",
			borderColor : "#1ab2ff",
			fill : false
		},{
			data : [ 0, 23, 10, 15, 3, 25, 5, 35, 2, 6, 50 ],
			label : "Bateria",
			borderColor : "#66ff66",
			fill : false
		}]
	},
	options : {
		title : {
			display : true,
			text : 'Atualização dos Dados (Em 5s)',
			 fontColor: 'black'
		}
	}
	
	
});

// ////////////GRAFICO 3/////////////////////////////////////
var grafico3 = new Chart(document.getElementById("line-chart3"), {
	type : 'line',
	data : {
		labels : [ 0, 5, 10, 15, 30, 35, 40, 45, 50, 55, 60 ],
		datasets : [ {
			data : [],
			label : "Uso CPU",
			borderColor : "  #330011",
			fill : false
		}, {
			data : [ 0, 86, 14, 15, 68, 25, 55, 15, 48, 45, 73 ],
			label : "Uso Disco",
			borderColor : "#ff80aa",
			fill : false
		},
		 {
			data : [ 0, 13, 37, 14, 44, 25, 82, 35, 81, 3, 57 ],
			label : "Uso Ram",
			borderColor : "#1ab2ff",
			fill : false
		},{
			data : [ 0, 23, 10, 15, 3, 25, 5, 35, 2, 6, 50 ],
			label : "Bateria",
			borderColor : "#66ff66",
			fill : false
		}]
	},
	options : {
		title : {
			display : true,
			text : 'Atualização dos Dados (Em 5s)',
				 fontColor: 'black'
				 
		}
	}
});









// ////////////////// AJAX E JSON //////////////////////////////////////

window.onload = function() {

	var http = new XMLHttpRequest();
	http.open("GET", "computador/dinamica/12");

	http.addEventListener("load", function() {

		if (http.status == 200) {

			var resposta = http.responseText;

			console.log("funcionouuuuuuu");

			var lista = JSON.parse(resposta);// ele pega o arquivo em formato
												// JSON transforma em array

			var json = function(callback) {
				var json = null;
				$.ajax({
					url : "computador/dinamica/12",
					type : 'GET',
					dataType : 'json',
					success : function(data) {
						json = data;
						callback(data);
					}
				});
				return json;
			};
			
			
			// criando um variavel onde
			// recebe o diretorio do grafico e a sua posição
			// nisso gar o Objeto do Json
			
			var i = 0;
			console.log(lista);
			grafico1.data.datasets[0].data[0] = lista.usoCpu;
			grafico1.data.datasets[1].data[1] = lista.usoDisco;
			grafico1.data.datasets[2].data[2] = lista.usoRam;
			grafico1.data.datasets[3].data[3] = lista.quantidadeBateriaUsada;
			i++;
			grafico1.update();
		
			
			
		

		} else {
			console.log("O tipo de erro " + http.status);
			//console.log(http.responseText);
		}
	});
	
	

	http.send(); // comando para enviar a requisição

}











