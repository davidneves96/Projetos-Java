package Unidade4;

public class pergunta10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 0;

int[] v = {10,1,-11,8,14,-1,9,5,7,3};

           int valor = 80 - 40 + 10 - 14;

           valor = (valor + 8) % 10;

           if (valor < 0)

                      valor = valor+10;

           for (int i = 0; i<=valor;i++) {

x = x +v[i];

           }

           System.out.println(x);
	}

}
