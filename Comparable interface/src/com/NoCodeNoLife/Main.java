package com.NoCodeNoLife;

import javax.swing.plaf.synth.SynthUI;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<MPoint> linkList = new LinkedList<MPoint>();
        linkList.add(new MPoint(1, 5));
        linkList.add(new MPoint(-1, 5));
        linkList.add(new MPoint(1, -5));
        Collections.sort(linkList, new Comparator<MPoint>() {
            @Override
            public int compare(MPoint o1, MPoint o2) {
                return o1.compareTo(o2);
            }
        });
        for (MPoint item : linkList) {
            System.out.println(item.toString());
        }
    }
}
