import java.util.Scanner;
public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		Scanner leitor = new Scanner(System.in);
		int idade=0;
		int i=0;
		int qtde=0;
		int soma=0, media;
		
		System.out.println("Quantos alunos existem nessa escola?");
		qtde = leitor.nextInt();
		
		while (i<qtde)
		{
			System.out.println("Digite a idade do " + (i+1) + "� aluno");
			idade = leitor.nextInt();
			soma = soma + idade;
			i++;
		}
		media = soma / qtde;
		System.out.println("A m�dia de idades dos alunos � " + media);
		leitor.close();
	}

}
