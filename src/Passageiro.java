
public class Passageiro {
	private Pessoa pessoa;
	private int numeroSmiles;
	
	public Passageiro(Pessoa pessoa, int numeroSmiles) {
		this.numeroSmiles = numeroSmiles;
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
	public int getNumeroSmiles() {
		return numeroSmiles;
	}
	public void setNumeroSmiles(int numeroSmiles) {
		this.numeroSmiles = numeroSmiles;
	}

}
