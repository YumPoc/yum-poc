// GRAFICOS////



//////grafico 1////////////
		var data = {
			labels : [ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul" ],
			datasets : [ {
				label : "Dataset #1",
				backgroundColor : "rgba(255,99,132,0.2)",
				borderColor : "rgba(255,99,132,1)",
				borderWidth : 2,
				hoverBackgroundColor : "rgba(255,99,132,0.4)",
				hoverBorderColor : "rgba(255,99,132,1)",
				data : [ 65, 59, 20, 81, 56, 55, 40 ],
			} ]
		};

		var options = {
			maintainAspectRatio : false,
			scales : {
				yAxes : [ {
					stacked : true,
					gridLines : {
						display : true,
						color : "rgba(255,99,132,0.2)"
					}
				} ],
				xAxes : [ {
					gridLines : {
						display : false
					}
				} ]
			}
		};

		Chart.Bar('chart', {
			options : options,
			data : data
		});




	<!-- - se loko -->

/////// grafico 2///////////////////////////
		/*

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

		window.onload = plotarGrafico;

		function plotarGrafico() {
		
		$.ajax({
			  url: "listas",
			}).always(function(resposta) {
				var data = {
						  labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"],
						  datasets: [{
						    label: "Dataset #1",
						    backgroundColor: "rgba(255,99,132,0.2)",
						    borderColor: "rgba(255,99,132,1)",
						    borderWidth: 2,
						    hoverBackgroundColor: "rgba(255,99,132,0.4)",
						    hoverBorderColor: "rgba(255,99,132,1)",
						    data: resposta.lista1,
						  },
						  {
							    label: "Dataset #2",
							    backgroundColor: "rgba(99,255,132,0.2)",
							    borderColor: "rgba(99,250,132,1)",
							    borderWidth: 2,
							    hoverBackgroundColor: "rgba(255,99,132,0.4)",
							    hoverBorderColor: "rgba(255,99,132,1)",
							    data: resposta.lista2,
							  }]
						};
				 atualizarGrafico(data);
			});	

		
		setTimeout(plotarGrafico, 3000);
		}

		function atualizarGrafico(data) {
		var ctx = document.getElementById('chart2').getContext('2d');
		window.myBar = new Chart(ctx, {
			type: 'bar',
			data: data,
			options: {
				responsive: true,
				legend: {
					position: 'top',
				},
				title: {
					display: true,
					text: 'Chart.js Bar Chart'
				}
			}
		});

		}

		/*Chart.Bar('chart2', {
		options: options,
		data: data
		});*/



/////////// grafico 3//////////////////////////
		new Chart(document.getElementById("doughnut-chart"), {
			type : 'doughnut',
			data : {
				labels : [ "Africa", "Asia", "Europe", "Latin America",
						"North America" ],
				datasets : [ {
					label : "Population (millions)",
					backgroundColor : [ "#3e95cd", "#8e5ea2", "#3cba9f",
							"#e8c3b9", "#c45850" ],
					data : [ 2478, 5267, 734, 784, 433 ]
				} ]
			},
			options : {
				title : {
					display : true,
					text : 'Predicted world population (millions) in 2050'
				}
			}
		});





///////////////////// grafico 4///////////////////////////
		new Chart(document.getElementById("line-chart"), {
			type : 'line',
			data : {
				labels : [ 1500, 1600, 1700, 1750, 1800, 1850, 1900, 1950,
						1999, 2050 ],
				datasets : [
						{
							data : [ 86, 4000, 106, 106, 107, 111, 133, 221,
									200, 2478 ],
							label : "Africa",
							borderColor : "#3e95cd",
							fill : false
						},
						{
							data : [ 86, 400, 5006, 456, 1147, 231, 603, 2221,
									3000, 4478 ],
							label : "Africa",
							borderColor : "#32CD32",
							fill : false
						} ]
			},
			options : {
				title : {
					display : true,
					text : 'World population per region (in millions)'
				}
			}
		});






	/////// graficos dos relátorios/////////////// 


////////////////// grafico 1/////////////////////////////////
		new Chart(document.getElementById("doughnut-chart2"), {
			type : 'doughnut',
			data : {
				labels : [ "Africa", "Asia", "Europe", "Latin America",
						"North America" ],
				datasets : [ {
					label : "Population (millions)",
					backgroundColor : [ "#3e95cd", "#8e5ea2", "#3cba9f",
							"#e8c3b9", "#c45850" ],
					data : [ 2478, 5267, 734, 784, 433 ]
				} ]
			},
			options : {
				title : {
					display : true,
					text : 'Predicted world population (millions) in 2050'
				}
			}
		});
///////////////////////////////////////////////////////////////////////

///////////////// grafico 2/////////////////
		new Chart(document.getElementById("doughnut-chart3"), {
			type : 'doughnut',
			data : {
				labels : [ "Africa", "Asia", "Europe", "Latin America",
						"North America" ],
				datasets : [ {
					label : "Population (millions)",
					backgroundColor : [ "#3e95cd", "#8e5ea2", "#3cba9f",
							"#e8c3b9", "#c45850" ],
					data : [ 2478, 5267, 734, 784, 433 ]
				} ]
			},
			options : {
				title : {
					display : true,
					text : 'Predicted world population (millions) in 2050'
				}
			}
		});
/////////////////////////////////////////////////////////////////////////////

	
////////////// grafico 3//////////////////////
		new Chart(document.getElementById("doughnut-chart4"), {
			type : 'doughnut',
			data : {
				labels : [ "Africa", "Asia", "Europe", "Latin America",
						"North America" ],
				datasets : [ {
					label : "Population (millions)",
					backgroundColor : [ "#3e95cd", "#8e5ea2", "#3cba9f",
							"#e8c3b9", "#c45850" ],
					data : [ 2478, 5267, 734, 784, 433 ]
				} ]
			},
			options : {
				title : {
					display : true,
					text : 'Predicted world population (millions) in 2050'
				}
			}
		});
////////////////////////////////////////////////////////
		
	
///////////////// grafico 4////////////////////////
		new Chart(document.getElementById("doughnut-chart5"), {
			type : 'doughnut',
			data : {
				labels : [ "Africa", "Asia", "Europe", "Latin America",
						"North America" ],
				datasets : [ {
					label : "Population (millions)",
					backgroundColor : [ "#3e95cd", "#8e5ea2", "#3cba9f",
							"#e8c3b9", "#c45850" ],
					data : [ 2478, 5267, 734, 784, 433 ]
				} ]
			},
			options : {
				title : {
					display : true,
					text : 'Predicted world population (millions) in 2050'
				}
			}
		});
/////////////////////////////////////////////////////////
		
//////////////grafico 5//////////////////////
		new Chart(document.getElementById("doughnut-chart6"), {
			type : 'doughnut',
			data : {
				labels : [ "Africa", "Asia", "Europe", "Latin America",
						"North America" ],
				datasets : [ {
					label : "Population (millions)",
					backgroundColor : [ "#3e95cd", "#8e5ea2", "#3cba9f",
							"#e8c3b9", "#c45850" ],
					data : [ 2478, 5267, 734, 784, 433 ]
				} ]
			},
			options : {
				title : {
					display : true,
					text : 'Predicted world population (millions) in 2050'
				}
			}
		});
////////////////////////////////////////////////////////
		
	
///////////////// grafico 6////////////////////////
		new Chart(document.getElementById("doughnut-chart7"), {
			type : 'doughnut',
			data : {
				labels : [ "Africa", "Asia", "Europe", "Latin America",
						"North America" ],
				datasets : [ {
					label : "Population (millions)",
					backgroundColor : [ "#3e95cd", "#8e5ea2", "#3cba9f",
							"#e8c3b9", "#c45850" ],
					data : [ 2478, 5267, 734, 784, 433 ]
				} ]
			},
			options : {
				title : {
					display : true,
					text : 'Predicted world population (millions) in 2050'
				}
			}
		});
/////////////////////////////////////////////////////////

//////////////grafico 7//////////////////////
		new Chart(document.getElementById("doughnut-chart8"), {
			type : 'doughnut',
			data : {
				labels : [ "Africa", "Asia", "Europe", "Latin America",
						"North America" ],
				datasets : [ {
					label : "Population (millions)",
					backgroundColor : [ "#3e95cd", "#8e5ea2", "#3cba9f",
							"#e8c3b9", "#c45850" ],
					data : [ 2478, 5267, 734, 784, 433 ]
				} ]
			},
			options : {
				title : {
					display : true,
					text : 'Predicted world population (millions) in 2050'
				}
			}
		});
////////////////////////////////////////////////////////
		
	
///////////////// grafico 8////////////////////////
		new Chart(document.getElementById("doughnut-chart9"), {
			type : 'doughnut',
			data : {
				labels : [ "Africa", "Asia", "Europe", "Latin America",
						"North America" ],
				datasets : [ {
					label : "Population (millions)",
					backgroundColor : [ "#3e95cd", "#8e5ea2", "#3cba9f",
							"#e8c3b9", "#c45850" ],
					data : [ 2478, 5267, 734, 784, 433 ]
				} ]
			},
			options : {
				title : {
					display : true,
					text : 'Predicted world population (millions) in 2050'
				}
			}
		});
/////////////////////////////////////////////////////////



