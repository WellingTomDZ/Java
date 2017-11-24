package App;

import entidade.Cliente;

import entidade.Telefone;

import java.util.Scanner;

public class Aplicativo {
	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		Telefone f = new Telefone();
		Scanner scan = new Scanner(System.in);		
		
		System.out.print("Informe o ID: ");
		c.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o nome: ");
		c.setNome(scan.nextLine());
		System.out.print("Informe a idade: ");
		c.setIdade(Integer.parseInt(scan.nextLine()));
		
		System.out.print("Informe o ID do telefone: ");
		f.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o numero do telefone: ");
		f.setNumero(scan.nextLine());
		
		scan.close();
		
		System.out.println("O ID informado: " + c.getId());
		System.out.println("A idade informada: " + c.getIdade());
		System.out.println("O nome informado: " + c.getNome());
		
		System.out.println("O ID do telefone informado: " + f.getId());
		System.out.println("O numero do telefone informada: " + f.getNumero());
		
		
	}	
}
