/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.singleton;

/**
 * LazySingleton
 *
 * @author shinan
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
