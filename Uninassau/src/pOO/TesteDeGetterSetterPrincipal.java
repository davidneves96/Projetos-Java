package pOO;

public class TesteDeGetterSetterPrincipal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TesteDeGetterSetterCarro carro = new TesteDeGetterSetterCarro();
		
		carro.setModelo("Ka");
		carro.setMarca("Ford");
		
		System.out.printf("A marca � %s e modelo � %s", carro.getMarca(), carro.getModelo());

	}

}
