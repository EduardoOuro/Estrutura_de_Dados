/*
3) Escreva uma função que recebe um vetor A[] e troca de posição seu
maior e seu menor elementos. A função deve ter deve ter complexidade
O(n), ou seja, o tamanho do vetor V[].
 */
package Aula_03_Desempenho;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_03_TrocaMaiorMenorVetor {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        trocaMaiorMenorVetor(v);
        exibeVetor(v);
    }

    public static void trocaMaiorMenorVetor(int[] v) {
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
        int aux;
            aux=v[iMaior];
            v[iMaior]=v[iMenor];
            v[iMenor]=aux;
    }

}
