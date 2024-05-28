package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class AnimalArray {
    private List<Integer> array;

    public AnimalArray(List<Integer> array) {
        this.array = new ArrayList<>(array);
    }

    // find pairs of (mouse, cat) or (cat, dog)
    public List<Integer> findPairs() {
        List<Integer> pairs = new ArrayList<>();
        int length = array.size() - 1;
        for (int i = 0; i < length; i++) {
            if ((array.get(i) == 1 && array.get(i + 1) == 2) || (array.get(i) == 2 && array.get(i + 1) == 3) || (array.get(i) == 2 && array.get(i + 1) == 1) || (array.get(i) == 3 && array.get(i + 1) == 2)) {
                pairs.add(i);
            }
        }
        return pairs;
    }

    // insert a cow (4) after the index position
    public void insertCow(int index) {
        array.add(index + 1, 4);
    }

    // solve the statement problem using the implemented methods
    public List<Integer> beFriends() {
        List<Integer> pairs = findPairs();
        int offset = 0;
        for (int index : pairs) {
            insertCow(index + offset);
            offset += 1;
        }
        return array;
    }
}