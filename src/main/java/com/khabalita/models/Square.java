package com.khabalita.models;

import com.khabalita.interf.ICalculable;

public class Square implements ICalculable{
    private Double side;
    private Double base;
    private Double height;

    //Consctructores
    public Square(){
    
    }
    
    public Square(Double side){
        this.side = side;
    }
    
    public Square(Double base, Double height){
        this.side = side;
        this.base = base;
        this.height = height;
    }
    
    public Square(Double side, Double base, Double height) {
        this.side = side;
        this.base = base;
        this.height = height;
    }

    //Getter y Setter
    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
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
        return 4 * side;
    }

}
