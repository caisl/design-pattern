/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.singleton;

/**
 * EagerSingleton
 *
 * @author shinan
 * @desc 饿汉单例类
 * @since 2017-07-12
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    private static EagerSingleton getInstance() {
        return instance;
    }
}
