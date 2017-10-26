import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class Application {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//*********** Mini-task 1. Calculating Summ of hole digits from user's number *************
        System.out.println("Input you hole number: ");
        String inputNumber = reader.readLine();

        int summ = 0;
        for(int i = 0; i < inputNumber.length(); i++) {
            summ += Long.parseLong(inputNumber.substring(i, i+1));
        }
        System.out.println(summ);

//*********** Mini-task 2. Check random number is it belong to any Set ***********************
        int randomNumber = (int)(5 + (Math.random()*(155-5)));

        System.out.println("Your random number is :" + randomNumber);
        if (randomNumber > 25 & randomNumber < 100) {
            System.out.println("Random number is IN Set\n");
        } else {
            System.out.println("Random number is OUT Set\n");
        }

//*********** Mini-task 3. Show on display numbers of Fibonachi **********************

        System.out.println("Enter amount of Fibonachi numbers: ");
        String numOfFib = reader.readLine();
        int[] arrayOfFib = new int[Integer.parseInt(numOfFib)];

        for(int i = 0; i < arrayOfFib.length; i++) {
            if(i == 0 ){
                arrayOfFib[i] = 0;
            } else if(i == 1 ) {
                arrayOfFib[i] = 1;
            } else {
                arrayOfFib[i] = arrayOfFib[i - 1] + arrayOfFib[i - 2];
            }
            System.out.println("Fibonachi numbers:\t" + arrayOfFib[i]);
        }
    }
}
