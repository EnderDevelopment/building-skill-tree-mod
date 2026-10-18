package com.enderdevelopment.skilltreemod.common.skills;

public class Skill {
    private String name;
    private int level;

    public Skill(String name) {
        this.name = name;
        this.level = 0;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void increaseLevel() {
        level++;
    }
}