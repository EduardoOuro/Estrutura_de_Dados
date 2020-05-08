/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_11_Pilha_Fila;

import aula_10_Pilha.Pilha;
import java.util.Scanner;

/**
 *
 * @author EdUaRdO
 */
public class Ex_05_Palindromo {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = entrada.nextLine().toUpperCase();
        String pInv = invPalavra(palavra);
        System.out.println("A palavra invertida é: "+pInv);
        if(pInv.equals(palavra)){
            System.out.println(palavra +" é palindromo");
        }else{
             System.out.println(palavra +" Não é palindromo");
        }
        
    }

    private static String invPalavra(String palavra) throws Exception {
        Pilha p=new Pilha();
        String inv="";
        
        for (int i = 0; i < palavra.length(); i++) {
            char caracter =palavra.charAt(i);
            p.push(caracter);        
        }
        while (!p.vazia()){
            inv =inv+p.pop();
        }
        return inv;
        
    }
    
}
