package week13;

import java.util.Scanner;
import java.util.Random;

public class methodikiboyutlubirdiziyirandomladondurme {

    public static void exp(int lb, int ub,int rs) {
        Scanner input = new Scanner(System.in);
        Random R = new Random();
        int[][] dizi = new int[ub][ub];
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                dizi[i][j] = R.nextInt(rs);
            }
        }
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                System.out.println("DİZİNİN "+(i+1)+" . SATIRI "+(j+1)+" . SÜTUNU");
                System.out.println(dizi[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("NxN BOYUTLU DİZİ İÇİN N DEGERİ: ?");
        int ub = input.nextInt();
        System.out.println("DİZİNİN ELEMANLARI KAÇA KADAR RANDOM VERILSIN");
        int rs = input.nextInt();
        exp(0,ub,rs);

    }

}
