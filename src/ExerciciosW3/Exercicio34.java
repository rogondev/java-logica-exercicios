package ExerciciosW3;
//Escreva um programa em Java para calcular a área do hexágono.
//Área de um hexágono = (6 * s^2)/(4*tan(π/6))
//onde s é o comprimento de um lado
//Dados de entrada:
//Entrada o comprimento de um lado do hexágono: 6
//Saída Esperada
//
//The area of the hexagon is: 93.53074360871938

import java.util.Scanner;

import static java.lang.Math.tan;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o comprimento de um lado do hexágono");
        double s = input.nextDouble();


        System.out.println("A área do hexagono é: " + areaHexagono(s));
    }

    public static double areaHexagono(double s) {
        return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
    }
}
