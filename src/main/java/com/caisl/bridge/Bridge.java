
package com.caisl.bridge;

/**
 * Bridge
 *
 * @author caisl
 * @since 2017-05-03
 */
public abstract class Bridge {
    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource(){
        return source;
    }

    public void setSource(Sourceable source){
        this.source =source;
    }
}
