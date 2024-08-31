package com.inn.wrapper;

public class Emp implements Comparable<Emp> {
    private String name;
    private String phoneNo;
    private int empId;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public int getEmpId() {
        return empId;
    }

    public Emp(String name, String phoneNo, int empId) {
        super();
        this.name = name;
        this.phoneNo = phoneNo;
        this.empId = empId;
    }

    //generate toString method
    @Override
    public String toString() {
        return "Emp [name=" + name + ", phoneNo=" + phoneNo + ", empId=" + empId + "]";
    }

    @Override
    public int compareTo(Emp emp) {
        return empId - emp.getEmpId();
    }
}
