/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.mediator;

/**
 * Colleague
 *
 * @author shinan
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
