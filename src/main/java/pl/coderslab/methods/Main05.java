package pl.coderslab.methods;

public class Main05 {

    public static void main(String[] args) {
        System.out.println(calculateNetto(100, 0.23));
    }

    public static double calculateNetto(double gross, double vat){
        return gross / (1 + vat);
    }
}
