package Arrays_Hashing;

import java.util.*;

/*Учитывая массив строк strs, сгруппируйте анаграммы вместе.
Вы можете вернуть ответ в любом порядке.

Анаграмма — это слово или фраза, образованная путем перестановки букв другого слова или фразы,
обычно с использованием всех исходных букв ровно один раз.*/

public class Group_anagrams {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0)
            return res;
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] hash = new char[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String str = new String(hash);
            if (map.get(str) == null) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}
