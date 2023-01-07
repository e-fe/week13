package week13;

import java.util.Scanner;
import java.util.Random;

public class methodustsinirialinmisdiziyidonndurme {
    
    public static int[] randomarray(int ub , int N){
        Scanner input = new Scanner(System.in);
        int [] dizi = new int [N];
        Random r = new Random();
        for (int i = 0; i < N; i++) {
            dizi[i] = r.nextInt(ub);
        }
        return dizi ;
    }

     public static void main(String[] args){

     Scanner input = new Scanner(System.in);
     
     int[] dizi2 = randomarray(54,4);
         for (int i = 0; i < dizi2.length; i++) {
             System.out.println(dizi2[i]);
             
         }

    }

}
