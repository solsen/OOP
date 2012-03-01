package merSammenligning;

public class sammenlign2 {
    /*
     * Bruk av == og equals.
     * Metoden equals sammenligner innholdet.
     * == sammenligner om variablene har samme referanse.
     */

    public static void main(String[] args) {
        /*
         * Sammenligner to int
         */
        //checkIfEqual(1, 1);

        /*
         * Sammenligner to Stringer. Java opretter ikke altid nye objekter om det finnes ett likt fra før.
         * Denne testen vil derfor også bli sann siden begge peker til samme plass i minnet.
         */
        String s1="en";
        String s2="en";
        checkIfEqual(s1, s2);

        /*
         * Her ber vi spesifikt om å oprette to ulike objekter. Innholdet er likt,
         * men siden har ulike referanser vil bare 'equals', som sammenligner innholdet, returnere true.
         * '==' som sammenligner objektreferansen returnerer false.
         */
        checkIfEqual(new String("en"), new String("en"));

    }

    private static void checkIfEqual(int i, int i0) {
        System.out.println("Sammenligner " + i + " med " + i0 + " via == : ");
        if (i == i0) {
            System.out.println("De er like!");
        } else {
            System.out.println("De er ikke like!");
        }


    }

    private static void checkIfEqual(String i, String i0) {
        System.out.println("Sammenligner " + i + " med " + i0 + " via 'equals()': ");
        if (i.equals(i0)) {
            System.out.println("De er like!");
        } else {
            System.out.println("De er ikke like!");
        }

        System.out.println("Sammenligner " + i + " med " + i0 + " via '==' : ");
        if (i == (i0)) { 
            System.out.println("De er like!");
        } else {
            System.out.println("De er ikke like!");
        }
    }
}
