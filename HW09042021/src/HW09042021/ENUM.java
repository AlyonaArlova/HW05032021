//Используя возможности enum, реализуйте метод getLetterPosition(), который должен возвращать позицию буквы в алфавите.
//Например, А – 1, B – 2 и т.д.

package HW09042021;

public class ENUM {
    public static void main(String[] args) {
        System.out.println(Alphabet.D.getLetterPosition());
    }

    public enum Alphabet {
        A, B, C, D, E,
        F, G, H, I, J,
        K, L, M, N, O,
        P, Q, R, S, T,
        U, V, W, X, Y, Z;


        int getLetterPosition() {
           return ordinal() + 1;


        }
    }
}
