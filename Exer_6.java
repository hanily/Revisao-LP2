package exercicios;
import java.util.Scanner;
public class Exer_6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("*************MENU*************");
		System.out.println("ESCOLHA QUAL EXERCICIO DESEJA EXECUTAR:");
		System.out.println("1 - EXERCICIO 01 ");
		System.out.println("2 - EXERCICIO 02 ");
		System.out.println("3 - EXERCICIO 03 ");
		System.out.println("4 - EXERCICIO 04 ");
		System.out.println("5 - EXERCICIO 05 ");
		System.out.println("0 -  SAIR ");
		int opc = ler.nextInt();
		
		switch(opc) {
		case 1:
			System.out.println("Informe o seu nome");
			
			String nome = ler.nextLine();
			
			System.out.println("Ola, "+nome);
			
		case 2:
			System.out.println("Digite uma frase:");
			String frase = ler.nextLine();
			
			System.out.println("Agora, digite um numero inteiro:");
			int num = ler.nextInt();
			
			if(num>0) {
				for(int i = 0; i < num; i++) {
					System.out.println(frase);
				}
			}
			else {
				System.out.println("Numero inválido!");
			}
		case 3:
			System.out.println("Digite um numero inteiro:");
			num = ler.nextInt();
			
			System.out.println("Informe uma frase:");
			frase = ler.next();
			
			if(num>0) {
			for(int i=0;i<num;i++) {
					System.out.println(frase);
				}
			}
			else {
				System.out.println("Numero Inválido!");
			}
			
		case 4:
			System.out.println("Digite um numero inteiro:");
			num = ler.nextInt();
			
			System.out.println("Informe uma frase:");
			frase = ler.next();
			
			if(num>0) {
			for(int i=0;i<num;i++) {
					System.out.println(frase);
				}
			}
			else {
				System.out.println("Numero Inválido!");
			}
			
		case 5:
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
		case 0:
			System.out.println("SAIU...");
			break;
		}
	}

}
