package org.target;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(soma());
    }

    public static int soma() {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k += 1;
            soma += k;
        }
        return soma;
    }
}
