package ExerciciosW3;
//Escreva um programa Java para adicionar dois números binários.
//Dados de entrada:
//Entrada número binário primeiro: 10
//Número binário segundo de entrada: 11
//Saída esperada
//
//Sum of two binary numbers: 101

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        long binario1, binario2;
        int i = 0, resto = 0;

        int[] soma = new int[20];

        Scanner in = new Scanner(System.in);

        System.out.print("Insira o primeiro número binário: ");
        binario1 = in.nextLong();

        System.out.print("Insira o segundo número binário: ");
        binario2 = in.nextLong();

        while (binario1 != 0 || binario2 != 0)
        {
            soma[i++] = (int)((binario1 % 10 + binario2 % 10 + resto) % 2);
            resto = (int)((binario1 % 10 + binario2 % 10 + resto) / 2);
            binario1 = binario1 / 10;
            binario2 = binario2 / 10;
        }

        if (resto != 0) {
            soma[i++] = resto;
        }

        --i;

        System.out.print("Soma dos dois números binários: ");
        while (i >= 0) {
            System.out.print(soma[i--]);
        }

        System.out.print("\n");



    }
}
