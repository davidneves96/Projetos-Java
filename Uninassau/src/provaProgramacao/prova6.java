package provaProgramacao;

import java.util.Scanner;


public class prova6 {
public static void main (String []args) {
	int ramal = 0;
			System.out.println("Por favor digite o ramal desejado");
	Scanner s = new Scanner (System.in);
	ramal=s.nextInt();
	
	
	switch (ramal) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		System.out.println("Ramal ocupado..."+ramal);
		break;
	case 7:
	case 8:
	case 9:
		default:
			System.out.println("Ramal inexistente.");
			break;
			
	}
}
}
