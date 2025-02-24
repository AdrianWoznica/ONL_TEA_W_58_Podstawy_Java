package pl.coderslab.methods;

public class Main03 {

    public static void main(String[] args) {
        double result = convertToUsd(10);
        System.out.println(result + "$");
    }

    public static double convertToUsd(double pln){
        return pln/4.04;
    }
}
