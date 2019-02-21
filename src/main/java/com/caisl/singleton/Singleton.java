
package com.caisl.singleton;

/**
 * Singleton
 *
 * @author caisl
 * @since 2017-05-02
 */
public class Singleton {

    private static Singleton instance = null;
    private Singleton(){

    }

    public static Singleton getIntance(){
        if(instance == null){
            synchronized (instance) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    private static class SingletonFactory{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return Singleton.instance;
    }
}
