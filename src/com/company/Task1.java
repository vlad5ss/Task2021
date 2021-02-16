package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите целое число: ");

            if (scanner.hasNextInt()) {
                if (scanner.nextInt() > 7) {
                    System.out.println("Привет");
                }
            } else {
                System.out.println("Вы ввели не целое число!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
