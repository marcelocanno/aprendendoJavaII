package aprendendoJavaII;

public class HerancaTest {

	public static void main(String[] args) {
		
		Pessoa pes = new Pessoa();
		Endereco end = new Endereco();
		Funcionario func = new Funcionario();
		
		pes.setNome("gina");
		pes.setCpf("987.987.987-24");
		end.setBairro("Jersey");
		end.setRua("Waal Street");
		pes.setEndereco(end);
		
		func.setNome("Jose");
		func.setCpf("345.678");
		func.setEndereco(end);
		func.setSalario(3400);
		
		
		pes.imprime();
		
		func.imprime();
	
	}

}
