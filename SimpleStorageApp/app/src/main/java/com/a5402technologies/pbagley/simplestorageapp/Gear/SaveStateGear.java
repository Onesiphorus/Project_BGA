package com.a5402technologies.pbagley.simplestorageapp.Gear;

import android.os.Environment;

import com.a5402technologies.pbagley.simplestorageapp.Gear.GearBase;

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

public class SaveStateGear implements Serializable {
    static public List<GearBase> ccs = new ArrayList<GearBase>();
    static SaveStateGear instance = null;

    public static SaveStateGear getInstance() {
        if (null == instance) instance = new SaveStateGear();
        return instance;
    }

    public static void saveData(SaveStateGear instance) {
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

    public static SaveStateGear loadData() {
        ObjectInput in;
        SaveStateGear ss = null;
        try {
            in = new ObjectInputStream(new FileInputStream("appSaveState.data"));
            ss=(SaveStateGear) in.readObject();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ss;
    }
}
