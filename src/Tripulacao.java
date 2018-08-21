
public class Tripulacao {
	private Long idTripulacao;
	private Pessoa pessoa;
	
	public Tripulacao(Pessoa pessoa, Long id) {
		this.pessoa = pessoa;
		this.idTripulacao = id;
	}
	public String getNome() {
		return pessoa.getNome();
	}

	public void setNome(String nome) {
		pessoa.setNome(nome);
	}

	public String getEndereco() {
		return pessoa.getEndereco();
	}

	public void setEndereco(String endereco) {
		pessoa.setEndereco(endereco);
		
	}
	public Long getIdTripulacao() {
		return idTripulacao;
	}
	public void setIdTripulacao(Long idTripulacao) {
		this.idTripulacao = idTripulacao;
	}
	
}
