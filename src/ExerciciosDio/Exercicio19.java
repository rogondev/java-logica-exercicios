package ExerciciosDio;
//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class Exercicio19 {
    public static void main(String[] args) {
// Laço 1: Troca a tabuada (Tabuada do 1, Tabuada do 2, etc.)
        for (int num = 1; num <= 10; num++) {

            System.out.println("--- TABUADA DO " + num + " ---");

            for (int i = 1; i <= 10; i++) {
                int resultado = num * i;
                System.out.println(num + " X " + i + " = " + resultado);
            }

            System.out.println();
        }

    }
}
