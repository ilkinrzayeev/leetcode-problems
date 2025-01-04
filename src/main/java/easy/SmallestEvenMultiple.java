package easy;

import java.util.Scanner;

public class SmallestEvenMultiple {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();

        SmallestEvenMultiple smallestEvenMultiple = new SmallestEvenMultiple();
        int result = smallestEvenMultiple.smallestEvenMultiple(number);
        System.out.println("The smallest even set: " + result);
    }

    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return n * 2;
        }
    }
}
