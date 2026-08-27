package ExerciciosDio;
//16 - Faça um algoritmo que leia três valores que representam os três lados de
// um triângulo e verifique se são válidos, determine se o triângulo é
//equilátero, isósceles ou escaleno.
//Equilátero: Tem os três lados iguais
// Isósceles: Tem dois lados iguais e um diferente
// Escaleno: Tem os três lados diferentes (nenhum é igual).

public class Exercicio16 {
    public static void main(String[] args) {
        double a = 10;
        double b = 10;
        double c = 10;

        if (a + b > c && a + c > b && b + c > a){
            if (a == b && a == c){
                System.out.println("Triângulo Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os lados informados não formam um triângulo válido.");
        }

    }
}
