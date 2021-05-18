package Unidade3;

public class Pergunta8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1, x = 0, i;
		while (n < 10) {
			if (n % 2 != 0) {
				for (i = 3; i * i <= n; i += 2) {
					if (n % i == 0)
						break;
				}
				if (i < n) {
					x++;
				}
			}
			n++;
		}
		System.out.println(x);
	}

}
