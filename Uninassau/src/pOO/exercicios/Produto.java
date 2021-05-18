package pOO.exercicios;

public class Produto {

	public Produto (int codigo, String nome, double valor) {
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	private int codigo;
	private String nome;
	private double valor;
	
	@Override
	public String toString() {
		return "Produto: " + this.nome + " custa R$" + this.valor; 
	}
	
}
