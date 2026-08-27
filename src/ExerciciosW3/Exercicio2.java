package ExerciciosW3;


import java.util.Scanner;
//Escreva um programa em Java para imprimir a soma de dois números. Dados
//do Teste: 74 + 36
//Produção Esperada:
//110

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número");
        int num2 = input.nextInt();

        int result = num1 + num2;
        System.out.println("O resultado da soma é " + result);

    }
}
