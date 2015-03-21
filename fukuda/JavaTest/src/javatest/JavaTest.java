/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author owner
 */
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outputprint();
        //outputprint2();
        
        if (outputprint4()) {
            System.out.println(outputprint3(19));
        }
    }
    
    static void outputprint() {
        System.out.println("Hello World !!");
        System.out.println("Hello World 2!!");
    }
   
    static void outputprint2(){
        int a = 10;
        int b = 100;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
    static double outputprint3(int a) {
        double b=0;
        if(a >= 10) {
            b = 3.45;
        }
        else if(a > 0 && a < 10){
            b = 5.45;
        }
        return b;
    }
    
    static boolean outputprint4(){
        boolean ret = true;

       
        return ret;
    }
}
