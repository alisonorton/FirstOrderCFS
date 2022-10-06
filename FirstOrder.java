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

    }
}