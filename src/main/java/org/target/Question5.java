package org.target;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string para inverter (Questão 5): ");
        String input = sc.nextLine();

        String invertedString = invertString(input);

        System.out.println("String invertida: " + invertedString);

        sc.close();
    }

    public static String invertString(String original) {
        char[] chars = original.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }

        return new String(chars);
    }
}
