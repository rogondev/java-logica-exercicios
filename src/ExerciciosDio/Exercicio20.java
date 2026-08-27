package ExerciciosDio;
//20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("****Tabuada****");
        System.out.println("Digite um número para receber a tabuada");
        int num = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " X " + i + " = " + resultado);
        }
    }
}
