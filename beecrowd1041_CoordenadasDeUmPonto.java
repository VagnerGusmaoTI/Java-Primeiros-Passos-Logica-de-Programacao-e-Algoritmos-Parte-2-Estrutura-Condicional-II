import java.util.Locale;
import java.util.Scanner;

public class beecrowd1041_CoordenadasDeUmPonto {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1041 Intervalo
		// https://www.beecrowd.com.br/judge/pt/problems/view/1041
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
		//A seguir, determine qual o quadrante ao qual pertence o ponto, ou se est� sobre um dos eixos cartesianos ou na origem (x = y = 0).

		//Se o ponto estiver na origem, escreva a mensagem �Origem�.

		//Se o ponto estiver sobre um dos eixos escreva �Eixo X� ou �Eixo Y�, conforme for a situa��o.

		//Entrada
		//A entrada contem as coordenadas de um ponto.

		//Sa�da
		//A sa�da deve apresentar o quadrante em que o ponto se encontra.
		
		//Exemplo de Entrada: 4.5 -2.2  /  Exemplo de Sa�da: Q4
		//Exemplo de Entrada: 0.1 0.1  /  Exemplo de Sa�da: Q1
		//Exemplo de Entrada: 0.0 0.0  /  Exemplo de Sa�da: Origem
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner (System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();
	}

}
