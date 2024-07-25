question 4:

package Interface;

import java.util.Scanner;
import java.util.*;

public class CharArrayGenerator {

    public static char[] generateCharArray(int[] input1) {
       
        List<Pair<Integer, Integer>> indexedList = new ArrayList<>();
        for (int i = 0; i < input1.length; i++) {
            indexedList.add(new Pair<>(input1[i], i));
        }
        indexedList.sort(Comparator.comparingInt(Pair::getKey));
        char[] output = new char[input1.length];
        char currentChar = 'a';
        
        for (int i = 0; i < indexedList.size(); i++) {
            int originalIndex = indexedList.get(i).getValue();
            output[originalIndex] = (char) (currentChar + i);
        }

        return output;
    }

    public static void main(String[] args) {
        int[] input1 = {10, 5, 70, 1};
        char[] output1 = generateCharArray(input1);
        System.out.println("Input: " + Arrays.toString(input1));
        System.out.println("Output: " + Arrays.toString(output1));

        int[] input2 = {4, 5, -2, 8, 99, 67};
        char[] output2 = generateCharArray(input2);
        System.out.println("Input: " + Arrays.toString(input2));
        System.out.println("Output: " + Arrays.toString(output2));
    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
