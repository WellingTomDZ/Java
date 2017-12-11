package prova;

import java.util.ArrayList;
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
				System.out.println("Entre com um valor: ");
				
				valor = scan.nextInt();
			}
		} 
	
	
		
		
	}	
	
}
