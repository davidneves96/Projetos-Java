package Unidade4;

public class pergunta4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int a = 7; 

           int t = 2;

           while (a < 29) {

                      a = a + t;

                      if ( (a % 2 == 1) || (a < 5) )

                                  t = t + 2;

           }

           System.out.println(a);

	}

}
