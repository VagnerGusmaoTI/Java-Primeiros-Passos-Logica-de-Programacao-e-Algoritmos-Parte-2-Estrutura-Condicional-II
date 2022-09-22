import java.util.Scanner;

public class beecrowd1035_TesteDeSeleção1 {

	public static void main(String[] args) {
		
		//ESTRUTURA CONDICIONAL
		
		//Exercício da plataforma beecrowd, nível iniciante: 1035 Teste de seleção 1
		//https://www.beecrowd.com.br/judge/pt/problems/view/1035
		//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, 
		//e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos 
		//e se a variável A for par escrever a mensagem "Valores aceitos", 
		//senão escrever "Valores nao aceitos".

		//Entrada
		//Quatro números inteiros A, B, C e D.

		//Saída
		//Mostre a respectiva mensagem após a validação dos valores.
		
		//Exemplo de Entrada: 5 6 7 8  /  Exemplo de Saída: Valores nao aceitos
		//Exemplo de Entrada: 2 3 2 6  /  Exemplo de Saída: Valores aceitos
		
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		if(B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}
		
		sc.close();

	}

}
