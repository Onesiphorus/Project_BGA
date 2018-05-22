package com.a5402technologies.pbagley.simplestorageapp;

import java.util.List;

public class CharacterClass {
    private String className;
    private Integer Agility;
    private Integer Cunning;
    private Integer Spirit;
    private Integer Strength;
    private Integer Lore;
    private Integer Luck;
    private Integer Health;
    private Integer Sanity;
    private Integer Defense;
    private Integer Willpower;
    private Integer RangedToHit;
    private Integer MeleeToHit;
    private Integer Combat;
    private Integer Initiative;

    CharacterClass() {}

    public CharacterClass(String className, Integer agility, Integer cunning, Integer spirit,
                          Integer strength, Integer lore, Integer luck, Integer health,
                          Integer sanity, Integer defense, Integer willpower, Integer rangedToHit,
                          Integer meleeToHit, Integer combat, Integer initiative)
    {
        this.className = className;
        Agility = agility;
        Cunning = cunning;
        Spirit = spirit;
        Strength = strength;
        Lore = lore;
        Luck = luck;
        Health = health;
        Sanity = sanity;
        Defense = defense;
        Willpower = willpower;
        RangedToHit = rangedToHit;
        MeleeToHit = meleeToHit;
        Combat = combat;
        Initiative = initiative;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getAgility() {
        return Agility;
    }

    public void setAgility(Integer agility) {
        Agility = agility;
    }

    public Integer getCunning() {
        return Cunning;
    }

    public void setCunning(Integer cunning) {
        Cunning = cunning;
    }

    public Integer getSpirit() {
        return Spirit;
    }

    public void setSpirit(Integer spirit) {
        Spirit = spirit;
    }

    public Integer getStrength() {
        return Strength;
    }

    public void setStrength(Integer strength) {
        Strength = strength;
    }

    public Integer getLore() {
        return Lore;
    }

    public void setLore(Integer lore) {
        Lore = lore;
    }

    public Integer getLuck() {
        return Luck;
    }

    public void setLuck(Integer luck) {
        Luck = luck;
    }

    public Integer getHealth() {
        return Health;
    }

    public void setHealth(Integer health) {
        Health = health;
    }

    public Integer getSanity() {
        return Sanity;
    }

    public void setSanity(Integer sanity) {
        Sanity = sanity;
    }

    public Integer getDefense() {
        return Defense;
    }

    public void setDefense(Integer defense) {
        Defense = defense;
    }

    public Integer getWillpower() {
        return Willpower;
    }

    public void setWillpower(Integer willpower) {
        Willpower = willpower;
    }

    public Integer getRangedToHit() {
        return RangedToHit;
    }

    public void setRangedToHit(Integer rangedToHit) {
        RangedToHit = rangedToHit;
    }

    public Integer getMeleeToHit() {
        return MeleeToHit;
    }

    public void setMeleeToHit(Integer meleeToHit) {
        MeleeToHit = meleeToHit;
    }

    public Integer getCombat() {
        return Combat;
    }

    public void setCombat(Integer combat) {
        Combat = combat;
    }

    public Integer getInitiative() {
        return Initiative;
    }

    public void setInitiative(Integer initiative) {
        Initiative = initiative;
    }


}
