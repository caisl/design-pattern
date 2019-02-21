
package com.caisl.decorator;

/**
 * Beverage
 *
 * @author caisl
 * @since 2017-04-26
 */
public abstract class Beverage {
    protected String description;

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();

}
