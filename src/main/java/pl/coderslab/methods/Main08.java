package pl.coderslab.methods;

public class Main08 {

    public static void main(String[] args) {
        System.out.println(maxOfThree(9, 19, 2));
        System.out.println(maxOfThree(100, 1, 2));
        System.out.println(maxOfThree(1, 2, 4));
    }

    public static int maxOfThree(int a, int b, int c){
        if (a > b && a > c){
            return a;
        } else if (b > a && b > c){
            return b;
        } else return c;
    }
}
