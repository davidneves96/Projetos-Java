package pOO.exercicios;

public class Start {

	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		realizarCast(new Produto());
		realizarCast(new Movel());
		realizarCast(new Eletrodomestico());
	}
	
	public static void realizarCast(Produto produto) {
		try {
			Eletrodomestico el = (Eletrodomestico) produto;
			System.out.println("Sucesso em converter o objeto da classe " + produto.getClass().getSimpleName());
		} catch (ClassCastException ce) {
			System.out.println("houve erro com a conversão com a classe" +produto.getClass().getSimpleName());
		}catch (Exception e) {
			System.out.println("houve erro generico");
		}
	}
}
