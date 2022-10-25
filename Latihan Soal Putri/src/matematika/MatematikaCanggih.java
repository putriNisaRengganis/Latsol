/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

/**
 *
 * @author hp
 */
public class MatematikaCanggih {
    void pertambahan (int a, int b){
    System.out.println (a+" + "+b+" = "+(a+b));    
    }
    void pengurangan (int a, int b){
    System.out.println (a+" - "+b+" = "+(a-b));
}
    void perkalian (int a, int b){
        System.out.println (a+" * "+b+" = "+(a*b));
    }
    void pembagian (int a, int b){
        System.out.println (a+" / "+b+" = "+(a/b));
    }
    void modulus (int a, int b){
        System.out.println(a + " / " +b+" = " +(a%b));
    }
    
    //double 
    void pertambahan (double a, double b, double c){
        System.out.println (a+" + "+b+"  + "+c+ " = "+(a+b+c));  
    }
    void pengurangan (double a, double b, double c){
        System.out.println (a+" - "+b+"  - "+c+ " = "+(a-b-c)); 
    }
   void perkalian (double a, double b, double c){
       System.out.println (a+" * "+b+"  * "+c+ " = "+(a*b*c)); 
   }
   void pembagian (double a, double b, double c){
      System.out.println (a+" / "+b+"  / "+c+ " = "+(a/b/c)); 
   }
     void modulus (double a, double b, double c){
      System.out.println (a+" % "+b+"  % "+c+ " = "+(a%b%c));     
     }
}
