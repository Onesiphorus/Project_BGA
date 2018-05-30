package com.a5402technologies.pbagley.simplestorageapp;

import com.a5402technologies.pbagley.simplestorageapp.Gear.Models.GearBase;

import org.junit.Test;

import java.util.ArrayList;

public class GearBaseUnitTest {
    private GearBase gearBase = new GearBase("testGear");
    private ArrayList<String> testArrayList = new ArrayList<>();


    @Test
    public void testGearBase() {
        assert gearBase.getName().equals("testGear");
        gearBase.setName(null);
        assert gearBase.getName().equals("noName");

        gearBase.setAgilityBonus(null);
        assert gearBase.getAgilityBonus().equals(0);
        gearBase.setAgilityBonus(1);
        assert gearBase.getAgilityBonus().equals(1);

        gearBase.setCost(null);
        assert gearBase.getCost().equals(0);
        gearBase.setCost(1);
        assert gearBase.getCost().equals(1);

        gearBase.setCunningBonus(null);
        assert gearBase.getCunningBonus().equals(0);
        gearBase.setCunningBonus(1);
        assert gearBase.getCunningBonus().equals(1);

        gearBase.setDarkStone(null);
        assert gearBase.getDarkStone().equals(0);
        gearBase.setDarkStone(1);
        assert gearBase.getDarkStone().equals(1);

        gearBase.setHealthBonus(null);
        assert gearBase.getHealthBonus().equals(0);
        gearBase.setHealthBonus(1);
        assert gearBase.getHealthBonus().equals(1);

        gearBase.setInitiativeBonus(null);
        assert gearBase.getInitiativeBonus().equals(0);
        gearBase.setInitiativeBonus(1);
        assert gearBase.getInitiativeBonus().equals(1);

        gearBase.setLoreBonus(null);
        assert gearBase.getLoreBonus().equals(0);
        gearBase.setLoreBonus(1);
        assert gearBase.getLoreBonus().equals(1);

        gearBase.setLuckBonus(null);
        assert gearBase.getLuckBonus().equals(0);
        gearBase.setLuckBonus(1);
        assert gearBase.getLuckBonus().equals(1);

        gearBase.setRestrictions(null);
        assert gearBase.getRestrictions().get(0).equals("None");
        testArrayList.add("test1");
        testArrayList.add("test2");
        gearBase.setRestrictions(testArrayList);
        assert gearBase.getRestrictions().equals(testArrayList);
        assert gearBase.getRestrictions().get(0).equals("test1");
        assert gearBase.getRestrictions().get(1).equals("test2");

        gearBase.setSanityBonus(null);
        assert gearBase.getSanityBonus().equals(0);
        gearBase.setSanityBonus(1);
        assert gearBase.getSanityBonus().equals(1);

        gearBase.setSell(null);
        assert gearBase.getSell().equals(0);
        gearBase.setSell(1);
        assert gearBase.getSell().equals(1);

        gearBase.setSanityBonus(null);
        assert gearBase.getSanityBonus().equals(0);
        gearBase.setSpiritBonus(1);
        assert gearBase.getSpiritBonus().equals(1);

        gearBase.setStrengthBonus(null);
        assert gearBase.getStrengthBonus().equals(0);
        gearBase.setStrengthBonus(1);
        assert gearBase.getStrengthBonus().equals(1);

        gearBase.setWeight(null);
        assert gearBase.getWeight().equals(0);
        gearBase.setWeight(1);
        assert gearBase.getWeight().equals(1);
    }
}

