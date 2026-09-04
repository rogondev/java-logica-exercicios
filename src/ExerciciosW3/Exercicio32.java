package ExerciciosW3;
//Escreva um programa Java para comparar dois números.
//Dados de Entrada:
//Entrada primeiro inteiro: 25
//Segundo número inteiro de entrada: 39
//Saída Esperada
//
//25 != 39
//25 < 39
//25 <= 39

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Comparação entre dois números");
        System.out.println("Digite o primeiro número:");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = input.nextInt();

        if (num1 == num2){
            System.out.println(num1 + " == " + num2);
        }else {
            System.out.println(num1 + " != " + num2);
        }

        if (num1 < num2){
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + " > " + num2);
        }

        if (num1 <= num2){
            System.out.println(num1 + " <= " + num2);
        }else {
            System.out.println(num1 + " >= " + num2);
        }

    }
}
