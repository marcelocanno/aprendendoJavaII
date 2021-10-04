package modificadorFinal;

public class CarroTest extends Carro{

	public static void main(String[] args) {
		
		Carro car = new Carro();
		System.out.println(car.getcomprador());
		car.getcomprador().setNome("Marcelo");
		System.out.println(car.getcomprador());
		car.setMarca("Honda");
		car.setNome("Azura");
		car.desligar();
		car.acelerar();
		car.imprime();
		Carro car1 = new Carro();
		System.out.println("----------------------------------------------------");
		car1.setMarca("viagem");
		car1.setNome("Suzuki");
		car1.ligar();
		car1.acelerar();
		car1.desligar();
		car1.imprime();
		System.out.println("----------------------------------------------------");
	}

}
