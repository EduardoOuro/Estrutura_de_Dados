/*
 9. A intercalação é o processo utilizado para construir uma lista ordenada, de
tamanho n+m, a partir de duas listas já ordenadas de tamanhos n e m. Por
exemplo, a partir das seqüências abaixo:
Exemplo:
A = { 1, 3, 6, 7} e B= {2, 4, 5}, a nova lista C é feita a partir de A e B:
C = { 1, 2, 3, 5, 6, 7}
Escreva uma função que faça a intercalação entre duas listas lineares. Suponha que
n  20 e m  20
 */
package Aula_02_Vetores;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.exibeVetorTam;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_08_Inters_Uniao.Inters2Vetores;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_09_Intercalacao {

    public static void main(String[] args) {

        int n1 = leInteiroPositivo();// define a dimensão
        int v1[] = leVetorAleatorio(n1);// gera valores aleatorios
        exibeVetor(v1); //
        bubbleSort(v1);
        exibeVetor(v1);

        int n2 = leInteiroPositivo();
        int v2[] = leVetorAleatorio(n1);
        exibeVetor(v2);
        bubbleSort(v2);
        exibeVetor(v2);

        int intercala[] = new int[v1.length + v2.length];
        intercala2Vetores(v1, v2, intercala);
        exibeVetor(intercala);

    }

    private static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++)//primeiro laço (n-1)vezes
        {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) { //troca
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }

    }

    public static void intercala2Vetores(int[] v1, int[] v2, int[] intercala) {
        //intercalação metodo interativo e estatico
        int i = 0, j = 0, k = 0;
        //enquanto houver elementos em um dos vetores
        //vai comparando e copiando para o resultante
        while (i < v1.length && j < v2.length) {
            if (v1[i] < v2[j]) {
                intercala[k] = v1[i];
                i++;
                k++;
            } else {
                intercala[k] = v2[j];
                j++;
                k++;

            }

        }
        //analiza a sobra em v1
        while (i < v1.length) {
            intercala[k] = v1[i];
            i++;
            k++;
        }
        //analiza a sobra em v2
        while (j < v2.length) {
            intercala[k] = v2[j];
            i++;
            k++;
        }
    }
}
