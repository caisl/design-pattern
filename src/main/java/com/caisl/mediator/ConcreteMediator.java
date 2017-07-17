/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.mediator;

/**
 * ConcreteMediator
 *
 * @author shinan
 * @since 2017-07-17
 */
public class ConcreteMediator implements Mediator {
    //持有并维护同事A
    private ConcreteColleagueA colleagueA;
    //持有并维护同事B
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    public void changed(Colleague c) {
        /**
         * 某一个同事类发生了变化，通常需要与其他同事交互
         * 具体协调相应的同事对象来实现协作行为
         */
    }

}
