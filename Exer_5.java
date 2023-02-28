package exercicios;
import java.util.Scanner;
public class Exer_5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = ler.next();
		
		System.out.println("Digite um numero inteiro para linha:");
		int linha = ler.nextInt();
		
		System.out.println("Digite um numero inteiro para coluna:");
		int coluna = ler.nextInt();
		
		for (int i = 0; i < linha; i++) {
			System.out.println("\n");
			
			for (int j = 0; j < coluna; j++) {
				System.out.printf(palavra);
		
			}
		}

	}

}
