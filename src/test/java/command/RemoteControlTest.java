
package command;

import com.caisl.command.Light;
import com.caisl.command.LightOnCommand;
import com.caisl.command.SimpleRemoteControl;

/**
 * RemoteControlTest
 *
 * @author caisl
 * @since 2017-05-11
 */
public class RemoteControlTest {
    public static void main(String args[]){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}
