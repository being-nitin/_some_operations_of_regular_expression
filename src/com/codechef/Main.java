package com.codechef;
import java.util.regex.*;
public class Main {

    public static void main(String[] args) {
	/*
	Regular Expression;
	 */
        // it will return true or false according to the matching of string:

        System.out.println(Pattern.matches("nitin","nitin"));

        /* . means that there can be any number of characters and second place is filled with
        s which means the length will be two and the second character should be s,
        will return true if the format of another string will same and false if not:
         */

        System.out.println(Pattern.matches(".s","as"));
    }
}
