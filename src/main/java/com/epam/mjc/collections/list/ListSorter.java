package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
    if(getResult(a) > getResult(b)){
        return 1;
    } else if (getResult(a) < getResult(b) || Math.abs(getResult(a)) == Math.abs(getResult(b))) {
        return -1;
    }
        return 0;
    }
    public double getResult (String a) {
        int numb = Integer.parseInt(a);
        return 5 * Math.pow(numb, 2) + 3;
    }
}
