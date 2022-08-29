package com.fastcampus.javaoop.logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort <T extends Comparable<T>> {

    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);

        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (output.get(j-1).compareTo(output.get(j)) > 0) {
                    T temp = output.get(j-1);
                    output.set(j-1, output.get(j));
                    output.set(j, temp);
                }
            }
        }

        return output;
    }
}
