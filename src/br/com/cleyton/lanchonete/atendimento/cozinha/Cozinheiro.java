package br.com.cleyton.lanchonete.atendimento.cozinha;

public class Cozinheiro {
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADCIONAR O LANCHE NO BALCAO");
	}
	
	public void adicionarSucoNoNalcao() {
		System.out.println("ADCIONAR O SUCO NO BALCAO");
	}
	
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoNalcao();
	}
	
	private void prepararLanche() {
		System.out.println("PREPARAR O LANCHE TIPO NATURAL");
	}
	
	private void prepararVitamina() {
		System.out.println("PREPARAR O SUCO");
	}
	
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONAR O PÃO, SALAME, QUIEJO, ...");
	}
	
	private void selecionarIngedientesVitamina() {
		System.out.println("SELECIONAR A FRUTA, LEITE, ...");
	}
	
	private void lavarIngredientes() {
		System.out.println("LAVAR OS INGREDIENTES");
	}
	
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENR A VITAMINA NO LIQUIDIFICADOR");
	}
	
	private void fritarIngedientesLanche() {
		System.out.println("FRITAR A CARNE E  OVO PARA O LANCHE");
	}
	
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
