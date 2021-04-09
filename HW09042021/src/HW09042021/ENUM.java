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

        //The java.lang.Enum.ordinal() method returns the ordinal of this enumeration constant
        // (its position in its enum declaration, where the initial constant is assigned an ordinal of zero).
        int getLetterPosition() {
           return ordinal() + 1;


        }
    }
}
