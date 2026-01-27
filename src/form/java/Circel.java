/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form.java;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author hadwa01
 */
public class Circel extends Form {

    private int radie;
    private boolean fylld;

    public Circel(int x, int y, int r, boolean f) {
        super(x, y);
        this.radie = r;
        this.fylld = f;
        color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(xPos, yPos, radie, radie);
    }

    @Override
    public String WhatAmI() {
        return "Circel";
    }

    @Override
    public double getArea() {
        return (radie * radie) * Math.PI;
    }

}
