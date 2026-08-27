package ExerciciosW3;
//Escreva um programa Java que receba dois números como entrada e exiba o produto de dois números.
//Dados de Teste:
//Entrada primeiro número: 25
//Entrada segundo número: 5
//Saída esperada:
//25 x 5 = 125

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o multiplicando");
        int multiplicand = input.nextInt();

        System.out.println("Digite o multiplicador");
        int multiplier = input.nextInt();

        int result = multiplicand * multiplier;

        System.out.println(multiplicand + " x " + multiplier + " = " + result);

    }
}
