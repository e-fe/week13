package week13;

import java.util.Scanner;

public class methodasallıkbakma {
    public static void exp(){
        Scanner input = new Scanner(System.in);
        System.out.println("ASALLIGINN KONTROL EDILMESINI ISTEDIGINZI SAYI : ");
        int N = input.nextInt();
        int sayac = 0 ;
        for (int i = 2; i < N; i++) {
            if(N%i==0){
                sayac++;
            }
        }
        if (sayac>0) {
            System.out.println("SAYI ASAL DEGİLDİR");
        }else{
            System.out.println("SAYI ASALDIR");
        }
        
        
    }
    
    

     public static void main(String[] args){

     Scanner input = new Scanner(System.in);
     
     exp();
     
     

    }

}
