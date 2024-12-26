package src.main.java.medium_tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOfMultiples {
    public static int[] arrayOfMultiples(int num, int length) {
        int [] nums = new int[length];

        for (int i = 0; i < length; i++) {
            nums[i] = num * (i+1);
        }
        // arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
        //
        //arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
        //
        //arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
        return nums;
    }

    @DataProvider (name = "arrays")
    public Object[][] arrays() {
        return new Object[][] {
                {7, 5, new int[]{7, 14, 21, 28, 35}},
                {12, 10, new int[]{12, 24, 36, 48, 60, 72, 84, 96, 108, 120}},
                {17, 6, new int[]{17, 34, 51, 68, 85, 102}}
        };
    }

    @Test(dataProvider = "arrays")
    public void test(int num, int length, int[] nums) {

        Assert.assertEquals(Arrays.toString(arrayOfMultiples(num,length)),Arrays.toString(nums));
    }


}
