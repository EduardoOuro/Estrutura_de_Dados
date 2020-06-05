/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_11_Pilha_Fila;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import Aula_10_Pilha.Pilha;

/**
 *
 * @author EdUaRdO
 */
public class Ex_03_Dec2Bin {
    public static void main(String[] args) throws Exception {
        int decimal = leInteiroPositivo();
        System.out.println(decimal + " == "+ dec2Bin(decimal));
    }

    private static String dec2Bin(int decimal) throws Exception {
        Pilha p =new Pilha();
        String binario ="";
        
        while(decimal >0){
            int resto =decimal%2;
            p.push(resto);
            decimal =decimal/2;//atualização
        }
        while (!p.vazia()){
            binario =binario + p.pop();
        }
        return binario;
    }    
    
}
