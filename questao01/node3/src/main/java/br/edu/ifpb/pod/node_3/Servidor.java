/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.node_3;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Logger;

/**
 *
 * @author Jose
 */
public class Servidor {
    public static int port = 10999;
    private static Logger log = Logger.getAnonymousLogger();
    
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(10999);
            ResolveOp2 op2 = new ResolveOp2();
            registry.bind("Calculadora", op2);
            log.info("Server na porta !"+port);
        } catch (RemoteException | AlreadyBoundException ex) {
            log.info("Erro: " + ex.toString());
        }
        
    }
}
