package com.github.arieljorge;

import java.util.Scanner;

import com.github.arieljorge.exceptions.ParametrosInvalidosException;

public class DesafioControleFluxoApplication {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);) {
			System.out.print("Digite o primeiro parâmetro: ");
			int primeiroParametro = scanner.nextInt();
			
			System.out.print("Digite o segundo parâmetro: ");
			int segundoParametro = scanner.nextInt();
			
			contar(primeiroParametro, segundoParametro);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
		if (primeiroParametro > segundoParametro) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		
		int contagem = segundoParametro - primeiroParametro;
		
		for (int i = 1; i <= contagem; i++) {
			System.out.printf("Imprimindo o número %d\n", i);
		}
	}
}
