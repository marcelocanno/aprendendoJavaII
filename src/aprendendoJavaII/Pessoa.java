package aprendendoJavaII;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	/*
	private Funcionario funcionario;
	private double salario;
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	*/
	public void imprime() {
		System.out.println("=======================================================");
		System.out.println("Nome : " +  this.nome);
		System.out.println("CPF : " + this.cpf);
		System.out.println("Endereco : " + this.endereco.getRua());
		System.out.println("Bairro : " + this.endereco.getBairro());
		System.out.println("-------------------------------------------------------");
			
		//System.out.println("Salario : " + this.salario);
	}
	{
		System.out.println("Testando inicialização");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	

}
