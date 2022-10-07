import java.util.Scanner;

public class FirstOrder{
    public static void main(String[] args){

        //Reading and storing input
        var s = new Scanner(System.in);
        double sn;

        s.next();
        double s1 = s.nextDouble();
        s.next();
        double c = s.nextDouble();
        s.next();
        double gn = s.nextDouble();
        s.close();

        System.out.printf("%nS(n) = %.1f(n - 1) * %.1f + sigma(%.1f^(n - i) * %.1f)%n", c, s1, c, gn);

 
        //Calculating S(n)
        for(int n = 1; n <= 10; n++){
            sn = 0;
            sn = Math.pow(c, n - 1) * s1;
            //Calculating the sigma part of the equation
            for(int i = 2; i <= n; i++){
                sn += Math.pow(c, n - i) * gn;
            } 
            //Displaying results
            System.out.printf("S(%d) = %.1f%n", n, sn);
        }

    }
}