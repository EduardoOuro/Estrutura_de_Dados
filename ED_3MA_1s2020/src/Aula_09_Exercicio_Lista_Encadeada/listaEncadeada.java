/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_09_Exercicio_Lista_Encadeada;

import Aula_06_Intr_ListaEncadeada.No;

/**
 *
 * @author EdUaRdO
 */
public class listaEncadeada {

    private No ini;

    //Criar uma lista vazia
    public listaEncadeada() {
        this.ini = null;
    }

    //verificar se alista esta vazia
    public boolean vazia() {
        return ini == null;
    }

    //insere no inicio
    public void insereInicio(int elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }

    public void insereFinal(int elemento) {
        //inserir no final
        No novo = new No(elemento, null);
        No temp = ini;

        if (vazia()) {    //temp=null
            //ListaVazia
            ini = novo;
        } else {
            //percorrer prar chegar ao final para inserir

            while (temp.getProx() != null) {
                temp = temp.getProx();
            }
            temp.setProx(novo);
        }

    }

    public void insereFinalR(int elemento) {
        insereFinalR(ini, elemento);
    }

    public void insereFinalR(No temp, int elemento) {
        //lista vazia
        if (temp == null) {
            No novo = new No(elemento, ini);
            ini = novo;
        } else {
            //ja estou no ultimo No
            if (temp.getProx() == null) {
                No novo = new No(elemento, null);
                temp.setProx(novo);
            } else {
                insereFinalR(temp.getProx(), elemento);

            }
        }

    }

    public void insereOrdenado(int elemento) {
        No novo = new No(elemento, ini);
        No temp = ini;
        No anterior = null;
        while (temp != null && temp.getElemento() < novo.getElemento()) {
            anterior = temp;
            temp = temp.getProx();
        }
        if (anterior == null) {    //temp=null
            //ListaVazia
            ini = novo;
        } else {
            novo.setProx(temp);
            anterior.setProx(novo);
        }
    }

    public void insereOrdenadoR(int elemento) {
        insereOrdenadoR(ini, elemento);
    }


    public void insereOrdenadoR(No temp, int elemento){
        //lista vazia ou inserir no inicio
        if(vazia()||ini.getElemento()>elemento){
//            No novo =new No(elemento,ini);
//            ini=novo;
            insereInicio(elemento);
            return;
        }
        //inserir no final
        if(temp.getProx()==null){
            No novo =new No(elemento, null);
            temp.setProx(novo);
            return;
        }
        //inserir entre dois NOS
        if(temp.getElemento()< elemento && temp.getProx().getElemento()>=elemento ){
            No novo =new No(elemento, ini);
            novo.setProx(temp.getProx());
            temp.setProx(novo);
            return;
            
        }
        insereOrdenadoR(temp.getProx(),elemento);
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;//temp é um contador

        while (temp != null) {
            strLista += temp.getElemento() + " ";
            temp = temp.getProx();
        }

        return strLista;
    }

    public boolean buscaLinearIt(int x) {
        No temp = ini;

        while (temp != null) {
            if (temp.getElemento() == x) {
                return true;
            }
            temp = temp.getProx();
        }
        return false;
    }

    public No buscaLinearIt2(int x) {//retorna a lista encadeada
        No temp = ini;

        while (temp != null) {
            if (temp.getElemento() == x) {
                return temp;
            }
            temp = temp.getProx();
        }
        return null;
    }

    public boolean buscaLinearR(int x) {
        return buscaLinearR(ini, x);
    }

    public boolean buscaLinearR(No temp, int x) {
        if (temp == null) {
            return false;
        }
        if (temp.getElemento() == x) {
            return true;
        }

        return buscaLinearR(temp.getProx(), x);
    }

    public No buscaLinearR2(int x) {
        return buscaLinearR2(ini, x);
    }

    public No buscaLinearR2(No temp, int x) {
        if (temp == null || temp.getElemento() == x) {
            return temp;
        }

        return buscaLinearR2(temp.getProx(), x);
    }

    public void removeInicio() {
        //verificar se a lista esta vazia
        if (vazia()) {
            System.out.println("Lista Vazia");
        } else {
            //Existe ao menos um No
            ini = ini.getProx();
        }
    }

    public void removeFinal(){
        if(vazia()){
            System.out.println("Lista vazia!");
        } else {
            
            No temp = ini;
            //No anterior = null;
            
            //Sem o uso de anterior, paramos no penÃºltimo nÃ³
            while (temp.getProx().getProx()!=null){
                //anterior=temp;
                temp=temp.getProx();
            }
            //Se a lista tem apenas um nÃ³
            if(temp.getProx()==null){
                ini=null; //tornar a lista vazia
            } else{
                temp.setProx(null);
            }
        }
    }
    public void removeFinalR(){
        removeFinalR(ini);
    }
    public void removeFinalR(No temp){
        if(vazia()){
            System.out.println("Lista vazia");
            return;
        }
        //um unico no
        if(ini.getProx()==null){
            ini=null;
        }
        //Mais de um No, chegando no penultimo
        if(temp.getProx().getProx()==null){
            temp.setProx(null);
            return;
        }
        removeFinalR(temp.getProx());
    }

    public void removeOrdenado(int elemento){
        if(vazia()){
            System.out.println("Lista vazia!");
        } else {
            No temp = ini;
            No anterior = null;
            
            while(temp!=null && temp.getElemento()!=elemento){
                anterior=temp;
                temp=temp.getProx();
            }
            //Se a lista tem apenas um nó
            if(anterior==null){
                ini=ini.getProx(); //1. remove do início
            } else {
                if (temp!=null && temp.getElemento()==elemento){
                    anterior.setProx(temp.getProx());
                } else {
                    System.out.println(elemento + " NAO está na lista");
                }
            }
        }   
    }  

    public int quantidadeNo() {
        No temp = ini;
        int cont = 0;
        while (temp != null) {
            temp = temp.getProx();
            cont++;
        }
        return cont;
    }

    public No menorNo() {
        No temp = ini;
        No min = temp;
        while (temp != null) {
            if (temp.getElemento() < min.getElemento()) {
                min = temp;
            }
            temp=temp.getProx();
        }
        return min;
    }

    public No menNo() {
        No temp, min;

        for (temp = ini, min = temp; temp != null;
                temp = temp.getProx()) {
            if (temp.getElemento() < min.getElemento()) {
                min = temp;
            }

        }
        return min;

    }
    public void inverteNos(){
        No temp=ini;
        No anterior=null;
        No posterior =null;
        
        while(temp.getProx()!=null){
            posterior=anterior;
            anterior=temp;
            temp=temp.getProx();
            anterior.setProx(posterior);
        }
        ini=temp;
        temp.setProx(anterior);
        
    }
}
