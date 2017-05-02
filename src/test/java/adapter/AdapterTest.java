/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package adapter;

import com.caisl.adapter.Adapter;
import com.caisl.adapter.Source;
import com.caisl.adapter.Targetable;
import com.caisl.adapter.Wrapper;
import com.caisl.adapter.inter.SourceSub1;
import com.caisl.adapter.inter.SourceSub2;
import com.caisl.adapter.inter.Sourceable;

/**
 * AdapterTest
 *
 * @author shinan
 * @since 2017-05-02
 */
public class AdapterTest {
    public static void main(String args[]){
        Targetable target = new Adapter();
        target.method1();
        target.method2();

        Source source = new Source();
        Targetable wrapper = new Wrapper(source);
        wrapper.method1();
        wrapper.method2();


        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
