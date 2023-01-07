package week13;

import java.util.Scanner;

public class methoddizisıralama {
    public static int exp(){
        Scanner input = new Scanner(System.in);
        System.out.println("DİZİ KAÇ ELEMANLI OLSUN");
        int N = input.nextInt();
        int [] dizi = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("DİZİNİN "+(i+1)+". İNDİSİ : ");
            dizi[i]=input.nextInt();
        }
        int max = 0 ; int min = 0;
        for (int i = 0; i < N; i++) {
            
            for (int j = 0; j < 10; j++) {
                if (dizi[i]>max) {
                    max = dizi[i];
                }
                
            }
        }
        return N ;
    }

     public static void main(String[] args){

     Scanner input = new Scanner(System.in);
     
     exp();

    }

}
