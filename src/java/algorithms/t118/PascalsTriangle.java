package algorithms.t118;

import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * <p/>
 * For example, given numRows = 5,
 * Return
 * <p/>
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 * <p/>
 * Created by wudi on 15-3-30.
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        //init
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < numRows; j++) {
                list.add(0);
            }
            result.add(list);
        }

        //add
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    result.get(i).set(j, 1);
                } else {
                    if (i != 0) {
                        List<Integer> last = result.get(i - 1);
                        int upper = last.get(j);
                        if (upper == 0) {
                            result.get(i).set(j, 1);
                        } else {
                            int sum = last.get(j) + last.get(j - 1);
                            result.get(i).set(j, sum);
                        }
                    }
                }
            }


            //cut
            if (i > 1) {
                List<Integer> pre = result.get(i - 2).subList(0, i - 1);
                result.set(i - 2, pre);
            }

            if (i > 0 && i == numRows -1 ) {
                List<Integer> pre = result.get(i - 1).subList(0, i);
                result.set(i - 1, pre);
            }
        }
        return result;
    }
}
