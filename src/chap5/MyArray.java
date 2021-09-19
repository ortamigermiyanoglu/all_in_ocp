package chap5;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        String[] compare1 = {"zelis", "memis", "velis"};
        String[] compare2 = {"veli", "ziya", "sami"};
        int[] space [], ships[][]; //2d array and 3d array

        int[] compare3 = {1};
        int[] compare4 = {2};

        System.out.println(Arrays.compare(compare3, compare4));
        System.out.println(Arrays.compare(compare1, compare2));

        Arrays.sort(compare2);

        System.out.println(Arrays.toString(compare2));

        int[] intt = new int[0];
    }
}
