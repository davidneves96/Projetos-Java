package estudo;

public class Pergunta5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0.0;
		int temp,n;
		temp = n = 153;
		int qtdDigitos=0;
		while (temp >0) {
			qtdDigitos++;
			temp = temp/10;
			
		}
		temp = n;
		while (temp > 0) {
			int digito = temp % 10;
			total += Math.pow(digito, qtdDigitos);
			temp = temp / 10;
		}
		System.out.println((int)total);
	}

}
