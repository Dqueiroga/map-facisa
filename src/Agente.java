
public class Agente {
	private Pessoa pessoa;
	private Long idAgente;
	
	public Agente(Pessoa pessoa, Long id) {
		this.idAgente = id;
		this.pessoa = pessoa;
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
	public Long getIdAgente() {
		return idAgente;
	}
	public void setIdAgente(Long idAgente) {
		this.idAgente = idAgente;
	}
	
}
