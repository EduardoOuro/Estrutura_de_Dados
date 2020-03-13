/*
5.     Escreva uma função que recebe um vetor V de n números inteiros,
        um elemento chave x e uma posição e insere o elemento na posição
        dada no vetor. 
 */
package Aula_05_recursao;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.exibeVetorTam;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author luis.eoconrado
 */
public class ADO1_Ex_05_InsereVetor {
    public static void main(String[] args) {
        int v[]=new int[50];
        int n=leInteiroPositivo();
        for (int i = 0; i < n; i++) {
            v[i]=(int)(Math.random()*50);// gerador de numeros alternativos
        }
        exibeVetor(v);
        System.out.println("Inserir um elemento no vetor");
        int x=leInteiroPositivo();
        System.out.printf("Qual posição inserir no vetor? [0,%d]\n",n-1);
        int pos=leInteiroPositivo();
        insereVetor(v,n,x,pos);
        exibeVetorTam(v,n+1);
        exibeVetor(v);
        
    }

    public static void insereVetor(int[] v,int n, int x, int pos) {
        int i;
        for(i=n;i>pos;i--) {           //for(i=n;i>pos;i--)  //(i = n-1; i >= pos; i--)*/
            v[i]=v[i-1];                //v[i]=v[i-1]        //v[i+1]=v[i];
        }
        v[pos]=x;
    }
}
