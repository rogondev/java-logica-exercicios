package ExerciciosDio;
//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida
// imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class Exercicio1 {

    public static void somaDoisNumeros(int A, int B, int C){
        int resultado = A + B;

        if (resultado < C){
            System.out.println(A + " + " + B + " = " + resultado + ". O resultado é menor que " + C);
        } else if (resultado > C) {
            System.out.println(A + " + " + B + " = " + resultado + ". O resultado é maior que " + C);
        }else {
            System.out.println("O resultado da soma entre " + A + " e " + B + " é igual a " + C);
        }
    }

    public static void main(String[] args) {
        somaDoisNumeros(1,1,2);
    }
}
