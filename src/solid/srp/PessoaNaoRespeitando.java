package solid.srp;

// forma errada
public class PessoaNaoRespeitando {
	private String nome;
	private int idade;
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	// demais getters & setter

	public Endereco buscarCEP(String cep) {
		String json = ""; // finge que ta acessando uma API e buscando os dados do CEP
		return new Endereco(json);
	}
}