package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class AnimalArray {
    private List<Integer> array;

    public AnimalArray(List<Integer> array) {
        this.array = new ArrayList<>(array);
    }

    // verifies if 2 elements form a pair
    // if they form a pair, returns true; otherwise, false
    public boolean findPair(int position1, int position2) {
        if((array.get(position1) == 1 && array.get(position2) == 2) || (array.get(position1) == 2 && array.get(position2) == 3)
                || (array.get(position1) == 2 && array.get(position2) == 1)
                || (array.get(position1) == 3 && array.get(position2) == 2))
            return true;
        return false;
    }



    // find pairs of (mouse, cat) or (cat, dog)
    public List<Integer> findAllPairs() {
        List<Integer> pairs = new ArrayList<>();
        int length = array.size() - 1;
        for (int i = 0; i < length; i++) {
            if (findPair(i, i + 1)) { // check if 2 consecutive elements form a pair
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
        List<Integer> pairs = findAllPairs();
        int offset = 0;
        for (int index : pairs) {
            insertCow(index + offset);
            offset += 1;
        }
        return array;
    }
}