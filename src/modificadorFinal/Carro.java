package modificadorFinal;

public class Carro {
	public static final double VELOCIDADEFINAL = 250;
	public final Comprador comprador = new Comprador();
	private String nome;
	private String marca;

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + "]";
	}
	public Comprador getcomprador() {
		return comprador;
	} 
	
	public void imprime() {
		System.out.println("Nome : " + nome + "  Marca : " +  marca + " " + comprador + "" + "[" +  VELOCIDADEFINAL + "]");
	}
	
	public void acelerar() {
		System.out.println("vruuummmmmmmmmmmmmmmmmmmmmmmm");
	}
	public void desligar() {
		System.out.println("motor off");
	}
	public void ligar() {
		System.out.println("motor on");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
