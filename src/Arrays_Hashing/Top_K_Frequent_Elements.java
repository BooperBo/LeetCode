package Arrays_Hashing;

import java.util.*;

public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        List<Integer> result = findTopKFrequentNumbers(new int[]{1, 3, 5, 12, 11, 12, 11, 4, 4}, 3);
        System.out.println("Here are the K frequent numbers: " + result);

//        List<Integer> result = findTopKFrequentNumbers(new int[] {1,1,1,2,2 }, 2);
//        System.out.println("Here are the K frequent numbers: " + result);

    }

    public static List<Integer> findTopKFrequentNumbers(int[] nums, int k) {
        if (k == nums.length) {
            return new ArrayList<>();
        }

        Map<Integer, Integer> numFrequencyMap = new HashMap<>();
        for (int n : nums) {
            numFrequencyMap.put(n, numFrequencyMap.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : numFrequencyMap.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<Integer> topNumbers = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            topNumbers.add(minHeap.poll().getKey());
        }
        return topNumbers;
    }

    static public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> eleFreq = new HashMap<>();
        for (int i : nums) {
            eleFreq.put(i, eleFreq.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1]; // need n+1 because if all numbers are same then the freq is 'n'

        for (Map.Entry<Integer, Integer> entry : eleFreq.entrySet()) {
            int n = entry.getKey();
            int f = entry.getValue();

            if (freq[f] == null) freq[f] = new ArrayList<>();

            freq[f].add(n);
        }

        int[] ans = new int[k];
        int c = 0;
        for (int i = freq.length - 1; i > 0 && c < k; i--) {
            if (freq[i] == null) continue;
            for (int num : freq[i]) {
                ans[c++] = num;
                if (c == k) break;
            }
        }
        return ans;
    }
}
