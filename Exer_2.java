package exercicios;
import java.util.Scanner;
public class Exer_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma frase:");
		String frase = sc.nextLine();
		
		System.out.println("Agora, digite um numero inteiro:");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i = 0; i < num; i++) {
				System.out.println(frase);
			}
		}
		else {
			System.out.println("Numero inválido!");
		}
	}

}
