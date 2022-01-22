package com.example.attendanceapp;

public class StudentItem {
    private long sid;
    public int roll;
    private String name;
    private String status;


    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }



    public StudentItem(long sid,int roll, String name) {
        this.sid=sid;
        this.roll = roll;
        this.name = name;
        status="";
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
