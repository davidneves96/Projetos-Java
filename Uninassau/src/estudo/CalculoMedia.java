package estudo;

import java.util.Scanner;



public class CalculoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1 = 0, nota2 = 0, result = 0;
		Scanner x = new Scanner(System.in);
		System.out.print("Digite sua primeira nota:");
		nota1 = x.nextFloat();
		System.out.print("Digite sua segunda nota:");
		nota2 = x.nextFloat();
		
		result = (nota1+nota2)/2;
		
		System.out.println("Sua média é:"+result);

	}

}
