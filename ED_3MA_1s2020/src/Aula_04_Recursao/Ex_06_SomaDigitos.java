/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Recursao;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author ANA.CSANTOS119
 */
public class Ex_06_SomaDigitos {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        System.out.println("Soma dígitos iterativa: ");
        System.out.println(somaDigitosIt(n));
        System.out.println("Soma dígitos recursiva: ");
        System.out.println(somaDigitosR(n));  
    }

    public static int somaDigitosIt(int n) {
        int cont=0;
        while (n>0){
            int resto=n%10;
            cont=cont+resto;
            n=n/10; //atualização
        }
        return cont;
    }
    public static int somaDigitosR(int n) {
        if (n<10) 
            return n;
        return n%10 + somaDigitosR(n/10);
    }
}
