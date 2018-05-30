package com.a5402technologies.pbagley.simplestorageapp.Gear.Models;

public class RangedWeapon extends GearBase {
    private Integer damageDie = 6;
    private Integer damageBonus = 0;
    private Integer shots = 0;
    private Integer range = 0;
    private Boolean twoHanded = false;

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

    public Boolean getTwoHanded() {
        return twoHanded;
    }

    public void setTwoHanded(Boolean twoHanded) {
        this.twoHanded = twoHanded;
    }
}
