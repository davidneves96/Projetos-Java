package jogo;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class BackEnd {
public static int jogador = 1;
public static String letra;
public static String grid [][] = new String[3][3];
public static boolean ganhou;
public static int ganho1=0,ganho2=0;



	public static void jogando1() {
		letra = "X";
		jogador = 2;
	}
	
	public static void jogando2() {
		letra = "O";
		jogador = 1;
		
	}
	
	public static void ganhar(){
		//ganhar para X
		for (int a = 0; a <= 2; a++) { //confirma linhas horizontais e verticais X
			if (grid[a][0] == "X" && grid[a][1] == grid[a][0] && grid[a][2] == grid[a][0]) {
				ganhou = true;
			}
			else
				if (grid[0][a] == "X" && grid[1][a] == grid[0][a] && grid[2][a] == grid[0][a]) {
					ganhou = true;
				}
		}
		//confirma linhas diagonais X
		 if (grid[0][0] == "X" && grid[1][1] == grid[0][0] && grid[2][2] == grid[0][0])
	      ganhou = true;
		 else
			 if (grid[0][2] == "X" && grid[1][1] == grid[0][2] && grid[2][0] == grid[0][2])
	         ganhou = true;
	
	
	//ganhar para O
	for (int a = 0; a <= 2; a++) { //confirma linhas horizontais e verticais O
		if (grid[a][0] == "O" && grid[a][1] == grid[a][0] && grid[a][2] == grid[a][0]) {
			ganhou = true;
		}
		else
			if (grid[0][a] == "O" && grid[1][a] == grid[0][a] && grid[2][a] == grid[0][a]) {
				ganhou = true;
			}
	}
	//confirma linhas diagonais O
	 if (grid[0][0] == "O" && grid[1][1] == grid[0][0] && grid[2][2] == grid[0][0])
      ganhou = true;
	 else
		 if (grid[0][2] == "O" && grid[1][1] == grid[0][2] && grid[2][0] == grid[0][2])
         ganhou = true;
	 
	 if (ganhou == true) {
		 sonzin();
		 if (jogador == 2) 
			ganho1++;
		else 
			ganho2++;
	 }

			
	}
	 public static  void resetar () {
			jogador = 1;
			ganhou = false;
			for (int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) {
					grid [a][b] = "";
				}
			}
	 }

	 public static void sonzin(){

		 
 try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(".\\sons\\aehooo.wav").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Erro no som.");
	        ex.printStackTrace();
	    }
 
	}





	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
