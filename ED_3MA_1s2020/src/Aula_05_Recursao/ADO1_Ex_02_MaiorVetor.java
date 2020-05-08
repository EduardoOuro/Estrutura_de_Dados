/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Recursao;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author ana.csantos119
 */
public class ADO1_Ex_02_MaiorVetor {
    public static void main(String[] args) {
        int n=leInteiroPositivo();    
        int v[]=leVetorAleatorio(n);
        exibeVetor(v);
        System.out.printf("O maior elemento está na posição: %d \n",iMaiorVetor(v));
        System.out.printf("O maior elemento é: %d ",v[iMaiorVetor(v)]);
    }

    public static int iMaiorVetor(int[] v) {
        int iMaior=0;
        for(int i=1; i<v.length; i++){
            if(v[i]>v[iMaior]){
                iMaior=i;
            }
        }
        return iMaior;
    }
}