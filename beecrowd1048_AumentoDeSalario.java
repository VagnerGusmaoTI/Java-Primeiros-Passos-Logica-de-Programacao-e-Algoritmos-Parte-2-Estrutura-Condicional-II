import java.util.Locale;
import java.util.Scanner;

public class beecrowd1048_AumentoDeSalario {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL

		// Exercício da plataforma beecrowd, nível iniciante: 1048 Aumento de salário
		// https://www.beecrowd.com.br/judge/pt/problems/view/1048
		// OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

			//Salário			Percentual de Reajuste
			//0 - 400.00				15%
			//400.01 - 800.00			12%
			//800.01 - 1200.00			10%
			//1200.01 - 2000.00			7%
			//Acima de 2000.00			4%

		//Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

		//Entrada
		//A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

		//Saída
		//Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) 
		//e o percentual de reajuste ganho, conforme exemplo abaixo.
			
			
		//Exemplo de Entrada: 400.00  /  Exemplo de Saída: Novo salario: 460.00	Reajuste ganho: 60.00	Em percentual: 15 %
		//Exemplo de Entrada: 800.01  /  Exemplo de Saída: Novo salario: 880.01	Reajuste ganho: 80.00	Em percentual: 10 %
		//Exemplo de Entrada: 2000.00  /  Exemplo de Saída: Novo salario: 2140.00	Reajuste ganho: 140.00	Em percentual: 7 %
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite seu salário:");
		
		double salario, percentual, reajuste, novoSalario;
		
		salario = sc.nextDouble();
		
		if(salario <= 400.00) {
			percentual = 15.00;
		}else if(salario <= 800.00) {
			percentual = 12.00;
		}else if(salario <= 1200.00) {
			percentual = 10.00;
		}else if(salario <= 2000.00) {
			percentual = 7.00;
		}else{
			percentual = 4.00;
		}
		
		reajuste = salario * percentual / 100.0;
		novoSalario = salario + reajuste;
		
		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.printf("Em percentual: %.0f %%%n", percentual);
		
		sc.close();
		
	}

}
