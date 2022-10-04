package PRAK1;

import java.util.Scanner;

public class PRAK104_2010817220030_FajraHanifaNuridiRadam {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        int andiR1, budiR1, andiR2, budiR2, andiR3, budiR3, poinAndi = 0, poinBudi=0;

        System.out.print("Kartu Andi: ");

        andiR1 = masuk.nextInt();
        andiR2 = masuk.nextInt();
        andiR3 = masuk.nextInt();
        masuk.nextLine();

        int [] andi = {andiR1,andiR2,andiR3};

        System.out.print("Kartu Budi: ");
        budiR1 = masuk.nextInt();
        budiR2 = masuk.nextInt();
        budiR3 = masuk.nextInt();

        if ((budiR1 >= 2 && budiR1 <=10) && (budiR2 >= 2 && budiR2 <=10) && (budiR3 >= 2 && budiR3 <=10) &&
                (andiR1 >= 2 && andiR1 <= 10) && (andiR2 >= 2 && andiR2 <=10) && (andiR3 >=2 && andiR3 <=10)) {
        int [] budi = {budiR1, budiR2, budiR3};
            int i = 0;
            while (i <= 2) {
                if (andi[i] > budi[i]) {
                    poinAndi++;
                } else  if (budi[i] > andi[i]) {
                    poinBudi++;
                }
                i++;
            }

            if (poinAndi > poinBudi) {
                System.out.println("Andi");
            } else if(poinBudi > poinAndi) {
                System.out.println("Budi");
            } else {
                System.out.println("Seri");
            } 
        }
        else {
                System.out.println("Invalid input kartu must be lebih dari 2 dan kurang dari 10 :)");
            }

        masuk.close();
    }
}
