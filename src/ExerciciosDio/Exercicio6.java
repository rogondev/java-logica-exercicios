package ExerciciosDio;
//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;
//criar variavel que receba um num
//criar variavel que reajusta esse num

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para saber o reajuste:");

        double valor = scanner.nextDouble();
        double reajuste = valor + (valor * 0.05);

        System.out.println("Valor reajustado: " + reajuste);
    }
}
