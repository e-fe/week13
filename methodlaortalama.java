package week13;

import java.util.Scanner;

public class methodlaortalama {
    
    public static void avrgofnums(){
        Scanner input = new Scanner(System.in);
        System.out.println("DİZİ UZUNLUĞU");
        int x = input.nextInt();
        int [] nums = new int [x];
        int top = 0 ;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("DİZİNİN "+(i+1)+" . İNDİSİ : ");
            nums [i] = input.nextInt();
            top += nums[i];
        }
        double ort = top/x;
        System.out.println("TOPLAMI : "+ top + " ORTALAMASI : "+ort);
    }

     public static void main(String[] args){

     Scanner input = new Scanner(System.in);
     avrgofnums();

    }

}
