package week13;

import java.util.Scanner;

public class methoddowhile {
    
    public static int dowhile(){
        Scanner input = new Scanner(System.in);
        int sayi;
        do{
        System.out.println("0-100 ARASINDA SAYI GİR");
        sayi = input.nextInt();
        }while(sayi>100 || sayi<0);
        return sayi;
    }
    public static int dowhile(int lb , int ub){
        Scanner input = new Scanner(System.in);
        int max = ub;int min = lb;
        int sayi;
        do{
        System.out.println(min+"İLE"+max+" ARASINDA SAYI GİR");
        sayi = input.nextInt();
        }while(sayi>ub || sayi<lb);
        return sayi;
    }

     public static void main(String[] args){

     Scanner input = new Scanner(System.in);
         System.out.println("DİZİ BOYUTUNU GİR");
         int x = input.nextInt();
         int [] dizi = new int[x];
         for (int i = 0; i < x; i++) {
             System.out.println("DİZİNİN "+(i+1)+" . İNDİSİNİ GİR");
             dizi[i]= dowhile(6,41);
             
         }

    }

}
