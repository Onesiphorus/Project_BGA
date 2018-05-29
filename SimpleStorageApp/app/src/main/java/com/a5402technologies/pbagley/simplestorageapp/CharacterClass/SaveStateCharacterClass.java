package com.a5402technologies.pbagley.simplestorageapp.CharacterClass;

import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SaveStateCharacterClass implements Serializable {
    static public List<CharacterClass> ccs = new ArrayList<CharacterClass>();
    static SaveStateCharacterClass instance = null;

    public static SaveStateCharacterClass getInstance() {
        if (null == instance) instance = new SaveStateCharacterClass();
        return instance;
    }

    public static void saveData(SaveStateCharacterClass instance) {
        ObjectOutput out;
        try {
            File outFile = new File(Environment.getExternalStorageDirectory(), "appSaveState.data");
            out = new ObjectOutputStream(new FileOutputStream(outFile));
            out.writeObject(instance);
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SaveStateCharacterClass loadData() {
        ObjectInput in;
        SaveStateCharacterClass ss = null;
        try {
            in = new ObjectInputStream(new FileInputStream("appSaveState.data"));
            ss=(SaveStateCharacterClass) in.readObject();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ss;
    }
}
