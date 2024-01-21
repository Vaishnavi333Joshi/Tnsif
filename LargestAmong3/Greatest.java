package LargestAmong3;

import java.util.*;

public class Greatest {
    public static void main(String[] args) {
        Ternary number = new Ternary();
        Scanner obj = new Scanner(System.in);
        // taking inputs
        System.out.println("Enter number1:");
        int num1 = obj.nextInt();
        System.out.println("Enter number2:");
        int num2 = obj.nextInt();
        System.out.println("Enter number3:");
        int num3 = obj.nextInt();
        // Calling method2

        number.doOperation(num1, num2, num3);
    }
}
