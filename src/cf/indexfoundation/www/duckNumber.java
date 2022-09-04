package cf.indexfoundation.www;

import java.util.Scanner;

public class duckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A Number To Check If It's A DUCK Number");
        String userInput = scanner.nextLine();
        //charAt() method is used to find the position of particular letter within the string
        char check = userInput.charAt(0);

        if (check == '0') {
            //DUCK number is a number which does not have a 0 (zero) at the beginning but within it, and also if there is no 0 (zeros) in a number that is not a DUCK number
            System.out.println(userInput + " Is Not A DUCK Number");
        } else {
            //Init a variable to count the number of zeros within the number
            int count = 0;
            //Checking the every char input by the user one by one
            for (int i = 1; i < userInput.length(); i++) {
                check = userInput.charAt(i);
                if (check == '0') {
                    count++;
                }
            }
            //Announce the result
            if (count > 0) {
                System.out.println(userInput + " Is A DUCK Number");
            } else {
                System.out.println(userInput + " Is NOT A DUCK Number");
            }
        }
    }
}
