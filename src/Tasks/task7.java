package Tasks;

import javax.naming.PartialResultException;

public class task7 {
    public static void main(String[] args) {
        int n =10 ; // number of terms to be printed
        int num1 = 0, num2 = 1, sum;

        System.out.print(num1 + " " + num2); // printing the first two terms

        for(int i = 2; i < n; i++) {
            sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;
        }
        }}


