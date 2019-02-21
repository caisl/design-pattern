
package com.caisl.adapter;

/**
 * Wrapper
 *
 * @author caisl
 * @since 2017-05-02
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source){
        this.source = source;
    }
    public void method1() {
        source.method1();
    }

    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
