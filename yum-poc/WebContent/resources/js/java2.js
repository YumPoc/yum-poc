$('#texto-caixa').on('show.bs.modal', function(event) {
	var button = $(event.relatedTarget) // quando aciona o botão
	var recipient = button.data('whatever') // Estrair o formulario
	// Se necessário, você pode iniciar uma solicitação AJAX aqui (e depois
	// fazer a atualização em um retorno de chamada).
	// Atualize o conteúdo do modal. Vamos usar o jQuery aqui, mas você pode
	// usar uma biblioteca de ligação de dados ou outros métodos.
	var modal = $(this)
	modal.find('.modal-title').text('New message to ' + recipient)// o que
																	// recebe o
																	// titulos
																	// de
																	// menssagens
	modal.find('.modal-body input').val(recipient) // o que recbe os inputs
});

// //// FUNCÃO DA BARRA DE NAVEGAÇÃO ///////////////////////////////

var botaoX = document.querySelector("#botaoFechar");
botaoX.addEventListener("click", Fechar);

var botaoToggle = document.querySelector("#toggle");
botaoToggle.addEventListener("click", Abrir);

var barra = document.querySelector("#barraDeNavegacao");

var caixa_Relatorio = document.querySelector("#caixaRelatorio");



function Fechar(event) {
	event.preventDefault();

	barra.classList.remove("efeitoBarra4");
	botaoToggle.classList.remove("efeitoToggle4");
	caixa_Relatorio.classList.remove("efeitoCaixa4");


	barra.classList.add("efeitoBarra3");
	botaoToggle.classList.add("efeitoToggle3");
	caixa_Relatorio.classList.remove("efeitoCaixa3");

}

function Abrir(event) {
	event.preventDefault();

	barra.classList.remove("efeitoBarra3");
	botaoToggle.classList.remove("efeitoToggle3");
	caixa_Relatorio.classList.remove("efeitoCaixa3");

	barra.classList.add("efeitoBarra4");
	botaoToggle.classList.add("efeitoToggle4");
	caixa_Relatorio.classList.remove("efeitoCaixa4");

}

// ///////////////////////////////////////////////////////////////////


