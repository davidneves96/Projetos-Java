package estudo;

import javax.swing.JOptionPane;

public class Principal {

		   public static void main(String[ ] args) {

		double a, b, c, r;

		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a:"));

		b = Double.parseDouble(JOptionPane.showInputDialog ("Digite o valor de b:"));

		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c:"));

		if (a < b && a < c) {

		    r = (b + c) / 2;

		} else if (b < c) {

		r = (a + c) / 2;

		} else {

		r = (a + b) / 2;

		        }

		System.out.print( r );

		   }

}
