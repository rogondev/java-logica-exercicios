package ExerciciosDio;

public class ExercicioGpt {
    public static void main(String[] args) {
        //1. imprimir 1 até 10 com while
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
//2. imprimir 10 até 1 com while

        int num2 = 10;
        while (num2 >= 1) {
            System.out.println(num2);
            num2--;
        }
//3. somar 1 até 100
        int num3 = 0;
        while (num3 <= 100) {

            int soma = num3 + 1;
            System.out.println(num3 + " + 1 = " + soma);
            num3++;

        }
//4. imprimir apenas pares de 1 até 20
        System.out.println("**************************************");
        int num6 = 0;
        while (num6 <= 20){
            int resultado = num6 % 2;
            if (resultado == 0){
                System.out.println(num6);
            }
            num6 ++;
        }



//5. tabuada de um número com while


        int num5 = 4;
        int multiplicador = 1;
        while (multiplicador <= 10){
            int resultado = num5 * multiplicador;
            System.out.println(num5 + " X " + multiplicador + " = " + resultado);
            multiplicador ++;
        }

        //6. fazer a tabuada 1–10 com dois while

        int numero = 1;
        int multiplicador2 = 1;

        while (numero <= 10) {

            while (multiplicador2 <= 10) {

                int resultado = numero * multiplicador2;
                System.out.println(numero + " X " + multiplicador2 + " = " + resultado);
                multiplicador2++;

            }
            multiplicador2 = 1;
            System.out.println("----------------");
            numero++;

        }


    }
}


