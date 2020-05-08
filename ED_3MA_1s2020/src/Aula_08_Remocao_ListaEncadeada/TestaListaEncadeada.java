/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08_Remocao_ListaEncadeada;

import Aula_06_Intr_ListaEncadeada.*;

/**
 *
 * @author EdUaRdO
 */
public class TestaListaEncadeada {
    public static void main(String[] args) {
      /*  No p =new No(7,null);
        System.out.println(p);
        System.out.println(p.getElemento());
        
        No q= new No(5,p);
        System.out.println(q);
        
        No r =new No(9,q);
        System.out.println(r);
     */
      listaEncadeada lst =new listaEncadeada();
        System.out.println(lst.vazia());
        
     lst.insereInicio(34);
     lst.insereInicio(21);
     lst.insereInicio(7);
     lst.insereFinal(45);
     lst.insereFinal(67);
     lst.insereOrdenado(3);//insercao no inicio
     lst.insereOrdenado(40);// insercao entre (meio)
     lst.insereOrdenado(85);// insercao no final
     
     System.out.println(lst);
     System.out.println(lst.buscaLinearIt(21));//return boolean 
     System.out.println(lst.buscaLinearIt(15));//return boolean
     System.out.println(lst.buscaLinearIt2(21).getElemento());//getElemento para mostrar somente o elemento
     System.out.println(lst.buscaLinearIt2(15));//return No
     
        System.out.println(lst.buscaLinearR(21));// recursiva return boolean
        System.out.println(lst.buscaLinearR(15));// recursiva return boolean
        
        System.out.println(lst.buscaLinearR2(21).getElemento());// recursiva return No
        System.out.println(lst.buscaLinearR2(15));// recursiva return No
    
    lst.insereFinalR(92);
    lst.insereFinalR(99);
        System.out.println(lst);
        
//    lst.insereOrdenadoR(1);
//    lst.insereOrdenadoR(56);
//    lst.insereOrdenadoR(85);
//    lst.insereOrdenadoR(103);
    
    System.out.println(lst);
    
    
    lst.removeInicio();
    lst.removeFinal();
        System.out.println(lst);
        
        
    lst.removeOrdenado(3); //removendo o primeiro
    lst.removeOrdenado(30);// removendo no meio
    lst.removeOrdenado(63);// removendo final
    lst.removeOrdenado(33);// removendo não esta na lista
        System.out.println(lst);
    
        
        System.out.println("a lista tem: "+lst.quantidadeNo()+" Nos");    
    }
    
}
