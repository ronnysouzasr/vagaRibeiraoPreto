package br.com.resposta2;

public class ContadorDeLetras {

	public static int contarLetraA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
