
package com.caisl.singleton;

/**
 * LazySingleton
 *
 * @author caisl
 * @desc 懒汉式单例
 * @since 2017-07-12
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
