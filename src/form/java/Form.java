/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form.java;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author hadwa01
 */
public abstract class Form implements Serializable{

    protected int xPos;
    protected int yPos;
    protected boolean running;
    protected boolean positivRiktning;
    protected Color color;
    protected int bas;
    protected int höjd;

    public Form(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    public int getXpos() {
        return this.xPos;

    }

    public int getYpos() {
        return this.yPos;
    }

    public int getbas() {
        return this.bas;

    }

    public int gethöjd() {
        return this.höjd;

    }

    public Point getPos() {
        return new Point(xPos, yPos);

    }

    public void setRunning(boolean run) {
        this.running = run;

    }
    boolean Höger = false;
    public void move(int x,int y){
        if(Höger){
            xPos +=5;
            if(xPos>=550){
                Höger=false;
            }
        }
        else{
            xPos-=5;
            if(xPos<=000){
                Höger=true;
            }
        }
    }

    public abstract void draw(Graphics g);

    public abstract String WhatAmI();

    public abstract double getArea();
}
