package app;

public class BackEnd {
	static float mediaAv1, mediaAv2, media;
	static float nota[] = new float[6];

	public static void calcular() {
	

	/**	
		for (int a = 0; a < 6; a++) {
			mediaAv1 = mediaAv1 + nota[a];
		}
		**/
		if ((nota[0]+nota[1]+nota[2]+nota[3]+nota[4]+nota[5]) > 0)
		mediaAv1 = (nota[0]+nota[1]+nota[2]+nota[3]+nota[4]+nota[5]) / 6;
		
		media = ((mediaAv1 * 0.4f) + (mediaAv2 * 0.6f));
	}

}
