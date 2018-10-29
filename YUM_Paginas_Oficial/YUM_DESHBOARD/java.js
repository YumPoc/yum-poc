$('#texto-caixa').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) // quando aciona o botão
  var recipient = button.data('whatever') // Estrair o formulario
  // Se necessário, você pode iniciar uma solicitação AJAX aqui (e depois fazer a atualização em um retorno de chamada).
  // Atualize o conteúdo do modal. Vamos usar o jQuery aqui, mas você pode usar uma biblioteca de ligação de dados ou outros métodos.
  var modal = $(this)
  modal.find('.modal-title').text('New message to ' + recipient)// o que recebe o titulos de menssagens
  modal.find('.modal-body input').val(recipient) // o que recbe os inputs
});


////// FUNCÃO DA BARRA DE NAVEGAÇÃO ///////////////////////////////

var barra = document.getElementById("barraDeNavegacao");
var container = document.getElementById("caixaContainer");
var toggle = document.getElementById("toggle");
var img = document.getElementById("imgLogo");

function toggleSidebar(){
  barra.style.marginLeft = '0px';
	container.style.marginLeft = '0px';
  toggle.classList.add("efeitoToggle2");
  img.classList.add("efeitoImg2");   
}

function Openmenu(){
  barra.classList.add("efeitoBarra");
  container.style.marginLeft = '-160px';
  toggle.classList.add("efeitoToggle");
  img.classList.add("efeitoImg");	
}

/////////////////////////////////////////////////////////////////////

// FUNÇÃO BOTAO DE CADASTRO DE COMPUTADORES
/*var botao = document.querySelector("#CadastroPc");
botao.addEventListener("click",mostra);

function mostra (event){

event.preventDefault();
var form = document.querySelector("#FormPc");
FormularioPrincipal = form.textContent;

var NomeComputador = form.NomeComputador.value;


var PainelPrincipalPc = document.getElementById("#exemplo");
var PainelSecundariolPc = document.querySelector("#PainelSecundarioPc");
var PainelTitulo = document.querySelector("#PainelTitulo");
PainelTitulo.textContent = NomeComputador;
console.log(PainelPrincipalPc);

} */


/*var botao = document.querySelector("#toogle-caixa");

botao.addEventListener("click", mostra);

function mostra (event){

.classList.add("paciente-invalido2");


}*/






