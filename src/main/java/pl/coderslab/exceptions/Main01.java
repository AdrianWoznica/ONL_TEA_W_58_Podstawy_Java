package pl.coderslab.exceptions;


public class Main01 {

    public static void main(String[] args) {
        try {
            System.out.println("Factorial of 5: " + factorial(5));
            System.out.println("Factorial of -5: " + factorial(-5));
        } catch (IllegalArgumentException e){
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    static int factorial(int number) {
        if (number < 0){
            throw new IllegalArgumentException("Number must be non-negative");
        }


        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
