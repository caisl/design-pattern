
package com.caisl.bridge;

/**
 * MyBridge
 *
 * @author caisl
 * @since 2017-05-03
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
