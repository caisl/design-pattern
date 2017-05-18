/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.command;

/**
 * SimpleRemoteControl
 *
 * @author shinan
 * @since 2017-05-11
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}
    public void setCommond(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
