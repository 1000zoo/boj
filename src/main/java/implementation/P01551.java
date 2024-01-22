//2024-01-22
//https://www.acmicpc.net/problem/01551
//수열의 변화

package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P01551 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int K = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(reader.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st2.nextToken(","));
        }

        int[] temp = array;
        while (K-- > 0) {
            temp = new int[--N];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = array[i + 1] - array[i];
            }
            array = temp;
        }

        String answer = Arrays.stream(temp).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println(answer);

    }
}
