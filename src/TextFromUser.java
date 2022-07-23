import java.util.Scanner;

public class TextFromUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userImput = scanner.nextLine();
        System.out.println("Witaj użytkowniku"+userImput);

    }
}
