package com.company.Figures;

import com.company.Figure;

public class Triangle implements Figure {

    private String color;
    private final String type = " Triangle";

    public Triangle(String color){
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
