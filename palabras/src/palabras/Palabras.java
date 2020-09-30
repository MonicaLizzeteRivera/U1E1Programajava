/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Monica
 */
public class Palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
        File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
LinkedList<String> lista = new LinkedList<String>();
    
try {
         
         archivo = new File ("C:\\Users\\Monica\\Documents\\NetBeansProjects\\palabras\\archivo.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         
         String linea =  br.readLine();
               
       
       
        while((linea =br.readLine())!= null){
            System.out.print(" "+ linea + " ");
            lista.add(linea);
        }
            Collections.emptyList();
            System.out.println (" ");
             System.out.println ("La oracion compuesta es: "); 
             Iterator iter = lista.descendingIterator();

             String cadena;
             while (iter.hasNext()){
             
cadena = (String) iter.next();
             
System.out.print(" " + cadena + " ");
br.close();
fr.close();
             
    }}

      catch(Exception e){
         e.printStackTrace();
      }finally{
         
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
          
    }
}

    
    
    

