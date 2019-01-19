package lab2;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Union;

import javax.lang.model.type.UnionType;

public class UnionFigureDraw {

//интр фигура, взять тип цвет рисовать парочка наследников класс который будет рисовать все фигуры - будет вызывать метод рисовать из интерфейса
//есть класс F<T>, он наследуется от Draw
//есть enum, в нем исп instanceof Figure.class
//в классе надо использовать методы equals и hashcode
//hashSet, set - коллекция, в которую будут входить классы F, enum используется для определения типа Figure
//Если enum корректный, рисуем. Если нет - нет.
//по объекту получаем его номер
//на входе set из многих типов(повторяющиеся), на выходе enum и тип фигуры
//треугольники-

    /*hashcode()
     equals() - сравнивает свойства объекта, чтобы выбрать из них уникальные  */
}
