
package com.caisl;

/**
 * StringTest
 *
 * @author caisl
 * @since 2017-05-12
 */
public class StringTest {
    public static void main(String args[]){
        String str1 ="caisl";
        String str2 = new String("caisl");
        System.out.println(str1 == str2);
        String str3 = "caisl";
        System.out.println(str1 == str3);
        String str4 = str1 + "1";
        String str5 = "caisl1";

        System.out.println(str4 == str5);

    }
}
