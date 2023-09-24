package br.com.cleyton.enums;

public class SistemaIbge {

	public static void main(String[] args) {
		for(EstadoBrasileiro e : EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome());
		}
		
		EstadoBrasileiro eb = EstadoBrasileiro.AMAZONAS;
		System.out.println(eb.getSigla());
		System.out.println(eb.getNome());
		System.out.println(eb.getNomeMaiusculo());
		System.out.println(eb.getCodigoIbge());

	}

}