package algorithms.t27;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * <p/>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Created by wudi on 15-4-16.
 */
public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int sub = 0;
        for (int i = 0; i < A.length - sub; i++) {
            if (A[i] == elem) {
                int last = A[A.length - 1 - sub];
                if (elem != last) {
                    A[i] = last;
                } else {
                    i--;
                }
                A[A.length - 1 - sub] = 0;
                sub++;
            }
        }
        return A.length - sub;
    }
}
