package pOO.classeAbstrata;

import pOO.TesteDeGetterSetterCarro;

public abstract class Combustivel {

	private int litrosDisponiveis;

    public void abastecerReservatorio(int litros) {
         this.litrosDisponiveis += litros;
    }
    public int getLitrosDisponiveis(){
         return this.litrosDisponiveis;
    }

    public abstract void printLitrosDisponiveis();
	

}
