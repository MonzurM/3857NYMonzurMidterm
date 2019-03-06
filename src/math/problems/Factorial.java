package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println(factorialR(5));
        System.out.println(factorialI(5));

    }
    //First using recursion
    public static int factorialR(int n){
        if(n==0){
            return 1;
        }
        return n * factorialR(n-1);
    }
    //Second using Iteration
    public static int factorialI(int n){
        int x = 1;

        for (int i=1; i <= n; i++)
            x *= i;

        return x;


    }
}