package ExerciciosDio;

// 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

public class Exercicio10 {
    public static void main(String[] args) {
        int[] notas = {7,10,4};

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("A sua média é: " + media);

    }
}
