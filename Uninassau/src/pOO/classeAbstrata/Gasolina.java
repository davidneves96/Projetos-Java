package pOO.classeAbstrata;

public class Gasolina extends Combustivel {

        @Override
        public void printLitrosDisponiveis() {
             System.out.println(getLitrosDisponiveis() + " Litros de Gasolina");
        }
}

