/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Intr_ListaEncadeada;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_06_Intr_ListaEncadeada.ADO3_Ex_12_03_SomaElementosVetor.somaElementosVetorR;

/**
 *
 * @author anacris
 */
public class ADO3_Ex_12_04_MediaElementosVetor {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        int v[]=leVetorAleatorio(n);
        exibeVetor(v);
        System.out.printf("A média do vetor = %f\n",mediaElementosVetorR(v));
    }

    public static double mediaElementosVetor(int[] v) {
        int soma=0;
        for (int i=0; i<v.length;i++){
            soma+= v[i];
        }
        return soma/(double)(v.length);
    }
    
   
    public static double mediaElementosVetorR(int[] v) {
         return mediaElementosVetorR(v,v.length);
    }
    public static double mediaElementosVetorR(int[] v, int n) {
        if(n==1)
            return v[0];
        
       return (v[n-1] + somaElementosVetorR(v,n-1))/(double)n;
        
    }
    
}
