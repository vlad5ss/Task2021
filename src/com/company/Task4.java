package com.company;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        String one = "(({{[[";					//false
        String two = "({[]})";					//true
        String three = "({)}[]";				//false
        String four = "({[]})))(({}{}";			//false
        String five = "()() {()}[][()]";		//true

        String[] tests = {one,two,three,four,five};

        for(String test : tests) {

            boolean isit = balanced(test);
            System.out.println(isit);

        }
    }

    private static boolean balanced(String str) {

        ArrayList<Character> array = new ArrayList<>();

        for(int i = 0; i < str.length(); i++ ) {

            switch(str.charAt(i)) {

                case '[': array.add('['); break;
                case ']': if(!array.isEmpty() && array.get(array.size()-1) == '[') {
                    array.remove(array.size()-1);
                }else return false;
                    break;

                case '(': array.add('('); break;
                case ')': if(!array.isEmpty() && array.get(array.size()-1) == '(') {
                    array.remove(array.size()-1);
                }else return false;
                    break;

                case '{': array.add('{'); break;
                case '}': if(!array.isEmpty() && array.get(array.size()-1) == '{') {
                    array.remove(array.size()-1);
                }else return false;
                    break;
            }
        }

        return (array.isEmpty())?  true:false;
    }
}
