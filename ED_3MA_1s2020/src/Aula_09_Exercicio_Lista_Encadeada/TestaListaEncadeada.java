/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_09_Exercicio_Lista_Encadeada;



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
        
     lst.insereInicio(28);
     lst.insereInicio(19);
     lst.insereInicio(7);
     lst.insereFinal(32);
     lst.insereFinal(45);
     lst.insereOrdenado(3);//insercao no inicio
     lst.insereOrdenado(30);// insercao entre (meio)
     lst.insereOrdenado(56);// insercao no final
     
     System.out.println(lst);
     System.out.println(lst.buscaLinearIt(19));//return boolean 
     System.out.println(lst.buscaLinearIt(55));//return boolean
     System.out.println(lst.buscaLinearIt2(29));//getElemento para mostrar somente o elemento
     System.out.println(lst.buscaLinearIt2(55));//return No
     
        System.out.println(lst.buscaLinearR(19));// recursiva return boolean
        System.out.println(lst.buscaLinearR(55));// recursiva return boolean
        
        System.out.println(lst.buscaLinearR2(19).getElemento());// recursiva return No
        System.out.println(lst.buscaLinearR2(55));// recursiva return No
    
    lst.insereFinalR(63);
    lst.insereFinalR(78);
        
        
    lst.insereOrdenadoR(1);
    lst.insereOrdenadoR(44);
    lst.insereOrdenadoR(85);
    lst.insereOrdenadoR(99);
    
    System.out.println(lst);
    
    
    lst.removeInicio();
     System.out.println(lst);
    lst.removeFinal();
        System.out.println(lst);
        
        
    lst.removeOrdenado(3); //removendo o primeiro
    lst.removeOrdenado(30);// removendo no meio
    lst.removeOrdenado(63);// removendo final
    lst.removeOrdenado(33);// removendo não esta na lista
        System.out.println(lst);
    
        
        System.out.println("a lista tem: "+lst.quantidadeNo()+" Nos");
   
       System.out.println("O menor da lista é= "+lst.menorNo().getElemento());
       
       lst.removeFinalR();
       lst.removeFinalR();
        System.out.println(lst);
        lst.inverteNos();
        System.out.println("Lista apos inverter os nos");
        System.out.println(lst);
    }
    
}
