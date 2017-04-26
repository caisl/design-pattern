/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package decorator;

import com.caisl.decorator.Beverage;
import com.caisl.decorator.Espresso;
import com.caisl.decorator.HouseBlend;
import com.caisl.decorator.Mocha;

/**
 * StarbuzzCoffee
 *
 * @author shinan
 * @since 2017-04-26
 */
public class StarbuzzCoffee {
    public static void main(String args[]){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

    }
}
