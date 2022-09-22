import java.util.Scanner;

public class beecrowd1046_TempoDeJogo {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exercício da plataforma beecrowd, nível iniciante: 1046 Tempo de jogo
		// https://www.beecrowd.com.br/judge/pt/problems/view/1046
		// OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
		//sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

		//Entrada
		//A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

		//Saída
		//Apresente a duração do jogo conforme exemplo abaixo.
		
		//Exemplo de Entrada: 16 2  /  Exemplo de Saída: O JOGO DUROU 10 HORA(S)
		//Exemplo de Entrada: 0 0  /  Exemplo de Saída: O JOGO DUROU 24 HORA(S)
		//Exemplo de Entrada: 2 16  /  Exemplo de Saída: O JOGO DUROU 14 HORA(S)
		
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
