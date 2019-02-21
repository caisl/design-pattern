
package com.caisl.mediator;

/**
 * Colleague
 *
 * @author caisl
 * @since 2017-07-17
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator(){
        return mediator;
    }
}
