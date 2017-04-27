/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.factory;

import java.util.ArrayList;

/**
 * Pizza
 *
 * @author shinan
 * @since 2017-04-27
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce ...");
        System.out.println("Adding topping :");
        for(int i = 0 ; i< toppings.size(); i++){
            System.out.println("  " + toppings.get(i));
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return this.name;
    }
}
