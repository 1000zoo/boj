//2024-01-14
//https://www.acmicpc.net/problem/02309
//일곱 난쟁이

package bruteforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P02309 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] heights = new int[9];
        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(scanner.nextLine());
        }
        recursion(heights, 0, 0, new ArrayList<>());
    }

    private static void recursion(int[] heights, int index, int sum, List<Integer> candidates) {
        if (candidates.size() == 7 && sum == 100) {
            Collections.sort(candidates);
            print(candidates);
            System.exit(0);
        } else if (candidates.size() == 7) {
            return;
        }

        for (int i = index; i < heights.length; i++) {
            candidates.add(heights[i]);
            recursion(heights, index + 1, sum + heights[i], candidates);
            candidates.remove(candidates.size() - 1);
        }
    }

    private static void print(List<Integer> candidates) {
        for (Integer candidate : candidates) {
            System.out.println(candidate);
        }
    }
}
