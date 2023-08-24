package javaproject;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class test01 {
    int n;
    String s;

    public test01(final int n, final String s) {
        this.n = n;
        this.s = s;
    }

    public static void main(final String[] args) {
        Collection<Object> c = new TreeSet<>(
        new Comparator<Object>() {
            @Override
            public int compare(Object arg0, Object arg1) {
                return 1;
            }
        });
        c.add("1");
        c.add(2);
        c.add("args");
        for (Object object : c) {
            System.out.println(object);
        }

    }

}
