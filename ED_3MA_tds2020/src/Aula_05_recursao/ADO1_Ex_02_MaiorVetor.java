/*
 2.     Escreva uma função que recebe por parâmetro um vetor de números inteiros e 
        retorna o índice em que se encontra o maior elemento do vetor.
 */
package Aula_05_recursao;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author luis.eoconrado
 */
public class ADO1_Ex_02_MaiorVetor {
    public static void main(String[] args) {
        
        int n=leInteiroPositivo();
        int v[]=leVetorAleatorio(n);
        exibeVetor(v);
        System.out.printf("O maior Elemento esta na posição: %d \n",iMaiorVetor(v));
        System.out.printf("O maior Elemento é: %d",v[iMaiorVetor(v)]);

    }

    private static int iMaiorVetor(int[] v) {
        int iMaior=0;
        for (int i = 1; i < v.length; i++) {
            if (v[i]>v[iMaior]){
                iMaior=i;
            }
                      
        }
        return iMaior;
    }
    
    
}
