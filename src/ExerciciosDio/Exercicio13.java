package ExerciciosDio;
// 13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima
// na tela o nome da pessoa e se ela é maior ou menor de idade.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida. Digite um valor maior ou igual a 0");
        } else if (idade >= 18) {
            System.out.println("Nome " + nome);
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Nome " + nome);
            System.out.println("Menor de idade.");
        }
    }
}
