package problem_338;

/*
* 338. Counting Bits
*
* Using dynamic programing, I solved this problem.
* This principle is similar to binary heap.
*
* 1 => 10 11,  10 => 100, 101, 100 => 1000, 1001
*
* we can get two values from ith value.
* First, We can get the value of left child (2 * i th element) using ith value.
* The number of bit of left child is same with the value of their parent. It will be appended 0.
* But The number of bit of right child (2 * i th element) have one bit more than the value of their parent. Because, it will be appended 1.
*
* Using this principle, we do this action repeatedly until i index will be n.
*
* Finally, The loop invariant is finished, We can get the final answer.
*
* */

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> conuntBits(int num) {

        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        for(int i = 2; i <= num; i++) {
            if(i % 2 == 0) { // If the element is left child
                result.add(result.get(i / 2));
            } else {
                result.add(result.get(i / 2) + 1);
            }
        }

        return result;

    }

    public static void main (String args[]) {
        List<Integer> list1 = conuntBits(2);
        PrintUtils.printList(list1);
        List<Integer> list2 = conuntBits(5);
        PrintUtils.printList(list2);
        List<Integer> list3 = conuntBits(16);
        PrintUtils.printList(list3);
    }
}
