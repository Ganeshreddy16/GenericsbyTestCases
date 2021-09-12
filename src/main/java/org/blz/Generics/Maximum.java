package org.blz.Generics;

public class Maximum {
//    public static void main(String[] args) {
//        Integer a=11,b=7,c=9;
//        getMaximum(a,b,c);
//
//        }

    public static Integer getMaximum(Integer a, Integer b, Integer c) {
        Integer max=a;
            if(b.compareTo(a)>0 && b.compareTo(c)>0)
            {
            max=b;
            }

        else if (c.compareTo(max)>0) {
                max = c;
            }
        System.out.println(max);
        return max;
    }

}
