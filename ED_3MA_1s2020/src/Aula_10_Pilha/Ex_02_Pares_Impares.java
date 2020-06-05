/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10_Pilha;

import java.util.Random;

/**
 *
 * @author EdUaRdO
 */
public class Ex_02_Pares_Impares {
    public static void main(String[] args) throws Exception {
        Random r =new Random();
        Pilha pares =new Pilha();
        Pilha impares =new Pilha();
        
        for(int i=0;i<10;i++){
            int num =r.nextInt(51);
            if(num %2==0){
                pares.push(num);
            }else{
                impares.push(num);
            }
        }
        System.out.println("pilhas de Pares");
        while(!pares.vazia()){
            System.out.println(pares.pop());
        }
        System.out.println("pilhas de Impares");
        while(!impares.vazia()){
            System.out.println(impares.pop());
        }
        
    }
    
}
