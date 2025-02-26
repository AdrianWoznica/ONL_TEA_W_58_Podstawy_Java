package pl.coderslab.arrays;

public class Main01 {

    public static void main(String[] args) {

        int[] mainTab = new int[50];

        for (int i = 0; i < mainTab.length; i++) {
            // przypisanie elementów do tablicy
            mainTab[i] = i;
        }

        for (int i = 0; i < mainTab.length; i++) {
            System.out.printf("%02d ", mainTab[i]);

            if ((i + 1) % 10 == 0){
                System.out.println();
            }

        }

    }
}
