package estudo;

public class ExemploOperadorUnario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 10, var2 = 20, res = 0;
		res = var1 + var2;
		System.out.println("res:" + res);
		res = var1++ + var2;
		System.out.println("res:" + res);
		res = var1 + var2;
		System.out.println("res:" + res);
		res = var1 + --var2;
		System.out.println("res:" + res);
		
		
		
	}

}
