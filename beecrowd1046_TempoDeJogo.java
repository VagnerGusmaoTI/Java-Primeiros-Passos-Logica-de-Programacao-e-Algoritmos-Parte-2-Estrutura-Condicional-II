import java.util.Scanner;

public class beecrowd1046_TempoDeJogo {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1046 Tempo de jogo
		// https://www.beecrowd.com.br/judge/pt/problems/view/1046
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, 
		//sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.

		//Entrada
		//A entrada cont�m dois valores inteiros representando a hora de in�cio e a hora de fim do jogo.

		//Sa�da
		//Apresente a dura��o do jogo conforme exemplo abaixo.
		
		//Exemplo de Entrada: 16 2  /  Exemplo de Sa�da: O JOGO DUROU 10 HORA(S)
		//Exemplo de Entrada: 0 0  /  Exemplo de Sa�da: O JOGO DUROU 24 HORA(S)
		//Exemplo de Entrada: 2 16  /  Exemplo de Sa�da: O JOGO DUROU 14 HORA(S)
		
		Scanner sc = new Scanner (System.in);
		
		int horaInicial, horaFinal, duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}else {
			duracao = 24 - horaInicial + horaFinal;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		
		sc.close();

	}

}
