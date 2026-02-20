/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package form.java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hadwa01
 */
public class FormJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Form> Former = new ArrayList<>();
        int val = 5;
        do {
            System.out.println("1. Skriv ut Listan ");//Skriver ut listan
            System.out.println("2. Rektangel ");//Skriver Väljer case 2
            System.out.println("3. Triangel");//Skriver Väljer case 3
            System.out.println("4. Cirkel");//Skriver Väljer case 4
            System.out.println("0. Avsluta");//Avslutar programmet
            System.out.println("Ange ditt val: ");
            try {
                val = input.nextInt();
                switch (val) {

                    case 1:
                        skrivUt(Former);

                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Ange x-koordinat: ");
                        int xR = input.nextInt();
                        System.out.println("Ange y-koordinat: ");
                        int yR = input.nextInt();
                        System.out.println("Ange basen: ");
                        int bR = input.nextInt();
                        System.out.println("Ange höjd: ");
                        int hR = input.nextInt();
                        Form r = new Rektangel(xR, yR, bR, hR, true);
                        Former.add(r);

                        break;
                    case 3:
                        System.out.println("Ange x-koordinat: ");
                        int xT = input.nextInt();
                        System.out.println("Ange y-koordinat: ");
                        int yT = input.nextInt();
                        System.out.println("Ange basen: ");
                        int bT = input.nextInt();
                        System.out.println("Ange höjd: ");
                        int hT = input.nextInt();
                        Form t = new Triangel(xT, yT, bT, hT, true);
                        Former.add(t);
                        break;
                    case 4:
                        System.out.println("Ange x-koordinat: ");
                        int xC = input.nextInt();
                        System.out.println("Ange y-koordinat: ");
                        int yC = input.nextInt();
                        System.out.println("Ange Radie: ");
                        int rC = input.nextInt();
                        Form c = new Circel(xC, yC, rC, true);
                        Former.add(c);
                        break;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Endast siffror");
                input.nextLine();
                System.out.println();

            }

        } while (val != 0);//Avlsutar när man väljer 0 
    }

    public static void skrivUt(ArrayList<Form> Former) {
        if (Former.isEmpty()) {
            System.out.println("Listan är tom");
            System.out.println();
        } else {
            for (int i = 0; i < Former.size(); i++) {
                System.out.println(Former.get(i).WhatAmI() + "\n area: " + Former.get(i).getArea());
                System.out.println();
            }

        }

    }

}
