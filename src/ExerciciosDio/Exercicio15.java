package ExerciciosDio;
//15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima
// na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//consideração o ano com 365 dias e o mês com 30 dias.
//(Ex: 5 anos, 2 meses e 15 dias de vida)

// O enunciado pede apenas o ano de nascimento,
// portanto não é possível calcular meses e dias restantes com precisão.
// A solução abaixo mostra a idade convertida em anos, meses e dias.

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano do seu nascimento");
        int anoNascimento = scanner.nextInt();
        int anoAtual = 2026;

        int idade = anoAtual - anoNascimento;
        int meses = idade * 12;
        int dias = idade * 365;

        System.out.println(idade);
        System.out.println(meses);
        System.out.println(dias);
    }
}
