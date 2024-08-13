import java.util.Scanner;

public class Dois {
	
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.print("Digite sua altura em metros (m): ");
		double altura = terminal.nextDouble();
		System.out.print("Digite seu peso em quilogramas (kg): ");
		double peso = terminal.nextDouble();
		
		System.out.println("Altura");
		System.out.println(altura + "m -> " + (altura * 100) + "cm");
		System.out.println("Peso");
		System.out.println(peso + "kg -> " + (peso * 1000) + "g");
		
		terminal.close();
	}
}
