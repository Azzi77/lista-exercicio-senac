import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();


                if ((numero %2) == 0){
                    System.out.println("Par");

        } else{
                    System.out.println(" Impar");
                }
    }
}
