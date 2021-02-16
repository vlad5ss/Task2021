package com.company;

/*
3.	Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 */

public class Task3 {

    private static int[] arrNumbers = {100, 234, 133, 34, 5 ,233,333,321,335,339,343,342};

    public static void main(String[] args) {

        System.out.println("Исходные элементы массива");

        for (int i = 0; i < arrNumbers.length; i++) {
            printArrElements(i);
        }

        System.out.printf("%n%n");
        System.out.println("Элементы массива, кратные 3");

        for (int i = 0; i < arrNumbers.length; i++) {
            if ((arrNumbers[i] % 3) == 0) {
                printArrElements(i);
            }
        }
    }

    private static void printArrElements (int i){
        if (i == (arrNumbers.length - 1)) {
            System.out.print(arrNumbers[i] + ".");
        } else {
            System.out.print(arrNumbers[i] + "; ");
        }
    }
}
