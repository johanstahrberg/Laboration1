package com.example.java26;

public class Member {

    private String id;
    private String name;
    private int activeLoans = 0;


    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getActiveLoans() {
        return activeLoans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseActiveLoans() {
        activeLoans++;
    }

    public void decreaseActiveLoans() {
        if (activeLoans > 0) {
            activeLoans--;
        }
    }

























}
