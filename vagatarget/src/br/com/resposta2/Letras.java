package br.com.resposta2;

import javax.swing.JOptionPane;

public class Letras {

	public static void main(String[] args) {
	     String input = JOptionPane.showInputDialog("Digete uma string");
	     
	     
	     ContadorDeLetras cont = new ContadorDeLetras();
	     int count = cont.contarLetraA(input);
	     JOptionPane.showMessageDialog(null, "A letra 'a' aparece "+ count + " vezes");

	}

}
