package com.madrat.pet;

public class Main {

    private static int sum = 0;

    public static void main(String[] args) {
        //printMultiplesOfThreeAndFiveFromTen();
        //printMultiplesOfThreeAndFiveFromOneHundred();
        printMultiplesOfThreeAndFiveFromOneThousand();
    }

    public static void printMultiplesOfThreeAndFiveFromTen() {
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.print(sum + "\n");
    }

    public static void printMultiplesOfThreeAndFiveFromOneHundred() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.print(sum + "\n");
    }

    public static void printMultiplesOfThreeAndFiveFromOneThousand() {
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                //System.out.print(i + "\n");
                sum += i;
                //System.out.print(sum + "\n");*/
            }
            System.out.print(sum + "\n");
        }
    }
}
