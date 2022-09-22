import java.util.Locale;
import java.util.Scanner;

public class beecrowd1051_ImpostoDeRenda {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1051 Imposto de Renda
		// https://www.beecrowd.com.br/judge/pt/problems/view/1051
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, 
		//pois sabem que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em benef�cio da popula��o, 
		//sem qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$.

		//Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. 
		//Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela de exemplo.

		//Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, 
		//pois a faixa de sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de Renda. 
		//No exemplo fornecido (abaixo), a taxa � de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. 
		//O valor deve ser impresso com duas casas decimais.

		//Entrada
		//A entrada cont�m apenas um valor de ponto flutuante, com duas casas decimais.

		//Sa�da
		//Imprima o texto "R$" seguido de um espa�o e do valor total devido de Imposto de Renda, com duas casas ap�s o ponto. 
		//Se o valor de entrada for menor ou igual a 2000, dever� ser impressa a mensagem "Isento".
		
		//Exemplo de Entrada: 3002.00  /  Exemplo de Sa�da: R$ 80.36
		//Exemplo de Entrada: 1701.12  /  Exemplo de Sa�da: Isento
		//Exemplo de Entrada: 4520.00  /  Exemplo de Sa�da: R$ 355.60
				
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double salario, imposto;
		
		salario = sc.nextDouble();
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
				
			
	}

}
