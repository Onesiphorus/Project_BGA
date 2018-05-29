package com.a5402technologies.pbagley.simplestorageapp.Character;


import com.a5402technologies.pbagley.simplestorageapp.CharacterClass.CharacterClass;
import com.a5402technologies.pbagley.simplestorageapp.Gear.Clothing;
import com.a5402technologies.pbagley.simplestorageapp.Gear.GearBase;
import com.a5402technologies.pbagley.simplestorageapp.Gear.MeleeWeapon;
import com.a5402technologies.pbagley.simplestorageapp.Gear.RangedWeapon;

import java.io.Serializable;
import java.util.List;

public class Character implements Serializable {
    private String characterName;
    private CharacterClass characterClass;
    private List<GearBase> gear;
    private Integer agilityBonus = 0;
    private Integer cunningBonus = 0;
    private Integer spiritBonus = 0;
    private Integer strengthBonus = 0;
    private Integer loreBonus = 0;
    private Integer luckBonus = 0;
    private Integer healthBonus = 0;
    private Integer sanityBonus = 0;
    private Integer armor = 0;
    private Integer spiritArmor = 0;
    private Integer rangedDamageDie = 6;
    private Integer rangedDamageBonus = 0;
    private Integer meleeDamageBonus = 0;
    private Integer meleeDamageDie = 6;
    private Integer combatBonus = 0;
    private Integer initiativeBonus = 0;
    private Integer maxGritBonus = 0;
    private Integer gold = 0;
    private Integer experience = 0;
    private Integer level = 1;
    private Boolean face = false;
    private Boolean hat = false;
    private Boolean shoulders = false;
    private Boolean torso =false;
    private Boolean gloves = false;
    private Boolean pants = false;
    private Boolean boots = false;
    private Boolean coat = false;
    private Boolean lHand = false;
    private Boolean rHand = false;
    private Boolean hasPTail = false;
    private Boolean pTail = false;

    public Character(String characterName, CharacterClass characterClass) {
        this.characterName = characterName;
        this.characterClass = characterClass;
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

    private Integer getAgilityBonus() {
        return agilityBonus;
    }

    public Integer getAgility() {
        return characterClass.getAgility() + this.getAgilityBonus();
    }

    public void setAgilityBonus(Integer agilityBonus) {
        this.agilityBonus = agilityBonus;
    }

    private Integer getCunningBonus() {
        return cunningBonus;
    }

    public Integer getCunning() {
        return characterClass.getCunning() + this.getCunningBonus();
    }

    public void setCunningBonus(Integer cunningBonus) {
        this.cunningBonus = cunningBonus;
    }

    private Integer getSpiritBonus() {
        return spiritBonus;
    }

    public Integer getSpirit() {
        return characterClass.getSpirit() + this.getSpiritBonus();
    }

    public void setSpiritBonus(Integer spiritBonus) {
        this.spiritBonus = spiritBonus;
    }

    private Integer getStrengthBonus() {
        return strengthBonus;
    }

    public Integer getStrength() {
        return characterClass.getStrength() + this.getStrengthBonus();
    }

    public void setStrengthBonus(Integer strengthBonus) {
        this.strengthBonus = strengthBonus;
    }

    private Integer getLoreBonus() {
        return loreBonus;
    }

    public Integer getLore() {
        return characterClass.getLore() + this.getLoreBonus();
    }

    public void setLoreBonus(Integer loreBonus) {
        this.loreBonus = loreBonus;
    }

    private Integer getLuckBonus() {
        return luckBonus;
    }

    public Integer getLuck() {
        return characterClass.getLuck() + this.getLuckBonus();
    }

    public void setLuckBonus(Integer luckBonus) {
        this.luckBonus = luckBonus;
    }

    public Integer getHealthBonus() {
        return healthBonus;
    }

    public Integer getHealth() {
        return characterClass.getHealth() + this.getHealthBonus();
    }

    public void setHealthBonus(Integer healthBonus) {
        this.healthBonus = healthBonus;
    }

    private Integer getSanityBonus() {
        return sanityBonus;
    }

    public Integer getSanity() {
        return characterClass.getSanity() + this.getSanityBonus();
    }

    public void setSanityBonus(Integer sanityBonus) {
        this.sanityBonus = sanityBonus;
    }

    public Integer getDefense() {
        return characterClass.getDefense();
    }

    public Integer getWillpower() {
        return characterClass.getWillpower();
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

    public Integer getCombatBonus() {
        return combatBonus;
    }

    public Integer getCombat() {
        return characterClass.getCombat() + this.getCombatBonus();
    }

    public void setCombatBonus(Integer combatBonus) {
        this.combatBonus = combatBonus;
    }

    public Integer getInitiativeBonus() {
        return initiativeBonus;
    }

    public Integer getInitiative() {
        return characterClass.getInitiative() + this.getInitiativeBonus();
    }

    public void setInitiativeBonus(Integer initiativeBonus) {
        this.initiativeBonus = initiativeBonus;
    }

    public Integer getMaxGritBonus() {
        return maxGritBonus;
    }

    public Integer getMaxGrit() {
        return characterClass.getMaxGrit() + this.getMaxGritBonus();
    }

    public void setMaxGritBonus(Integer maxGritBonus) {
        this.maxGritBonus = maxGritBonus;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public Integer getRangedDamageDie() {
        return rangedDamageDie;
    }

    public void setRangedDamageDie(Integer rangedDamageDie) {
        this.rangedDamageDie = rangedDamageDie;
    }

    public Integer getRangedDamageBonus() {
        return rangedDamageBonus;
    }

    public void setRangedDamageBonus(Integer rangedDamageBonus) {
        this.rangedDamageBonus = rangedDamageBonus;
    }

    public Integer getMeleeDamageBonus() {
        return meleeDamageBonus;
    }

    public void setMeleeDamageBonus(Integer meleeDamageBonus) {
        this.meleeDamageBonus = meleeDamageBonus;
    }

    public Integer getMeleeDamageDie() {
        return meleeDamageDie;
    }

    public void setMeleeDamageDie(Integer meleeDamageDie) {
        this.meleeDamageDie = meleeDamageDie;
    }

    public void addGear(GearBase newGear) {
        this.gear.add(newGear);
    }

    public void removeGear(final String gearName) {
        this.gear.removeIf((GearBase gb) -> gb.getName().equals(gearName));
    }

    public List<GearBase> getGear() {
        return gear;
    }

    public void setGear(List<GearBase> gear) {
        this.gear = gear;
    }

    public void equipClothing(Clothing c) {

    }

    public void equipRanged(RangedWeapon r) {

    }

    public void equipMelee(MeleeWeapon m) {

    }

}
