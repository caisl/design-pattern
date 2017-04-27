/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.caisl.builder;

import java.util.ArrayList;

/**
 * Toy
 *
 * @author shinan
 * @since 2017-04-27
 */
public class Toy {
    private String head;
    private String body;
    private ArrayList<String> legs;
    private ArrayList<String> hands;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ArrayList<String> getLegs() {
        return legs;
    }

    public void setLegs(ArrayList<String> legs) {
        this.legs = legs;
    }

    public ArrayList<String> getHands() {
        return hands;
    }

    public void setHands(ArrayList<String> hands) {
        this.hands = hands;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", legs=" + legs +
                ", hands=" + hands +
                '}';
    }

    public static class Builder {
        private Toy toy;

        public Builder() {
            toy = new Toy();
        }

        public Builder setHead(String head) {
            toy.setHead(head);
            return this;
        }

        public Builder setBody(String body) {
            toy.setBody(body);
            return this;
        }

        public Builder setLegs(ArrayList<String> legs) {
            toy.setLegs(legs);
            return this;
        }

        public Builder setHands(ArrayList<String> hands) {
            toy.setHands(hands);
            return this;
        }

        public Toy build() {
            return toy;
        }
    }
}

