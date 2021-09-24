package solid.srp;

//classe respeitando o SRP 
class PessoaRespeitando {
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
}