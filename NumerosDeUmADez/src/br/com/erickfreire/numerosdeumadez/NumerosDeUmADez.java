package br.com.erickfreire.numerosdeumadez;

/**
 * Programa em Java que mostra os números de 1 a 10
 * @author Erick Freire
 * @version 1 - Criado em 14-04-2021 as 17:42
 */

public class NumerosDeUmADez {
	public static void main(String[] args) {
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.printf("%d ", contador);
			++contador;
		}
		
		System.out.println();
	}

}
