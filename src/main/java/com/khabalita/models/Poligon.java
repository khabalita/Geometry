
package com.khabalita.models;

import com.khabalita.interf.ICalculable;


public class Poligon implements ICalculable{
    private Double numberOfSide;
    private Double lengthOfSide;

    //Constructor
    public Poligon(){
    
    }
    
    public Poligon(Double numberOfSide, Double lengthOfSide){
        this.numberOfSide = numberOfSide;
        this.lengthOfSide = lengthOfSide;
    }
    
    //Getter y Setter
    public Double getNumberOfSide() {
        return numberOfSide;
    }

    public void setNumberOfSide(Double numberOfSide) {
        this.numberOfSide = numberOfSide;
    }
    
    public Double getLenghtOfSide(){
        return lengthOfSide;
    }
    
    public void setLengthOfSide(Double lengthOfSide){
        this.lengthOfSide = lengthOfSide;
    }
    
    public Double calcApotema() throws Exception{
        if(numberOfSide <= 2){
            throw new Exception("The number of side must be greater than 2");
        }
          return lengthOfSide / (2 * Math.tan(Math.PI / numberOfSide));
    } 
    
    @Override
    public Double caclArea() throws Exception {
        Double apotema = calcApotema();
        return ((getAreaFormula(numberOfSide) * apotema * lengthOfSide) / 2);
    }

    @Override
    public Double calcPerimeter() {
        Double resultPoligonPerimeter = (numberOfSide * lengthOfSide);
        return resultPoligonPerimeter;
    }
    
    private double getAreaFormula(Double numberOfSide){
        return (Math.PI * numberOfSide / (4 * Math.tan(Math.PI / numberOfSide)));
    }
    
}
