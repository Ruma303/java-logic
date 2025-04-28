package lessons;

public class Conditionals {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        // If-else statement
        System.out.println("\nIf-else statement\n");
        if (x > y) {
            System.out.println("x è maggiore di y");
        } else if (x == y) {
            System.out.println("x è uguale a y");
        } else if (x < y) {
            System.out.println("x è minore di y");
        } else {
            System.out.println("x non è maggiore, uguale o minore di y");
        }


        // Switch statement
        System.out.println("\nSwitch statement\n");
        String fruit = "Cocomero"; // Prova tutti i valori dei case, o anche altri che non esistono

        switch (fruit) { // Confrontiamo il valore della variabile fruit con i seguenti case

            case "Mela": // Primo confronto
                System.out.println("Il valore di fruit è Mela");
                break; // Se il valore di fruit == "Mela", il codice uscirà dallo switch.

            case "Pesca": // Secondo confronto
                System.out.println("Il valore di fruit è Pesca");
                break; // Se il valore di fruit == "Pesca", il codice uscirà dallo switch.

            // Il primo modo per attivare delle istruzioni è definire più case, e le istruzioni e il break sono all'ultima
            case "Banana":
            case "Avocado":
            case "Mango":
            case "Fragola":
            case "Papaya":
                System.out.println("Il valore di fruit è un frutto tropicale");
                break;

            // Case constant list
            // Il secondo modo per è definire un unico case con più valori da confrontare separati da virgole
            case "Lamponi", "Fragoline di bosco", "Mirtilli":
                System.out.println("Il valore di fruit è un frutto di bosco");
                break;

            default: // Opzionalmente possiamo aggiungere un caso base
                System.out.println("Il valore di fruit non è tra i casi previsti");
                break; // Quest'ultimo break è opzionale

            // NON È CONSIGLIATO INSERIRE ALTRI CASI DOPO IL DEFAULT, ma si potrebbe fare.
            case "Anguria":
                fruit = "Mela";
                break;
        }

        System.out.println("Siamo fuori dallo switch");
        System.out.println("Il valore finale della variabile fruit è: " + fruit);


        // Switch expression
        System.out.println("\nSwitch expression\n");

        int z = 20;

        String number = switch(z) {
            case 10 -> "Dieci";
            case 20 -> "Venti";
            default -> {
                System.out.println("Opzione di default.");
                yield "Qualsiasi altro valore";
            }
        };

        System.out.println(number);


        int giorno = 5;

        // Switch expression con blocco di codice e yield
        String tipoGiorno = switch (giorno) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> {
                System.out.println("È un giorno feriale");
                yield "Feriale";
            }
            default -> {
                System.out.println("Giorno non valido");
                yield "Sconosciuto";
            }
        };

        System.out.println("Tipo di giorno: " + tipoGiorno);


        // Ternary operator
        System.out.println("\nOperatore ternario\n");
        int max = (x > y) ? x : y;
        System.out.println("Il numero maggiore è: " + max);
    }
}
