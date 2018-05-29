package com.a5402technologies.pbagley.simplestorageapp.Character;

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

public class SaveStateCharacter implements Serializable {
    static public List<Character> ccs = new ArrayList<Character>();
    static SaveStateCharacter instance = null;

    public static SaveStateCharacter getInstance() {
        if (null == instance) instance = new SaveStateCharacter();
        return instance;
    }

    public static void saveData(SaveStateCharacter instance) {
        ObjectOutput out;
        try {
            File outFile = new File(Environment.getExternalStorageDirectory(), "appSaveStateCharacter.data");
            out = new ObjectOutputStream(new FileOutputStream(outFile));
            out.writeObject(instance);
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SaveStateCharacter loadData() {
        ObjectInput in;
        SaveStateCharacter ss = null;
        try {
            in = new ObjectInputStream(new FileInputStream("appSaveStateCharacter.data"));
            ss=(SaveStateCharacter) in.readObject();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ss;
    }
}
