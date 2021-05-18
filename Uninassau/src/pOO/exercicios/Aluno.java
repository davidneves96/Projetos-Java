package pOO.exercicios;

public class Aluno extends Pessoa {

	public Aluno () {
		
	}
	
	public Aluno (String nome, String serie) {
		this.setNome(nome);
		this.serie = serie;
	}
	private String serie;
	
	@Override
	public String toString() {
		return "Aluno:" + this.getNome() + " " + serie;
	}
}
