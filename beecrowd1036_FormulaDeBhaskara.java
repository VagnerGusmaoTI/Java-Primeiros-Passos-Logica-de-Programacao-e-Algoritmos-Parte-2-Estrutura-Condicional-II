import java.util.Locale;
import java.util.Scanner;

public class beecrowd1036_FormulaDeBhaskara {

	public static void main(String[] args) {
		
		//ESTRUTURA CONDICIONAL
		
			//Exercício da plataforma beecrowd, nível iniciante: 1036 Fórmula de Bhaskara
			//https://www.beecrowd.com.br/judge/pt/problems/view/1036
			//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
		//Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, 
		//caso haja uma divisão por 0 ou raiz de numero negativo.

		//Entrada
		//Leia três valores de ponto flutuante (double) A, B e C.

		//Saída
		//Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 
		//Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. 
		//Imprima sempre o final de linha após cada mensagem.
		
		//Análise
		//Ver a Fórmula de Bhaskara na página 15 do material do curso
		//• Delta não pode ser negativo
		//• A não pode ser zero
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		//Cáculo valor de delta
		
		double delta = B * B - 4.0 * A * C;
		
		//No if testa a condição de "Impossivel calcular"
		//No else segue com os cálculos
		
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
