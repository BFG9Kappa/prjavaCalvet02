/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava02;

import java.io.*;
import java.net.*;

/**
 *
 * @author bfg9kappa@gmail.com
 */
public class Prjava02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Versió 0.1 del projecte prjava02"); 	
        try {
            InetAddress adreca = InetAddress.getLocalHost();
            String hostname = adreca.getHostName();
            System.out.println("Hostname: " + hostname);
            System.out.println("Nom de usuari: " + System.getProperty("user.name"));
            System.out.println("Carpeta personal: " + System.getProperty("user.home"));
            System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
            System.out.println("Versió OS: " + System.getProperty("os.version"));
        } catch (IOException e) {
            System.out.println("Exception occurred");
        }  
    }
}