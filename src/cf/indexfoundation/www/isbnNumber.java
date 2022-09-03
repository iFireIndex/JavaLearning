package cf.indexfoundation.www;

import java.util.Scanner;

public class isbnNumber {
    public static void main(String[] args) {
        int x = 0;
        long userInput, isValidISBN, check, total = 0;

        System.out.println("---------------------------");
        System.out.println("Enter A ISBN Number");
        System.out.println("---------------------------");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLong();
        isValidISBN = userInput;

        //Count the digit of the entered ISBN and declared the ISBN is 10 digit or NOT
        while(userInput > 0){
            userInput = (userInput / 10);
            x++;
        }

        if (x != 10) {
            System.out.println("Please Enter A 10 Digit ISBN Number");
        } else {
            //Declared the ISBN valid or NOT
            for(int i = 10; i >= 1; i--) {
                check = (isValidISBN % 10);
                total = total + (check * i);
                isValidISBN = (isValidISBN / 10);
            }

            if (total % 11 == 0) {
                System.out.println("It Is A Valid ISBN");
            } else {
                System.out.println("It Is Not A Valid ISBN");
            }
        }


    }
}
