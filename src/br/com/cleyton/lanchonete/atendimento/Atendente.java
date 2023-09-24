package br.com.cleyton.lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("SERVIR A MESA");
	}
	
	private void pegarLancheCozinha(){
		System.out.println("PEGAR O LANCHE NA COZINHA");
	}
	
	public void receberPagamento() {
		System.out.println("RECEBER O PAGAMENTO");
	}
	
	void trocarGas() {
		System.out.println("TROCAR O GÁS PARA O COZINHEIRO");
	}
	
	private void pegarPedidoBalcao() {
		System.out.println("PEGAR O PEDIDO NO BALCAO");
	}
}
