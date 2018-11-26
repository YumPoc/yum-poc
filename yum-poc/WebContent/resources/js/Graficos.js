// GRAFICOS////



var idteste = document.getElementById("idTeste").textContent;
console.log(idteste);

//////grafico 1////////////

var grafico1 = new Chart(document.getElementById("line-chart"+idteste), {
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



///////////////////////////////







