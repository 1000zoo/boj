//2024-01-16
//https://www.acmicpc.net/problem/02231
//분해합

package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02231 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        System.out.println(process(input));
    }

    private static int process(int input) {

        for (int i = 1; i < input; i++) {
            if (i + sumOfNums(i) == input) {
                return i;
            }
        }

        return 0;
    }

    private static int sumOfNums(int num) {
        int sum = 0;
        for (String n : String.valueOf(num).split("")) {
            sum += Integer.parseInt(n);
        }
        return sum;
    }
}
