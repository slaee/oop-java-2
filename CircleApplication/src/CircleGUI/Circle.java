/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircleGUI;

/**
 *
 * @author sly
 */
public class Circle {
    private double radius;
    
    public Circle(){}
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        return (Math.PI * Math.pow(radius, 2));
    }
    
    public double getCircumference(){
        return 2 * radius * Math.PI;
    }
}
