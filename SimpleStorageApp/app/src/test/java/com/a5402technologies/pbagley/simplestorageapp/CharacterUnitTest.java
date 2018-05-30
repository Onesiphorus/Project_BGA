package com.a5402technologies.pbagley.simplestorageapp;

import com.a5402technologies.pbagley.simplestorageapp.Character.Character;
import com.a5402technologies.pbagley.simplestorageapp.CharacterClass.CharacterClass;

import org.junit.Test;

/**
 * Created by pmars on 5/30/2018.
 */

public class CharacterUnitTest {
    private CharacterClass characterClass = new CharacterClass("test", 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1);
    private Character character = new Character("test", characterClass);

    @Test
    public void testCharacter() {
        assert character.getCharacterClass().equals(characterClass);
        assert character.getCharacterName().endsWith("test");
    }
}
