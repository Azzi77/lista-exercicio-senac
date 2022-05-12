import java.util.Scanner;

public class Praticando {

    public static void main(String[] args) {

        float salario = 4700.50F;

        if (salario > 4500) {                   // se salario maior que 4.500 imprima 30%
            float trintaPorCento = salario * 0.3F;
            System.out.println("30% = " + trintaPorCento);
        } else {                                              // se não imprima 15%
            float dezPorCento = salario * 0.1F;
            System.out.println(" 10% = " + dezPorCento);
        }

    }
}


