// HomeTask 2 (a).round; b) loops; c) Random, min/max in array; d)simple numbers, Erastophen method)
import java.util.*;
import java.math.*;

public class HomeWork2 {
    public static void main(String[] args) {

        // a) Using library method of Java - "Math.round()"

        double a = 15.34, b = 78.58, c = 789.2;

        System.out.println("Round A = " + Math.round(a));
        System.out.println("Round B = " + Math.round(b));
        System.out.println("Round C = " + Math.round(c) + "\n");

        // b) Loops: for, while, do/while with "Hello World!".

        for(int i = 0; i <= 2; i++){
            System.out.println("Hello World!(For)");
        }

        int i = 0;
        while(i <= 2){
            System.out.println("Hello World!(While)");
            i++;
        }

        int j = 0;
        do{
            System.out.println("Hello World!(Do/while)");
            j++;
        } while (j <= 2);

        System.out.println("");

        // c) Array, using Random() and finding min/max values;

        int min = 0, max = 0;
        int[] ar1 = new int[10];
        Random random = new Random();
        System.out.println("Your random array is: ");

        for(i = 0; i < ar1.length; i++){
            ar1[i] = random.nextInt(100) - 30;
            System.out.print(ar1[i] + " ");

            if(ar1[i] < min){
                min = ar1[i];
            }
            else if(ar1[i] > max){
                max = ar1[i];
            }
        }
        System.out.println("\nMin = " + min + "\n" + "Max = " + max + "\n");

        // d)Finding simple numbers. My method & Using Erastophen method.

        System.out.println("My method of finding simple numbers!");
        for (i = 2; i <= 10000; i++){

             if(i == 2 || i == 3 || i == 5 || i == 7){
                 System.out.println("Simple numbers are: " + i);
             }

             if(i%2 > 0 && i%3 > 0 && i%5 > 0 && i%7 > 0) {
                 System.out.println("Simple numbers are: " + i);
             }
        }
        // Erastophen method. (Is more faster, when value more 10^6 !!!)

        System.out.println("\nErastophen method of finding simple numbers!");

        int n = 10000;
        int[] ar = new int[n]; // Create Array

        for(i = 0; i < n; i++) {
            ar[i] = i;
        }
        ar[1] = 0; // 1 is not simple number, but 2 is simple.

        for(i = 2; i < n; i++){
            if(ar[i] != 0) {
                for(j = i*2; j < n; j+=i){  // Putting NOT simple values to zero
                    ar[j] = 0;
                }
            }
        }

        for(i = 0; i < n; i++) { // Show only simple numbers
            if(ar[i] != 0) {
                System.out.println(ar[i]);
            }
        }

    }
}
