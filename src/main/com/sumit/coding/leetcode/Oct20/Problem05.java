package main.com.sumit.coding.leetcode.Oct20;

/*
 * URL
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3484/
 * */
public class Problem05 {
    public static void main(String[] args) {
        System.out.println(new Problem05().bitwiseComplement(5));
    }

    public int bitwiseComplement(int n) {
        int m = n;
        int mask = 0;

        // edge case
        if (n == 0) return 1;

        while (m != 0) {
            mask = (mask << 1) | 1;
            m = m >> 1;
        }

        return (~n) & mask;
    }
}
