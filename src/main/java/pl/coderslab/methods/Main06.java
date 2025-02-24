package pl.coderslab.methods;

public class Main06 {

    public static void main(String[] args) {
        System.out.println(checkMaturity(19));
        System.out.println(checkMaturity(3));
    }

    public static boolean checkMaturity(int age){
        return age >= 18;
    }
}
