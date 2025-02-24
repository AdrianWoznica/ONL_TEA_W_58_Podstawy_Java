package pl.coderslab.methods;

public class Main09 {

    public static void main(String[] args) {
        int x = factorial(5);
        System.out.println(x);
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
