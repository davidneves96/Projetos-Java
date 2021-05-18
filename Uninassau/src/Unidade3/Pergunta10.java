package Unidade3;

public class Pergunta10 {

	public static void somaTres(int x[]) {
		x[0] += 3;
	}
	
	public static void somaDois(int x) {
		x += 2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x = 0;
	int y[] = {0};
	somaDois(x);
	somaTres(y);
	somaDois(y[0]);
	System.out.println(x + " " + y [0]);
	}

}
