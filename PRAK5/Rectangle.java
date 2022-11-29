/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author ACER
 */
public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(double l, double w){
        super("Rectangle");
        this.length = l;
        this.width = w;
    }
    
    public double area(){
        return length*width;
    }
    
    public String toString(){
        return super.toString() + " of length " + this.length + " and width "+ this.width;}
}
