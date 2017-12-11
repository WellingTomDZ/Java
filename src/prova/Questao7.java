package prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Questao7 {
	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		int	valor;
		int soma = 0;
		
		// auto-fechamento do Scanner
		try (Scanner scan = new Scanner(System.in)){
			//looping infinito
			for (;;) {
				System.out.println("Entre com um valor ou 0 para encerrar: ");				
				valor = scan.nextInt();
				
				// condi��o de parada
				if (valor == 0) {
					break;
				}
				
				// carregamento do array
				numeros.add(valor);
				
				// calculo da media
				soma += valor;
			}
			
			// imprimndo o vetor na sua forma original
			System.out.println("Impress�o do array como foi digitado:");
			for (Integer num : numeros) {
				System.out.print(" " + num);
			}
			
			// m�todo Java para ordena��o crescente
			Collections.sort(numeros);
			
			System.out.println("\nArray ordenado:");
			for (Integer num : numeros) {
				System.out.print(" " + num);
			}
			
			// sa�da da soma dos n�meros
			System.out.println("\nSoma: " + soma);
			// sa�da da m�dia dos n�meros
			System.out.println("\nM�dia: " + (double)soma / numeros.size());
		} 		
	}	
}
