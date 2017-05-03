/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.chain;

/**
 * MyHandler
 *
 * @author shinan
 * @since 2017-05-03
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name){
        this.name = name;
    }
    public void operator() {
        System.out.println(name + "deal!");
        if(getHandler() != null){
            getHandler().operator();
        }
    }
}
