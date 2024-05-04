package com.khabalita.models;

import com.khabalita.interf.ICalculable;

public class Circle implements ICalculable{
    
    private Double radius;
    private static final Integer POW = 2; //variable estatica final para darle un valor a POW

    //Constructor
    public Circle(){
    
    }
    
    public Circle(Double radius) {
        this.radius = radius;
    }
    
    //Getter y Setter
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    //Metodos especificos de clase
    @Override
    public Double caclArea() {
        return ((Math.PI * radius) *getSQRT(2)) ;
    }

    @Override
    public Double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    //Metodo para devolver el cuadrado de un numero
    public Double getSQRT(Integer number){
        return Math.pow(number, POW);
    }
}
