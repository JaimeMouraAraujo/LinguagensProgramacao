package aula_4;

import java.util.Scanner;

public class Aluno extends Pessoa {
	private String nome;
	private int idade;
	private boolean isProgramador;

	Aluno(String nome, int idade, boolean isProgramador) {
		this.nome = nome;
		this.idade = idade;
		this.isProgramador = isProgramador;

		this.dizerAlgo("Olá, me chamo " + this.nome + ", tenho " + this.idade + " e"
				+ (this.isProgramador ? "" : " não") + " sou programador.");
	}

	@Override
	void dizerAlgo(String algo) {
		System.out.println(algo);
	}

	@Override
	float multiplicar(float v1, float v2) {
		return v1 * v2;
	}

	@Override
	float somar(float v1, float v2) {
		return v1 + v2;
	}

	@Override
	float subtrair(float v1, float v2) {
		return v1 - v2;
	}

	@Override
	float dividir(float v1, float v2) {
		return v1 / v2;
	}

	@Override
	float calcularRestoDeDivisao(float v1, float v2) {
		return v1 % v2;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o nome do aluno: ");
		String nome = scan.nextLine();

		System.out.print("Informe a idade do aluno: ");
		int idade = scan.nextInt();
		scan.nextLine(); // limpa o buffer de entrada

		System.out.print("Informe se o aluno é ou não um programador ([S]im | [N]ão): ");
		String isProg = scan.nextLine();
		scan.close();

		Aluno aluno = new Aluno(nome, idade, isProg.charAt(0) == 'S');

		aluno.dizerAlgo("Boa noite");

		aluno.dizerAlgo("multiplicar: " + aluno.multiplicar(2, 3));
		aluno.dizerAlgo("somar: " + aluno.somar(2, 3));
		aluno.dizerAlgo("subtrair: " + aluno.subtrair(2, 3));
		aluno.dizerAlgo("dividir: " + aluno.dividir(2, 3));
		aluno.dizerAlgo("calcularRestoDeDivisao: " + aluno.calcularRestoDeDivisao(2, 3));
	}
}
