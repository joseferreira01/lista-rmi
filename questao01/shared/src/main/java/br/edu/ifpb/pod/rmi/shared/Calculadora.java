/*
 @author jose2
*/
package br.edu.ifpb.pod.rmi.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    double op1(double x, double y) throws RemoteException;
    double op2(double x, double y) throws RemoteException;
}
