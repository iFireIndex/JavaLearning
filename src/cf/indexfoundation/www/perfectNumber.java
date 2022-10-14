package cf.indexfoundation.www;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        int userInput, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number To Check If It Is A Perfect OR Not");
        userInput = scanner.nextInt(); // Input number from user

        scanner.close();

        for (int i = 1; i < userInput; i++) {   // loop t+ "It is not a Perfect Number : " o find the factors
            if(userInput % i == 0) {    // Condition for factors of number
                sum = (sum+ i); // storing sum of factors excluding number
            }
        }

        //comparing sum of factors with number
        if (sum == userInput) {
            System.out.println(userInput+ " It is a Perfect Number");
        } else {
            System.out.println(userInput+ " It is not a Perfect Number");
        }

    }
}
