package com.example.exceptions;

public class WrongNumberException extends Exception{
    public WrongNumberException(){
        super("You didnt listened to me :(");
    }
    public WrongNumberException(String message){
        super(message);
    }
}
