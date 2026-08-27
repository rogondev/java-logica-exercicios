package ExerciciosDio;
//12 - Faça um algoritmo que leia o valor de um produto e determine o valor
// que deve ser pago, conforme a escolha da forma de pagamento
// pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize
// os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
// Tabela de Código de Condições de Pagamento
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

import java.util.Scanner;

public class Exercicio12 {

    public static double aVistaDinheiro(double valor) {
        return valor * 0.85;
    }

    public static double aVistaCartao(double valor) {
        return valor * 0.90;
    }

    public static double parcelaEmDois(double valor) {
        return valor;
    }

    public static double parcelaEmTres(double valor) {
        return valor * 1.10;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****Carrinho de compras*****");
        System.out.println("Digite o valor do seu produto");

        double valor = scanner.nextDouble();

        System.out.println("*********Catálogo de Produtos*********");
        System.out.println("Selecione a forma de pagamento");
        System.out.println("1. À vista no pix.");
        System.out.println("2. À vista no cartão de crédito.");
        System.out.println("3. Parcelado: 2x.");
        System.out.println("3. Parcelado: 3x.");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Total: " + aVistaDinheiro(valor));
                break;
            case 2:
                System.out.println("Total" + aVistaCartao(valor));
                break;
            case 3:
                System.out.println("Total: " + parcelaEmDois(valor));
                break;
            case 4:
                System.out.println("Total: " + parcelaEmTres(valor));
                break;
        }
    }
}
