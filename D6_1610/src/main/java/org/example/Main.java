package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        sample1(7);
//        Samples.uzdevums();

//        int result = Samples.uzdevums2();
//        System.out.println(result);

//        Samples.uzdevums3("aa", "bbb", "cccc");

//        int result =Samples.uzdevums4(3,5);
//        System.out.println(result);

//        int result = Tasks.task2();
//        System.out.println("Jūsu ievadītais skaitlis ir "+result);

//        int result=Tools.Power(3, 3);
//        System.out.println(result);

        double result1 = Geometrija.triangle(5, 6,9);
        System.out.println("Trīsstūra perimetrs ir " +result1);
        double result2 = Geometrija.quad(5,5,7,6);
        System.out.println("Četrstūra perimetrs ir " +result2);

    }

    static void sample1(int a) {
        if (a % 2 == 0) {
            System.out.println("A ir Pāra skaitlis");
        } else {
             System.out.println("A ir Nepāra skaitlis");
        }
    }
}