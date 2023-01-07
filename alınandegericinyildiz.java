package week13;

import java.util.Scanner;

public class alınandegericinyildiz {

    public static void exp(int sa ) {

        for (int i = 0; i <=sa ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <=sa; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("SATIR SAYISI");
        int sa = input.nextInt();
        exp(sa);

    }

}
