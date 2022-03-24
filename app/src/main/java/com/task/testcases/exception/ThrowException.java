package com.task.testcases.exception;

import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scan = new Scanner(System.in);
        char character = scan.next().charAt(0);
        System.out.println(NumberExceptionKt.usingThrowsNotation(character));
    }
}
