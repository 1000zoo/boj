//2024-01-19
//https://www.acmicpc.net/problem/01292
//쉽게 푸는 문제

package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01292 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        int s = Integer.parseInt(input.split(" ")[0]);
        int e = Integer.parseInt(input.split(" ")[1]);

        System.out.println(getSum(e) - getSum(s - 1));
    }

    private static int getSum(int num) {
        int answer = 0;
        int x = root(num);

        for (int i = 1; i <= x; i++) {
            answer += i * i;
        }

        return answer + (x + 1) * (num - sumFromOne(x));
    }

    private static int sumFromOne(int num) {
        return num * (num + 1) / 2;
    }

    private static int root(int num) {
        return (int) (-1 + Math.sqrt(1 - 4 * -2 * num)) / 2;
    }
}

