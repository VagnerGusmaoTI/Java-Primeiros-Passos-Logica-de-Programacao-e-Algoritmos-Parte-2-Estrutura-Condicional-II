import java.util.Locale;
import java.util.Scanner;

public class beecrowd1045_TiposDeTriangulos {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1045 Tipos de tri�ngulo
		// https://www.beecrowd.com.br/judge/pt/problems/view/1045
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. 
		//A seguir, determine o tipo de tri�ngulo que estes tr�s lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
			//se A >= B+C, apresente a mensagem: NAO FORMA TRIANGULO
			//se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
			//se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
			//se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
			//se os tr�s lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
			//se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
			
		//Entrada
		//A entrada contem tr�s valores de ponto flutuante de dupla precis�o A (0 < A) , B (0 < B) e C (0 < C).

		//Sa�da
		//Imprima todas as classifica��es do tri�ngulo especificado na entrada.
		
		//Exemplo de Entrada: 7.0 5.0 7.0  /  Exemplo de Sa�da: TRIANGULO ACUTANGULO	TRIANGULO ISOSCELES
		//Exemplo de Entrada: 6.0 6.0 10.0  /  Exemplo de Sa�da: TRIANGULO OBTUSANGULO	TRIANGULO ISOSCELES
		//Exemplo de Entrada: 6.0 6.0 6.0  /  Exemplo de Sa�da: TRIANGULO ACUTANGULO	TRIANGULO EQUILATERO
		//Exemplo de Entrada: 5.0 7.0 2.0  /  Exemplo de Sa�da: NAO FORMA TRIANGULO
		//Exemplo de Entrada: 6.0 8.0 10.0  /  Exemplo de Sa�da: TRIANGULO RETANGULO
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double n1, n2, n3, A, B, C;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
			A = n1;
			if (n2 > n3) {
				B = n2;
				C = n3;
			}
			else {
				B = n3;
				C = n2;
			}
		}
		else if (n2 > n3) {
			A = n2;
			if (n1 > n3) {
				B = n1;
				C = n3;
			}
			else {
				B = n3;
				C = n1;
			}
		}
		else {
			A = n3;
			if (n1 > n2) {
				B = n1;
				C = n2;
			}
			else {
				B = n2;
				C = n1;
			}
		}
		
		if (A >= B+C) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			// testando as tr�s possibilidades em rela��o aos �ngulos
			if (A*A == B*B + C*C) {
				System.out.println("TRIANGULO RETANGULO");
			}
			else if (A*A > B*B + C*C) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			else {
				System.out.println("TRIANGULO ACUTANGULO");
			}

			// testando se pode ser equil�tero ou is�sceles
			if (A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			else if (A == B || A == C || B == C) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		sc.close();

	}

}
