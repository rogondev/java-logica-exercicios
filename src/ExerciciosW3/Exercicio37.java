package ExerciciosW3;
//Escreva um programa Java para reverter uma cadeia.
//Dados de entrada:
//Entrada uma string: A raposa
//marrom rápida Saída esperada
//
//Reverse string: xof nworb kciuq ehT

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o texto");

        StringBuilder sb = new StringBuilder(input.nextLine());

        System.out.println(sb.reverse());

    }
}
