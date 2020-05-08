/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import java.util.Scanner;

/**
 *
 * @author ana.csantos119
 */
public class Ex_04_Inverter {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        //int v[]=leVetor(n);
        int v[]=leVetorAleatorio(n);
        exibeVetor(v);
        inverterVetor(v);
        exibeVetor(v);
        //exibeVetorTam(v,n);
    }

    public static int leInteiroPositivo() {
        Scanner sc = new Scanner(System.in);
        int n;
       do {
           System.out.print("Digite um inteiro e positivo:");
           n=sc.nextInt();
       }while(n<=0 || n>100000);
       return n;
    }

    public static int[] leVetor(int n) {
        Scanner sc = new Scanner(System.in);
        int v[]=new int[n];
        for (int i=0;i<v.length;i++){
            System.out.printf("v[%d]= ",i);
            v[i]= sc.nextInt();
        }
        return v;
    }
    public static int[] leVetorAleatorio(int n) {
        int v[]=new int[n];
        for (int i=0;i<v.length;i++){
            v[i]= (int)(Math.random()*50);
        }
        return v;
    }

    public static void exibeVetor(int[] v) {
        for (int i=0; i<v.length;i++){
            System.out.print(v[i]+" ");
        }
        System.out.println();
    }

    public static void exibeVetorTam(int[] v, int n) {
      for (int i=0; i<n;i++){
            System.out.print(v[i]+" ");
        }
        System.out.println();
    }

    public static void inverterVetor(int[] v) {
        int ini=0;
        int fim=v.length-1;
        while (ini<fim){
            //Trocar
            int aux=v[ini];
            v[ini]=v[fim];
            v[fim]=aux;
            ini++;
            fim--;
        }
    }
}
