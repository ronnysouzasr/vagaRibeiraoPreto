package br.com.resposta1;

public class Fibonaci {
	
	public  boolean isFibonacci(int n) {
        if (n == 0 || n == 1) return true;
        int a = 0, b = 1, c = 0;
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == n;
    }

}
