package com.sumit.coding.arrays;

import java.util.ArrayList;
import java.util.List;

/*
 *   Solution to the problem
 *   https://www.interviewbit.com/problems/add-one-to-number/
 */
public class AddOneToNumber {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(); //0, 3, 7, 6, 4, 0, 5, 5, 5
        arr.add(0);
        arr.add(3);
        arr.add(0);
        arr.add(6);
        arr.add(4);
        arr.add(0);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        System.out.println(new AddOneToNumber().plusOne(arr));
    }

    private List<Integer> plusOne(List<Integer> A) {

        int j = 0;
        while (j < A.size() && A.size() > 1) {
            if (A.get(j) == 0)
                A.remove(j);
            else if (A.get(j) != 0)
                break;
        }
        int n = A.size();
        int i = 0;
        int carry = 1;
        int val;

        while (i < n && carry == 1) {

            val = A.get(n - i - 1);
            val += carry;
            if (val > 9) {
                carry = 1;
                A.set(n - i - 1, 0);
            } else {
                carry = 0;
                A.set(n - i - 1, val);
            }

            if (n - i - 1 == 0 && carry == 1) {
                A.add(0, 1);
            }
            i++;
        }
        return A;
    }
}
