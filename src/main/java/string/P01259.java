//2024-01-19
//https://www.acmicpc.net/problem/01259
//팰린드롬수

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01259 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!"0".equals(input = reader.readLine())) {
            System.out.println(process(input) ? "yes" : "no");
        }
    }

    private static boolean process(String input) {
        if (input.length() == 1) {
            return true;
        }
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
