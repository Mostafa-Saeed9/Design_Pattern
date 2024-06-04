package FactoryDesignPattern;

public interface OperationFactory {
    Operation getInstance(int choice) throws InvalidOperationException;
}
