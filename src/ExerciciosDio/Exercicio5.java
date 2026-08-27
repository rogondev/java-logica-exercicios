package ExerciciosDio;
//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor
// do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.621,00).

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //dificuldade para tirar apenas lendo o ex
        double salarioMinimo = 1621.00;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário");
        double salarioUsuario = scanner.nextDouble();

//        for (int i = 0; i < salarioUsuario; i += salarioMinimo) {
//            int quantidade = i + 1;
//        }
//        System.out.println("Seu salário e equivalente a " +);
//    } primeiro tentei fazer isso mas depois consultei e vi que n dava, a variavel qt morrei ali e n da pra concatenar

        double quantidade = salarioUsuario / salarioMinimo;
        System.out.printf("Seu salario é equivalente a %.0f salários mínimos", quantidade);
        //n consegui responder com println pq o numeral vinha enorme e utilizei o printf com ajuda do gemini, n sabia tem usar acho que n foi explicado no curso
    }
}
