package solid.ocp;

// decidiu-se que � necess�rio dar 20% de desconto as pessoas acima de 60 anos
// classe respeitando o OCP
public class CobrancaAntes {
	public float cobrarEntrada(PessoaAntes pagador) {
		return 10;
	}
}