package ExerciciosW3;
//Escreva um programa Java que receba três números como entrada
// para calcular e imprimir a média dos números.

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("**Cálculo de média");
        System.out.println("Digite o primeiro número");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número");
        int num2 = input.nextInt();

        System.out.println("Digite o terceiro número");
        int num3 = input.nextInt();

        int media = (num1 + num2 + num3) / 3;

        System.out.println("A média é: " + media);

    }
}
