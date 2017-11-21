
public class OperadoresLogicos {
	public static void main(String[] args) {
		
		double nota01 = 5.0;
		double nota02 = 6.5;
		double nota03 = 5.0;
		double nota04 = 7.5;
		double frequencia = 77.2;
		
		boolean status = true;
		
		double media = (nota01 + nota02 + nota03 + nota04) / 4;
		
		status = ((media >= 6.0) && (frequencia >= 75)) ? true : false;
		
		if(!status)
			System.out.println("Reprovado");
		else
			System.out.println("Aprovado");
	}
		
}
