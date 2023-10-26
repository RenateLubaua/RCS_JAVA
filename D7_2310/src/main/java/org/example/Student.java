package org.example;

public class Student {
    public String vārds;
    public String uzvārds;
    public int kurss;
    public String fakultāte;

    public void info(){
        System.out.println("Studenta vārds: " + vārds);
        System.out.println("Studenta uzvārds: " + uzvārds);
        if (kurss<1){
            System.out.println("Studenta kurss: "+ 1);
        }else if (kurss>4) {
            System.out.println("Studenta kurss: Kļūda, pieejami 4 kursi, pārbaudiet ievadītos datus");
        }else{
            System.out.println("Studenta kurss: "+ kurss);
        }
        System.out.println("Studenta Fakultāte: " + fakultāte);
    }


    public Student(String vārds, String uzvārds, int kurss, String fakultāte) {
        this.vārds = vārds;
        this.uzvārds = uzvārds;
        this.kurss = kurss;
        this.fakultāte = fakultāte;
    }




}
