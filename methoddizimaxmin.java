package week13;

import java.util.Scanner;

public class methoddizimaxmin {
    
    public static void maxminnum(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("DİZİ UZUNLUĞU");
        int x = input.nextInt();
        int [] nums = new int [x];
        int top = 0 ;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("DİZİNİN "+(i+1)+" . İNDİSİ : ");
            nums [i] = input.nextInt();
            
        }
        int max = 0 ; int min = nums[0] ;
        int maxin = 0; int minin = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max=nums[i];
                maxin=i;
            }
            if (nums[i]<min) {
                min=nums[i];
                minin=i;
            }
            
        }
            System.out.println("MAX SAYI : "+ max+" MAX SAYININ İNDİSİ : "+(maxin+1)+" MİN SAYI : "+min+" MİN SAYI İNDİSİ : "+(minin+1));
    }

     public static void main(String[] args){

     Scanner input = new Scanner(System.in);
     maxminnum();
     

    }

}
