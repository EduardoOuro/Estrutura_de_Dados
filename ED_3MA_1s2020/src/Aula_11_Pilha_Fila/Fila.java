/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_11_Pilha_Fila;

import Aula_10_Pilha.No;

/**
 *
 * @author EdUaRdO
 */
public class Fila {
    private No first;
    private No last;
    
    //CRIAR UMA FILA
    public Fila(){
        this.first=null;
        this.last=null;
    }
    //VERIFICAR SE A FILA ESTÁ VAZIA
    public boolean isEmpty(){
        return this.first == null && this.last ==null;
    }
    //METODO QUE ENFILEIRAR UM ELEMENTO (INSERÇÃO NO FINAL)
    public void enqueue (Object x){
        No novo = new No(x, null);
        
        //SE FILA VAZIA, SERÁ O PRIMEIRO
        if(isEmpty()){
            this.first=novo;
            this.last =novo;
            return;
        }
        //SE TIVER MAIS DE UM NÓ NA FILA
        if(this.last!=null){
            this.last.setProx(novo);
            this.last =novo;
            return;
        }
    }
    //METODO DESENFILEIRAR UM ELEMENTO(REMOVER DO INICIO)
    public Object dequeue()throws Exception{
        //SE FILA VAZIA
        if(isEmpty()){
            throw new Exception("Erro: A lista está vazia");
        }
        Object elemento = this.first.getElemento();
        this.first=this.first.getProx();
        
        return elemento;
    }
    //METODO QUE VERIFICA O TAMANHO DA FILA
    public int size(){
        No temp = this.first;
        int cont =0;
        
        while(temp!=null){
            temp=temp.getProx();
            cont++;            
        }
        return cont;
    }
     public int size2(){
         No temp;
         int cont=1; 
        for(temp=this.first;temp!=last;temp=temp.getProx()){
            cont++;
        }
        return cont;
     }    
    @Override
    public String toString() {
        return "Fila{" + "first=" + first + ", last=" + last + '}';
    }
    
}

