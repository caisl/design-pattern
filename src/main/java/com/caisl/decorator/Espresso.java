
package com.caisl.decorator;

/**
 * Espresso
 *
 * @author caisl
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
