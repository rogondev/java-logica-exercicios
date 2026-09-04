package ExerciciosW3;
//Escreva um programa Java e calcule a soma dos dígitos de um inteiro.
//Dados de Entrada:
//Entrada um inteiro: 25
//Saída Esperada
//
//The sum of the digits is: 7

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro de no mínimo dois dígitos");
        int num = input.nextInt();

        System.out.println("A soma dos dois dígitos é " + somaDigitos(num));


    }

    public static int somaDigitos(int num) {
        int soma = 0;

        // Calculate the soma of the digits
        while (num != 0) {
            soma += num % 10;
            num /= 10;
        }

        return soma;
    }
}
