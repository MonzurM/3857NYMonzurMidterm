package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int fibonacci = 40;
        int[] fibo = new int[fibonacci];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2; i < fibonacci; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for(int i=0; i< fibonacci; i++){
            System.out.println(fibo[i] + " ");
        }

    }
}
