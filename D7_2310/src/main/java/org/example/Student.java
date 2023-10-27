package org.example;

public class Student {
    public String vārds;
    public String uzvārds;
    public int kurss;
    public String fakultāte;

    public void info(){
        System.out.println("Studenta vārds: " + vārds);
        System.out.println("Studenta uzvārds: " + uzvārds);
        System.out.println("Studenta kurss: "+ kurss);
        System.out.println("Studenta Fakultāte: " + fakultāte);
    }


    public Student(String vārds, String uzvārds, int kurss, String fakultāte) {
        this.vārds = vārds;
        this.uzvārds = uzvārds;

        if (kurss>4){
            this.kurss =4;
        }else if (kurss<1){
            this.kurss=1;
        }else{
            this.kurss=kurss;
        }
        this.fakultāte = fakultāte;
    }




}
