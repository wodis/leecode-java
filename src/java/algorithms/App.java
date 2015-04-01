package algorithms;

import algorithms.t118.PascalsTriangle;
import algorithms.t21.ListNode;
import algorithms.t21.MergeTwoSortedLists;
import algorithms.t38.CountAndSay;

import java.util.Date;
import java.util.List;

/**
 * Main Class.
 * Created by wudi on 2015/3/29.
 */
public class App {
    public static void main(String[] args) {
        long start = new Date().getTime();
        /******/

        mergeTwoLists();

        /******/
        long end = new Date().getTime();
        System.out.println("consume time : " + (end - start) + " ms");
    }

    public static void mergeTwoLists(){
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        mergeTwoSortedLists.mergeTwoLists(l1,l2);
    }

    public static void pascalsTriangle() {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> result = pascalsTriangle.generate(5);
        System.out.println(result);
    }

    public static void countAndSay() {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(5));
    }
}
