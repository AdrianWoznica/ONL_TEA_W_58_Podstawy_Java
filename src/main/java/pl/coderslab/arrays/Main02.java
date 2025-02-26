package pl.coderslab.arrays;

import java.util.Random;

public class Main02 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] randNumbers = new int[20];

        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = random.nextInt(101);
            // komenda do sprawdzenia jakie cyfry zostały przypisane: System.out.println(randNumbers[i]);
        }

        // zmienna do przechowywania minimalnej wartości
        int minValue = randNumbers[0];

        for (int i = 1; i < randNumbers.length; i++) {
            if (randNumbers[i] < minValue){
                minValue = randNumbers[i];
            }
        }

        System.out.println("Minimalna wartość w tablicy: " + minValue);
    }
}
