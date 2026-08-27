package ExerciciosDio;
//7 - Faça um algoritmo que leia dois valores booleanos
// (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite true ou false:");
        boolean valor1 = scanner.nextBoolean();

        System.out.println("Digite true ou false:");
        boolean valor2 = scanner.nextBoolean();

        if (valor1 && valor2){
            System.out.println("Ambos valores são true");
        } else if (valor1 || valor2){
            System.out.println("Um valor é false");
        } else {
            System.out.println("Ambos os valores são false");
        }
    }

}
