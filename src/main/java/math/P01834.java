//2024-01-24
//https://www.acmicpc.net/problem/01834
//나머지와 몫이 같은 수

package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01834 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        System.out.println(process(N));
    }

    private static long process(int n) {
        long sum = 0L;
        for (long i = 1; i < n; i++) {
            sum += i * n + i;
        }
        return sum;
    }
}
