
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
        Circle circle = new Circle();
        Double areaCircle = circle.caclArea();
        return areaCircle;
    }
    
    public Double calcPerimeterCircle(Double radius){
        Circle circle = new Circle();
        Double perimeterCircle = circle.calcPerimeter();
        return perimeterCircle;
    }
    
    //METODOS FOR TRIANGLE
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
    
    //METODOS FOR POLIGON
    public Double calcApotema(Double numberOfSide, Double lengthOfSide) throws Exception{
        Poligon poligon = new Poligon();
        Double apotemaPoligon = poligon.calcApotema();
        return apotemaPoligon;
    }
    
    public Double calcAreaRegularPoligon() throws Exception{
        Poligon poligon = new Poligon();
        Double areaPoligon = poligon.caclArea();
        return areaPoligon;
    }
    
    public Double calcPerimeterRegularPoligon(Double numberOfSide, Double lengthOfSide) throws Exception{
        try{
            Poligon poligon = new Poligon();
            Double perimeterPoligon = poligon.calcPerimeter();
            return perimeterPoligon;
        }catch(Exception e){
            throw new Exception ("Error to get Perimeter of Regular Poligon");
        }
    }
}
