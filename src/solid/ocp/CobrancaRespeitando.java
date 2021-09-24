package solid.ocp;

// decidiu-se que � necess�rio dar 20% de desconto as pessoas acima de 60 anos
// classe respeitando o OCP
public class CobrancaRespeitando {
	public float cobrarEntrada(Pagador pagador) {
		// dessa forma, a l�gica alterada n�o fica aqui, mas sim na classe que � passada
		// por parametro, a l�gica aqui foi extendida para que, ao inv�s de receber uma
		// classe Pessoa qualquer, receba uma classe que extenda a interface pagador,
		// garantindo que tem o m�todo "getValorPago" implementado
		return pagador.getValorPago(10);
	}
}