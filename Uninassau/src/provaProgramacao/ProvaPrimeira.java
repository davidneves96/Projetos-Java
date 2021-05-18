package provaProgramacao;

public class ProvaPrimeira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] e = {3,7,15,26,39};
int [] f = {1,7,19,26,51};
int d = 0;

for (int i = 0; i < e.length;i++) {
	if (e [i] == f[i])
		d=d+1;
}
System.out.println(d);
	}

}
