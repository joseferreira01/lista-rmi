/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.node_1;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class Servidor1 {
    public static int port = 10997;
    private static  Logger log =Logger.getAnonymousLogger() ; 
    
    public static void main(String[] args) {
        try {
            
            Registry registry = LocateRegistry.createRegistry(port);
            CalculadoraNo1 calculadora = new CalculadoraNo1();
            registry.bind("Calculadora", calculadora);
            log.info("chamando servidor");
        } catch (RemoteException | AlreadyBoundException ex) {
             log.info(ex.toString()); 
        }
        
    }
    
}
