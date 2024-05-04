
package com.khabalita.controller;

import com.khabalita.models.Circle;
import com.khabalita.models.Square;
import com.khabalita.models.Triangle;


public class FigureController {
    
    
    //METODOS DEL SQUARE
    public Double calcAreaSquare(Double base, Double height){
        Square square = new Square(base, height);
        Double areaSquare = square.caclArea();
        return areaSquare;
    }
    
    public Double calcPerimeterSquare(Double side){
        Square square = new Square(side);
        Double perimeterSquare = square.calcPerimeter();
        return perimeterSquare;
    }
    
    //METODOS DEL  CIRCLE
    public Double calcAreaCircle(Double radius){
        Circle circle = new Circle();
        Double areaCircle = circle.caclArea();
        return areaCircle;
    }
    
    public Double calcPerimeterCircle(Double radius){
        Circle circle = new Circle();
        Double perimeterCircle = circle.calcPerimeter();
        return perimeterCircle;
    }
    
    //METODOS DEL TRIANGLE
    public Double calcAreaTriangle(){
        Triangle triangle = new Triangle();
        Double areaTriangle = triangle.caclArea();
        return areaTriangle;
    }
    
    public Double calcPerimeterTriangle(){
        Triangle triangle = new Triangle();
        Double perimeterTriangle = triangle.calcPerimeter();
        return perimeterTriangle;
    }
}
