package questao;

public class ContaEspecial extends Conta {
	protected double limite;

	 public ContaEspecial(int num, double saldo, double limite) {

	 super(num, saldo);

	 this.limite = limite;

	 }

	 public void debite( double val ){

	  if (val<= (saldo + limite)) {

	    saldo = saldo - val; 

	  }

	  else

	     System.out.println("Saldo insuficiente!");

	 }
}
