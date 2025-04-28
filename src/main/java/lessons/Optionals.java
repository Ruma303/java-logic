package lessons;

import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {

        Optional<String> opt1 = Optional.of("Hello");          // Valore presente, non può essere null o lancia un'eccezione NullPointerException
        Optional<String> opt2 = Optional.ofNullable(null);     // Può essere null
        Optional<String> opt3 = Optional.empty();              // Nessun valore

        // Controllo se il valore è presente
        if (opt1.isPresent()) {
            System.out.println("Valore presente");
            System.out.println(opt1.get()); // Stampa il valore
        }

        // Controllo se il valore è assente
        if (opt2.isEmpty()) {
            System.out.println("Valore assente");

            opt2.ifPresentOrElse(
                    value -> System.out.println("Valore presente: " + value),
                    () -> System.out.println("Valore assente")
            );
        }


        // Eccezioni e fallback
        String fallbackValue = opt3.orElse("default");
        System.out.println("Fallback value: " + fallbackValue);

        String fallbackValue2 = opt3.orElseGet(() -> "Lazy");
        System.out.println("Fallback value 2: " + fallbackValue2);

        // String exceptionValue = opt3.orElseThrow(() -> new IllegalArgumentException("Valore assente"));


        // Mappature
        Optional<String> opt = Optional.of("Java");

        // map() Restituisce nuovo Optional<Integer> trasformato
        Optional<Integer> length = opt.map(String::length);
        System.out.println("Length: " + length.get()); // 4

        // Restituisce nuovo Optional<String> trasformato
        Optional<String> upper = opt.map(String::toUpperCase);
        System.out.println("Upper: " + upper.get()); // JAVA

        // flatMap() è usato quando la funzione restituisce già un Optional.
        Optional<String> result = opt.flatMap(val -> Optional.of(val.toUpperCase()));
        System.out.println("FlatMap: " + result.get()); // JAVA


        // Filtraggio
        Optional<String> filtered = opt.filter(val -> val.length() > 3);
        System.out.println("Filtered: " + filtered.get()); // Java

    }
}
