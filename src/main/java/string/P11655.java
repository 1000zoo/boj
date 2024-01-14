//2024-01-11
//https://www.acmicpc.net/problem/11655
//ROT 13

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11655 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        String result = process(input);
        System.out.println(result);
    }

    private static String process(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                sb.append(c);
                continue;
            }
            char start = Character.isLowerCase(c) ? 'a' : 'A';
            int diff = c - start;
            sb.append((char) (start + (diff + 13) % 26));
        }
        return sb.toString();
    }
}
