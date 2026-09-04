package ExerciciosW3;
//Escreva um programa em Java para imprimir um rosto.
//Produção Esperada
//
// +"""""+
//[| o o |]
// |  ^  |
// | '-' |
// +-----+

public class Exercicio16 {
    public static void main(String[] args) {
        String[] imagem = new String[5];

        imagem[0] = " +\"\"\"\"\"+ ";
        imagem[1] = "[| o o |]";
        imagem[2] = " |  ^  | ";
        imagem[3] = " | '-' | ";
        imagem[4] = " +-----+ ";

        for (int i = 0; i < 5; i++) {
            System.out.println(imagem[i]);
        }

    }
}
