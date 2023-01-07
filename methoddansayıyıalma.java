package week13;

import java.util.Scanner;

public class methoddansayıyıalma {

    public static int incrementby(int num, int index) {
        num += index;
        return num;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi = 5 ;
        System.out.println("ARTTIRMADAN ÖNCE SAYI : "+sayi);
        sayi = incrementby(sayi,3);
        System.out.println("ARTTIRDIKTAN SONRA SAYI : "+sayi);
        System.out.println("--------------");
        int sayi2 =incrementby(28,3);
        System.out.println(sayi2);
        
    }

}
