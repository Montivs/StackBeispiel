package Aufgabe35;

import java.util.Scanner;

public class Console {

    static final Scanner in = new Scanner(System.in);

    static public int readIntegerFromStdIn(String text) {
        System.out.print(text + " ");
        int num = in.nextInt();
        return num;
    }

    static public String readStringFromStdIn(String text) {
        System.out.print(text + " ");
        // TODO: Read text from Stdin
        return "TestString";
    }

}