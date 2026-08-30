package ExerciciosW3;
//Escreva um programa Java para trocar duas variáveis.

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        int a, b, temp;

        a = 50;
        b = 800;

        System.out.println("Antes da troca : a, b = " + a + ", " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Depois da troca : a, b = " + a + ", " + b);

    }
}
