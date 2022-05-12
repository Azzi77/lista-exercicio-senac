import java.util.Scanner;

public class Algoritmo {

    public static  void main(String[] args) {

        int nota;

        Scanner scan = new Scanner(System.in);

        System.out.println( "Digite a nota");
        nota = scan.nextInt();

        if (nota >=6) {
            System.out.println("Aprovado");
        }else{

            System.out.println("Reprovado");



        }


    }


}
