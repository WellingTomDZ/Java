package prova;

import java.util.Scanner;

public class Questao4 {	
		public static void main(String[] args) {
			
			String nome; 
			String velha = "";
			String nova = "";
			
			int idade;
			int idVelha = 0;
			int idNova = 100;
			
			int cont = 0;
			

			try (Scanner scan = new Scanner(System.in)){ 	
			
				do {
						
				System.out.println("Entre com o nome: ");
				nome = scan.nextLine();
				
				System.out.println("Entre com a idade: ");
				idade = Integer.parseInt(scan.nextLine());
				
					if (idNova > idade) {
						idNova = idade;
						nova = nome;
					} else if (idVelha < idade) {
						idVelha = idade;
						velha = nome;
					}
				
				cont++;
				}
				while (cont < 3);				

				System.out.println("O(a) mais velho(a) é " + velha + " e o(a) mais novo(a) é " + nova + ".");	
			}
		}
	}
