package ExerciciosDio;

//8 - Faça um algoritmo que leia três valores inteiros
// diferentes e imprima na tela os valores em ordem decrescente.

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três valores");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c){
            System.out.println(a);
            if (b > c){
                System.out.println(b);
                System.out.println(c);
            }else {
                System.out.println(c);
                System.out.println(b);
            }
        }

        if (b > a && b > c){
            System.out.println(b);
            if (a > c){
                System.out.println(a);
                System.out.println(c);
            }else {
                System.out.println(c);
                System.out.println(a);
            }
        }

        if (c > a && c > b){
            System.out.println(c);
            if (b > a){
                System.out.println(b);
                System.out.println(a);
            }else {
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
}
