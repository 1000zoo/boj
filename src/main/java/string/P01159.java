//2024-01-16
//https://www.acmicpc.net/problem/01159
//농구 경기

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01159 {

    public static void main(String[] args) throws IOException {
        int[] dp = new int[26];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            char first = reader.readLine().charAt(0);
            dp[first - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dp.length; i++) {
            if (dp[i] >= 5) {
                sb.append((char) (i + 'a'));
            }
        }

        if (sb.length() == 0) {
            sb.append("PREDAJA");
        }

        System.out.println(sb);
    }
}
