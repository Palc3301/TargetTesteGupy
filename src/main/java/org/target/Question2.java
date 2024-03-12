package org.target;

import java.util.Scanner;

//Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
// (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
// escreva um programa na linguagem que desejar onde, informado um número,
// ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar na sequência de Fibonacci (Questão 2): ");
        int numero = sc.nextInt();

        boolean pertence = isFibonacci(numero);

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }

    static boolean isFibonacci(int n) {
        if (n <= 1) {
            return true;
        }

        long a = 0;
        long b = 1;

        while (b < n) {
            long temp = a;
            a = b;
            b = temp + b;
        }

        return n == b;
    }
}