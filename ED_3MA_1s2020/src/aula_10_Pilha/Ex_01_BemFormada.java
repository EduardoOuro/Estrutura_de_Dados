/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_10_Pilha;

import java.util.Scanner;

/**
 *
 * @author EdUaRdO
 */
public class Ex_01_BemFormada {
    public static void main(String[] args) throws Exception {
        Scanner input =new Scanner(System.in);   
        System.out.println("Digite uma sequencia de () e []:");
        String seq=input.nextLine();
        Pilha p = new Pilha();
        
        for(int i=0;i < seq.length();i++){
        char caracter=seq.charAt(i);
        // se caracter for de abertura
        if (caracter =='('|| caracter =='[' ){
            p.push(caracter);
        }else{
            //se for de caracter fechamento
            //verificar se a pilha esta vazia. Exemplo somente fechamento
            if(p.vazia()){
                System.out.println("Não esta bem formada a sequencia");
                return;
            }
            char charTopo=(char)p.pop();
            //verificar as compatibidades
            if(charTopo=='('&& caracter==']'){
                System.out.println("Não esta bem formada a sequencia");
                return;
            }
            if(charTopo=='['&& caracter==')'){
                System.out.println("Não esta bem formada a sequencia");
                return;
            }
        }
        
    }
        //terminar de percorrer asequencia e analizar 
        if(p.vazia()){
            System.out.println("Esta bem formada a sequencia");
        }else{
            System.out.println("Não esta bem formada a sequencia");
        }
        
    }
    
}
