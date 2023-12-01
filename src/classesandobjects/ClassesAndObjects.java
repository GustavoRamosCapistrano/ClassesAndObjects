/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] circleRadiuses = {2,5,8};
        String[] cicleColours = {"yellow","green","pink"};
        
        
        
        Scanner sc = new Scanner(System.in);
        
        Rectangle rect3;
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(9,7,"blue", true);
        
        System.out.println(rect1.length);
        System.out.println(rect2.length);
        rect3 = new Rectangle(4,5,"red",false);
        
        System.out.println("testing new methods");
        System.out.println(rect1.calculateArea());
        System.out.println(rect2.calculateArea());
        System.out.println(rect3.calculateArea());
        System.out.println(rect1.calculateParimeter());
        System.out.println(rect2.calculateParimeter());
        System.out.println(rect3.calculateParimeter());
        Rectangle.calculateArea(5, 9);
        rect3.length = -2;
        
    }
    
}
