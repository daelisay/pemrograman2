/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author ACER
 */
public abstract class Shape {
    protected String shapeName;
    protected abstract double area();
    
    public Shape(String shapeName){
        this.shapeName = shapeName;
    }
    public String toString(){
        return this.shapeName;
    }
}
