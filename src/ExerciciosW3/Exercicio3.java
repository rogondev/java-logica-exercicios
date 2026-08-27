package ExerciciosW3;
//Escreva um programa Java para dividir dois números e imprimi-los na tela. Dados
//do Teste:
//50/3
//Resultado Esperado:
//16

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*****Divisão*****");
        System.out.println("Digite o dividendo");
        int dividendo = input.nextInt();

        System.out.println("Digite o divisor");
        int divisor = input.nextInt();

        int resultado = dividendo / divisor;

        System.out.println(dividendo + " ÷ " + divisor + " = " + resultado);
    }
}
