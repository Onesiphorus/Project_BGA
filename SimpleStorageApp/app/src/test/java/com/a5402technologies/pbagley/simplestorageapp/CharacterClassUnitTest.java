package com.a5402technologies.pbagley.simplestorageapp;

import com.a5402technologies.pbagley.simplestorageapp.CharacterClass.CharacterClass;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

/**
 * Created by pmars on 5/30/2018.
 */


public class CharacterClassUnitTest {
    private CharacterClass characterClass = new CharacterClass("test", 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1);

    @Test
    public void testCharacterClass() {
        assert characterClass.getClassName().equals("test");
        assert characterClass.getAgility().equals(1);
        assert characterClass.getCunning().equals(1);
        assert characterClass.getSpirit().equals(1);
        assert characterClass.getStrength().equals(1);
        assert characterClass.getLore().equals(1);
        assert characterClass.getLuck().equals(1);
        assert characterClass.getHealth().equals(1);
        assert characterClass.getSanity().equals(1);
        assert characterClass.getDefense().equals(1);
        assert characterClass.getWillpower().equals(1);
        assert characterClass.getRangedToHit().equals(1);
        assert characterClass.getMeleeToHit().equals(1);
        assert characterClass.getCombat().equals(1);
        assert characterClass.getInitiative().equals(1);
        assert characterClass.getMaxGrit().equals(1);
    }
}
