/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.decorator;

/**
 * Beverage
 *
 * @author shinan
 * @since 2017-04-26
 */
public abstract class Beverage {
    protected String description;

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();

}
