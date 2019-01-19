package com.company.Figures;

import com.company.Figure;

public class Square implements Figure {

    private String color;
    private final String type = " Square";

    public Square(String color){
        this.color = color;
    }

    public String GetType() {
        return type;
    }

    public String GetColor(){
        return color;
    }

    public String Draw(){
        return GetColor() + GetType();
    }
}
