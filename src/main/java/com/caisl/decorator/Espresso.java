/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.decorator;

/**
 * Espresso
 *
 * @author shinan
 * @since 2017-04-26
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    public double cost() {
        return 1.99;
    }
}
