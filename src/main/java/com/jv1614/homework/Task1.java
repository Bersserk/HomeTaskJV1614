
package com.jv1614.homework;

public class Task1 {
    
    public static void main (String[] args) {
         
         printText ();    
         printPersonalData ();    
         
        
    }
    
        static void printText () {  
        
        String a = "Here ";
        String b = "some ";
        String c = "text";
    
          System.out.println("Задание 1: Hello all");
          System.out.println("Задание 2: " + a + b + c);
          System.out.println("Задание 3:");
      }    
    
        static void printPersonalData () {
       
        String a = "Full name:  Zakhozhiy Oleg Yurievich";
        String b = "number group:  JV1614";
        String c = "training time:  TH 19.00, SU 09.00";
        int d = 1;
        int e = 2;
        int f = 3;
        
        System.out.println(d + ".  " + a );
        System.out.println(e + ".  " + b);
        System.out.println(f + ".  " + c);
    }
    
        
}
