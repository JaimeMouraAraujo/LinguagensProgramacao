package solid.srp;

public class Endereco {
	private String estado;
	private String cep;
	private String cidade;
	private String bairro;
	private String logradouro;
	private String numero;
	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	// demais getters & setters

	public Endereco(String json) {
		this.estado = "RS";
		this.cep = "93800-266";
		this.cidade = "Sapiranga";
		this.bairro = "Centro";
		this.logradouro = "Rua Miguel tostes";
		this.numero = "246";
		this.complemento = "";
	}

	public static Endereco buscaCEP(String cep) {
		// digamos que eu busco via API
		String json = "{\"cep\":\"93800-266\",\"cidade\":\"Sapiranga\",\"logradouro\":\"Rua Miguel tostes\",\"bairro\":\"Centro\",\"estado\":\"RS\"}";

		return new Endereco(json);
	}
}
