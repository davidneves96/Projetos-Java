package pOO.cursos;

import java.util.List;

public class Professor extends Pessoas {

	private List<String> nomeCursoMinistrado;
	private double salario;
	
	
	
	public double obterSalario() {
		return this.salario;
	}

	public void setNomeCursoMinistrado (List<String> nomecurso) {
		this.nomeCursoMinistrado = nomecurso;
	}
	
	public List<String> getNomeCursoMinistrado () {
		return nomeCursoMinistrado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
