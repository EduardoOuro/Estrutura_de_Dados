/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_10_Pilha;

/**
 *
 * @author EdUaRdO
 */
public class TestaPilha {
    public static void main(String[] args) throws Exception {
//        Pilha_Vetor p =new Pilha_Vetor(10);
//        
//        System.out.println(p.vazia());
//        p.push(3);
//        p.push(5);
//        p.push(8);
//        System.out.println(p.vazia());
//        System.out.println(p.pop());
//        System.out.println(p.pop());
//        System.out.println(p.size());
//        System.out.println(p.pop());
//        System.out.println(p.vazia());
          Pilha p=new Pilha();
          
          System.out.println(p.vazia());
          p.push(3);
          p.push(5);
          p.push(8);
          System.out.println(p);
          
    }
    
}
