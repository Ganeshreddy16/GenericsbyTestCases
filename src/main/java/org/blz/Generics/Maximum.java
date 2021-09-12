package org.blz.Generics;

public class Maximum {

    public static String getMaximum(String a, String b, String c) {
        String max=a;
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
