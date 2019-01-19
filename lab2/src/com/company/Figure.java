package com.company;

public interface Figure {

    String GetType();

    String GetColor();

    default String Draw() {
        return GetColor() + GetType();
    }


    /*hashcode()
     equals() - сравнивает свойства объекта, чтобы выбрать из них уникальные  */
}
