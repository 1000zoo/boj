//2024-01-22
//https://www.acmicpc.net/problem/01526
//가장 큰 금민수

package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01526 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        while (!isGold(N)) {
            N--;
        }
        System.out.println(N);
    }

    private static boolean isGold(int n) {
        while (n > 0) {
            int r = n % 10;
            if (r == 4 || r == 7) {
                n /= 10;
                continue;
            }
            return false;
        }
        return true;
    }


}
