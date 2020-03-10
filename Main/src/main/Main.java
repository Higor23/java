/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author higor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produtos x = new Produtos();
        x.setPreco(300);
        x.adicionar(20);
        System.out.println(x.getPreco());
    }
    
}
