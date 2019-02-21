
package com.caisl.decorator;

/**
 * HouseBlend
 *
 * @author caisl
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
