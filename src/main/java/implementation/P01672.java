//2024-01-23
//https://www.acmicpc.net/problem/01672
//DNA 해독

package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01672 {

    private final static String[][] table = {
            {"A", "C", "A", "G"},
            {"C", "G", "T", "A"},
            {"A", "T", "C", "G"},
            {"G", "A", "G", "T"}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String code = reader.readLine();
        System.out.println(decode(code));
    }

    private static String decode(String code) {
        String An = String.valueOf(code.charAt(code.length() - 1));

        for (int i = code.length() - 2; i >= 0; i--) {
            String An1 = String.valueOf(code.charAt(i));
            An = table[toIndex(An1)][toIndex(An)];
        }

        return An;
    }

    private static int toIndex(String key) {
        if (key.equals("A")) {
            return 0;
        }
        if (key.equals("G")) {
            return 1;
        }
        if (key.equals("C")) {
            return 2;
        }
        return 3;
    }
}
