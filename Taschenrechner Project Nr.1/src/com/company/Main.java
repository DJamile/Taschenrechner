package com.company;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main <Taschenrechner> {

        public static void main(String[] args) {
            System.out.println("Bitte geben Sie zwei Zahlen ein:");    // Mit welchen beiden Zahlen soll gearbeitet werden?
            Scanner sc = new Scanner(System.in);  //  Ermöglicht es mir generell einen Input zu geben
        int numberOne = sc.nextInt(); // Die erste Zahl die dann reingeschrieben wird wird mit numberOne definiert.
        int numberTwo = sc.nextInt (); // Die zweite Zahl die dann reingeschrieben wird wird mit numberTwo definiert.
        System.out.println("Zahl eins = " + numberOne);  // Beim Ergebnis gibt er dann wieder mit welchen beiden Zahlen gearbeitet wurde.
        System.out.println("Zahl zwei = " + numberTwo);  // Beim Ergebnis gibt er dann wieder mit welchen beiden Zahlen gearbeitet wurde.
        String operator = sc.next(); // erlaubt es Java auch input von mir anzunehmen
        int result = 0;
        switch(operator){
            case "+":
                result = Addieren(numberOne,numberTwo);
                break;
            case "-":
                result = Subtrahieren(numberOne, numberTwo);
                break;
            case "*":
                result = Multiplizieren(numberOne,numberTwo);
                break;
            case "/":
                result = Dividieren(numberOne,numberTwo);
                break;
            case "^":
                result = Hoch(numberOne,numberTwo);
                break;
        }
        if (result != 0){
            System.out.println("Ergebnis =" + result);
        } else {
            System.out.println("Ich kann nicht durch 0 dividieren.");
        }
    }
    private static int Addieren(int one, int two) { // private ermöglicht den Zugriff auf die Variable innerhalb der Klasse
        int result = one + two;
        return result;
    }
    private static int Subtrahieren(int one, int two){
        int result = one - two;
        return result;
    }
    private static int Multiplizieren(int one, int two){
        int result = one * two;
        return result;
    }
    private static int Dividieren(int one, int two){
        if (two == 0){
            return 0;
        }
        int result = one / two;
        return result;
    }
    private static int Hoch( int one, int two){
        int result = one * one;
        return result;
    }
}

