
package com.caisl.command;

/**
 * SimpleRemoteControl
 *
 * @author caisl
 * @since 2017-05-11
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}
    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
