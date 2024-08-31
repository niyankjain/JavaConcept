package com.inn.wrapper;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<EmpNew> {

    @Override
    public int compare(EmpNew emp1, EmpNew emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}
