package ExerciciosW3;
//Escreva um programa Java que receba um número como entrada e imprima sua tabela de multiplicar até 10.
//Dados de Teste:
//Entrada um número: 8
//Saída esperada:
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******Tabela de multiplicação******");
        System.out.println("Digite um número");
        int a = input.nextInt();
        int b = 1;

        while (b <= 10){
            int result = a * b;
            System.out.println(a + " X " + b + " = " + result);
            b++;
        }

    }
}
