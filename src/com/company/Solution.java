package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        int n = s.length();

        if(n%2 != 0){
            return "NO";
        }

        Map<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put('{','}');
        brackets.put('[',']');
        brackets.put('(',')');

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < n; i++){

            if(brackets.get(s.charAt(i)) != null){
                stack.push(s.charAt(i));

            } else if(!brackets.get(stack.pop()).equals(new Character(s.charAt(i)))){
                return "NO";
            }
        }

        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
