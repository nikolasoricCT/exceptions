package com.example.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception {
    public static void main (String[] args) {
        int [] array = { 10, 20, 30, 40, 50};
        //Unchecked exceptions - checked in the runtime
        try {
            int calculate = array[1] / 0;       //this will throw DivideByZero

            System.out.println(array[5]);       //this will throw ArrayOutOfBound
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException exception) //we declared 2 exceptions in one block
        {
            System.out.println(exception);
        }

        readFile("nikola.txt");    //calling the function
    }

    // Checked exception - checks while compiling
    private static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException ex)
        {
            System.out.println(ex);
        }
    }
}
