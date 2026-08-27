package ExerciciosDio;
// 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno,
// calcule a média das nota obtidas, imprima na tela o nome do aluno e
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado
// aprovado sua média final deve ser maior ou igual a 7.

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        double[]notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Aluno: " + nome);
        System.out.println("Média final: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
