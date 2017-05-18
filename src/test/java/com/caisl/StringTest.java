/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl;

/**
 * StringTest
 *
 * @author shinan
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
