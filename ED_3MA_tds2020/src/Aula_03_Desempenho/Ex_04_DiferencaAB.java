/*
4) Escreva o algoritmo que recebe um vetor A de tamanho n contendo
inteiros e encontra o par de elementos distintos a e b do vetor que fazem
com que a diferença a-b seja a maior possível. A função deve ter deve ter
complexidade O(n), ou seja, o tamanho do vetor V[].
 */
package Aula_03_Desempenho;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;


/**
 *
 * @author luis.eoconrado
 */
public class Ex_04_DiferencaAB {
    public static void main(String[] args) {
         int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        int dif[]=maiorDifVetor(v);
        System.out.println("O par que da a maior diferença são");
        exibeVetor(dif);
       
    }

        public static int[] maiorDifVetor(int[] v) {
        int iMaior = 0;
        int iMenor = 0;
         
        for (int i = 1; i < v.length; i++) {
            if (v[i]>v[iMaior]) {
                iMaior =i;
            } else {
                if (v[i]<v[iMenor]) {
                    iMenor=i;

                }
            }

        }
        //trocar do maior com o menor
       
        int resp[]= {v[iMaior],v[iMenor]};
        return resp;
    }
    
}
