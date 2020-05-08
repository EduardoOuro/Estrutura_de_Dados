/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Intr_ListaEncadeada;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author anacris
 */
public class ADO3_Ex_12_02_MinElementoVetor {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        int v[]=leVetorAleatorio(n);
        exibeVetor(v);
        System.out.printf("O menor do vetor = %d\n",minElementoVetorR(v));
    }

    public static int minElementoVetor(int[] v) {
        int menor=v[0];
        for (int i=1; i<v.length;i++){
            if(v[i]<menor)
                return menor=v[i]; 
        }
        return menor;
    }
    
    /*
    Se n=1, v[0] é o único elemento, logo ele é o menor
    Se n>1, procurar menor entre o mínimo entre o último da instância v[n-1] e o
    restante do vetor [0...n-2]
    */
    public static int minElementoVetorR(int[] v) {
         return minElementoVetorR(v,v.length);
    }
    public static int minElementoVetorR(int[] v, int n) {
        if(n==1)
            return v[0];
        
        int menor=minElementoVetorR(v,n-1);
        if(menor<v[n-1])
            return menor;
        else
            return v[n-1];
        
    }
    
}
