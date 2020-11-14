package problem_1043;

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static int maxSumAfterPartitioning(List<Integer> arr, int k) {
        int N = arr.size();
        int[] dp = new int[N];
        for(int i = 0; i < N; i++) {
            int curMax = 0;
            for(int j = 0; j < k; j++) {
                if(i - j < 0) break;
                curMax = Math.max(curMax, arr.get(i - j));
                int previousSum = i - (j + 1) >= 0 ? dp[i - (j + 1)] : 0;
                dp[i] = Math.max(dp[i],  previousSum + curMax * (j + 1));
            }
        }

        PrintUtils.printArray(dp);

        return dp[N - 1];
    }

    public static void main(String args[]) {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 15, 7, 9, 2, 5, 10));
        System.out.println(maxSumAfterPartitioning(input, 3));

        List<Integer> input2 = new ArrayList<>(Arrays.asList(1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3));
        System.out.println(maxSumAfterPartitioning(input2, 4));
    }
}
