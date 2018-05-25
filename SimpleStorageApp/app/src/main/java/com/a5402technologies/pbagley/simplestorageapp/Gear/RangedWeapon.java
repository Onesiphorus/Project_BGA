package com.a5402technologies.pbagley.simplestorageapp.Gear;

public class RangedWeapon extends GearBase {
    private Integer damageDie;
    private Integer damageBonus;
    private Integer shots;
    private Integer range;
    private Boolean twoHanded;

    public RangedWeapon(String name) {
        super(name);
    }

    public Integer getDamageDie() {
        return damageDie;
    }

    public void setDamageDie(Integer damageDie) {
        this.damageDie = damageDie;
    }

    public Integer getDamageBonus() {
        return damageBonus;
    }

    public void setDamageBonus(Integer damageBonus) {
        this.damageBonus = damageBonus;
    }

    public Integer getShots() {
        return shots;
    }

    public void setShots(Integer shots) {
        this.shots = shots;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }
}
