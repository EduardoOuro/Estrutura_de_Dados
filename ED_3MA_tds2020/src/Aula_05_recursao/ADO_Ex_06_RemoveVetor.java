/*
6.     Escreva uma função que recebe um vetor V de n números inteiros e um elemento chave x 
        e remove o elemento dado no vetor, caso ele exista no vetor.
 */
package Aula_05_recursao;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.exibeVetorTam;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_07_BuscaLinear.buscaLinear;

/**
 *
 * @author luis.eoconrado
 */
public class ADO_Ex_06_RemoveVetor {
    public static void main(String[] args) {
        int v[]=new int[50];
        int n=leInteiroPositivo();
        for (int i = 0; i < n; i++) {
            v[i]=(int)(Math.random()*50);// gerador de numeros alternativos
        }
        exibeVetor(v);
        System.out.println("Remover um elemento no vetor");
        int x=leInteiroPositivo();
        
        removeVetor(v,n,x);
        exibeVetorTam(v,n+1);
        exibeVetor(v);
        
    }

    public static void removeVetor(int[] v,int n, int x) {
        int i;
        int pos=buscaLinear(v,x);
        for(i=pos;i<n;i++) {           
            v[i]=v[i+1];               
        }
        
    }
    
}
