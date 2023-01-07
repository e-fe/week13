package week13;

import java.util.Scanner;
import java.util.Random;

public class ikiboyutludiziyibirboyuttatopla {

    public static void exp(int lb, int ub, int rs) {
        Scanner input = new Scanner(System.in);
        Random R = new Random();
        int[][] dizi = new int[ub][ub];
        int[][] dizi2 = new int[ub][ub];
        int[] tdizi = new int[(int) Math.pow(ub,2)];
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                dizi[i][j] = R.nextInt(rs);
            }
        }
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                dizi2[i][j] = R.nextInt(rs);
            }
        }
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                tdizi[i] = dizi[i][j]+dizi2[i][j];
            }
        }
        
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                System.out.println("BİRİNCİ DİZİNİN");
                System.out.println("DİZİNİN "+(i+1)+" . SATIRI "+(j+1)+" . SÜTUNU");
                System.out.println(dizi[i][j]);
            }
        }
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                System.out.println("İKİNCİ DİZİNİN");
                System.out.println("DİZİNİN "+(i+1)+" . SATIRI "+(j+1)+" . SÜTUNU");
                System.out.println(dizi2[i][j]);
            }
        }
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                System.out.println("ÜCÜNCÜ DİZİNİN");
                System.out.println("DİZİNİN "+(i+1)+" . SATIRI "+(j+1)+" . SÜTUNU");
                System.out.println(tdizi[i]);
            }
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("NxN DEGERİ İÇİN N DEGERİ : ?");
        int ub = input.nextInt();
        System.out.println("DİZİNİN DEGERLERİ KAÇA KADAR RANDOM ALINSIN ? ");
        int rs = input.nextInt();
        exp(0, ub, rs);

    }

}
