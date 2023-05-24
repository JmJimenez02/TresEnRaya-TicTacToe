/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TresEnRaya;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;

/**
 *
 * @author josem
 */
public class Funciones {
    
    public static void guardaEnFichero(String texto, String ruta) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.newLine();
            bw.write(texto);
            
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
