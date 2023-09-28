package Letcode;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n,r;
                 int factorial= 1;
                 int factorial2=1;
                 int factorial3=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Kombinasyonu hesalanacak ilk sayıyı giriniz. (C(n,r) şeklinde olacak biçimde n'i girin.) : ");

        n= sc.nextInt();
        System.out.println("Kombinasyonu hesaplanacak 2. sayıyı giriniz (C(n,r) şeklinde olacak biçimde r'i girin.)");
        r=sc.nextInt();
        int a=n-r;
        while(n !=1){
             factorial *=n;
             n--;
        }
        while(r!=1){
            factorial2 *=r;
            r--;
        }
       while(a!=1){
            factorial3 *=a;
            a--;
        }
        int combination=factorial/(factorial2*factorial3);

        System.out.println(" Kombinasyon : " + combination);


    }
}
