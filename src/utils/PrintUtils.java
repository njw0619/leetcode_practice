package utils;

import java.util.List;

public class PrintUtils {
    public static void printList(List<? extends Object> list) {
        System.out.print("[ ");
        for(Object t : list) {
            System.out.print(t + " ");
        }
        System.out.println("]");
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for(Object t : array) {
            System.out.print(t + " ");
        }
        System.out.println("]");
    }
}
