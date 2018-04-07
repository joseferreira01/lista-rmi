/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.rmi.shared;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Servidores {
    private Map<String,Integer> nos;
    private static int no;
    
    public Servidores(){
        nos = new HashMap<>();
        putNo();
    }

    private void putNo(){
        nos.put("node_1", new Integer(10997));
        nos.put("node_2", new Integer(10998));
        nos.put("node_3", new Integer(10999));
    }
    
    public int getNos(){
        no = new Random().nextInt(nos.size());
        return nos.get(nos.keySet().toArray()[no]);
    }
}
