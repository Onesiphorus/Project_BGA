package com.a5402technologies.pbagley.simplestorageapp.Gear;

public class Clothing extends GearBase {

    private Boolean face = false;
    private Boolean hat = false;
    private Boolean shoulders = false;
    private Boolean torso = false;
    private Boolean gloves = false;
    private Boolean pants = false;
    private Boolean boots = false;
    private Boolean coat = false;

    Clothing(String name) {
        super(name);
    }

    public Boolean getFace() {
        return face;
    }

    public void setFace(Boolean face) {
        this.face = face;
    }

    public Boolean getHat() {
        return hat;
    }

    public void setHat(Boolean hat) {
        this.hat = hat;
    }

    public Boolean getShoulders() {
        return shoulders;
    }

    public void setShoulders(Boolean shoulders) {
        this.shoulders = shoulders;
    }

    public Boolean getTorso() {
        return torso;
    }

    public void setTorso(Boolean torso) {
        this.torso = torso;
    }

    public Boolean getGloves() {
        return gloves;
    }

    public void setGloves(Boolean gloves) {
        this.gloves = gloves;
    }

    public Boolean getPants() {
        return pants;
    }

    public void setPants(Boolean pants) {
        this.pants = pants;
    }

    public Boolean getBoots() {
        return boots;
    }

    public void setBoots(Boolean boots) {
        this.boots = boots;
    }

    public Boolean getCoat() {
        return coat;
    }

    public void setCoat(Boolean coat) {
        this.coat = coat;
    }
}
