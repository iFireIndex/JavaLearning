package cf.indexfoundation.www;

import java.util.Scanner;

public class techNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1, string2, string3;
        int length, userInput, division, a, b, sum, square;

        System.out.println("----------------------");
        System.out.println("Please Enter A Number");
        System.out.println("----------------------");

        string1 = scanner.nextLine();
        //Count the length of the user given number
        length = string1.length();
        //Convert user given input string number into actual int
        userInput = Integer.parseInt(string1);

        if ((length % 2) == 0) {
            division = 1/2;
            string2 = string1.substring(0, division);
            string3 = string1.substring(division, length);

            a = Integer.parseInt(string2);
            b = Integer.parseInt(string3);

            sum = (a + b);
            square = (sum * sum);

             if (userInput == square) {
                 System.out.println(userInput + "Is a tech number");
             } else {
                 System.out.println(userInput + "Is not a tech number");
             }
        } else{
            System.out.println("Please enter a valid tech number");
        }
    }
}
