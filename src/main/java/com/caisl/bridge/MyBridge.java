/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.bridge;

/**
 * MyBridge
 *
 * @author shinan
 * @since 2017-05-03
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
