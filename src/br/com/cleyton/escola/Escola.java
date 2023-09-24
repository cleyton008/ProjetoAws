package br.com.cleyton.escola;

public class Escola {
	public static void main(String[] args) {
		Aluno rafael = new Aluno();
		rafael.setNome("Rafael");
		rafael.setIdade(21);
		
		System.out.println("O aluno " + rafael.getNome() + " tem " + rafael.getIdade());
	}
}
