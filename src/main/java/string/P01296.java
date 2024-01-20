//2024-01-21
//https://www.acmicpc.net/problem/01296
//팀 이름 정하기

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P01296 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        int L = getLetterIn(name, 'L');
        int O = getLetterIn(name, 'O');
        int V = getLetterIn(name, 'V');
        int E = getLetterIn(name, 'E');

        int N = Integer.parseInt(reader.readLine());
        String[] inputs = new String[N];

        for (int i = 0; i < N; i++) {
            inputs[i] = reader.readLine();
        }

        Arrays.sort(inputs);

        int maxScore = -1;
        String answer = null;

        for (String input : inputs) {
            int l = L + getLetterIn(input, 'L');
            int o = O + getLetterIn(input, 'O');
            int v = V + getLetterIn(input, 'V');
            int e = E + getLetterIn(input, 'E');
            int score = formula(l, o, v, e);
            if (maxScore < score) {
                maxScore = score;
                answer = input;
            }
        }

        System.out.println(answer);

    }

    private static int getLetterIn(String name, char key) {
        int count = 0;
        for (char c : name.toCharArray()) {
            count += c == key ? 1 : 0;
        }
        return count;
    }

    private static int formula(int L, int O, int V, int E) {
        return ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
    }
}
