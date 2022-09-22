import java.util.Locale;
import java.util.Scanner;

public class beecrowd1038_Lanche {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exercício da plataforma beecrowd, nível iniciante: 1038 Lanche
		// https://www.beecrowd.com.br/judge/pt/problems/view/1038
		// OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Com base na tabela de exemplo, escreva um programa que leia o código de um item e a quantidade deste item. 
		//A seguir, calcule e mostre o valor da conta a pagar.
		
		//Entrada
		//O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

		//Saída
		//O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
		
		//Exemplo de Entrada: 3 2  /  Exemplo de Saída: Total: R$ 10.00
		//Exemplo de Entrada: 4 3  /  Exemplo de Saída: Total: R$ 6.00
		//Exemplo de Entrada: 2 3  /  Exemplo de Saída: Total: R$ 13.50
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o código do produto e a quantidade desejada:");
		
		int codigo, quantidade;
		
		double total;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
			
		if(codigo == 1) {
			total = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f%n", total);
		}else if(codigo == 2) {
			total = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f%n", total);
		}else if(codigo == 3) {
			total = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f%n", total);
		}else if(codigo == 4) {
			total = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f%n", total);
		}else if(codigo == 5) {
			total = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f%n", total);
		}else{
			System.out.println("Valor inválido");
		}
		
		sc.close();

	}

}
