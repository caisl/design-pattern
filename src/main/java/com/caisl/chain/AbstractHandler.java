
package com.caisl.chain;

/**
 * AbstractHandler
 *
 * @author caisl
 * @since 2017-05-03
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler(){
        return handler;
    }

    public void setHandler(Handler handler){
        this.handler = handler;
    }

}
