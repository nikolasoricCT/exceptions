package com.example.exceptions;
import java.lang.Exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exception2 {
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

        //Custom Exception
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a number, But not lower then 5 otherwise it will BREAK!! ");
        try {
            int input = enter.nextInt();
            if (input < 5) {
                throw new WrongNumberException();
            } else {
                System.out.println(input);
            }
        }catch (WrongNumberException exception) {
            System.out.println(exception.getMessage());
        }
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
