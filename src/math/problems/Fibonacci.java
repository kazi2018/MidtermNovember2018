package math.problems;


import java.util.Arrays;
public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

        int fib []= new int[40];
        for(int i=0;i<40;i++){
            if (i<2){
                fib[i]=i;
            }else{
                fib[i]=fib[i-1]+fib[i-2];
            }


        }
        System.out.println(Arrays.toString(fib));
    }
}