package Arrays_Hashing;

/*Даны две строки s и t, вернуть, true если t это анаграмма s, и в false противном случае.

Анаграмма — это слово или фраза, образованная путем перестановки букв другого слова или фразы,
обычно с использованием всех исходных букв ровно один раз.*/

public class Valid_Anargam {
    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagaram"));

    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }

        for (int n : letters) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
