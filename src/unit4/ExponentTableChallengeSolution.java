package unit4;

/*
Write a program that will have print the following output to the screen

Number^0.5   Number^1    Number^2    Number^3    Number^4
(Number+1)^0.5 ...
.
.
.
for the numbers 1-12
 */

public class ExponentTableChallengeSolution {
    // https://stackoverflow.com/questions/14413020/how-to-use-formatting-with-printf-correctly-in-java
    // %[index$][flags][width][.precision]conversion where [] denotes optional
    // % beginning of expression
    // [index$] argument, begins at 1
    // [-] left alignment
    // [width] minimum field width
    // [.precision] numbers after decimal place
    // conversion d - decimal, f - floating point, s - string
    public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            System.out.printf("%10.3f\t",Math.pow(i, 0.5));
            for (int j = 1; j < 5; j++) {
                System.out.printf("%10.3f\t", Math.pow(i, j));
            }
            System.out.println();
        }
    }
}
