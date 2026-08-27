package ExerciciosW3;
//Escreva um programa Java para imprimir os resultados das seguintes operações.
//Dados de Teste:
//a. -5 + 8 * 6
//b. (55+9) % 9
//c. 20 + -3*5 / 8
//d. 5 + 15 / 3 * 2 - 8 % 3
//Produção Esperada:
//43
//1
//19
//13

public class Exercicio4 {
    public static void main(String[] args) {
        int result1 = -5 + 8 * 6;
        int result2 = (55+9) % 9;
        int result3 = 20 + -3*5 / 8;
        int result4 = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
