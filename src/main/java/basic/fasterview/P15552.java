//2023-12-26
//https://www.acmicpc.net/problem/15552
//빠른 A + B

package basic.fasterview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine());

        int length = Integer.parseInt(st.nextToken());

        for (int i = 0; i < length; i++) {
            StringTokenizer line = new StringTokenizer(reader.readLine());
            int ans = Integer.parseInt(line.nextToken()) + Integer.parseInt(line.nextToken());
            writer.write(ans + "\n");
        }

        writer.flush();
        writer.close();
    }
}
