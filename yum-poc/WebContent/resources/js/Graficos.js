// GRAFICOS////

//////grafico 1////////////

var grafico1 = new Chart(document.getElementById("line-chart"), {
	type : 'line',
	data : {
		labels : [ 0, 5, 10, 15, 30, 35, 40, 45, 50, 55, 60 ],
		datasets : [ {
			data : [ 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 ],
			label : "Memoria Ram",
			borderColor : "  #330011",
			fill : false
		}, {
			data : [ 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 ],
			label : "Processador",
			borderColor : "#ff80aa",
			fill : false
		} ]
	},
	options : {
		title : {
			display : true,
			text : 'Atualização dos Dados (Em 5s)'
		}
	}
});

// ///////// grafico 2//////////////////////////
var grafico2 = new Chart(document.getElementById("line-chart2"), {
	type : 'line',
	data : {
		labels : [ 0, 5, 10, 15, 30, 35, 40, 45, 50, 55, 60 ],
		datasets : [ {
			data : [ 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 ],
			label : "Memoria Ram",
			borderColor : "#00001a",
			fill : false
		}, {
			data : [ 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 ],
			label : "Processador",
			borderColor : "#1ab2ff",
			fill : false
		} ]
	},
	options : {
		title : {
			display : true,
			text : 'Atualização dos Dados (Em 5s)'
		}
	}
});

// /////////////////// grafico 3///////////////////////////
var grafico3 = new Chart(document.getElementById("line-chart3"), {
	type : 'line',
	data : {
		labels : [ 0, 5, 10, 15, 30, 35, 40, 45, 50, 55, 60 ],
		datasets : [ {
			data : [ 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 ],
			label : "Memoria Ram",
			borderColor : "#003300",
			fill : false
		}, {
			data : [ 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 ],
			label : "Processador",
			borderColor : "#66ff66",
			fill : false
		} ]
	},
	options : {
		title : {
			display : true,
			text : 'Atualização dos Dados (Em 5s)'
		}
	}
});

// //////////////////////////////////////////////////////////////////////////////////////////////////////////////

// ////////////////// AJAX E JSON //////////////////////////////////////

window.onload = function() {

	var http = new XMLHttpRequest();
	http.open("GET", "https://api-pacientes.herokuapp.com/pacientes");

	http.addEventListener("load", function() {

		if (http.status == 200) {

			var resposta = http.responseText;

			console.log("funcionouuuuuuu");

			var lista = JSON.parse(resposta);// ele pega o arquivo em formato
												// JSON transforma em array

			console.log(lista);

			var json = function(callback) {
				var json = null;
				$.ajax({
					url : "https://api-pacientes.herokuapp.com/pacientes",
					type : 'GET',
					dataType : 'json',
					success : function(data) {
						json = data;
						callback(data);
					}
				});
				return json;
			};
			
			
		

		} else {
			console.log("O tipo de erro " + http.status);
			console.log(http.responseText);
		}
	});

	http.send(); // comando para enviar a requisição

}
