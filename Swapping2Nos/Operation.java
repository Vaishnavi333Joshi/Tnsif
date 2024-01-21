package Swapping2Nos;

import java.util.*;

public class Operation {
    static int num1, num2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking Inputs
        System.out.println("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        num2 = sc.nextInt();
        System.out.println("Numbers Before Swapping,First No:" + " " + num1 + " " + "Second No: " + num2);
        // Calling Functions
        Swap obj = new Swap();
        obj.SwapingTwoNumbers(num1, num2);
    }
}
