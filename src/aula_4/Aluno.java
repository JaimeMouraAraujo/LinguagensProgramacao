package aula_4;
public class Aluno extends Pessoa {
	private String nome;
	private int idade;
	private boolean isProgramador;

	Aluno(String nome, int idade, boolean isProgramador) {
		this.nome = nome;
		this.idade = idade;
		this.isProgramador = isProgramador;

		this.dizerAlgo("Olá, me chamo " + this.nome + ", tenho " + this.idade + " e "
				+ (this.isProgramador ? "" : "não") + "sou programador.");
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
}
