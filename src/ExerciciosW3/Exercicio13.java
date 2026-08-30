package ExerciciosW3;
//Escreva um programa em Java para imprimir a área e o perímetro de um retângulo.
//Dados do Teste:
//Largura = 5,5 Altura = 8,5
//Área de saída esperada é 5,6 * 8,5 = 47,60
//Perímetro é 2 * (5,6 + 8,5) = 28,20

public class Exercicio13 {
    public static void main(String[] args) {
        final double largura = 5.5;
        final double altura = 8.5;

        double perimetro = 2 * (largura + altura);

        System.out.println(largura + " * " + altura + " = " + perimetro);



    }
}
