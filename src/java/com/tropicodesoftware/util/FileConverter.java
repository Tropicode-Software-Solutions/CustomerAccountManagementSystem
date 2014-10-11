/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tropicodesoftware.util;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.ejb.Stateless;
import javax.swing.ImageIcon;


/**
 *
 * @author Anthony
 */
@Stateless
public class FileConverter {
    
   public ImageIcon bytesToImage(byte[] rawImage){
       Image image = Toolkit.getDefaultToolkit().createImage(rawImage);
       return new ImageIcon(image);
   } 
   
   public byte[] fileToBytes(String filePath){
        //create a file from the file path specified
        File file = new File(filePath);
        //create a new byte array with the same size as the length of the file in bytes 
        byte[] bytes = new byte[(int)file.length()];
        try{
            //convert the file to bytes
            FileInputStream fileStream = new FileInputStream(file);
            fileStream.read(bytes);
            fileStream.close();
        } 
        catch(IOException e){
            e.printStackTrace();
        }
        return bytes;
   }
    
}
