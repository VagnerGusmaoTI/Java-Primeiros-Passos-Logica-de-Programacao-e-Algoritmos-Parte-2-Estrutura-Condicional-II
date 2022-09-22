import java.util.Scanner;

public class beecrowd1044_Multiplos {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exercício da plataforma beecrowd, nível iniciante: 1044 Múltiplos
		// https://www.beecrowd.com.br/judge/pt/problems/view/1044
		// OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
		//indicando se os valores lidos são múltiplos entre si.

		//Entrada
		//A entrada contém valores inteiros.

		//Saída
		//A saída deve conter uma das mensagens conforme descrito acima.
		
		//Exemplo de Entrada: 6 24  /  Exemplo de Saída: Sao Multiplos
		//Exemplo de Entrada: 6 25  /  Exemplo de Saída: Nao sao Multiplos
		
		Scanner sc = new Scanner (System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();

	}

}
