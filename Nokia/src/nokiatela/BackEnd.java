package nokiatela;

import java.awt.dnd.MouseDragGestureRecognizer;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;

public class BackEnd {
public static String frase = "";

	public static void timer() {


	}

	public static void ApertarEnter() {
		
	BackEnd.apertarUm();
	BackEnd.apertarDois();
	BackEnd.apertarTres();
	BackEnd.apertarQuatro();
	BackEnd.apertarCinco();
	BackEnd.apertarSeis();
	BackEnd.apertarSete();
	BackEnd.apertarOito();
	BackEnd.apertarNove();
	BackEnd.apertarAsteristico();
	BackEnd.apertarZero();
	BackEnd.apertarJogoDaVelha();
	

		
		//tecla 3
		


	}

	public static void apertarC(){
		FrontEnd.valor = "";
		FrontEnd.teste = 0;
		BackEnd.frase = "";
		}
	


	public static void apertarUm() {
		if (FrontEnd.teste == 1) {
		BackEnd.frase = "Nokia";
		FrontEnd.valor = "";
		}
		
	}
	
	public static void apertarDois() {
		

		if (FrontEnd.teste == 2) {
			frase = BackEnd.frase.concat("a");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 22) {
			frase = BackEnd.frase.concat("b");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 222) {
			frase = BackEnd.frase.concat("c");
			FrontEnd.valor = "";
		}
	

	}
	
	public static void apertarTres(){
		
		if (FrontEnd.teste == 3) {
			frase = BackEnd.frase.concat("d");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 33) {
			frase = BackEnd.frase.concat("e");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 333) {
			frase = BackEnd.frase.concat("f");
			FrontEnd.valor = "";
		}
		
	}

	public static void apertarQuatro(){
		

		if (FrontEnd.teste == 4) {
			frase = BackEnd.frase.concat("g");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 44) {
			frase = BackEnd.frase.concat("h");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 444) {
			frase = BackEnd.frase.concat("i");
			FrontEnd.valor = "";
		}
	
		
	}

	public static void apertarCinco(){
		

		if (FrontEnd.teste == 5) {
			frase = BackEnd.frase.concat("j");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 55) {
			frase = BackEnd.frase.concat("k");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 555) {
			frase = BackEnd.frase.concat("l");
			FrontEnd.valor = "";
		}
	
		
	}
	
	public static void apertarSeis(){
		

		if (FrontEnd.teste == 6) {
			frase = BackEnd.frase.concat("m");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 66) {
			frase = BackEnd.frase.concat("n");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 666) {
			frase = BackEnd.frase.concat("o");
			FrontEnd.valor = "";
		}
	
		
	}

	public static void apertarSete(){
		

		if (FrontEnd.teste == 7) {
			frase = BackEnd.frase.concat("p");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 77) {
			frase = BackEnd.frase.concat("q");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 777) {
			frase = BackEnd.frase.concat("r");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 7777) {
			frase = BackEnd.frase.concat("s");
			FrontEnd.valor = "";
		}
	
		
	}

	public static void apertarOito(){
		

		if (FrontEnd.teste == 8) {
			frase = BackEnd.frase.concat("t");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 88) {
			frase = BackEnd.frase.concat("u");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 888) {
			frase = BackEnd.frase.concat("v");
			FrontEnd.valor = "";
		}
	
		
	}

	public static void apertarNove(){
		

		if (FrontEnd.teste == 9) {
			frase = BackEnd.frase.concat("w");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 99) {
			frase = BackEnd.frase.concat("x");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 999) {
			frase = BackEnd.frase.concat("y");
			FrontEnd.valor = "";
		}
		else if (FrontEnd.teste == 9999) {
			frase = BackEnd.frase.concat("z");
			FrontEnd.valor = "";
		}
	
		
	}

	public static void apertarAsteristico(){
	if (FrontEnd.teste == 10) {
		frase = BackEnd.frase.concat("*");
		FrontEnd.valor = "";
	}
		
	}

	public static void apertarZero(){
		if (FrontEnd.teste == 0) {
		frase = BackEnd.frase.concat(" ");
		FrontEnd.valor = "";
		}
	}

	public static void apertarJogoDaVelha(){
		if (FrontEnd.teste == 12) {
		frase = BackEnd.frase.concat("#");
		FrontEnd.valor = "";
		}
		
	}

}

