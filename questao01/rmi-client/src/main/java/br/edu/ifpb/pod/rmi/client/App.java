/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.rmi.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class App {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Client client = new Client();
        double x, y, result;
        int optCalc = 0;
        
        Scanner in = new Scanner(System.in);
        
        try {
            System.out.println("Digite uma opção:\n 1- 2xy  \n 2- 2x/y");
            optCalc = in.nextInt(); in.nextLine();
            
            System.out.println("Digite o primeiro número:");
            x = in.nextDouble(); in.nextLine();
            
            System.out.println("Digite o segundo número:");
            y = in.nextDouble(); in.nextLine();
            
            switch(optCalc){
                case 1: {
                    result = client.calcOp1(x, y);
                    System.out.println("O resultado de 2yx = eh: " + result);
                } break;
                case 2: {
                    result = client.calcOp2(x, y);
                    System.out.println("O resultado da subtracao2 2x/y = eh: " + result);
                } break;
                default: {
                    System.out.println("Você não escolheu uma opção válida "
                            + "então o sistema será encerrado...");
                    System.exit(0);
                } break;
            }
           
        } catch (Exception ex){
            System.err.println("Erro no cliente: " + ex.toString());
        }
    }
}
