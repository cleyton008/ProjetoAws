package br.com.cleyton.lanchonete;

public class Cliente {
	public void escolherLanche() {
		System.out.println("ESCOLHER O LANCHE");
	}
	
	public void fazerPedido() {
		System.out.println("FAZER PEDIDO");
	}
	
	public void pagarConta() {
		consultarSaldoAplicativo();
		System.out.println("PAGAR A CONTA");
	}
	
	private void consultarSaldoAplicativo() {
		System.out.println("CONSULTAR SALDO NO APP DO BANCO");
	}

}
