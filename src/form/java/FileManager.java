/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 *
 * @author hadwa01
 */
//Den här koden connectar till både kontaktframe och kontakt för att underlätt vår arbete. 
public class FileManager {

    public void saveToFile(ArrayList<Form> list) {
        try {
            FileOutputStream fileOut = new FileOutputStream("savedFormerLista.ser");
            {
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(list);
                out.flush();
                out.close();
                fileOut.close();
            }
        } catch (IOException ex) {

        }
    }

    public ArrayList<Form> readFromFile() {
        ArrayList<Form> list = null;
        try {

            FileInputStream fileIn = new FileInputStream("savedFormerLista.ser");
            {
                ObjectInputStream oin = new ObjectInputStream(fileIn);
                //  oin = new ObjectInputStream(fileIn);
                list = (ArrayList<Form>) oin.readObject();
                oin.close();
            }
        } catch (IOException ie) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

        return list;
    }

}
