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
public class Produtos {
    private String descricao;
    private double entPreco, preco;
    private int quantidade;
    
    
    public void adicionar(double entPreco){
        preco = entPreco + preco;
               
}
    
    public void setPreco(double entPreco){
        preco = entPreco;
               
}
    public double getPreco(){
        return preco;
    }
}
