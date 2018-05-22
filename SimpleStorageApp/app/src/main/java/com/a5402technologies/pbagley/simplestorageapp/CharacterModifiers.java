package com.a5402technologies.pbagley.simplestorageapp;

public class CharacterModifiers {
    private String characterName;
    private Integer agilityBonus;
    private Integer cunningBonus;
    private Integer spiritBonus;
    private Integer strengthBonus;
    private Integer loreBonus;
    private Integer luckBonus;
    private Integer healthBonus;
    private Integer sanityBonus;
    private Integer defense;
    private Integer willpower;
    private Integer armor;
    private Integer spiritArmor;
    private Integer rangedToHit;
    private Integer rangedDamageDie;
    private Integer rangedDamageBonus;
    private Integer meleeToHit;
    private Integer meleeDamageBonus;
    private Integer meleeDamageDie;
    private Integer combatBonus;
    private Integer initiativeBonus;
    private Integer shotsBonus;
    private Integer gold;
    private Integer experience;
    private Integer level;

    public CharacterModifiers(String characterName) {
        this.characterName = characterName;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
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

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getWillpower() {
        return willpower;
    }

    public void setWillpower(Integer willpower) {
        this.willpower = willpower;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public Integer getSpiritArmor() {
        return spiritArmor;
    }

    public void setSpiritArmor(Integer spiritArmor) {
        this.spiritArmor = spiritArmor;
    }

    public Integer getRangedToHit() {
        return rangedToHit;
    }

    public void setRangedToHit(Integer rangedToHit) {
        this.rangedToHit = rangedToHit;
    }

    public Integer getMeleeToHit() {
        return meleeToHit;
    }

    public void setMeleeToHit(Integer meleeToHit) {
        this.meleeToHit = meleeToHit;
    }

    public Integer getCombatBonus() {
        return combatBonus;
    }

    public void setCombatBonus(Integer combatBonus) {
        this.combatBonus = combatBonus;
    }

    public Integer getInitiativeBonus() {
        return initiativeBonus;
    }

    public void setInitiativeBonus(Integer initiativeBonus) {
        this.initiativeBonus = initiativeBonus;
    }

    public Integer getShotsBonus() {
        return shotsBonus;
    }

    public void setShotsBonus(Integer shotsBonus) {
        this.shotsBonus = shotsBonus;
    }
}
