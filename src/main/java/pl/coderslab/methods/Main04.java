package pl.coderslab.methods;

public class Main04 {

    public static void main(String[] args) {
        String result = createName("Jan", "Kowalski", "Kowal");
        System.out.println(result);
    }

    public static String createName(String name, String surname, String nickname){
        return name + " " + surname + " " + nickname;
    }
}
