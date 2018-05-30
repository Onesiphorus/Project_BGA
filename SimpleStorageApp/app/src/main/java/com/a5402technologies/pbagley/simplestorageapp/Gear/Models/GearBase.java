package com.a5402technologies.pbagley.simplestorageapp.Gear.Models;

import java.util.List;

public class GearBase {
    private String name;
    private Integer cost;
    private Integer sell;
    private Integer weight;
    private Integer darkStone;
    private Integer agilityBonus;
    private Integer cunningBonus;
    private Integer spiritBonus;
    private Integer strengthBonus;
    private Integer loreBonus;
    private Integer luckBonus;
    private Integer healthBonus;
    private Integer sanityBonus;
    private Integer initiativeBonus;
    private List<String> restrictions;

    public GearBase(String name) {
        this.name = name;
    }

    public String getName() {
        return null == name ? "noName" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return null == cost ? 0 : cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getSell() {
        return null == sell ? 0 : sell;
    }

    public void setSell(Integer sell) {
        this.sell = sell;
    }

    public Integer getWeight() {
        return null == weight ? 0 : weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getDarkStone() {
        return null == darkStone ? 0 : darkStone;
    }

    public void setDarkStone(Integer darkStone) {
        this.darkStone = darkStone;
    }

    public Integer getAgilityBonus() {
        return null == agilityBonus ? 0 : agilityBonus;
    }

    public void setAgilityBonus(Integer agilityBonus) {
        this.agilityBonus = agilityBonus;
    }

    public Integer getCunningBonus() {
        return null == cunningBonus ? 0 : cunningBonus;
    }

    public void setCunningBonus(Integer cunningBonus) {
        this.cunningBonus = cunningBonus;
    }

    public Integer getSpiritBonus() {
        return null == spiritBonus ? 0 : spiritBonus;
    }

    public void setSpiritBonus(Integer spiritBonus) {
        this.spiritBonus = spiritBonus;
    }

    public Integer getStrengthBonus() {
        return null == strengthBonus ? 0 : strengthBonus;
    }

    public void setStrengthBonus(Integer strengthBonus) {
        this.strengthBonus = strengthBonus;
    }

    public Integer getLoreBonus() {
        return null == loreBonus ? 0 : loreBonus;
    }

    public void setLoreBonus(Integer loreBonus) {
        this.loreBonus = loreBonus;
    }

    public Integer getLuckBonus() {
        return null == luckBonus ? 0 : luckBonus;
    }

    public void setLuckBonus(Integer luckBonus) {
        this.luckBonus = luckBonus;
    }

    public Integer getHealthBonus() {
        return null == healthBonus ? 0 : healthBonus;
    }

    public void setHealthBonus(Integer healthBonus) {
        this.healthBonus = healthBonus;
    }

    public Integer getSanityBonus() {
        return null == sanityBonus ? 0 : sanityBonus;
    }

    public void setSanityBonus(Integer sanityBonus) {
        this.sanityBonus = sanityBonus;
    }

    public Integer getInitiativeBonus() {
        return null == initiativeBonus ? 0 : initiativeBonus;
    }

    public void setInitiativeBonus(Integer initiativeBonus) {
        this.initiativeBonus = initiativeBonus;
    }

    public List<String> getRestrictions() {
        if (null == restrictions) {
            restrictions.add("None");
        }
        return restrictions;
    }

    public void addRestriction(String r) {
        this.restrictions.add(r);
    }

    public void setRestrictions(List<String> restrictions) {
        this.restrictions = restrictions;
    }
}
