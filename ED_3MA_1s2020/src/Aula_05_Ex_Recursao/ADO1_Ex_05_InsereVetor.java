/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Ex_Recursao;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.exibeVetorTam;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author ana.csantos119
 */
public class ADO1_Ex_05_InsereVetor {
    public static void main(String[] args) {
        int v[]=new int[50];
        int n=leInteiroPositivo();    
        for (int i=0;i<n;i++){
            v[i]= (int)(Math.random()*50);
        }
        exibeVetor(v);
        System.out.println("Inserir um elemento no vetor: ");
        int x=leInteiroPositivo();
        System.out.printf("Qual posição inserir vetor? [0,%d]\n",n-1);
        int pos=leInteiroPositivo(); 
        insereVetor(v,n,x,pos);
        exibeVetorTam(v,n+1);
        exibeVetor(v);
    }

    public static void insereVetor(int[] v, int n, int x, int pos) {
        int i;
        for(i=n;i>pos;i--){
           v[i]=v[i-1];
       }
       v[pos]=x;
    }
}
