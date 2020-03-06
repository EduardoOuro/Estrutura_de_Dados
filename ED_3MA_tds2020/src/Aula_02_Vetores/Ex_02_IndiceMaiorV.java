/*
 2. Escreva uma função que recebe por parâmetro um vetor de números inteiros e retorna
    o índice em que se encontra o maior elemento do vetor. A interface da função deve ser:

    public static int indiceMaiorVetor(int v[]);
 */
package Aula_02_Vetores;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_02_IndiceMaiorV {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        int iMaiorVetor=(indiceMaiorVetor(v));
        System.out.println("O maior valor está na posição: "+iMaiorVetor);
        
    }

    public static int indiceMaiorVetor(int[] v) {
        int maior =v[0];
        int pos=0;
        for (int i = 1; i < v.length; i++) {
            if(v[i]>maior){
                pos=i;
            }
        }
        return pos;
    }
    
}
