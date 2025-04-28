package lessons;

public class Labels {
    public static void main(String[] args) {

        // Esempio di utilizzo delle etichette in un blocco if
        int numero = 10;

        controllo:
        {
            if (numero % 2 == 0) {
                System.out.println("Il numero è pari.");
                break controllo; // Interrompe il blocco etichettato 'controllo'
            }
            System.out.println("Questo messaggio non verrà mai stampato.");
        }

        System.out.println("Fine del programma.");


        // Esempio di utilizzo delle etichette in un switch
        int scelta = 2;

        operazione: {  // Etichetta per il blocco di codice
            switch (scelta) {
                case 1:
                    System.out.println("Hai scelto 1.");
                    break;
                case 2:
                    System.out.println("Hai scelto 2.");
                    break operazione;  // Esce dall'intero blocco 'operazione'
                case 3:
                    System.out.println("Hai scelto 3.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
            System.out.println("Questo non verrà stampato se scelta è 2.");
        }

        System.out.println("Uscito dal blocco operazione.");


        // Esempio di utilizzo delle etichette in un ciclo
        outer: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) break outer; // Interrompe il ciclo etichettato 'outer'
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("Siamo fuori dal ciclo 'outer'.");



        // Uso di continue
        outer: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.println("i == j, salto alla prossima iterazione di 'outer'");
                    continue outer;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }


        // Esempio più avanzato
        System.out.println("Inizio ciclo esterno\n");

        OUTER_LABEL: for (int i = 0; i < 10; i++) {
            System.out.println("Ciclo esterno -> i = " + i);

            INNER_LABEL: for (int k = 0; k <= 10; k++) {
                System.out.println("\tCiclo interno -> k = " + k);

                if (i == 2) break OUTER_LABEL; // Interrompe immediatamente il ciclo esterno

                if (k == 2) {
                    System.out.println("\tUsciamo dal ciclo interno.");
                    break INNER_LABEL; // Interrompe solo il ciclo interno
                }
            }

            System.out.println("Fine iterazione ciclo esterno: " + i + "\n");
        }

        System.out.println("\nSei fuori dal ciclo esterno...");

    }
}
