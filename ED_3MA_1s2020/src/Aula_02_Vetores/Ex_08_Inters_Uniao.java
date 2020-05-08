/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.exibeVetorTam;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_07_BuscaLinear.buscaLinear;
/**
 *
 * @author ana.csantos119
 */
public class Ex_08_Inters_Uniao {
    public static void main(String[] args) {
        int n1=leInteiroPositivo();
        int v1[]=leVetorAleatorio(n1);
        exibeVetor(v1);
        int n2=leInteiroPositivo();
        int v2[]=leVetorAleatorio(n2);
        exibeVetor(v2);
        //(a)Interseção de 2 Vetores
        int inter[]=new int[v1.length];
        int nInter=Inters2Vetores(v1,v2,inter);
        exibeVetor(inter);
        exibeVetorTam(inter,nInter);
        //(b)Uniao de 2 Vetores
        int uniao[]=new int[v1.length+v2.length];
        int nUniao=uniao2Vetores(v1,v2,uniao);
        exibeVetor(uniao);
        exibeVetorTam(uniao,nUniao);
    }

    public static int Inters2Vetores(int[] v1, int[] v2, int[] inter) {
       int k=0;
       //Percorrer o v1 e busca em v2
       for(int i=0;i<v1.length;i++){
           //Buscar v1[i] no vetor v2
           if(buscaLinear(v2,v1[i])!=-1){
               inter[k]=v1[i];
               k++;
           }  
       }
       return k;
    }

    public static int uniao2Vetores(int[] v1, int[] v2, int[] uniao) {
       int k=0;
       //Copiar os elementos de v1 para o vetor união
       for(int i=0;i<v1.length;i++){
           uniao[k]=v1[i];
           k++;
       }
       //Percorrer o v2 e busca em v1
       for(int i=0;i<v2.length;i++){
           //Buscar v2[i] no vetor v1
           if(buscaLinear(v1,v2[i])==-1){
               uniao[k]=v2[i];
               k++;
           }  
       }
       return k;
       
    }
}
