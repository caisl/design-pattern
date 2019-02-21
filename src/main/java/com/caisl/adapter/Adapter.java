
package com.caisl.adapter;

/**
 * Adapter
 *
 * @author caisl
 * @since 2017-05-02
 */
public class Adapter extends Source implements Targetable {
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
