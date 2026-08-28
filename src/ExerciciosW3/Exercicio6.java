package ExerciciosW3;
//Escreva um programa Java para imprimir a soma (adição), multiplicar, subtrair, dividir e remanescer dois números.
//Dados de Teste:
//Entrada primeiro número: 125
//Entrada segundo número: 24
//Saída esperada:
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int a = input.nextInt();

        System.out.println("Digite o segundo número");
        int b = input.nextInt();

        int sum = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int divide = a / b;
        int remainder = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + subtract);
        System.out.println(a + " X " + b + " = " + multiply);
        System.out.println(a + " / " + b + " = " + divide);
        System.out.println(a + " mod " + b + " = " + remainder);
    }
}
