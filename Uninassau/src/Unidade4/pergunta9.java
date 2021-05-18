package Unidade4;

public class pergunta9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = {{7,15, 14, -2},{9, -3, -7, 11},{3, 12, 15, -2},{5, 21, 16, 9}};

        int x = 0;

        for (int i=0; i < m.length; i++) {

                   for (int j = 0; j < m[i].length; j++) {

                               if ( (i + j) % 2 == 1)

                                           x = x + m[i][j];

                   }

        }

        System.out.println(x);
	}

}
