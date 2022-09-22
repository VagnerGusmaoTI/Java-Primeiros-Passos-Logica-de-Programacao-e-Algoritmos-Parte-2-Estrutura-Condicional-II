import java.util.Scanner;

public class beecrowd1049_Animal {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exercício da plataforma beecrowd, nível iniciante: 1049 Animal
		// https://www.beecrowd.com.br/judge/pt/problems/view/1049
		// OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o exemplo de esquema fornecido, da esquerda para a direita.  
		//Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.
		
		//Entrada
		//A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

		//Saída
		//Imprima o nome do animal correspondente à entrada fornecida.
		
		//Exemplo de Entrada: vertebrado	mamifero	onivoro  /  Exemplo de Saída: homem
		//Exemplo de Entrada: vertebrado	ave		carnivoro  /  Exemplo de Saída: aguia
		//Exemplo de Entrada: invertebrado	anelideo	onivoro  /  Exemplo de Saída: minhoca
		
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
