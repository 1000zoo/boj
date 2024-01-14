package string;//2024-01-14
//https://www.acmicpc.net/problem/01157
//단어 공부

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01157 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        int[] dp = new int[26];
        for (char c : input.toLowerCase().toCharArray()) {
            dp[c - 'a']++;
        }
        int max = 0;
        char answer = ' ';
        for (int i = 0; i < 26; i++) {
            if (max > dp[i]) {
                continue;
            }
            if (max == dp[i]) {
                answer = '?';
            } else {
                answer = (char) (i + 'A');
                max = dp[i];
            }
        }
        System.out.println(answer);
    }
}
