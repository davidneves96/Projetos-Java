package pOO.exercicios;

public class Pessoa {
	
	private String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return "Nome:" + nome;
	}
}
