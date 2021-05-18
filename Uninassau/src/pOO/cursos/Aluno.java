package pOO.cursos;

import java.util.List;

public class Aluno extends Pessoas {

	private List<String> cursos;
	private double notas[];
	
	public List<String> getCursos() {
		return cursos;
	}

	public void setCursos(List<String> cursos) {
		this.cursos = cursos;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double obterMedia() {
		int qtdNotas = this.notas.length;
		double totalNotas = 0;
		for (int i = 0; i < qtdNotas; i++) {
			totalNotas += this.notas[i];
		}
		return totalNotas/qtdNotas;
	}
	
}
