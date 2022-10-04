package PRAK1;

import java.util.Scanner;

public class PRAK103_2010817220030_FajraHanifaNuridiRadam {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        int input = masuk.nextInt();
        int i = 1;
        do{
            if (input % 7 == 0){
                continue;
            }
            if (i == 5) System.out.print(input);
            else System.out.print(input + ", ");
            i++;
            input--;
        } while (i<=5);
    }
}
