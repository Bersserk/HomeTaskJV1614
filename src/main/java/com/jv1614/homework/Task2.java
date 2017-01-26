
package com.jv1614.homework;

public class Task2 {

    public static final double rBig = 123.321321;                            // rBig - радиус описанной окружности
    public static final double pi = 3.141592653589793238462643;          // число Пи является константой
    public static final double r = 12.45;                                                   // r - радиус вписанной окружности
    
    public static void main (String [] args) {
    
        printFormula ();
    }
    
    public static void printFormula () {                                                                                                                                            
                                                                                          
               double s = pi*r*r;                                                                                // s - площадь окружности
               double c = 2*pi*r;                                                                               // C - длина окружности
               double sRing = pi*(rBig*rBig - r*r);                                                 // sRing - площадь кольца
               
               System.out.println("Circumference = " + c);
               System.out.println("The area of a circle = " + s);
               System.out.println("Square ring = " + s);
               
        }
    
}
