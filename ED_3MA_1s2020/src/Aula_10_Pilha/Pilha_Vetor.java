/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10_Pilha;

/**
 *
 * @author EdUaRdO
 */
public class Pilha_Vetor {
    private Object item[];
    private int topo;
    
    //criar pilha vazia
    public Pilha_Vetor(int maxTam){
        this.item=new Object[maxTam];
        this.topo=0;
    }
    //Empilhar um elemento
    public void push (Object x) throws Exception{
        if(this.topo == this.item.length){
            throw new Exception("Erro: A pilha esta cheia");
        }
        this.item[this.topo++]=x;
    }
    
    // verificar se a pilha está vazia
    public boolean vazia(){
        return this.topo==0;
    }
    //desempilhar um elemento do topo
    public Object pop() throws Exception{
        if(this.vazia()){
            throw new Exception("Erro: a pilha está vazia");
        }
        this.topo--;
        return this.item[this.topo];
        //ou return this.item[--this.topo];
    }
    public int size(){
        return this.topo;
    }
}
