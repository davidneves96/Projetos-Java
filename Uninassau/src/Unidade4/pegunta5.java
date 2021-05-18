package Unidade4;

public class pegunta5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resposta = 0;

        int[][] y = new int[][] {{7,5,1,2,3},{4,5,6,7,8},{1,2,3,4,5}};

        for (int i = 0; i < y.length; i++) {

resposta = resposta + y[ i ][ 2 ];

       }

       System.out.println(resposta);

	}

}
