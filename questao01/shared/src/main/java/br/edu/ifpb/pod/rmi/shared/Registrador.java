/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.rmi.shared;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Logger;

/**
 *
 *  @author jose
 */
public class Registrador {
    private static int servidores;
    private Registry registry;
    private   Logger log = Logger.getAnonymousLogger(); 
    
    public Registrador() throws RemoteException {
        registry = getRegistry();
        
    }
    
    public Calculadora getCalculadora() throws NotBoundException, RemoteException{
        Calculadora calculadora = (Calculadora) registry.lookup("Calculadora");
        log.info("Servidor ativo"+servidores);
        return calculadora;
    }
    
    private static Registry getRegistry() throws RemoteException{
        servidores = new Servidores().getNos();
        return LocateRegistry.getRegistry(servidores);
    }
}
