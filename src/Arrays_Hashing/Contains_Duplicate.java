package Arrays_Hashing;

import java.util.HashSet;
import java.util.Set;

/*Для заданного целочисленного массива nums возвращайте значение,
 true если какое-либо значение встречается в массиве не менее двух раз ,
 и возвращайте значение, false если все элементы различны.*/

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 1};
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (numbers.contains(num))
                return true;
            numbers.add(num);
        }
        return false;
    }
}

