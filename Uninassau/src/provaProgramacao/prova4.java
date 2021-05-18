package provaProgramacao;

public class prova4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int z = 7;
z = z + 3;
int a = 1;
while (z < 52) {
	if (z % 2 == 1) {
		System.out.println("Nassau "+Integer.toString(a++));
		z = z+4;
	}
	else
		z = z +19;
}
	}

}
