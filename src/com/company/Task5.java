package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Task5 {
    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c: s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else if (stack.isEmpty()) return "Нету баланса";
            else if (c == ')' && stack.pop() != '(') return "Нету баланса";
            else if (c == '}' && stack.pop() != '{') return "Нету баланса";
            else if (c == ']' && stack.pop() != '[') return "Нету баланса";
        }

        return stack.isEmpty() ? "Есть баланс" : "Нету баланса";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        try {
            System.out.print("Введите последовательность число([((())()(())]]): ");
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            System.out.println(result);
        }

        scanner.close();

    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        scanner.close();
    }
    }
}
