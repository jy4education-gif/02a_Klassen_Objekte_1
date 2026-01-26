package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /*
       *    1. Iteration
       *    Instanziierung  --> 
       *    Erzeugen eines Objektes durch Aufruf eines Konstruktors
       *    Objekt <---> Instanz
       *    cat --> Referenzvariable
       *    Cat --> Referenztyp(Klasse)
       * 
       */

        Cat cat = new Cat();  // default - Konstruktor
        output("Blick von aussen auf cat: " + cat);  // Ausgabe der Referenzadresse im Speicher
        cat.meow(); // Aufruf der meow-Methode
        output("-----------------------");
       
        Cat cat2 = new Cat();  // default - Konstruktor
        output("Blick von aussen auf cat2: " + cat2);  // Ausgabe der Referenzadresse im Speicher
        cat2.meow(); // Aufruf der meow-Methode
        output("-----------------------");

        output("Test_01");

    }
        public static void output(String outputString) {
        System.out.println(outputString);   
    }   
}
