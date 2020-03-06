/*
7. Escreva uma função que recebe um vetor V de n números inteiros e um elemento
chave x e faz a busca do elemento no vetor. A função retorna a posição que
encontrou ou -1 se não encontrou.
 */
package Aula_02_Vetores;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_07_BuscaLinear {

    public static void main(String[] args) {
        int n = leInteiroPositivo();//ler dimensão
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("\n Digite o numero que deseja buscar");
        int x = leInteiroPositivo();
        int pos = buscaLinear(v, x);
        if (pos == -1) {
            System.out.printf("%d Não esta no vetor.", x);
        } else {
            System.out.printf("está na posição %d do vetor", x);
        }

    }

    public static int buscaLinear(int[] v, int x) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;

    }

}
