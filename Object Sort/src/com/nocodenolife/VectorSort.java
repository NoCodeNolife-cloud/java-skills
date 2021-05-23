package com.nocodenolife;

import java.util.Vector;

public class VectorSort {

    public static void bubbleSort(Vector<Point> vector) {

        for (int i = 0; i < vector.size(); ++i) {

            for (int j = 0; j < vector.size() - 1 - i; ++j) {

                if (vector.get(j).getX() == vector.get(j + 1).getX()) {

                    if (vector.get(j).getY() > vector.get(j + 1).getY()) {

                        vectorSwap(vector, j);
                    }
                } else if (vector.get(j).getX() > vector.get(j + 1).getX()) {

                    vectorSwap(vector, j);
                }
            }
        }
    }

    private static <T> void vectorSwap(Vector<T> vector, int position) {

        T tmp = vector.get(position);
        vector.set(position, vector.get(position + 1));
        vector.set(position + 1, tmp);
    }
}
