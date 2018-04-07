/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.node_3;




import br.edu.ifpb.pod.rmi.shared.Calculadora;
import br.edu.ifpb.pod.rmi.shared.Registrador;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Jose
 */
public class ResolveOp2 extends UnicastRemoteObject implements Calculadora
{

    public ResolveOp2() throws RemoteException {};
    
    @Override
    public double op1(double x, double y) throws RemoteException {
        Calculadora calculadora = null;
        try {
            calculadora = new Registrador().getCalculadora();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
        return calculadora.op1(x, y);
    }

    @Override
    public double op2(double x, double y) throws RemoteException {
        if(y==0)
            new RemoteException("Nao e possivel efetuar divisao por 0s");
        return (2*x)/y;
    }
    
}
