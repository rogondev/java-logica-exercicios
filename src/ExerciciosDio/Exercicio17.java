package ExerciciosDio;
//17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e
// calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//Fórmula: C = (5 * ( F-32) / 9)

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit");
        double f = scanner.nextDouble();
        double c = (5 * ( f-32) / 9);

        System.out.printf("a temperatura em Fahrenheit eh: %.2f%n", f );
        System.out.printf("a temperatura em Graus eh: %.2f", c );
    }
}
