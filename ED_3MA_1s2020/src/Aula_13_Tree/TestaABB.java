/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_13_Tree;

/**
 *
 * @author EdUaRdO
 */
public class TestaABB {
    public static void main(String[] args) {
        ABB tree = new ABB();
        
        tree.insere(8);
        tree.insere(2);
        tree.insere(5);
        tree.insere(7);
        tree.insere(9);
        tree.insere(3);
        tree.insereR(11);
        tree.insereR(10);
        tree.insereR(6);
        System.out.println(tree);
        
        System.out.println("\n pre-Ordem: ");
        tree.preOrdem();
        System.out.println("\n in-Ordem: ");
        tree.inOrdem();
        System.out.println("\n pos-Ordem: ");
        tree.posOrdem();
        System.out.println("\n------------------------------------------------\n");
        int num=7;
        if(tree.buscaIt(num)!= null)
            System.out.println("Achou: "+tree.buscaIt(num).getElemento());
        else
            System.out.println("Não achou: "+num);
       
        num=4;
        if(tree.buscaIt(num)!= null)
            System.out.println("Achou: "+tree.buscaIt(num).getElemento());
        else
            System.out.println("Não achou: "+num);
        System.out.println("Numero de nos: "+tree.contaNos());
        System.out.println("Altura da Arvore: "+tree.altura());
        System.out.println("\ninOrdem dos nos folhas: ");
        tree.inOrdemFolhas();
        System.out.println("\nO menor elemento = "+tree.menorIt().getElemento());
        System.out.println("\nO maior elemento = "+tree.maior().getElemento());
        
        System.out.println("removendo o 6: "+ tree.remove(6));//NO FOLHA
        tree.inOrdem();
        System.out.println();
        System.out.println("removendo o 9: "+ tree.remove(9));//NO 1 FILHO
        tree.inOrdem();
        System.out.println();
        System.out.println("removendo o 8: "+ tree.remove(8));// NO 2 FILHOS
        tree.inOrdem();
        System.out.println();
        System.out.println("removendo o 4: "+ tree.remove(4));//NO QUE NAO ESTA NA ABB
        tree.inOrdem();
        System.out.println();
        
        
        
        
    }
    
}
