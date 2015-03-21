/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fproject;

/**
 *
 * @author User01
 */
public class FJava {  //FJavaクラス
    /**
     Java勉強会　2015/03/21
     */
    //(1)メンバ変数aの変数
    int a = 10;
    
    public static void main(String[] args) {
    //mainメソッド
        //(2)ローカル変数xの変数
        int x = 20;
        FJava aaa = new FJava();
        aaa.show();

        System.out.println("Hello World!!");
    }
    
    void show(){
        //(3)ローカル変数yの宣言
        int y = 30;
        //(4)メンバ変数aの参照
        System.out.println("変数aは" + a + "です。");
        // Integer.toString
        System.out.println(Integer.toString(y));

    }
    }
}
