//2024-01-22
//https://www.acmicpc.net/problem/01357
//뒤집힌 덧셈

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01357 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        String X = st.nextToken();
        String Y = st.nextToken();

        System.out.println(process(X, Y));
    }

    private static int process(String X, String Y) {
        StringBuilder x = new StringBuilder(X);
        StringBuilder y = new StringBuilder(Y);

        x.reverse();
        y.reverse();

        StringBuilder answer = new StringBuilder(
                String.valueOf(Integer.parseInt(x.toString()) + Integer.parseInt(y.toString())));
        answer.reverse();

        return Integer.parseInt(answer.toString());
    }
}
