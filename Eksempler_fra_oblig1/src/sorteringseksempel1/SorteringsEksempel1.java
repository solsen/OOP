package sorteringseksempel1;

public class SorteringsEksempel1 {

    public static void main(String[] args) {
        String[] stringTall = {"8", "5", "7", "1001", "10", "10000002", "42", "0"};
        print(stringTall); // Skriver ut orginal array

        sortByStringValue(stringTall);
        print(stringTall);  // Skriver ut etter sortering av Stringverdi

        sortByIntValue(stringTall);
        print(stringTall);  // Skriver ut etter sortering av tallverdi

    }

    /*
     * Riktig sammenligning.
     * String blir gjort om til int før sammenligning
     */
    static void sortByIntValue(String[] s) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < s.length - 1; i++) {
                /* Her er eksempel på to måter det kan gjøres på:
                 * Enten ved å gjøre om til variablene til klassen Integer og bruke Integers
                 * compareTo metode, eller ved å parse verdiene rett til int i if-testen og
                 * bruke en relasjonsopperator (<,>,=,!= osv).
                 */

                //  Integer tall1=Integer.parseInt(s[i]);
                //  Integer tall2=Integer.parseInt(s[i+1]);
                //  if(tall1.compareTo(tall2) > 0){ // Om element en er større en element to..

                if (Integer.parseInt(s[i]) > Integer.parseInt(s[i + 1])) {
                    /*
                     * Her bytter man plass på elementene
                     * Eks. I første iterasjon har vi 8 på plass [0] og 5 på plass [1]
                     * og i=0. Følgende skjer:
                     */
                    String tmp = s[i];   // Plukk ut 8
                    s[i] = s[i + 1];    //  Sett 5 på posisjonen der 8 var. Både posisjon [0] og [1] i listen har nå verdi 5
                    s[i + 1] = tmp;    //   Sett 8 inn på plass [1]
                    sorted = false;

                }

            }
        }
    }

    /* 
     * Denne metoden bruker compareTo for å sammenligne to variabler av typen String.
     * Dette er riktig dersom man skal sortere noe alfabetisk, men ikke etter verdi
     */
    static void sortByStringValue(String[] s) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < s.length - 1; i++) {
                if (s[i].compareTo(s[i + 1]) > 0) {
                    String tmp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = tmp;
                    sorted = false;

                }

            }
        }
    }

    static void print(String[] tall) {
        for (String s : tall) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
