package com.a5402technologies.pbagley.simplestorageapp.Gear;

import java.util.List;

public class GearBase {
    private String name;
    private Integer cost = 0;
    private Integer sell = 0;
    private Integer weight = 0;
    private Integer darkStone = 0;
    private Integer agilityBonus = 0;
    private Integer cunningBonus = 0;
    private Integer spiritBonus = 0;
    private Integer strengthBonus = 0;
    private Integer loreBonus = 0;
    private Integer luckBonus = 0;
    private Integer healthBonus = 0;
    private Integer sanityBonus = 0;
    private Integer initiativeBonus = 0;
    private List<String> restrictions = null;

    public GearBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getSell() {
        return sell;
    }

    public void setSell(Integer sell) {
        this.sell = sell;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getDarkStone() {
        return darkStone;
    }

    public void setDarkStone(Integer darkStone) {
        this.darkStone = darkStone;
    }

    public Integer getAgilityBonus() {
        return agilityBonus;
    }

    public void setAgilityBonus(Integer agilityBonus) {
        this.agilityBonus = agilityBonus;
    }

    public Integer getCunningBonus() {
        return cunningBonus;
    }

    public void setCunningBonus(Integer cunningBonus) {
        this.cunningBonus = cunningBonus;
    }

    public Integer getSpiritBonus() {
        return spiritBonus;
    }

    public void setSpiritBonus(Integer spiritBonus) {
        this.spiritBonus = spiritBonus;
    }

    public Integer getStrengthBonus() {
        return strengthBonus;
    }

    public void setStrengthBonus(Integer strengthBonus) {
        this.strengthBonus = strengthBonus;
    }

    public Integer getLoreBonus() {
        return loreBonus;
    }

    public void setLoreBonus(Integer loreBonus) {
        this.loreBonus = loreBonus;
    }

    public Integer getLuckBonus() {
        return luckBonus;
    }

    public void setLuckBonus(Integer luckBonus) {
        this.luckBonus = luckBonus;
    }

    public Integer getHealthBonus() {
        return healthBonus;
    }

    public void setHealthBonus(Integer healthBonus) {
        this.healthBonus = healthBonus;
    }

    public Integer getSanityBonus() {
        return sanityBonus;
    }

    public void setSanityBonus(Integer sanityBonus) {
        this.sanityBonus = sanityBonus;
    }

    public Integer getInitiativeBonus() {
        return initiativeBonus;
    }

    public void setInitiativeBonus(Integer initiativeBonus) {
        this.initiativeBonus = initiativeBonus;
    }

    public List<String> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<String> restrictions) {
        this.restrictions = restrictions;
    }
}
