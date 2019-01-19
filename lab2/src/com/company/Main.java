package com.company;

import com.company.Figures.Circle;
import com.company.Figures.Square;
import com.company.Figures.Triangle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class Main  {

    public static List<Figure> figure = new ArrayList<Figure>();
    //public static HashSet<Figure> figures = new HashSet<Figure>();


    public static void main(String[] args)  {
        figure.add(new Square("Red"));
        figure.add(new Circle("Blue"));
        figure.add(new Triangle("Black"));
        DrawAll();

        //HashSet<String> figures = new HashSet<String>();
        /*figures.add("Квадрат");
        figures.add("Круг");
        figures.add("Квадрат");*/

        /*figures.add(new Square("Red"));
        figures.add(new Square("Red"));
        figures.add(new Circle("Yellow"));

        Stream.of(figures)
                .distinct()
                .forEach(i -> System.out.print("" + i));*/
    }


    public static void DrawAll(){
        for (Figure f : Main.figure) {
            System.out.println(f.Draw());
        }
    }
}

