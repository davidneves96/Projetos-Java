package pOO;

public class Carro {

	private String marca, modelo; //variaveis PRIVADAS só podem ser acessadas por meio de encapsulamento
	
	int contador; //atributo da classe
	
	public static void main(String args[]) {
		new Carro(); //chamando construtor
	}
	
	Carro (){ //construtor
		this(10); //envia o valor 10 para o metodo
	}
	
	Carro(int contador){ //o metodo recebe o valor 10 e armazena em contador que é uma variavel do metodo e não da classe
		this.contador ++;
		System.out.printf("construtor chamado, numero passado foi: %s", contador); //ele le o contador do metodo
		System.out.printf("\no contador é: %s", this.contador); //ele le o contador da classe 
	}
	
	
	//exemplo de emcapsulamento (junto com a classe ExemploReferencia)
	
	
	//Getters
	//Serão utilizados na outra classe para exibir o resultado
	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}
	//Getters
	
	//Setters
	//pegam o valor valor adiquirido na outra classe para jogar dentro da variavel de classe PRIVADA marca 
	public void setMarca (String marca) {
		this.marca = marca;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	//Setters
	
}
