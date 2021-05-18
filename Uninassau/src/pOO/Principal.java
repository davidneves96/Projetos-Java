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
		
		System.out.println("a soma de 15 e 25 é: " +resultado );
		
		resultado = Operacoes.somar(nume1, nume2);//pegando metodo somar da classe operacoes mas agora para somar o valor de entrada
		//(vindo do scanner para nume1 e nume2)
		
		System.out.println("a soma de " +nume1+ " e "+nume2 +" é: " +resultado);
		
		
		
		
		//SUBTRAÇÃO
		Operacoes operacao = new Operacoes (); //instanciando Operacoes para usar o metodo subtrair já que ele não é
		//estatico e portanto não pode ser usado fora da classe, o metodo estatico permite a mudança de todas as intancias fora da classe
		//porem o metodo SEM static só permite mudanças em objetos instanciados, como agora que estamos estanciando operacao
		//PS: estatico não é bom pois não tem muita liberdade para personalizar os metodos como instanciando cada um deles.
		
		//pegando metodo subtrair no objeto operacao depois de instanciar ele e herda os metodos da classe Operacoes 
		resultado = operacao.subtrair(25, 15);
		System.out.println("A subtração de 25 com 15 é: " +resultado);
		
		
		resultado = operacao.subtrair(nume1, nume2);//pegando metodo subtrair da classe operacoes mas agora para subtrair 
		//pelos dados de entrada
		System.out.println("A subtração de "+nume1+" com " +nume2+ " é: " +resultado);
		
		
		//DIVISÃO
		resultado2 = operacao.dividir(25, 15);
		System.out.println("A divisão de 25 com 15 é: " +resultado2);
		
		resultado2 = operacao.dividir(nume1,nume2 ); //foi criado uma variavel resultado2 só que em float, já que divisão tem pontos flutuantes		
		System.out.println("A divisão de "+nume1+" e " +nume2+ " é: " +resultado2);;
	}

}
