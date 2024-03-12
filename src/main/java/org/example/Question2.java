package org.example;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar na sequência de Fibonacci (Questão 2): ");
        int numero = sc.nextInt();

        boolean pertence = false;

        // Verifica se o número pertence à sequência de Fibonacci
        for (int i = 0; i < 30; i++) {
            if (fibo(i) == numero) {
                pertence = true;
                break;
            }
        }

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }

    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
}
