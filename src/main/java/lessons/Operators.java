package lessons;

public class Operators {
    public static void main(String[] args) {

        // --- Operatori Unari

        // -- Incremento e decremento
        int x = 1; System.out.println(x); // 1
        System.out.println(++x); // 2
        System.out.println(x++); // 2
        System.out.println(x); // 3
        System.out.println(--x); // 2
        System.out.println(x--); // 2
        System.out.println(x); // 1


        // -- Positivo unario
        int positive = +5; System.out.println(positive); // 5

        // -- Negativo unario
        int negative = -5; System.out.println(negative); // -5


        // --- Operatori aritmetici
        System.out.println(5 + 3); // 8
        System.out.println(5 - 3); // 2
        System.out.println(5 * 3); // 15
        System.out.println(15.0 / 3.2); // 4.6875
        System.out.println(10 % 4); // 2


        // --- Operatori shift
        int e = 2;
        System.out.println(e << 1); // 4, in binario: 100

        int f = 4;
        System.out.println(f << 1); // 2, in binario: 10

        int g = -4;
        System.out.println(g >>> 1); //


        // --- Operatori di confronto
        System.out.println(5 < 10); // true
        System.out.println(5 > 3); // false
        System.out.println(5 <= 3); // true
        System.out.println(5 >= 10); // false
        System.out.println(5 == 5); // true
        System.out.println(5 != 10); // true



        // --- Operatori bitwise
        System.out.println(5 & 3); // 1
        System.out.println(5 | 3); // 7
        System.out.println(5 ^ 3); // 6
        System.out.println(~5); // -6



        // --- Operatori logici
        System.out.println(true && false); // false
        System.out.println(true || false); // true
        System.out.println(!true); // false



        // --- Short-circuit evaluation
        System.out.println(0 !=0 && 10 / 0 > 1); // false


        // --- Operatori di assegnamento

        // -- Operatori aritmetici
        int a = 5;
        System.out.println(a += 5); // 10
        System.out.println(a -= 5); // 5
        System.out.println(a *= 5); // 25
        System.out.println(a /= 5); // 5
        System.out.println(a %= 5); // 1


        // -- Operatori aritmetici
        int b = 5;
        System.out.println(b &= 5); // 0
        System.out.println(b |= 5); // 5
        System.out.println(b <<= 5); // 160
        System.out.println(b >>= 5); // 5
        System.out.println(b >>>= 5); // 0
    }
}