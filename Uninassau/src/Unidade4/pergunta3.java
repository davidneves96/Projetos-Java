package Unidade4;

public class pergunta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] v = {0,2,4,3,1,0,3,0,4,2};

		 int resposta = 0, indice = 0;

		                        int valor = 75 - 50 + 12 - 58;

		                        valor = (valor + 6) % 10;

		                        if (valor < 0)

		                                   valor = valor+10;

		                        indice = 5+v[valor];

		                        resposta = v[v[indice]];

		                        System.out.println(resposta);
	}

}
