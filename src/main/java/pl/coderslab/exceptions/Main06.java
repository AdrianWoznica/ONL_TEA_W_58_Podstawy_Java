package pl.coderslab.exceptions;


public class Main06 {

    public static void main(String[] args) {
        try {
            System.out.println(divide(10,0));
        } catch (IllegalArgumentException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static int divide (int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Parameter 'b' cannot be zero");
        }
        return a / b;
    }
}
