/*
 6) Escreva uma função que receba dois vetores (A[] e B[]) já ordenados
em ordem crescente e ambos possuem o mesmo tamanho. A sua
função imprime a intersecção entre os dois vetores, ou seja, os
elementos em comum entre os vetores A[] e B[]. Considere que os
vetores não contêm valores duplicados. A função deve ter deve ter
complexidade O(n), ou seja, o tamanho do vetor A[] e do vetor B[].
 */
package Aula_03_Desempenho;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;


/**
 *
 * @author luis.eoconrado
 */
public class Ex_06_Inters2Vetores {
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetorAleatorio(n1);
        exibeVetor(v1);
        int v2[] = leVetorAleatorio(n1);
        exibeVetor(v2);
        IntersOrdenada2Vetores(v1,v2);
        //(a) Interseccao de 2 Vetores ordenados
        
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


//    public static void IntersOrdenada2Vetores(int[] v1, int[] v2) {
//         int i=0;
//            int j=0;
//            while (i<v1.length && j<v2.length){
//                if(v1[i]==v2[j]){
//                    System.out.println(v1[i]+" ");
//                    i++;
//                    j++;
//                    
//                }else {
//                    if(v1[i]<v2[j]){
//                        i++;
//                    }else{
//                        j++;
//                    }
//                }
//    }
//    }
}
