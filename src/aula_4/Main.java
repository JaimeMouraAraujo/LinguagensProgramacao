package aula_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Informe o nome do aluno: ");
		String nome = scan.nextLine();

		System.out.print("Informe a idade do aluno: ");
		int idade = scan.nextInt();
		scan.nextLine(); // limpa o buffer de entrada

		System.out.print("Informe se o aluno é ou não um programador ([S]im | [N]ão): ");
		String isProg = scan.nextLine();

		Aluno aluno = new Aluno(nome, idade, isProg.charAt(0) == 'S');

		aluno.dizerAlgo("Boa noite");

		scan.close();
	}
}
