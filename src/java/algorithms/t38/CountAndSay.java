package algorithms.t38;

import java.util.ArrayList;
import java.util.List;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * <p/>
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * <p/>
 * Note: The sequence of integers will be represented as a string.
 * <p/>
 * Created by wudi on 2015/3/29.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        String current = "0";
        String next = "0";
        for (int i = 1; i <= n; i++){
            if (i == 1){
                current = "1";
                next = countNext(String.valueOf(1));
            }else {
                current = next;
                next = countNext(current);
            }
        }
        return current;
    }

    public String countNext(String n) {
        char[] chars = n.toCharArray();
        List<Integer> numbers = new ArrayList<>();
        for (char c : chars) {
            String s = String.valueOf(c);
            numbers.add(Integer.valueOf(s));
        }
        numbers.add(-1);

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < numbers.size(); i++) {
            if (i > 0) {
                int previous = numbers.get(i - 1);
                int current = numbers.get(i);
                if (previous == current) {
                    count++;
                } else {
                    sb.append(count).append(previous);
                    count = 1;
                }
            }
        }

        return sb.toString();
    }
}
