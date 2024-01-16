//2024-01-16
//https://www.acmicpc.net/problem/01037
//약수

package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P01037 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int[] divisors = new int[N];

        StringTokenizer st = new StringTokenizer(reader.readLine());

        for (int i = 0; i < N; i++) {
            divisors[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(divisors);

        int answer = N == 1 ? divisors[0] * divisors[0] : divisors[0] * divisors[divisors.length - 1];

        System.out.println(answer);

    }
}
