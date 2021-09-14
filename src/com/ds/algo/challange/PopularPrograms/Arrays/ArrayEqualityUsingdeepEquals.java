package com.ds.algo.challange.PopularPrograms.Arrays;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 9/14/21 9:33 AM
 */

// f you are checking multidimensional arrays for equality, then use deepEquals() method of Arrays class instead of equals() method. Because, deepEquals() performs deep comparison
public class ArrayEqualityUsingdeepEquals {

    public static void main(String[] args)
    {
        String[][] s1 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };

        String[][] s2 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };

        System.out.println(Arrays.deepEquals(s1, s2));     //Output : true

        //Calling equals() method on same arrays will return false

        System.out.println(Arrays.equals(s1, s2));        //Output : false

        //That's why use deepEquals() method to compare multidimensional arrays
    }
}
