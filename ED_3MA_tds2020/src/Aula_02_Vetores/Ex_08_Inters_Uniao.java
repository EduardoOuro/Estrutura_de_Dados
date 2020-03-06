/*
 8. Sejam dois conjuntos, A e B, com n e m elementos respectivamente. Os conjuntos
não possuem elementos repetidos e não estão ordenados.
a) Faça uma função que para efetuar a intersecção entre dois conjuntos, ou seja, os
elementos em comum entre os dois conjuntos. O conjunto C conterá a intersecção de A e
B.
Exemplo:
1- A = { 7, 2, 5, 8, 4} e B= {4, 2, 5}, C = A  B = {2, 5, 4}
2- A = { 3, 9, 11} e B= {2, 6, 1}, C = A  B = {}
b) Faça uma função que para efetuar a união de dois conjuntos. O conjunto C conterá
todos os elementos de A e B.
Exemplo:
3- A = { 7, 2, 5, 8, 4} e B= {4, 2,5, 10}, C = A  B = {7,2, 5,8, 4,10}
4- A = { 3, 9, 11} e B= {2, 6, 1}, C = A  B = {3,9,11,2,6,1}

 */
package Aula_02_Vetores;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.exibeVetorTam;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_07_BuscaLinear.buscaLinear;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_08_Inters_Uniao {

    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetorAleatorio(n1);
        exibeVetor(v1);
        int n2 = leInteiroPositivo();
        int v2[] = leVetorAleatorio(n1);
        exibeVetor(v2);
        //(a) Interseccao de 2 Vetores
        int inter[] = new int[v1.length];
        int nInter = Inters2Vetores(v1, v2, inter);
        exibeVetor(inter);
        exibeVetorTam(inter, nInter);
        
        //(b) uniao de 2 vetores    
        int uniao[] = new int[v1.length + v2.length];
        int nUniao = uniao2Vetores(v1, v2, uniao);
        exibeVetor(uniao);
        exibeVetorTam(uniao, nUniao);

    }

    public static int Inters2Vetores(int[] v1, int[] v2, int[] inter) {
        int k = 0;
        //pecorrer o v1 e busca em v2
        for (int i = 0; i < v1.length; i++) {
            // Ve se  v1[i] esta em v[2]
            if (buscaLinear(v2, v1[i]) != -1) {
                inter[k] = v1[i];
                k++;
            }

        }

        return k;

    }

    private static int uniao2Vetores(int[] v1, int[] v2, int[] uniao) {
        int k = 0;
        //copiar os elementos do vetor1 para o vetor uniao
        for (int i = 0; i < v1.length; i++) {
            uniao[k] = v1[i];
            k++;
        }
        for (int i = 0; i < v2.length; i++) {
            // Ve se  v2[i] esta em v[1]
            if (buscaLinear(v1, v2[i]) == -1) {
                uniao[k] = v2[i];
                k++;
            }
        }
        return k;

    }

}
