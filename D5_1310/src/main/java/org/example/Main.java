package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//       String a = sample3();
//       System.out.println(a);
//
//       String b=sample4();
//       System.out.println(b);

//        sample5(6,7);
//        sample6("abc", "defg", "hijklmnop");

        sample7(4);

    }

    static void sample7(int a) {
        if (a < 1) {
            System.out.println("Kļūda");
        } else {
            for (int i = 0; i < a; i++) {
                System.out.println("&&&&");
            }
        }
    }

    static void sample6(String a, String b, String c){
        System.out.println(a+" "+b+" "+c);
    }

   static void sample5(int a, int b){
       System.out.println("Summa ir " + (a+b));
   }

    public static String sample4() {
        Scanner sc = new Scanner(System.in);


        String result = "";
        for (int i = 0; i <3; i++) {
            System.out.println("Lūdzu ievadi savu frāzi");
            String frāze = sc.nextLine();
            result= result+frāze+" ";
        }

        return result ;
    }


    public static String sample3(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Lūdzu, ievadiet pirmo frāzi");
        String frāze1=sc.nextLine();

        System.out.println("Lūdzu, ievadiet otro frāzi ");
        String frāze2=sc.nextLine();

        System.out.println("Lūdzu, ievadiet trešo frāzi ");
        String frāze3=sc.nextLine();

        String teikums= frāze1+ " " + frāze2 +" "+frāze3+" ";
        return teikums;


    }

    public static int sample2 (){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ievadiet skaitli!");
        int sk1=sc.nextInt();

        System.out.println("Ievadiet skaitli");
        int sk2=sc.nextInt();

        int result=sk1+sk2;
        return result;
    }

    public static void sample1(){
        System.out.println();
    }
}