package Arrays_Hashing;

/*Учитывая массив целых чисел nums и целое число target, верните индексы двух чисел так, чтобы они составляли в сумме target.
Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды.
Вы можете вернуть ответ в любом порядке.

Time Complexity: O(N)
Space Complexity: O(N)
*/

import java.util.HashMap;

public class Two_sum {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 4, 5};
        System.out.println(twoSum(a, 9));

    }

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[0];
    }
}
