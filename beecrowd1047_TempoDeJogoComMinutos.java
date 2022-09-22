import java.util.Scanner;

public class beecrowd1047_TempoDeJogoComMinutos {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1047 Tempo de jogo com minutos
		// https://www.beecrowd.com.br/judge/pt/problems/view/1047
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a dura��o do jogo.

		//Obs: O jogo tem dura��o m�nima de um (1) minuto e dura��o m�xima de 24 horas.

		//Entrada
		//Quatro n�meros inteiros representando a hora de in�cio e fim do jogo.

		//Sa�da
		//Mostre a seguinte mensagem: �O JOGO DUROU XX HORA(S) E YYY MINUTO(S)�.
		
		//Exemplo de Entrada: 7 8 9 10  /  Exemplo de Sa�da: O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)
		//Exemplo de Entrada: 7 7 7 7  /  Exemplo de Sa�da: O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)
		//Exemplo de Entrada: 7 10 8 9  /  Exemplo de Sa�da: O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, minutoInicial, horaFinal, minutoFinal, instanteInicial, instanteFinal, duracao;

		horaInicial = sc.nextInt();
		minutoInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		minutoFinal = sc.nextInt();
		
		instanteInicial = horaInicial * 60 + minutoInicial;
		instanteFinal = horaFinal * 60 + minutoFinal;
		
		if (instanteInicial < instanteFinal) {
			duracao = instanteFinal - instanteInicial;
		}
		else {
			duracao = (24 * 60 - instanteInicial) + instanteFinal;
		}
		
		int duracaoHoras = duracao / 60;
		int duracaoMinutos = duracao % 60;
		
		System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
		
		sc.close();

	}

}
