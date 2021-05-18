package pOO.exercicios;

import java.util.HashMap;
import java.util.Map;

public class BancoDeDadosVirtual {
	private static  Map<Integer, Produto> produtos = new HashMap<Integer, Produto> ();
	public static void carregarDadosVirtual() {
		produtos.put(1, new Produto(1, "Notebook", 3250.00));
		produtos.put(2, new Produto(2, "Tv 45\"", 1800.00));
		produtos.put(3, new Produto(3, "Fogão 6 Bocas", 1250.00));
	}
	public static Produto getProduto(int codigo) {
		return produtos.get(codigo);
	}
}
