package PRAK1;

import java.util.Scanner;

public class PRAK102_2010817220030_FajraHanifaNuridiRadam {
    public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        int i = 0;
        int input = masuk.nextInt();

        while (i <= 6){
            int t;
            if (input % 2 == 0) {
                t = (input / 2) -1;
                System.out.print(" " +t+ " ");
            }else{
                System.out.print(input);
            }
            input++;
            i++;
        }
        masuk.close();
    }
}
