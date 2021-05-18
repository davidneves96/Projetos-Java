package estudo;

import java.util.Scanner;

public class LenghtTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teste = new String();
		String teste3 = new String();
		char[] teste2 = new char[3];
		Scanner x = new Scanner (System.in);
		
		teste = x.nextLine();
		teste3 = x.nextLine();
		
		//revisado com "trim"
		//teste = x.nextLine().trim(); 
		
		//Teste de métodos Strings
		// teste lenght
		System.out.println("A palavra digitada tem " + teste.length() + " caracteres");
		
		//teste charAt
		System.out.println("O caractere na primeira casa é:" + teste.charAt(0) +" e o caractere na ultima casa é:" + teste.charAt(teste.length()-1));
		//teste getChars
		teste.getChars(teste.length()-3, teste.length(), teste2, 0);
		System.out.print("Os ultimos 3 caracteres da palavra são: ");
		System.out.println(teste2);
		
		//Teste replace
		System.out.println("O marido da:" +teste.replace(teste.charAt(teste.length()-1), 'a'));
		
		//Teste toUperCase
		System.out.println("FALANDO GRITANDO:" + teste.toUpperCase());
		
		//Teste toLowerCase
		System.out.println("Falando com classe... " + teste.toLowerCase() + "...");
		
		//Teste trim
		System.out.println("Se você digitou espaço no inicio ou final, esse aqui tirou legal:" + teste.trim());
		
		//Teste equals
		if (teste.equals(teste3))
			System.out.println("As palavras são iguais (case sensitive)");
		else
			System.out.println("As palavras não são iguais (case sensitive)");
		
		//Teste equals sem case sentitive
		if (teste.equalsIgnoreCase(teste3))
			System.out.println("As palavras são iguais (sem case sentitive)");
		else
			System.out.println("As palavras não são iguais (sem case sentitive)");
			
		
	}

}
