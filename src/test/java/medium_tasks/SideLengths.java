package medium_tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SideLengths {
    public static int warOfNumbers(int[]numbers){

        int odd = 0;
        int even = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                even += numbers[i];
            }
            else {
                odd += numbers[i];
            }
        }
        int result = Math.max(even,odd) - Math.min(even,odd);
        return result;
    }
    @DataProvider(name = "warOfNum")
    public Object[][] warOfNum() {
        return new Object[][] {
                {new int []{2, 8, 7, 5}, 2},
                {new int []{12, 90, 75}, 27},
                {new int []{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}, 168}
        };
    }

    @Test(dataProvider = "warOfNum")
    public static void test(int [] num, int num1){
        Assert.assertEquals(warOfNumbers(num), num1);
    }

}
