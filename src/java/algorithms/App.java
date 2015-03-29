package algorithms;

import algorithms.t38.CountAndSay;

import java.util.Date;

/**
 * Main Class.
 * Created by wudi on 2015/3/29.
 */
public class App {
    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        long start = new Date().getTime();
        System.out.println(countAndSay.countAndSay(5));
        long end = new Date().getTime();
        System.out.println(end - start);
    }
}
