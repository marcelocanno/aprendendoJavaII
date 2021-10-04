package sobrescrita;

public class PessoaTest extends Pessoa{

	public static void main(String[] args) {
		
		Pessoa pes = new Pessoa();
		pes.setNome("Marcelo");
		pes.setIdade(62);
		
		Pessoa pes1 = new Pessoa();
		pes1.setNome("Julio");
		pes1.setIdade(45);

		Pessoa pes2 = new Pessoa();
		pes2.setNome("Mateus");
		pes2.setIdade(28);

		Pessoa pes3 = new Pessoa();
		pes3.setNome("Maria");
		pes3.setIdade(22);
		
		System.out.println(pes);
		System.out.println(pes1);
		System.out.println(pes2);
		System.out.println(pes3);
		
		System.out.println("------------------------------------------------------");
	}

}
