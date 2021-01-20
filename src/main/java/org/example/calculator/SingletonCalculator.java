package org.example.calculator;

class SingletonCalculator
{
    private static SingletonCalculator single_instance = null;

    public IntCalculator calculator;


    private SingletonCalculator()
    {
        calculator=new IntCalculator();
        System.out.println("Inizializzata");
    }

    public static SingletonCalculator getInstance()
    {
        if (single_instance == null)
            single_instance = new SingletonCalculator();

        return single_instance;
    }
}
