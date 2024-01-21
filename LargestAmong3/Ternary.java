package LargestAmong3;

public class Ternary {
    void doOperation(int num1, int num2, int num3) {
        // if all numbers all equal
        if (num1 == num2 && num2 == num3)
            System.out.println("All numbers are equal");
        // find maximum
        else {
            int max = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3;
            System.out.println("Greatest of three: " + max);
        }

    }
}
