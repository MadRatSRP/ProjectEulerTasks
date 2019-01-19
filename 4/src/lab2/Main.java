package lab2;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

      HashSet<Figure> hashSet = new HashSet<>();

      Figure f1 =new Figure("Треугольник", "Синий");
      Figure f2 =new Figure("Треугольник", "Желтый");

      hashSet.add(f1);
      hashSet.add(new Figure("Треугольник", "Красный"));
      hashSet.add(new Figure("Треугольник", "Синий"));

      hashSet.forEach(dd -> System.out.println(dd.color + " " + dd.type));

      HashMap<enumFigure, Figure> hashMap = new HashMap<>();

      hashMap.put(enumFigure.getKey(f1), f1);
      hashMap.put(enumFigure.getKey(f2), f2);

      System.out.println(hashMap.get(enumFigure.BlueTriangle).color + " "  + hashMap.get(enumFigure.BlueTriangle).type);

    }
}
