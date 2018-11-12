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
var caixa1 = document.querySelector("#caixaComputador");
var caixa2 = document.querySelector("#caixaComputador2");
var caixa3 = document.querySelector("#caixaComputador3");
var caixa4 = document.querySelector("#caixaComputador4");

var texto = document.querySelector("#texto");



function Fechar(event) {
	event.preventDefault();

	barra.classList.remove("efeitoBarra2");
	botaoToggle.classList.remove("efeitoToggle2");
	caixa1.classList.remove("efeitoCaixa2");
	caixa2.classList.remove("efeitoCaixa2");
	caixa3.classList.remove("efeitoCaixa2");
	caixa4.classList.remove("efeitoCaixa2");

	barra.classList.add("efeitoBarra");
	botaoToggle.classList.add("efeitoToggle");
	caixa1.classList.add("efeitoCaixa");
	caixa2.classList.add("efeitoCaixa");
	caixa3.classList.add("efeitoCaixa");
	caixa4.classList.add("efeitoCaixa");

}

function Abrir(event) {
	event.preventDefault();

	barra.classList.remove("efeitoBarra");
	botaoToggle.classList.remove("efeitoToggle");
	caixa1.classList.remove("efeitoCaixa");
	caixa2.classList.remove("efeitoCaixa");
	caixa3.classList.remove("efeitoCaixa");
	caixa4.classList.remove("efeitoCaixa");

	barra.classList.add("efeitoBarra2");
	botaoToggle.classList.add("efeitoToggle2");
	caixa1.classList.add("efeitoCaixa2");
	caixa2.classList.add("efeitoCaixa2");
	caixa2.classList.add("efeitoCaixa3");
	caixa4.classList.add("efeitoCaixa3");

}

// ///////////////////////////////////////////////////////////////////

// FUNÇÃO BOTAO DE CADASTRO DE COMPUTADORES
/*
 * var botao = document.querySelector("#CadastroPc");
 * botao.addEventListener("click",mostra);
 * 
 * function mostra (event){
 * 
 * event.preventDefault(); var form = document.querySelector("#FormPc");
 * FormularioPrincipal = form.textContent;
 * 
 * var NomeComputador = form.NomeComputador.value;
 * 
 * 
 * var PainelPrincipalPc = document.getElementById("#exemplo"); var
 * PainelSecundariolPc = document.querySelector("#PainelSecundarioPc"); var
 * PainelTitulo = document.querySelector("#PainelTitulo");
 * PainelTitulo.textContent = NomeComputador; console.log(PainelPrincipalPc);
 *  }
 */

/*
 * var botao = document.querySelector("#toogle-caixa");
 * 
 * botao.addEventListener("click", mostra);
 * 
 * function mostra (event){
 * 
 * .classList.add("paciente-invalido2");
 * 
 *  }
 */

