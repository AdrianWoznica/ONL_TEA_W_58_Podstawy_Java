package pl.coderslab.arrays;

public class Main06 {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 10, 11, 4, 7, 8, 13, 19, 21};
        int[] secondNumbers = {2, 4, 15, 22, 1, 3, 5, 7, 9, 17};
        int[] thirdNumbers = new int[10];

        for (int i = 0; i < thirdNumbers.length; i++) {
            thirdNumbers[i] = numbers[i] + secondNumbers[i];
            System.out.println(thirdNumbers[i]);
        }
    }
}
