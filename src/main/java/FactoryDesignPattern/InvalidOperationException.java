package FactoryDesignPattern;

public class InvalidOperationException extends Exception{
    public InvalidOperationException(String message) {
        super(message);
    }
}