package main;

public class ExampleSingleton {
    static int accessCount = 0;
    static ExampleSingleton singletonInstance = new ExampleSingleton();

    public ExampleSingleton() {
        System.out.println("I, the ExampleSingleton, am being created");
    }

    public static ExampleSingleton getInstance() {
        accessCount++;
        return singletonInstance;
    }

    public int accessCount() {
        System.out.println("The sole instance of ExampleSingleton is being retrieved");
        return accessCount;}
}
