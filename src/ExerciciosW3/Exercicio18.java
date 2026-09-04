package ExerciciosW3;
//Escreva um programa Java para multiplicar dois números binários.
//Dados de Entrada:
//Introdução do primeiro número binário: 10
//Entrada o segundo número binário: 11
//Saída Esperada
//
//Product of two binary numbers: 110

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        long binario1, binario2, multiplo = 0;

        int digito, fator = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro número binário: ");
        binario1 = input.nextLong();

        System.out.print("Insira o segundo número binário: ");
        binario2 = input.nextLong();

        while (binario2 != 0) {
            digito = (int)(binario2 % 10);
            if (digito == 1) {
                binario1 = binario1 * fator;
                multiplo = binaryproduct((int) binario1, (int) multiplo);
            } else {
                binario1 = binario1 * fator;
            }
            binario2 = binario2 / 10;
            fator = 10;
        }

        System.out.print("Product of two binary numbers: " + multiplo + "\n");
    }

    static int binaryproduct(int binary1, int binary2) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (remainder != 0) {
            sum[i++] = remainder;
        }

        --i;

        while (i >= 0) {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }

        return binary_prod_result;

    }
}
