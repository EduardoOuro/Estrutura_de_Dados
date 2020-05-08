/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Intr_ListaEncadeada;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_09_Intercalacao.bubbleSort;

/**
 *
 * @author anacris
 */
public class ADO2_Ex_Intercala2Vetores {
    public static void main(String[] args) {
        int n1=leInteiroPositivo();
        int A[]=leVetorAleatorio(n1);
        bubbleSort(A);
        exibeVetor(A);
        int n2=leInteiroPositivo();
        int B[]=leVetorAleatorio(n2);
        bubbleSort(B);
        exibeVetor(B);
        int intercala[]=intercala2VetoresOn(A,B);
        exibeVetor(intercala);
    }



    public static int [] intercala2VetoresOn(int[] A, int[] B) {
       int C[]=new int[A.length+B.length];
       int i=0,j=0,k=0;
       
       while (k<C.length){
           if(i==A.length){
               C[k]=B[j];
               j++;k++;  
           } else {
                 if(j==B.length){
                    C[k]=A[i];
                    i++;k++;
                 } else {
                  if(A[i]< B[j]){
                      C[k]=A[i];
                        i++;k++;
                    } else {
                        C[k]=B[j];
                        j++;k++;
                        }
                    }
                }
            }
       return C;
     }
}
