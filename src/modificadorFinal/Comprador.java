package modificadorFinal;

public class Comprador {
	
	private String nome = "jose";
		
	@Override
	public String toString() {
		return "Comprador [nome = " + nome + "]";
	}
	public Comprador() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
