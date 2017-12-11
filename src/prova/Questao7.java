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
				
				// condição de parada
				if (valor == 0) {
					break;
				}
				
				// carregamento do array
				numeros.add(valor);
				
				// calculo da media
				soma += valor;
			}
			
			// imprimndo o vetor na sua forma original
			System.out.println("Impressão do array como foi digitado:");
			for (Integer num : numeros) {
				System.out.print(" " + num);
			}
			
			// método Java para ordenação crescente
			Collections.sort(numeros);
			
			System.out.println("\nArray ordenado:");
			for (Integer num : numeros) {
				System.out.print(" " + num);
			}
			
			// saída da soma dos números
			System.out.println("\nSoma: " + soma);
			// saída da média dos números
			System.out.println("\nMédia: " + (double)soma / numeros.size());
		} 		
	}	
}
