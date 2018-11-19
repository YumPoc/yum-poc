// GRAFICOS////



//////grafico 1////////////
		new Chart(document.getElementById("line-chart"), {
			type : 'line',
			data : {
				labels : [ 0,5,10,15,30,35,40,45,50,55,60],
				datasets : [
						{
							data : [ 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 ],
							label : "Memoria Ram",
							borderColor : "  #330011",
							fill : false
						},
						{
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



	<!-- - se loko -->




/////////// grafico 2//////////////////////////
	new Chart(document.getElementById("line-chart2"), {
		type : 'line',
		data : {
			labels : [  0,5,10,15,30,35,40,45,50,55,60 ],
			datasets : [
					{
						data : [ 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100  ],
						label : "Memoria Ram",
						borderColor : "#00001a",
						fill : false
					},
					{
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




///////////////////// grafico 3///////////////////////////
		new Chart(document.getElementById("line-chart3"), {
			type : 'line',
			data : {
				labels : [ 0,5,10,15,30,35,40,45,50,55,60 ],
				datasets : [
						{
							data : [ 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100  ],
							label : "Memoria Ram",
							borderColor : "#003300",
							fill : false
						},
						{
							data : [ 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50],
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





////////////////////////////////////////////////////////////////////////////////////////////////////////////////