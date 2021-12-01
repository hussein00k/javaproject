package com.company;

public class Condition {
    String cond_name;
    String cond_state;

    public Condition(String cond_name, String cond_state) {
        this.cond_name = cond_name;
        this.cond_state = cond_state;
    }

    public String getCond_name() {
        return cond_name;
    }

    public String getCond_state() {
        return cond_state;
    }
}
