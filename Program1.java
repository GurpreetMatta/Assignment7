/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Gurpreet Singh
 */
public class Program1 {
    public static void main (String args[]) throws FileNotFoundException, IOException
    {
         FileInputStream fis=new FileInputStream("G:\\Netbeams Project Folder\\AcadView Assignment\\src\\assignment7\\abc.txt");
           
        try{
            int i=0;
            while(i!=-1){
            do{
                i=fis.read();
               if(i!=-1)
               {
                       System.out.print((char)i);
                       
               }
            }while(i!=' ');
            System.out.println();
            }
        }catch(Exception e)
        {
            e.getMessage();
        }
        fis.close();
        
    }
}
