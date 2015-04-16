package algorithms.t88;

/**
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * <p/>
 * Note:
 * You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B.
 * The number of elements initialized in A and B are m and n respectively.
 * Created by wudi on 15-4-16.
 */
public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        int pA = m - 1;
        int pB = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (pA < 0 && pB >= 0) {
                A[i] = B[pB];
                pB--;
                continue;
            } else if (pB < 0 && pA >= 0) {
                A[i] = A[pA];
                pA--;
                continue;
            }

            if (A[pA] > B[pB]) {
                A[i] = A[pA];
                pA--;
            } else if (A[pA] <= B[pB]) {
                A[i] = B[pB];
                pB--;
            }
        }
    }
}
