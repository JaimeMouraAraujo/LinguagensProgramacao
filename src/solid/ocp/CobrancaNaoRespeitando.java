package solid.ocp;

// decidiu-se que � necess�rio dar 20% de desconto as pessoas acima de 60 anos
// forma errada, pois a classe esta sendo alterada, e n�o extendida 
public class CobrancaNaoRespeitando {
	public float cobrarEntrada(PessoaAntes pagador) {
		float valorCobrado = 10;

		if (pagador.getIdade() >= 60) {
			valorCobrado = (float) (valorCobrado * 0.8);
		}

		return valorCobrado;
	}
}