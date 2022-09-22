import java.util.Scanner;

public class beecrowd1049_Animal {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1049 Animal
		// https://www.beecrowd.com.br/judge/pt/problems/view/1049
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Neste problema, voc� dever� ler 3 palavras que definem o tipo de animal poss�vel segundo o exemplo de esquema fornecido, da esquerda para a direita.  
		//Em seguida conclua qual dos animais seguintes foi escolhido, atrav�s das tr�s palavras fornecidas.
		
		//Entrada
		//A entrada cont�m 3 palavras, uma em cada linha, necess�rias para identificar o animal segundo a figura acima, com todas as letras min�sculas.

		//Sa�da
		//Imprima o nome do animal correspondente � entrada fornecida.
		
		//Exemplo de Entrada: vertebrado	mamifero	onivoro  /  Exemplo de Sa�da: homem
		//Exemplo de Entrada: vertebrado	ave		carnivoro  /  Exemplo de Sa�da: aguia
		//Exemplo de Entrada: invertebrado	anelideo	onivoro  /  Exemplo de Sa�da: minhoca
		
		Scanner sc = new Scanner (System.in);
		
		String caracteristica1, caracteristica2, caracteristica3;
		
		caracteristica1 = sc.nextLine();
		caracteristica2 = sc.nextLine();
		caracteristica3 = sc.nextLine();
		
		if (caracteristica1.equals("vertebrado")) {
			if (caracteristica2.equals("ave")) {
				if (caracteristica3.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else {
					System.out.println("pomba");
				}
			}
			else {
				if (caracteristica3.equals("onivoro")) {
					System.out.println("homem");
				}
				else {
					System.out.println("vaca");
				}
			}
		}
		else {
			if (caracteristica2.equals("inseto")) {
				if (caracteristica3.equals("hematofago")) {
					System.out.println("pulga");
				}
				else {
					System.out.println("lagarta");
				}
			}
			else {
				if (caracteristica3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				else {
					System.out.println("minhoca");
				}
			}
		}
		
		sc.close();
	}

}
