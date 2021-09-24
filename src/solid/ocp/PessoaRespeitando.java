package solid.ocp;

public class PessoaRespeitando implements Pagador {
	private int idade;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public float getValorPago(float valorPadrao) {
		float valorPagar = valorPadrao;

		if (this.idade >= 60) {
			valorPagar = (float) (valorPadrao * 0.8);
		}

		return valorPagar;
	}
}
