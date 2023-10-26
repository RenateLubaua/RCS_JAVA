package org.example;

import java.util.Scanner;

public class Main {

    //globāls mainīgais, var izmantot visur
//    private static int a = 3;

    public static void main(String[] args) {

        Student s1 = new Student("Renāte", "Lubaua", 3, "Programmēšanas pamati");
        s1.info();

        System.out.println("---------------------------");

        Book grāmata = new Book("Aleksandrs", "Grīns", "Dvēseļu Putenis", 1934 );
        grāmata.info();

        int gadi = Book.Vecums(1934);
        System.out.println("Grāmatas vecums ir: " + gadi + " gadi");
    }



public static void Samples(){

//        System.out.println(a);

        Scanner sc = new Scanner(System.in);

        Rectangle rec1 = new Rectangle(2,5,2,5);

        System.out.println(rec1.perimeter());

        Rectangle rec2 = new Rectangle(20,50,20,50);
        System.out.println(rec2.perimeter());

        sampleVar();
    }
        public static void sampleVar(){
            int a = 5; //izvadīs lokālo nevis globālo
            System.out.println(a);
        }



//        //static
//        SampleClass.sample2();
//
//        //non static --> Objekts
//        SampleClass sampleObject = new SampleClass();
//        sampleObject.sample1();


    }

