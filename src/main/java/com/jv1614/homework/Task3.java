
package com.jv1614.homework;

public class Task3 {

    
    public static void main (String [] args) {
        
        
          
         printFormula();        
    }
    
         static void printFormula () {
    
                  double h = 5.3;                     //   H - высота фигуры;      
                  
                  double a = 2.3;
                  double b = 3.4;
                  double c = 4.5;
                  double d = 3;                        //   длина стороны правильного многоугольник;
                  int n = 5;                               // количество сторон правильного многоугольника;

                  double vc = Task2.pi*Task2.rBig*Task2.rBig*h;                                     //  объем цилиндра
                  double  vpc = Task2.pi*h*(Task2.rBig*Task2.rBig-Task2.r*Task2.r);  //  объем полого цилиндра
                  double s = 2*Task2.pi*Task2.r*h;                                                            //  площадь боковой поверхности цилиндра не полого;
                  double v = 4*Task2.pi*Task2.rBig*Task2.rBig*Task2.rBig/3;               //  объем шара;
                  double ss = 4*Task2.pi*Task2.rBig*2;                                                    // Площадь поверхности шара
                  double sp = 2*(a*b+b*c+a*c);                                                                 //  площадь прямоугольного параллелепипеда;
                  double vp = a+b+c;                                                                                //  объем прямоугольного параллелепипеда;
                  
                  double p = d*n;                                                //  формула периметра правильного многоугольника;
                  double spu = Task2.r*p*0.5;                          // формула площади правильного многоугольника
                  double sPir = (0.5*spu*d*n)+spu;                  //  площадь всех сторон правильной пирамиды;
                  double vPir = (spu*h)/3;                                //  объем правильной пирамиды;
                          
            
                  System.out.println("Объем цилиндра = "+vc);
                  System.out.println("Объем полого цилиндра = "+vpc);
                  System.out.println("Площадь боковой поверхности цилиндра = "+s);   
                  System.out.println("Объем шара = "+v);   
                  System.out.println("Площадь поверхности шара = "+ss);   
                  System.out.println("Площадь прямоугольного параллелепипеда = "+sp);   
                  System.out.println("Объем прямоугольного параллелепипеда = "+vp);   
                  System.out.println("Площадь всех сторон правильной пирамиды = "+sPir);   
                  System.out.println("Объем правильной пирамиды = "+vPir);   
                  
    }
    
}
