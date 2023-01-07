package week13;

import java.util.Scanner;

public class methodlar {
    
    public static void firstmethod(){       // VOİD------>TİPİ FİRSTMETHOD----> ADI  ()---->PARAMETRE LİSTESİ
        System.out.println("PROGRAM BAŞLANGICI / SONU");
    }
    public static void numsum(int num1 , int num2){
        int result = num1+num2;
        System.out.println("result : "+result);
    }
    public static void numplusone(int num1){
        int result = num1+1;
        System.out.println("result : "+result);
    }
    
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        firstmethod();
        int a = 3 , b = 5 ;
        int c = 3+5;
        System.out.println(c);
        firstmethod();
        System.out.println("---------------");
        numsum(a,b);
        numsum(2,3);
        System.out.println("---------------");
        numplusone(30);
        System.out.println("---------------");
        
        
        

    }

}
