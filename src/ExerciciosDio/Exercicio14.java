package ExerciciosDio;
//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de
// A por B e o valor de B por A e imprima na tela os valores.

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B");
        int b = scanner.nextInt();

        int temporario = a;
        a = b;
        b = temporario;
        System.out.println("Novo valor de A: " + a); // Imprime 10
        System.out.println("Novo valor de B: " + b); // Imprime 5
    }
}
