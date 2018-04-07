/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.rmi.client;




import br.edu.ifpb.pod.rmi.shared.Calculadora;
import br.edu.ifpb.pod.rmi.shared.Registrador;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Jose
 */
public class Client {
    private static Calculadora calculadora;
            
    public Client() throws RemoteException, NotBoundException {
        calculadora = new Registrador().getCalculadora();
    }
    
    public double calcOp1(double x, double y) throws RemoteException, NotBoundException {
        return calculadora.op1(x, y);
    }
    
    public double calcOp2(double x, double y) throws RemoteException, NotBoundException{
        return calculadora.op2(x, y);
    }
    
}
