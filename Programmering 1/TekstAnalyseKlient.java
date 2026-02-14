import java.util.Scanner;

public class TekstAnalyseKlient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Skriv inn en tekst: ");
            String tekst = scanner.nextLine();

            TekstAnalyse analyse = new TekstAnalyse(tekst);

            System.out.println("Totalt antall bokstaver: " + analyse.finnTotaltAntallBokstaver());
            System.out.println("Antall forskjellige bokstaver: " + analyse.finnAntallForskjelligeBokstaver());
            System.out.println("Prosent ikke-bokstaver: " + analyse.finnProsentIkkeBokstaver() + "%");

            System.out.println("Hvilken bokstav vil du søke etter?");
            char bokstav = scanner.nextLine().charAt(0);
            System.out.println("Antall: " + analyse.finnAntallForekomster(bokstav));
            System.out.println();
        }
    }
}
