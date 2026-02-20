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
public class Triangel extends Form {

    private int bas;
    private int höjd;
    private boolean fylld;

    public Triangel(int x, int y, int b, int h, boolean f) {
        super(x, y);
        this.bas = b;
        this.höjd = h;
        this.fylld = f;
        color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    @Override
    public void draw(Graphics g) {
        if (running) {
            move(0, 0);
        }
        int[] xPoints = {xPos, xPos + bas / 2, xPos + bas};
        int[] yPoints = {yPos, yPos - höjd, yPos};
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 3);

    }

    @Override
    public String WhatAmI() {
        return "Triangel";
    }

    @Override
    public double getArea() {

        return (bas * höjd) / 2;

    }

}
