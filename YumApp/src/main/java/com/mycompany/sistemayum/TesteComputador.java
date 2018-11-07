/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemayum;

/**
 *
 * @author guilh
 */
public class TesteComputador {
    public static void main(String[] args) {
        Computador pc = new Computador();
        pc.setNome();
        pc.setEnderecoMac();
        pc.setNumeroIp();
        pc.setSistemaOperacional();
        pc.setTamanhoHd();
        pc.setTamanhoRam();
        pc.setTipoProcessador();
        
        
        System.out.println(pc.getNome());
        System.out.println(pc.getEnderecoMac());
        System.out.println(pc.getNumeroIp());
        System.out.println(pc.getSistemaOperacional());
        System.out.println(pc.getTamanhoHd());
        System.out.println(pc.getTamanhoRam());
        System.out.println(pc.getTipoProcessador());
    }
    
}
