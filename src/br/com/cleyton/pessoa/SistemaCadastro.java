package br.com.cleyton.pessoa;

public class SistemaCadastro {

	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		//definimos dois parâmetros na ciração do obejto Pessoa, porque criamos o construtor Pessoa com dois parãmetros
		Pessoa maria = new Pessoa("123", "Maria");
		
		//definimos o endereço de helena
		maria.setEndereco("Rua das Gaivotas");
		
		System.out.println("O CPF de " + maria.getNome() + " é " + maria.getCpf());

	}

}
