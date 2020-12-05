package com.emse.spring.faircorpagain.telusko;

import org.springframework.stereotype.Component;


public class Alien {

    private int aid;
    private String aname;
    private String tech;

    public Alien() {
    }

    public Alien(int aid, String aname, String tech) {
        this.aid = aid;
        this.aname = aname;
        this.tech = tech;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show(){
        System.out.println("justChecking");
    }
}
