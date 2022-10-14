package cf.indexfoundation.www;

import java.util.Scanner;

public class calculatorFunction {
    public static void main(String[] args) {
        char operator;
        double num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the operator (+, -, *, /)");
        operator = scanner.next().charAt(0);

        System.out.println("Enter Two Number One By One, Like -> '85 90' ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        
        scanner.close();
        
        switch (operator){
            case '+':
                System.out.printf("%.2f + %.2f = %.2f,", num1, num2, (num1 + num2));
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f,", num1, num2, (num1 - num2));
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f,", num1, num2, (num1 * num2));
                break;
            case '/':
                if (num2 != 0){
                    System.out.printf("%.2f / %.2f = %.2f,", num1, num2, (num1 / num2));
                } else {
                    System.out.println("Divided By Zero Is Not Possible");
                }
                break;
            default:
                System.out.printf("%c Is An Invalid Operator", operator);
        }
    }
}
