//2024-01-19
//https://www.acmicpc.net/problem/01268
//임시 반장 정하기

package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01268 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[][] students = new int[N][5];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int index = 0;
            while (st.hasMoreTokens()) {
                students[i][index++] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(process(students));
    }

    private static int process(int[][] students) {
        int[] info = new int[students.length];

        for (int i = 0; i < students.length; i++) {
            int count = 0;
            for (int j = 0; j < students.length; j++) {
                if (i == j) {
                    continue;
                }
                if (atLeastOne(students[i], students[j])) {
                    count++;
                }
            }
            info[i] = count;
        }
        int max = -1;
        int elected = -1;

        for (int i = 0; i < info.length; i++) {
            if (max < info[i]) {
                max = info[i];
                elected = i + 1;
            }
        }

        return elected;
    }

    private static boolean atLeastOne(int[] s1, int[] s2) {
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == s2[i]) {
                return true;
            }
        }
        return false;
    }
}
