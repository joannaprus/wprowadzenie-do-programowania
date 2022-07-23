import java.util.Scanner;

public class Nowezadanie {
    public static void main (String[] args){
        /**
         * 1 chcę aby w programie było pytanie o imie i nazwisko i wiek
         * 2 chcęzeby po pytanio o wiek była pętla sprawdzająca czy osoba jest pełnoletnia czy nie
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imię");
        String imię = scanner.next();
        System.out.println("podaj nazwisko");
        String nazwisko = scanner.next();
        System.out.println("podaj wiek");
        int wiek = scanner.nextInt();
    }
}
