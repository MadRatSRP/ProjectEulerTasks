package lab2;

import java.util.HashMap;



enum enumFigure
{
  RedSquare,
  BlueSquare,
  BlueTriangle,
  YellowTriangle,
  GreenCircle,
  NotFigure;

  static enumFigure getKey(Figure figure) {

    if (figure.type.equals("Квадрат") && figure.color.equals("Краный"))
      return enumFigure.RedSquare;

    if (figure.type.equals("Квадрат") && figure.color.equals("Синий"))
      return enumFigure.BlueSquare;

    if (figure.type.equals("Треугольник") && figure.color.equals("Синий"))
      return enumFigure.BlueTriangle;

    if (figure.type.equals("Треугольник") && figure.color.equals("Желтый"))
      return enumFigure.YellowTriangle;

    if (figure.type.equals("Круг") && figure.color.equals("Зеленый"))
      return enumFigure.GreenCircle;

    return enumFigure.NotFigure;
  }
}
