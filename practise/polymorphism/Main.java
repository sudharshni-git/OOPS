class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    private double add(double a, double b) {
        return a + b;
    }

    public void displayDoubleSum(double a, double b) {
        double result = add(a, b);
        System.out.println("Sum of Decimal: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        calc.displayDoubleSum(5.5, 4.5);
    }
}