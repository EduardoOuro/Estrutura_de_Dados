/*
4. Escreva uma função que recebe um vetor V de n números inteiros e inverte a
ordem dos elementos do vetor no mesmo vetor.
Exemplo:
V = { 4, 9, 10, 8, 6} o vetor V invertido é {6, 8, 10, 9, 4}
 */
package Aula_02_Vetores;

import java.util.Scanner;


public class Ex_04_Inverter {
    public static void main(String[] args) {
        
        int n=leInteiroPositivo();
//        System.out.println(n);
        int v[];
        v=leVetor(n);
        exibeVetor(v);
        leVetorAleatorio(n);
        inverterVetor(v);
        exibeVetor(v);
        
//        exibeVetorTam(v,n);
        
        
    }
    
    
    

    public static int leInteiroPositivo() {
        Scanner input = new Scanner(System.in);
        int n;
       do{
           System.out.print("Digite um inteiro e positivo: ");
           n=input.nextInt();
       }while(n<=0 || n>100);
        return n;
    }

    public static int[] leVetor(int n) {
        Scanner input = new Scanner(System.in);
        int v[]=new int[n];
        for (int i = 0; i < v.length; i++) {
//            System.out.print("v["+i+"]= ");
            System.out.printf("v[%d]",i);// mesma coisa de cima
            v[i]=input.nextInt();
            
        }
        return v;
    }
    public static void exibeVetor(int[]v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+" ");
            
        }
        System.out.println();
    }

    public static void exibeVetorTam(int[] v, int n) {
        
        for (int i = 0; i < v.length; i++) {
//            System.out.print("v["+i+"]="+v[i]+" ");         
            System.out.print(v[i]+" ");         
        }
        System.out.println();
        
    }
    public static void inverterVetor(int[] v){
        int inicio=0;
        int fim=v.length-1;
        while(inicio<fim){
            //trocar
            int aux=v[inicio];
            v[inicio]=v[fim];
            v[fim]=aux;
            inicio++;
            fim--;
        }
        
        
    }
    public static int[] leVetorAleatorio(int n){
        int v[]=new int [n];
        for (int i = 0; i < v.length; i++) {
            v[i]=(int)(Math.random()*50);// gerador de numeros alternativos
        }
        return v;
    }
    

    
    
}
