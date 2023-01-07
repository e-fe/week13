package week13;

import java.util.Scanner;

public class methodkarelertoplami {

    public static void exp() {
        Scanner input = new Scanner(System.in);
        System.out.println("KACIN KARESİNE KADAR TOPLANSIN ?");
        int N = input.nextInt();
        System.out.println("--------------");
        int top = 0;
        for (int i = 0; i <= N; i++) {
            top += (int) Math.pow(i, 2);
            System.out.println(top);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        exp();
        
    }

}
