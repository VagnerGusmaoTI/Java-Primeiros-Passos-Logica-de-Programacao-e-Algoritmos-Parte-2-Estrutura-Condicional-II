import java.util.Locale;
import java.util.Scanner;

public class beecrowd1037_Intervalo {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exercício da plataforma beecrowd, nível iniciante: 1037 Intervalo
		// https://www.beecrowd.com.br/judge/pt/problems/view/1037
		// OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		// Você deve fazer um programa que leia um valor qualquer e apresente uma
		// mensagem dizendo
		// em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este
		// valor se encontra.
		// Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser
		// impressa a mensagem “Fora de intervalo”.

		// O símbolo ( representa "maior que". Por exemplo:
		// [0,25] indica valores entre 0 e 25.0000, inclusive eles.
		// (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

		// Entrada
		// O arquivo de entrada contém um número com ponto flutuante qualquer.

		// Saída
		// A saída deve ser uma mensagem conforme exemplo abaixo.

		// Exemplo de Entrada: 25.01 / Exemplo de Saída: Intervalo (25,50]
		// Exemplo de Entrada: 25.00 / Exemplo de Saída: Intervalo [0,25]
		// Exemplo de Entrada: 100.00 / Exemplo de Saída: Intervalo (75,100]
		// Exemplo de Entrada: -25.02 / Exemplo de Saída: Fora de intervalo

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double number; 
		
		number = sc.nextDouble();

		if (number < 0.0 || number > 100.0) {
			System.out.println("Fora de intervalo");
		} else if (number <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (number <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (number <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}

		sc.close();

	}

}
