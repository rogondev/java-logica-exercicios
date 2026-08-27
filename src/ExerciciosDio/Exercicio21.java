package ExerciciosDio;
//21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

import java.util.Random;

public class Exercicio21 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = (int) (Math.random() * 101);
        System.out.println(numeroAleatorio);
    }
}
