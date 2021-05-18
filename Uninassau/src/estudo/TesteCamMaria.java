package estudo;
import java.util.Scanner;

public class TesteCamMaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nomes = new String[3];

		Scanner s = new Scanner(System.in);


		for(int i = 0; i < nomes.length; i++){

		   System.out.print("Digite o " + (i + 1) + "º nome : " );

		   nomes[i] = s.nextLine();

		}

		for(int i = 0; i < nomes.length; i++){

		   System.out.println("O " + (i + 1) + "º nome foi: " + nomes[i]); 

		}


	}

}
