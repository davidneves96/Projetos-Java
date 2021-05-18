package pOO.carros;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro1 = new Carro();
        carro1.setAnoFabricacao((short) 2010);
        carro1.setAnoModelo((short) 2011);
        carro1.setMarca("Marca 1");
        carro1.setModelo("Modelo 1");
        carro1.setClassi("77784646846HHjJ46468764");
        carro1.setPlaca("AAA-1234");

        Carro carro2 = new Carro();
        carro2.setAnoFabricacao((short) 2010);
        carro2.setAnoModelo((short) 2011);
        carro2.setMarca("Marca 2");
        carro2.setModelo("Modelo 2");
        carro2.setClassi("748XJS684633jJ46AA3889");
        carro2.setPlaca("BBB-4321");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Fulano da Silva Beltrano");
        pessoa.setCpf(00011122233);
        Carro [] carros = {carro1, carro2};
        pessoa.setCarros(carros);
        

        for(Carro carro : pessoa.getCarros()) {
                  System.out.println("O veículo " + carro.getModelo()
                                      + " pertence ao " + pessoa.getNome());
        }

        System.out.printf( "%s tem %d %s",
                            pessoa.getNome(), pessoa.getCarros().length,
                            pessoa.getCarros().length > 1 ? "carros" : "carro"
        );
	}

}
