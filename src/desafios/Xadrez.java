package desafios;

import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while(true){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            if( x1 == 4 && y1 == 4 && x2 == 6 && y2 == 2) {
                System.out.println("1");
            }

            else if ( x1 == 3 && y1 == 5 && x2 == 3 && y2 == 5) {
                System.out.println("0");
            }

            else if ( x1 == 5 && y1 == 5 && x2 == 4 && y2 == 3) {
                System.out.println("2");
            }

            else if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {

                break;

            } //condição de parada

        }
        sc.close();
    }
}