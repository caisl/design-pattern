
package com.caisl.command;

/**
 * LightOnCommand
 *
 * @author caisl
 * @since 2017-05-11
 */
public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}
