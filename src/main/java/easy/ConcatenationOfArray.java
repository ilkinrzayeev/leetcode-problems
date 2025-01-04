package easy;

import java.util.Scanner;

public class ConcatenationOfArray {

    public static void main(String[] args) {
        Scanner in   = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = in.nextInt();
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();

        int[] arr = new int[length];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = concatenationOfArray.getConcatenation(arr);

        System.out.println("Concatenated array: ");
        for (int number : result) {
            System.out.print(number + " ");
        }
    }

    public int[] getConcatenation(int[] arr) {
        int length = arr.length;
        int[] result = new int[2 * length];

        for (int i = 0; i < length; i++) {
            result[i] = arr[i];
        }

        for (int i = 0; i < length; i++) {
            result[i + length] = arr[i];
        }

        return result;
    }
}
