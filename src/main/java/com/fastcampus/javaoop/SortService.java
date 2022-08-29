package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.ListIterator;

@AllArgsConstructor
public class SortService {

    private final Sort<String> sort;

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
