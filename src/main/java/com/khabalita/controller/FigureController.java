
package com.khabalita.controller;

import com.khabalita.models.Circle;
import com.khabalita.models.Poligon;
import com.khabalita.models.Square;
import com.khabalita.models.Triangle;


public class FigureController {
    
    
    
    //METODOS FOR SQUARE
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
    
    //METODOS FOR  CIRCLE
    public Double calcAreaCircle(Double radius){
        Circle circle = new Circle(radius);
        Double areaCircle = circle.caclArea();
        return areaCircle;
    }
    
    public Double calcPerimeterCircle(Double radius){
        Circle circle = new Circle(radius);
        Double perimeterCircle = circle.calcPerimeter();
        return perimeterCircle;
    }
    
    //METODOS FOR TRIANGLE
    public Double calcAreaTriangle(Double base, Double height){
        Triangle triangle = new Triangle(base, height);
        Double areaTriangle = triangle.caclArea();
        return areaTriangle;
    }
    
    public Double calcPerimeterTriangle(Double base, Double side1, Double side2){
        Triangle triangle = new Triangle(base, side1, side2);
        Double perimeterTriangle = triangle.calcPerimeter();
        return perimeterTriangle;
    }
    
    //METODOS FOR POLIGON
    public Double calcAreaRegularPoligon(Double numberOfSide, Double lengthOfSide) throws Exception{
        Poligon poligon = new Poligon(numberOfSide, lengthOfSide);
        Double areaPoligon = poligon.caclArea();
        return areaPoligon;
    }
    
    public Double calcPerimeterRegularPoligon(Double numberOfSide, Double lengthOfSide) throws Exception{
            Poligon poligon = new Poligon(numberOfSide, lengthOfSide);
            Double perimeterPoligon = poligon.calcPerimeter();
            return perimeterPoligon;
    }
}
