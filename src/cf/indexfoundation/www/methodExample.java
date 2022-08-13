package cf.indexfoundation.www;

import java.util.Scanner;

class Discount{
    double discountAmount;
    double calculate(double x){
        discountAmount = x - (x*(25.00 / 100.00));
        return discountAmount;
    }
}

public class methodExample {
    public static void main(String[] args) {
        Discount discount1 = new Discount();
        int userGivenAmount;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of pen");
        userGivenAmount = sc.nextInt();

        //Displaying the result
        System.out.println("Amount to Be Paid (Less Discount 25%): " +discount1.calculate(userGivenAmount));
    }
}
