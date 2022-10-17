import java.util.Scanner;

public class ProblemOfTheDay_101722 {

    /**
     * Reversing input numbers
     * <p>
     * Write a program that reads two integer numbers
     * from the standard input and outputs them in the reverse order separated by one space.
     */
    public static void main(String args[]) {
        String n, n2;
        Scanner in = new Scanner(System.in);
        n = in.next();
        n2 = in.next();
        System.out.print(n2 + " " + n);
    }
}






