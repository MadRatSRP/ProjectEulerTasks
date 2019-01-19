package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Program {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{

        try {
            Class example = Class.forName("com.company.Example");
            Example obj = new Example();

            int i = example.getModifiers();
            String j = Modifier.toString(i);

            sb.append("Имя пакета = " + example.getPackage());

            sb.append("\nИмя класса = " + example.getSimpleName());

            sb.append("\nМодификатор класса = " + j);

            Field f = obj.getClass().getDeclaredField("word");
            f.setAccessible(true);
            String string_value = (String) f.get(obj);
            sb.append("\nЗначение private переменной = " + string_value);

            f = obj.getClass().getDeclaredField("symbol");
            f.setAccessible(true);
            Character char_value = (Character) f.get(obj);
            sb.append("\nЗначение protected переменной = " + char_value);

            f = obj.getClass().getDeclaredField("number");
            f.setAccessible(true);
            Integer integer_value = (Integer) f.get(obj);
            sb.append("\nЗначение public переменной = " + integer_value);

            //Вызов приватного метода
            Method method = Example.class.getDeclaredMethod("getWord");
            method.setAccessible(true);
            method.invoke(obj);

            //Изменение значения private переменной
            Field m = Example.class.getDeclaredField("word");
            m.setAccessible(true);
            m.set(obj, "keepo");
            //System.out.print(f.get(obj));
            sb.append("\nНовое значение переменнной word = " + m.get(obj));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(sb);

    }
}

//f4
//alt f8
///ctrl+ /
