package pl.coderslab.methods;

public class Main10 {

    public static void main(String[] args) {
        System.out.println(footballWin(0,2,3,1));
    }

    /*
    a1 - gole zdobyte przez zespół A w pierwszym meczu (na boisku zespołu A,
    b1 - gole zdobyte przez zespół B w pierwszym meczu (na boisku zepołu A),
    a2 - gole zdobyte przez zespół A w drugim meczu (na boisku zespołu B),
    b2 - gole zdobyte przez zespół B w drugim meczu (na boisku zespołu B).
     */

    public static String footballWin(int a1, int b1, int a2, int b2){
        int wynikA = a1 + a2;
        int wynikB = b1 + b2;

        if (wynikA > wynikB){
            return "1";
        } else if (wynikB > wynikA) {
            return "2";
        } else {
            if (a2 > b2){
                return "1";
            } else if (a2 < b2) {
                return "2";
            } else return "x";
        }
    }
}
