/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Intr_ListaEncadeada;

/**
 *
 * @author anacris
 */
public class testaListaEncadeada {
    public static void main(String[] args) {
        No p = new No(7,null);
        System.out.println(p); //System.out.println(p.toString());
        System.out.println(p.getElemento());
        No q = new No(5,p);
        System.out.println(q);
        No r = new No(9,q);
        System.out.println(r);
    }
}
