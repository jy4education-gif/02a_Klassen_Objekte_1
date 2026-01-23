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
        System.out.println(cat);  // Ausgabe der Referenzadresse im Speicher
        cat.meow(); // Aufruf der meow-Methode  

    }

}
