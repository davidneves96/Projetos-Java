package pOO;

public class ExemploReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Carro carro = new Carro(); //posso instanciar assim
		//ou assim:
		
		Carro carro; //fazendo referencia a classe Carro com o nome carro (que � meu objeto aqui) para que o compilador reserve 
		// na memoria um espa�o para o objeto do tipo Carro
		
		carro = new Carro (); //antes dessa linha a referencia carro est� nula 
		//aqui estamos atribuindo um novo objeto a Carro, instanciando ele.

		carro.setModelo("March");
		carro.setMarca("Nissan");
		
		System.out.printf("\nA marca � %s e modelo � %s", carro.getMarca(), carro.getModelo());
	}

}
