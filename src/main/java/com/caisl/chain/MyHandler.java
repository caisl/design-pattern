
package com.caisl.chain;

/**
 * MyHandler
 *
 * @author caisl
 * @since 2017-05-03
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name){
        this.name = name;
    }
    public void operator() {
        System.out.println(name + "deal!");
        if(getHandler() != null){
            getHandler().operator();
        }
    }
}
