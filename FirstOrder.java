import java.util.Arrays;
import java.util.Scanner;

public class FirstOrder{
    public static void main(String[] args){

        //Reading and storing input
        var s = new Scanner(System.in);

        s.next();
        double s1 = s.nextDouble();
        s.next();
        double c = s.nextDouble();
        s.next();
        double gn = s.nextDouble();
        s.close();

        System.out.println(s1 + "\n" + c + "\n" + gn + "\n");

        System.out.printf("S(n) = %.1f(n - 1) * %.1f + sigma(%.1f^(n - i) * %.1f)%n", c, s1, c, gn);
        //System.out.println("S(n) = " + c + "(n - 1) * " + s1 + " sigma(" + c + "^(n - i) * " + gn + ")");

        //Display S(1)
        System.out.printf("S(1) = %.1f%n", s1);

    }
}