package enumeracoes;

public class ClienteTest {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Jorge", TipoCliente.PESSOA_FISICA);
		Cliente clienteVip = new Cliente("S2", TipoCliente.PESSOA_JURIDICA);
		System.out.println(cliente);
		System.out.println(clienteVip);
	}

}
