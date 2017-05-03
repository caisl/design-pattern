/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package chain;

import com.caisl.chain.MyHandler;

/**
 * ChainTest
 *
 * @author shinan
 * @since 2017-05-03
 */
public class ChainTest {
    public static  void main(String args[]){
        MyHandler h1 = new MyHandler("H1");
        MyHandler h2 = new MyHandler("H2");
        MyHandler h3 = new MyHandler("H3");

        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operator();

    }
}
