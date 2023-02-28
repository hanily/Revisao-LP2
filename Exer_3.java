package exercicios;
import java.util.Scanner;
public class Exer_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		int num = ler.nextInt();
		
		System.out.println("Informe uma frase:");
		String frase = ler.next();
		
		if(num>0) {
		for(int i=0;i<num;i++) {
				System.out.println(frase);
			}
		}
		else {
			System.out.println("Numero Inválido!");
		}
	}

}
