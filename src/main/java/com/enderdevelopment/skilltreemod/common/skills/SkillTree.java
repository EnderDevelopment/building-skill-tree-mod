package com.enderdevelopment.skilltreemod.common.skills;

import java.util.HashMap;
import java.util.Map;

public class SkillTree {
    private Map<String, Skill> skills;

    public SkillTree() {
        skills = new HashMap<>();
    }

    public void addSkill(Skill skill) {
        skills.put(skill.getName(), skill);
    }

    public Skill getSkill(String name) {
        return skills.get(name);
    }
}