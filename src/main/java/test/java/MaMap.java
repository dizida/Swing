package test.java;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MaMap {

    private TreeMap<Integer, String> noteMap;
   

    public MaMap() {
        noteMap = new TreeMap<>();
        initMap();
    }

    private void initMap() {
        noteMap.put(60, "do");
        noteMap.put(62,"ré");
        noteMap.put(64, "mi");
        noteMap.put(65, "fa");
        noteMap.put(67,"sol");
        noteMap.put(69, "la");
        noteMap.put(71, "si");
        noteMap.put(72, "do2");

       
    }

    public TreeMap<Integer, String> getNoteMap() {
        return noteMap;
    }

    public void setNoteMap(TreeMap<Integer, String> noteMap) {
        this.noteMap = noteMap;
    }
    
}

