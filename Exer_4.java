package exercicios;
import java.util.Scanner;
public class Exer_4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("CALCULO DA AREA DO RETÂNGULO");
		System.out.println("Informe a altura do retângulo:");
		double alt = ler.nextDouble();
		
		System.out.println("Informe a base do retangulo");
		double base = ler.nextDouble();
		
		double area = base * alt;
		double perimetro = (2 * base) + (2 * alt);
		
		System.out.println("Área do retângulo:"+area);
		System.out.println("Perímetro do retângulo:"+perimetro);
	}

}
