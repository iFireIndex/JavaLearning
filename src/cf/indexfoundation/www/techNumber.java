package cf.indexfoundation.www;

import java.util.Scanner;

public class techNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mainString, string1, string2;
        int length, userInput, a, b, sum, square;

        System.out.println("|----------------------|");
        System.out.println(" Please Enter A Number ");
        System.out.println("|----------------------|");

        //Putting the user given number into mainString variable
        mainString = scanner.nextLine();

        //Count the length of the user given number
        length = mainString.length();
        //Convert user given input string number into actual int
        userInput = Integer.parseInt(mainString);

        if ((length % 2) == 0) {
            double division = 0.5;
            division = (division * length);

            //Dividing the user given number into two parts and putting them into two different String
            string1 = mainString.substring(0, (int) division);
            string2 = mainString.substring((int) division, length);

            //Converting above two string into int
            a = Integer.parseInt(string1);
            b = Integer.parseInt(string2);

            sum = (a + b);
            square = (sum * sum);

             if (userInput == square) {
                 System.out.println("*******************************");
                 System.out.println("    " + userInput + " Is A TECH Number    ");
                 System.out.println("*******************************");
             } else {
                 System.out.println("*********************************");
                 System.out.println("    " + userInput + " Is Not A TECH Number    ");
                 System.out.println("*********************************");
             }
        } else{
            System.out.println("Please Enter A 2, 4, 6, 8, 10 . . . Digit Number");
        }
    }
}
