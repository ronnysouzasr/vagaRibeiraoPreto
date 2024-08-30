package br.com.resposta1;

import javax.swing.JOptionPane;

public class resposta1 {

	public static void main(String[] args) {
		

	    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
	    Fibonaci fi = new Fibonaci();
	    if (fi.isFibonacci(num)) {
	    	
	    	JOptionPane.showMessageDialog(null, num + " pertence à sequência de Fibonacci.");
	        
	    } else {
	    	JOptionPane.showMessageDialog(null, num + " pertence à sequência de Fibonacci.");
	    }
	        
	    
	    
	       
	}	

}
