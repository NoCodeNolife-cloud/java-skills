package com.nocodenolife;

import java.util.Vector;

public class VectorSort {

    public static void sort(Vector<Integer> vector) {

        for (int i = 0; i < vector.size(); ++i) {

            for (int j = 0; j < vector.size() - 1 - i; ++j) {

                if (vector.get(j + 1) < vector.get(j)) {

                    int tmp = vector.get(j + 1);
                    vector.set(j + 1, vector.get(j));
                    vector.set(j, tmp);
                }
            }
        }
    }
}
