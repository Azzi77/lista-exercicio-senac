import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);  // para usuario entrar com informação
        int numero;
        int maior =0 ;
        int menor  =0;
        System.out.println( "Digite 10 numeros inteiros");
        for (int i =0; i<10 ;i = i+1){ // i começa a contagem ate 10 loop de 10 vezes
            numero = leitor.nextInt();            // guardar os numeros


            if (i == 0){   // i é igual ao primeiro numero no caso 0
                maior = numero;
                menor = numero;
            }
            if (numero>maior){
                maior = numero;
            }
            if (numero <menor){
                menor = numero;

            }
        }
        System.out.println( "Maior = " + maior);
        System.out.println( "Menor = " + menor);


        leitor.close();  // leitor.close();  // para fechar a clase scanner leito
    }

}





