package test;

import java.util.ArrayList;

public class q7 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i=0 ; i<10 ; i++ ) {
            nums.add(i+1);
        }
        System.out.println("nums="+nums);
        int sum = 10;
        for (Integer num : nums ) {
            sum += num;
        }
        System.out.printf("合計は、%dです。", sum);
    }
}
