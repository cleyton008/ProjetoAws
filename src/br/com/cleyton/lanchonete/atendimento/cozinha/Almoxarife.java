package br.com.cleyton.lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLAR A ENTRADA DOS PRODUTOS PARA A LANCHONETE");
	}
	
	private void controlarSaida() {
		System.out.println("CONTROLAR A SAIDA DOS PRODUTOS");
	}
	
	void entregarIngredientes() {
		System.out.println("ENTREGAR INGREDIENTES PARA O COZINHEIRO");
		controlarSaida();
	}
	
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GAS");
	}
}
