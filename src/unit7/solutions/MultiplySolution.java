package unit7.solutions;
/**
 * Jack really likes his number five: the trick here is that you have to multiply each number by 5 raised to the number of digits of each numbers, so, for example:
 *
 * multiply(3) == 15 // 3 * 5¹
 * multiply(10) == 250 // 10 * 5²
 * multiply(200) == 25000 // 200 * 5³
 * multiply(0) == 0 // 0 * 5¹
 * multiply(-3) == -15 // -3 * 5¹
 */
public class MultiplySolution {

    public static int multiply(int number) {
        int digits = String.valueOf(Math.abs(number)).length();
        return (int)(number * Math.pow(5, digits));
    }

    public static void main(String[] args) {
        System.out.println(multiply(3));
        System.out.println(multiply(10));
        System.out.println(multiply(200));
        System.out.println(multiply(0));
        System.out.println(multiply(-3));

    }
}
