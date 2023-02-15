import java.lang.Math;
import java.util.Scanner;

/**
 * 
 *
 * @author Ismail Hendryx
 *         A Java program that reads
 *         from input a double-precision floating-point positive number (type
 *         double) and
 *         writes to standard output its square root, to the nearest integer
 *         rounded down, as an
 *         integer (no decimal places).
 */
public class Submission {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double Reads = sc.nextDouble();
        double wholeNum = Reads;
        wholeNum = Math.abs(wholeNum);
        double a = 2;

        while (Math.abs(a - wholeNum / a) >= 1) {
            a = (a + wholeNum / a) / 2;
        }
        if (Math.floor(a) * Math.floor(a) == wholeNum) {
            System.out.println((int) Math.floor(a));
        } else if (Math.floor(a) * Math.floor(a) > wholeNum) {
            System.out.println((int) Math.floor(a - 1));
        } else {
            System.out.println((int) Math.floor(a));
        }
        System.out.println(wholeNum);
    }
}