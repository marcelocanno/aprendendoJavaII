package aprendendoJavaII;

public class Funcionario  extends Pessoa{
	
	private double salario;
	
	
	
	public void imprime() {
		super.imprime();
		System.out.println("Salario : " + this.salario);
		System.out.println("=======================================================");
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
