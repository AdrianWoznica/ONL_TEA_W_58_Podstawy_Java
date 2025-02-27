package pl.coderslab.exceptions;


public class Main05 {

    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("xyz");
            System.out.println(num);
        } catch (NumberFormatException e){
            System.out.println("Error: Invalid number format.");
        } finally {
            System.out.println("Execution completed");
        }
    }
}
