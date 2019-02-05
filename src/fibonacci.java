// Name : Muskan Khatri
// Student Number : 0636861
// This program will ask the user to enter an element and then it will print the fibonacci series till that number.
// In this program recursion and iterations works at the same time.

import java.util.Scanner;
import java.lang.*;      // this is for calculating time

public class fibonacci {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);               //to read in stuff in java

        //nth element input
        System.out.print("Enter the last element of Fibonacci sequence: ");
        int Input = sc.nextInt();

        //Printing out Recursion method
        // A recursion is basically a method calling itself
        System.out.println(Input);
        System.out.println("Fib Series up to: " + Input + "  is :");

        // for loop is basically counting
        for (int i = 0; i < Input; i++) {
            System.out.println(fiboSeriesRec(i));

        }
        System.out.println(System.currentTimeMillis()-start);      // printing out time
        {


        }


        //Print out Iteration method

        System.out.println("Fib Series up to: " + Input + "  is :");

        for (int i = 0; i < Input; i++) {
            System.out.println(fibIteration(i));
        }

        System.out.println(System.currentTimeMillis()-start);
    }






        //Recursive method
            static int fiboSeriesRec(int Input) {
                if ((Input == 0) || (Input == 1)) {
                    return Input;
                }
                return fiboSeriesRec(Input - 1) + fiboSeriesRec(Input - 2);
        }

        //Iteration method
            static int fibIteration(int Input)
            {
                if ((Input == 0) || (Input == 1)) {
                    return Input;
                }
                int x = 0, y = 1, z = 1;

                for (int i = 0; i < Input; i++) {

                    z = x + y;
                    x = y;
                    y = z;
                }
                return z;
            }

        }



