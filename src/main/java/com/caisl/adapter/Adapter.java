/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.adapter;

/**
 * Adapter
 *
 * @author shinan
 * @since 2017-05-02
 */
public class Adapter extends Source implements Targetable {
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
