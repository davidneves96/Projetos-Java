package pOO;

public class ExemploReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Carro carro = new Carro(); //posso instanciar assim
		//ou assim:
		
		Carro carro; //fazendo referencia a classe Carro com o nome carro (que é meu objeto aqui) para que o compilador reserve 
		// na memoria um espaço para o objeto do tipo Carro
		
		carro = new Carro (); //antes dessa linha a referencia carro está nula 
		//aqui estamos atribuindo um novo objeto a Carro, instanciando ele.

		carro.setModelo("March");
		carro.setMarca("Nissan");
		
		System.out.printf("\nA marca é %s e modelo é %s", carro.getMarca(), carro.getModelo());
	}

}
