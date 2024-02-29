package unit7.challenges;

public class CommandLineCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Error insufficient arguments");
            return;
        }
        // got enough arguments
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        char[] c = args[1].toCharArray();
        switch(c[0]) {
            case '/':
                System.out.println(a / b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            default:
                System.out.println("Illegal operator!");

        }
    }
}
