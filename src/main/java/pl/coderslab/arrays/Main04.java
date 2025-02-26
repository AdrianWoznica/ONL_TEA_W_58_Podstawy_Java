package pl.coderslab.arrays;

public class Main04 {

    public static void main(String[] args) {

        int[] numbers = {3,5, 7, 2, 1, 9, 4, 8, 6, 10};

        int[] reverse = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers[numbers.length - 1 - i];
        }

        for (int i = 0; i < reverse.length; i++) {
            System.out.println(reverse[i] + " ");
        }

    }
}
