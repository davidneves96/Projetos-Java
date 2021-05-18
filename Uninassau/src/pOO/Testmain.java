package pOO;


class TestSuper {
	int x = 120;
}

class TestSuper1 extends TestSuper{

	int x = 180;
	
	void display() {
		System.out.println("O valor de x é:" +super.x);
	}
	
}

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestSuper1 testSuper1 = new TestSuper1();
		testSuper1.display();
		
		System.out.println(Constantes.URL_BLOG);
		//Constantes.URL_BLOG = "jfiekaojfioeajmwad"; //com final não da pra alterar
		System.out.println(Constantes.URL_BLOG);
	}

}
