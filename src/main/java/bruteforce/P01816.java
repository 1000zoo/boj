//2024-01-24
//https://www.acmicpc.net/problem/01816
//암호 키

package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P01816 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());

        while (N-- > 0) {
            writer.write((process(Long.parseLong(reader.readLine())) ? "YES" : "NO") + "\n");
        }
        writer.flush();
        writer.close();
    }

    private static boolean process(long code) {
        for (long i = 2; i < Math.min(Math.sqrt(code) + 1L, 1_000_000L); i++) {
            if (code % i == 0) {
                return false;
            }
        }
        return true;
    }
}
