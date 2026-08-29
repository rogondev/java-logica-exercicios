package ExerciciosW3;
//Escreva um programa Java para imprimir a área e o perímetro de um círculo.
//Dados do Teste:
//Raio = 7,5
//Perímetro de Saída
//Esperado é = 47,12388980384689
//Área é = 176,71458676442586

public class Exercicio11 {
    public static void main(String[] args) {

        double radius = 7.5;

        double perimeter = 2 * Math.PI * radius;

        double area = Math.PI * radius * radius;

        System.out.println("O perímetro é = " + perimeter);
        System.out.println("Área é = " + area);


    }
}
