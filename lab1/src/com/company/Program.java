package com.company;

import java.util.*;
import static java.lang.System.*;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        out.print("Введите строку, которую нужно проверить\n");
        String example = scan.nextLine();
        scan.close();

        Result.returnResult(example);
    }

}
