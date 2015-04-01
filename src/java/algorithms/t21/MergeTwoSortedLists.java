package algorithms.t21;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * Created by wudi on 2015/4/1.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 != null) {
            ListNode pre = null;
            ListNode ll = l1.next;
            while (ll != null) {
                pre = ll;
                ll = ll.next;
            }
            if (pre != null) {
                pre.next = l2;
            } else {
                l1.next = l2;
            }
            return l1;
        } else {
            return l2;
        }
    }
}
