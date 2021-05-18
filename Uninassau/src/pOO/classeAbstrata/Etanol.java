package pOO.classeAbstrata;

public class Etanol extends Combustivel {

public 	int testinho = 0; 
	
    @Override
    public void printLitrosDisponiveis() {
         System.out.println(getLitrosDisponiveis() + " Litros de Etanol");
    }
}