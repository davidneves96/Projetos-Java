package pOO;

public class ExemploSobrecarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pagarPrestacao ("01234.147258.214521.0000001.00012000", 120.00);
		pagarPrestacao (2,"01234.147258.214521.0000001.00012000", 120.00);
	}
	
	public static void pagarPrestacao (String codBarras, double valor) {
		System.out.println("Prestação 1 paga com sucesso");
	} 
	
	public static void pagarPrestacao (int numPrestacao,String codBarras, double valor) {
		System.out.println("Prestação " +numPrestacao+" paga com sucesso");
	}
	
 //PS: Inverter o lugar dos atributos no metodo main (botando a linha 8 no lugar da linha 7 por exemplo) 
	//E inverter o lugar do metodos pagarPrestacao (botando a linha 15 ate 17 no lugar da linha 11 ate 13 
	//NÃO ALTERA O VALOR, o java le do mesmo jeito, incrivel! 
}
