/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.decorator;

/**
 * HouseBlend
 *
 * @author shinan
 * @since 2017-04-26
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "HouseBlend";
    }
    public double cost() {
        return .89;
    }
}
