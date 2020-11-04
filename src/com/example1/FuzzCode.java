package com.example1;

import java.util.Scanner;

public class FuzzCode {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) //number divisible by 15  print 'FizzBuzz' in place of number
                System.out.println("FizzBuzz" + " ");
            else if (i % 5 == 0) //number divisible by 5  print 'Buzz' in place of number
                System.out.println("Buzz" + " ");
            else if (i % 3 == 0) //number divisible by 3 print 'Fizz' in place of number
                System.out.println("Fizz" + " ");
            else
                System.out.println(i + "");
        }
    }
}
