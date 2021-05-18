package questao;

public class Lista_vetor {
	private double [] info;

	 private int livre;

	 public Lista_vetor(){

	 livre = 0;

	 info = new double [1000];

	 }

	 public void addLast( double e ){

	 if ( livre < info.length ) {

	   info[livre] = e;

	   livre++;

	 }

	 else {

	  System.out.println("Lista cheia!");

	 }

	 }

	 public double opr1(){

	  double soma = 0;

	  for (int i = 0; i < livre; i++) {

	   soma = soma + info[i];

	  }

	  return soma;

	 }


}
