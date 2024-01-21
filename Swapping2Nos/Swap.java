package Swapping2Nos;

public class Swap {
    public void SwapingTwoNumbers(int num1, int num2) {
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.printf("Numbers After Swapping,First No:" + " " + num1 + " " + "Second No: " + num2);
    }

}
