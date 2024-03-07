package unit9;

/**
 * Instructions:
 * Create a class that supports the basic four functions of a calculator.
 * Methods:
 * add(double a, double b), add()
 * multiply(double a, double b), multiply()
 * divide(double a, double b), divide() -- check for zero in divisor
 * subtract(double a, double b), subtract()
 *
 * Getters:
 * double[] getArguments() -- return arguments in a two elements array arg[0] - a, arg[1] - b
 *
 * Setters:
 * void setArguments(double a, double b)
 *
 *
 * Your class should retain the last two numbers passed for subsequent no
 * argument method calls.
 *
 * Constructors:
 * Calculator()
 * Calculator(double a, double b)
 *
 * Write a main method that exercises all the class's functionality.
 */

public class CalculatorClassAssignmentSolution {

    private double a;
    private double b;

    CalculatorClassAssignmentSolution() {
        double a = 0;
        double b = 0;
    }

    CalculatorClassAssignmentSolution(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double add (double x, double y) {
        a = x;
        b = y;
        return a + b;
    }
    double add() {
        return a + b;
    }

    double subtract (double x, double y) {
        a = x;
        b = y;
        return a - b;
    }

    double subtract() {
        return a - b;
    }

    double divide (double x, double y) {
        a = x;
        b = y;
        if (!this.testZero(b))
            return a / b;
        throw new RuntimeException("Cannot Divide By Zero!");
    }

    private boolean testZero(double b) {
        return b == 0;
    }

    double divide() {
        return this.divide(a, b);
    }

    double multiply(double x, double y) {
        a = x;
        b = y;
        return a * b;
    }

    double multiply() {
        return this.multiply(a, b);
    }

    public static void main(String[] args) {
        var calc = new CalculatorClassAssignmentSolution(9, 18);
        System.out.println("Add: " + calc.add());
        System.out.println("Subtract: " + calc.subtract());
        System.out.println("Multiply: " + calc.multiply());
        System.out.println("Divide: " + calc.divide());

        System.out.println("Multiply 9 * 0: " + calc.multiply(9, 0));
        System.out.println("Divide 9 / 0: " + calc.divide(9, 0));
    }
}

