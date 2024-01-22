//2024-01-22
//https://www.acmicpc.net/problem/01373
//2진수 8진수

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01373 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        input = "0".repeat(count(input.length() % 3)) + input;

        StringBuilder answer = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i -= 3) {
            answer.append(Integer.parseInt(input.substring(i - 2, i + 1), 2));
        }
        answer.reverse();
        System.out.println(answer);
    }

    private static int count(int i) {
        return i == 2 ? 1 : i == 1 ? 2 : 0;
    }
}
