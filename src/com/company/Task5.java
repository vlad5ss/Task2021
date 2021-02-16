package com.company;

public class Task5 {

    public static void main(String[] args) {

        String one = "(({{[[";					//false
        String two = "({[]})";					//true
        String three = "({)}[]";				//false
        String four = "({[]})))(({}{}";			//false
        String five = "()() {()}[][()]";		//true

        String[] tests = {one,two,three,four,five};

        for(String test : tests) {

            boolean isit = isBalanced(test);
            System.out.println(isit);

        }
    }

    private static boolean isBalanced(String str) {
        if (null == str || ((str.length() % 2) != 0)) {
            return false;
        } else {
            char[] charArray = str.toCharArray();
            for (char c : charArray) {
                if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                    return false;
                }

            }
        }

        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        return (str.length() == 0);

    }
}
