import java.util.Scanner;

public class beecrowd1044_Multiplos {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1044 M�ltiplos
		// https://www.beecrowd.com.br/judge/pt/problems/view/1044
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
		//indicando se os valores lidos s�o m�ltiplos entre si.

		//Entrada
		//A entrada cont�m valores inteiros.

		//Sa�da
		//A sa�da deve conter uma das mensagens conforme descrito acima.
		
		//Exemplo de Entrada: 6 24  /  Exemplo de Sa�da: Sao Multiplos
		//Exemplo de Entrada: 6 25  /  Exemplo de Sa�da: Nao sao Multiplos
		
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
