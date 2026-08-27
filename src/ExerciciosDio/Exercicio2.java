package ExerciciosDio;
//2 - Faça um algoritmo para receber um número qualquer e
//na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("Número positivo");
        }else if (numero < 0){
            System.out.println("Número negativo");
        } else {
            System.out.println("Número igual a zero");
        }

        if (numero % 2 == 0){
            System.out.println("Número par");
        }else {
            System.out.println("Número impar");
        }
    }

}
