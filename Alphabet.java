import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// hello

/**
 * Coordinate the translation of SAL assembly code to text-based binary.
 *
 * @author Ismail Hendryx
 * @version 1
 */
public class Alphabet {

    public static void main(String[] args) {
        String A = "A";
        A = A.toLowerCase();

        String B = "B";
        B = B.toLowerCase();

        String C = "C";
        C = C.toLowerCase();

        String D = "D";
        D = D.toLowerCase();

        String E = "E";
        E = E.toLowerCase();

        String F = "F";
        F = F.toLowerCase();

        String G = "G";
        G = G.toLowerCase();

        String H = "H";
        H = H.toLowerCase();

        String I = "I";
        I = I.toLowerCase();

        String J = "J";
        J = J.toLowerCase();

        String K = "K";
        K = K.toLowerCase();

        String L = "L";
        L = L.toLowerCase();

        String M = "M";
        M = M.toLowerCase();

        String N = "N";
        N = N.toLowerCase();

        String O = "O";
        O = O.toLowerCase();

        String P = "P";
        P = P.toLowerCase();

        String Q = "Q";
        Q = Q.toLowerCase();

        String R = "R";
        R = R.toLowerCase();

        String S = "S";
        S = S.toLowerCase();

        String T = "T";
        T = T.toLowerCase();

        String U = "U";
        U = U.toLowerCase();

        String V = "V";
        V = V.toLowerCase();

        String W = "W";
        W = W.toLowerCase();

        String X = "X";
        X = X.toLowerCase();

        String Y = "Y";
        Y = Y.toLowerCase();

        String Z = "Z";
        Z = Z.toLowerCase();

        HashMap<String, String> alpha = new HashMap<String, String>();
        alpha.put(A, "1");
        alpha.put(B, "2");
        alpha.put(C, "3");
        alpha.put(D, "4");
        alpha.put(E, "5");
        alpha.put(F, "6");
        alpha.put(G, "7");
        alpha.put(H, "8");
        alpha.put(I, "9");
        alpha.put(J, "10");
        alpha.put(K, "11");
        alpha.put(L, "12");
        alpha.put(M, "13");
        alpha.put(N, "14");
        alpha.put(O, "15");
        alpha.put(P, "16");
        alpha.put(Q, "17");
        alpha.put(R, "18");
        alpha.put(S, "19");
        alpha.put(T, "20");
        alpha.put(U, "21");
        alpha.put(V, "22");
        alpha.put(W, "23");
        alpha.put(X, "24");
        alpha.put(Y, "25");
        alpha.put(Z, "26");
        alpha.put("A", "1");
        alpha.put("B", "2");
        alpha.put("C", "3");
        alpha.put("D", "4");
        alpha.put("E", "5");
        alpha.put("F", "6");
        alpha.put("G", "7");
        alpha.put("H", "8");
        alpha.put("I", "9");
        alpha.put("J", "10");
        alpha.put("K", "11");
        alpha.put("L", "12");
        alpha.put("M", "13");
        alpha.put("N", "14");
        alpha.put("O", "15");
        alpha.put("P", "16");
        alpha.put("Q", "17");
        alpha.put("R", "18");
        alpha.put("S", "19");
        alpha.put("T", "20");
        alpha.put("U", "21");
        alpha.put("V", "22");
        alpha.put("W", "23");
        alpha.put("X", "24");
        alpha.put("Y", "25");
        alpha.put("Z", "26");
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();

        String value = alpha.get(key);
        if (value != null) {
            System.out.println(value);
        } else {
            System.out.println("Key not found in map.");
        }

    }

}
