package desafios;

import java.util.Scanner;

public class ExibindoNumerosPares {

    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();
        int numerosPares = 0;

        while(numerosPares <= N) {
            numerosPares = numerosPares + 2;

            if (numerosPares <= N)
                System.out.println(numerosPares);
            }
    }
}
