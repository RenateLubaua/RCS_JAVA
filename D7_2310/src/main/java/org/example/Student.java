package org.example;

public class Student {
    public String vārds;
    public String uzvārds;
    public int kurss;
    public String fakultāte;

    public void info(){
        System.out.println("Studenta vārds ir " + vārds);
        System.out.println("Studenta uzvārds ir " + uzvārds);
        if (kurss<1){
            System.out.println("Studenta kurss ir "+ 1);
        }else if (kurss>4) {
            System.out.println("Kļūda, pieejami 4 kursi, pārbaudiet ievadītos datus");
        }else{
            System.out.println(kurss);
        }
        System.out.println("Studenta Fakultāte ir " + fakultāte);
    }


    public Student(String vārds, String uzvārds, int kurss, String fakultāte) {
        this.vārds = vārds;
        this.uzvārds = uzvārds;
        this.kurss = kurss;
        this.fakultāte = fakultāte;
    }




}
