import java.util.Locale;
import java.util.Scanner;

public class beecrowd1040_Media3 {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1040 M�dia 3
		// https://www.beecrowd.com.br/judge/pt/problems/view/1040
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia quatro n�meros (N1, N2, N3, N4), cada um deles com uma casa decimal, 
		//correspondente �s quatro notas de um aluno. Calcule a m�dia com pesos 2, 3, 4 e 1, 
		//respectivamente, 
		//para cada uma destas notas e mostre esta m�dia acompanhada pela mensagem "Media: ". 
		//Se esta m�dia for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". 
		//Se a m�dia calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". 
		//Se a m�dia calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

		//No caso do aluno estar em exame, leia um valor correspondente � nota do exame obtida pelo aluno. Imprima ent�o a mensagem "Nota do exame: " 
		//acompanhada pela nota digitada. Recalcule a m�dia (some a pontua��o do exame com a m�dia anteriormente calculada e divida por 2). 
		//e imprima a mensagem "Aluno aprovado." (caso a m�dia final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a m�dia tenha ficado 4.9 ou menos). 
		//Para estes dois casos (aprovado ou reprovado ap�s ter pego exame) apresente na �ltima linha uma mensagem "Media final: " 
		//seguido da m�dia final para esse aluno.

		//Entrada
		//A entrada cont�m quatro n�meros de ponto flutuante correspendentes as notas dos alunos.

		//Sa�da
		//Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme a descri��o do problema. 
		//N�o esque�a de imprimir o enter ap�s o final de cada linha, caso contr�rio obter� "Presentation Error".
		
		// Exemplo de Entrada: 2.0 4.0 7.5 8.0 6.4 / Exemplo de Sa�da: Media: 5.4 Aluno em exame. Nota do exame: 6.4 Aluno aprovado. Media final: 5.9
		// Exemplo de Entrada: 2.0 6.5 4.0 9.0 / Exemplo de Sa�da: Media: 4.8 Aluno reprovado.
		// Exemplo de Entrada: 9.0 4.0 8.5 9.0 / Exemplo de Sa�da: Media: 7.3 Aluno aprovado.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		float N1, N2, N3, N4, media, notaExame, mediaFinal;
		
		N1 = sc.nextFloat();
		N2 = sc.nextFloat();
		N3 = sc.nextFloat();
		N4 = sc.nextFloat();
		
		media = (N1 * 2f + N2 * 3f + N3 * 4f + N4 * 1f) / 10f;
		System.out.printf("Media: %.1f%n", media);
		
		if(media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}else if(media < 5.0) {
			System.out.println("Aluno reprovado.");
		}else {
			System.out.println("Aluno em exame.");
			notaExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			mediaFinal = (notaExame + media) / 2f;
			if (mediaFinal >= 5f) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");
			}			
			System.out.printf("Media final: %.1f%n", mediaFinal);
		}
		
		
		sc.close();
	}

}
