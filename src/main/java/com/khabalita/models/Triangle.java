package com.khabalita.models;

import com.khabalita.interf.ICalculable;

public class Triangle implements ICalculable{
    private Double side1;
    private Double side2;
    private Double base;
    private Double height;

    //Constructor
    public Triangle(){
    
    }
    
    public Triangle(Double base, Double height){
        this.base = base;
        this.height = height;
    }
    
    
    public Triangle(Double side1, Double side2, Double base){
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
    }
    
    public Triangle(Double side1, Double side2, Double base, Double height){
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
    }
    

    //Getter y Setter
    public Double getSide1() {
        return side1;
    }

    public void setSide1(Double side) {
        this.side1 = side;
    }
    
    public Double getSide2() {
        return side2;
    }

    public void setSide2(Double side) {
        this.side2 = side;
    }
    
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double caclArea() {
        return base * height;
    }

    @Override
    public Double calcPerimeter() {
        return base + side1 + side2;
    }
}
