package pOO;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado, nume1, nume2;
		float resultado2;
		
		Scanner x = new Scanner (System.in);
		
		nume1 = x.nextInt();
		
		nume2 = x.nextInt();
		
		
		//SOMA
		//pegando metodo somar da classe operacoes para somar 15 e 25
		resultado = Operacoes.somar(15, 25);
		
		System.out.println("a soma de 15 e 25 �: " +resultado );
		
		resultado = Operacoes.somar(nume1, nume2);//pegando metodo somar da classe operacoes mas agora para somar o valor de entrada
		//(vindo do scanner para nume1 e nume2)
		
		System.out.println("a soma de " +nume1+ " e "+nume2 +" �: " +resultado);
		
		
		
		
		//SUBTRA��O
		Operacoes operacao = new Operacoes (); //instanciando Operacoes para usar o metodo subtrair j� que ele n�o �
		//estatico e portanto n�o pode ser usado fora da classe, o metodo estatico permite a mudan�a de todas as intancias fora da classe
		//porem o metodo SEM static s� permite mudan�as em objetos instanciados, como agora que estamos estanciando operacao
		//PS: estatico n�o � bom pois n�o tem muita liberdade para personalizar os metodos como instanciando cada um deles.
		
		//pegando metodo subtrair no objeto operacao depois de instanciar ele e herda os metodos da classe Operacoes 
		resultado = operacao.subtrair(25, 15);
		System.out.println("A subtra��o de 25 com 15 �: " +resultado);
		
		
		resultado = operacao.subtrair(nume1, nume2);//pegando metodo subtrair da classe operacoes mas agora para subtrair 
		//pelos dados de entrada
		System.out.println("A subtra��o de "+nume1+" com " +nume2+ " �: " +resultado);
		
		
		//DIVIS�O
		resultado2 = operacao.dividir(25, 15);
		System.out.println("A divis�o de 25 com 15 �: " +resultado2);
		
		resultado2 = operacao.dividir(nume1,nume2 ); //foi criado uma variavel resultado2 s� que em float, j� que divis�o tem pontos flutuantes		
		System.out.println("A divis�o de "+nume1+" e " +nume2+ " �: " +resultado2);;
	}

}
