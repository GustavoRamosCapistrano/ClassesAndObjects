/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjects;

/**
 *
 * @author Gustavo
 */
public class Rectangle {
    //variables
    static String shapeType = "rectangle";
    private int length;
    private int width;
    private String colour;
    private boolean isFilled;

    
    //getting and setting for the Rectangle
    public static String getShapeType() {
        return shapeType;
    }

    public static void setShapeType(String shapeType) {
        Rectangle.shapeType = shapeType;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("length must be positive");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("width must be positive");
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public Rectangle() {
        length = 10;
        width = 25;
        colour = "red";
        isFilled = false;
    }

    //method overloading - same method name, different input parameters
    //they can do different things
    public Rectangle(int length, int width, String colour, boolean isFilled) {
        this.length = length;
        this.width = width;
        this.colour = colour;
        this.isFilled = isFilled;
        System.out.println("Made a cool new rectangle!! its colour is: " + colour);
    }

    public Rectangle(int length, int width, String colour) {
        this.length = length;
        this.width = width;
        this.colour = colour;
        this.isFilled = true;
    }

    public int calculateArea() {
        return length * width;

    }

    public int calculateParimeter() {
        return 2 * (length + width);
    }

    public static int calculateArea(int length, int width) {
        return length * width;
    }
    //calculating Parameter
    public int calculateParimeter(){
        return 2*(length + width);
}
