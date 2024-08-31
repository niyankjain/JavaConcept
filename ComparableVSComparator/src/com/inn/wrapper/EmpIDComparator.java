package com.inn.wrapper;

import java.util.Comparator;

public class EmpIDComparator implements Comparator<EmpNew> {

    @Override
    public int compare(EmpNew emp1, EmpNew emp2) {
        return emp1.getEmpId() - emp2.getEmpId();
    }
}

