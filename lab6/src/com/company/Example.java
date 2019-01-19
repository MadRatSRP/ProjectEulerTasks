package com.company;

import jdk.nashorn.internal.ir.annotations.Reference;

public class Example {

    private String word = "Hello World";

    public Integer number = 10;

    protected Character symbol = 'N';

    @Reference
    private String getWord() {
        Program.sb.append("\nСтарое значение переменной word = " + word);
        return word;
    }

    public void setSymbol(Character symbol) {

        this.symbol = symbol;
    }

    public void setNumber(Integer number) {

        this.number = number;
    }

    //1//несколько полей, несколько методов
    //через get вывести всю инфу о нем
    //2//в приватное свойство значение
    //вывести значение

    //invoke

    //вся информация о классе
    //в поле записать значение в приватное поле по названию поля
    //по названию получить информацию

    //есть какой то метод начинающийся на show он его найдет и этот метод выведет новое значение,
    //которое мы присвоим приватному полю
}
