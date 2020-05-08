/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Desempenho;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.exibeVetorTam;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetor;

/**
 *
 * @author ana.csantos119
 */
public class Ex_06_Inters2Vetores {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        int v1[]=leVetor(n);
        exibeVetor(v1);
        int v2[]=leVetor(n);
        exibeVetor(v2);
        //Interseção de 2 Vetores ordenados
        IntersOrdenada2Vetores(v1,v2);
}

    public static void IntersOrdenada2Vetores(int[] v1, int[] v2) {
        int i=0;
        int j=0;
        
        while (i<v1.length && j<v2.length){
            if(v1[i]==v2[j]){
                System.out.print(v1[i] + " ");
                i++;
                j++;
            } else{
                if(v1[i]<v2[j]){
                    i++;
                } else{
                    j++;
                }
            }
        }
    }
}
