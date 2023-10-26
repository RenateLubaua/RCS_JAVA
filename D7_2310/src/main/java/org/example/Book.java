package org.example;

public class Book {
    public String vārds;
    public String uzvārds;
    public String nosaukums;
    public int gads;

    public void info() {
        System.out.println("Autora vārds: " + vārds);
        System.out.println("Autora uzvārds: " + uzvārds);
        System.out.println("Grāmtas nosaukums: " + nosaukums);
        System.out.println("Grāmtas izdošanas gads: " + gads);
    }
    public Book (String vārds, String uzvārds, String nosaukums, int gads){
        this.vārds=vārds;
        this.uzvārds=uzvārds;
        this.nosaukums=nosaukums;
        this.gads=gads;
        }
        public static int Vecums(int gads){
        return 2003-gads;

        }
    }

