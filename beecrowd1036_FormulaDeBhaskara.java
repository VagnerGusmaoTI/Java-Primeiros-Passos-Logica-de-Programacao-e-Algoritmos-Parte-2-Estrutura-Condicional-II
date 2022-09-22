import java.util.Locale;
import java.util.Scanner;

public class beecrowd1036_FormulaDeBhaskara {

	public static void main(String[] args) {
		
		//ESTRUTURA CONDICIONAL
		
			//Exerc�cio da plataforma beecrowd, n�vel iniciante: 1036 F�rmula de Bhaskara
			//https://www.beecrowd.com.br/judge/pt/problems/view/1036
			//OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o de Bhaskara. 
		//Se n�o for poss�vel calcular as ra�zes, mostre a mensagem correspondente �Impossivel calcular�, 
		//caso haja uma divis�o por 0 ou raiz de numero negativo.

		//Entrada
		//Leia tr�s valores de ponto flutuante (double) A, B e C.

		//Sa�da
		//Se n�o houver possibilidade de calcular as ra�zes, apresente a mensagem "Impossivel calcular". 
		//Caso contr�rio, imprima o resultado das ra�zes com 5 d�gitos ap�s o ponto, com uma mensagem correspondente conforme exemplo abaixo. 
		//Imprima sempre o final de linha ap�s cada mensagem.
		
		//An�lise
		//Ver a F�rmula de Bhaskara na p�gina 15 do material do curso
		//� Delta n�o pode ser negativo
		//� A n�o pode ser zero
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		//C�culo valor de delta
		
		double delta = B * B - 4.0 * A * C;
		
		//No if testa a condi��o de "Impossivel calcular"
		//No else segue com os c�lculos
		
		if (A == 0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
			}
			else {
			double raiz1 = (-B + Math.sqrt(delta)) / (2.0 * A);
			double raiz2 = (-B - Math.sqrt(delta)) / (2.0 * A);
			System.out.printf("R1 = %.5f%n", raiz1);
			System.out.printf("R2 = %.5f%n", raiz2);
			}
	
		sc.close();

	}

}
