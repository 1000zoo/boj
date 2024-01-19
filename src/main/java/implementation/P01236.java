//2024-01-19
//https://www.acmicpc.net/problem/01236
//성 지키기

package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01236 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(reader.readLine());
        int M = Integer.parseInt(st1.nextToken());
        int N = Integer.parseInt(st1.nextToken());

        String[] castle = new String[M];

        for (int i = 0; i < M; i++) {
            castle[i] = reader.readLine();
        }

        System.out.println(process(castle));
    }

    private static int process(String[] castle) {
        int rowCount = 0;
        int colCount = 0;

        for (String s : castle) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == 'X') {
                    count++;
                }
            }
            if (count == 0) {
                rowCount++;
            }
        }

        for (int i = 0; i < castle[0].length(); i++) {
            int count = 0;
            for (String s : castle) {
                if (s.charAt(i) == 'X') {
                    count++;
                }
            }
            if (count == 0) {
                colCount++;
            }
        }

        return Math.max(rowCount, colCount);
    }
}
