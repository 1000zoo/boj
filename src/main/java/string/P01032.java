//2024-01-16
//https://www.acmicpc.net/problem/01032
//명령 프롬프트

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01032 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        String[] inputs = new String[T];

        for (int i = 0; i < T; i++) {
            inputs[i] = reader.readLine();
        }

        System.out.println(process(inputs));

    }

    private static String process(String[] inputs) {
        StringBuilder sb = new StringBuilder(inputs[0]);

        for (int i = 1; i < inputs.length; i++) {
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) != inputs[i].charAt(j)) {
                    sb.setCharAt(j, '?');
                }
            }
        }

        return sb.toString();
    }
}
