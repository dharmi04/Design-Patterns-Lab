package com.shapes;

public class AreaOfShapes {
    public Area getInstance(String str){
        if(str.equals("Square")){
            return new Square();
        }
        else if(str.equals("Rectangle")){
            return new Rectangle();
        }
        else if(str.equals("Circle")){
            return new Circle();
        }

        else{
            return new Triangle();
        }
       
    }
}
