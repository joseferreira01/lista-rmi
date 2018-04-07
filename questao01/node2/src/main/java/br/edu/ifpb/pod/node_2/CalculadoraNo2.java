/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.node_2;




import br.edu.ifpb.pod.rmi.shared.Calculadora;
import br.edu.ifpb.pod.rmi.shared.Registrador;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose
 */
public class CalculadoraNo2 extends UnicastRemoteObject implements Calculadora {

    public CalculadoraNo2() throws RemoteException {};
    
    @Override
    public double op1(double x, double y) throws RemoteException {
        return 2*(x * y);
    }

    @Override
    public double op2(double x, double y) throws RemoteException {
        Calculadora calculadora = null;
        try {
            calculadora = new Registrador().getCalculadora();
        } catch (NotBoundException ex) {
            Logger.getLogger(CalculadoraNo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return calculadora.op2(x, y);
    }
    
}
