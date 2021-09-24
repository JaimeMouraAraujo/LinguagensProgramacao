package solid.ocp;

// decidiu-se que é necessário dar 20% de desconto as pessoas acima de 60 anos
// classe respeitando o OCP
public class CobrancaRespeitando {
	public float cobrarEntrada(Pagador pagador) {
		// dessa forma, a lógica alterada não fica aqui, mas sim na classe que é passada
		// por parametro, a lógica aqui foi extendida para que, ao invés de receber uma
		// classe Pessoa qualquer, receba uma classe que extenda a interface pagador,
		// garantindo que tem o método "getValorPago" implementado
		return pagador.getValorPago(10);
	}
}