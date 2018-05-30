package com.a5402technologies.pbagley.simplestorageapp.Gear.Models;

public class MeleeWeapon extends GearBase {
    private Integer combat = 0;
    private Integer damageBonus = 0;
    private Integer damageDie = 6;
    private Boolean twoHanded = false;

    public MeleeWeapon(String name) {
        super(name);
    }

    public Integer getCombat() {
        return combat;
    }

    public void setCombat(Integer combat) {
        this.combat = combat;
    }

    public Integer getDamageBonus() {
        return damageBonus;
    }

    public void setDamageBonus(Integer damageBonus) {
        this.damageBonus = damageBonus;
    }

    public Integer getDamageDie() {
        return damageDie;
    }

    public void setDamageDie(Integer damageDie) {
        this.damageDie = damageDie;
    }
}

