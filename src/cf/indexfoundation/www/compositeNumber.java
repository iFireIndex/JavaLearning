package cf.indexfoundation.www;

import java.util.Scanner;

public class compositeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput, count = 0;
        System.out.println("Enter A Number To Check If It Is A Composite Number OR Not");
        userInput = scanner.nextInt(); // Input number from use

        for (int i = 2; i < userInput; i++) {
            if (userInput % i == 0) {    // checking factors of the number
                count++;
            }
        }

        //Display the result
        if (count > 1) {
            System.out.println(userInput+ " It is Composite Number");
        } else {
            System.out.println(userInput+ " It is not Composite Number");
        }
    }
}
