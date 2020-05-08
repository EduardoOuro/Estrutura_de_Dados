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
public class Ex_05_Potencia {
    public static void main(String[] args) {
        int base=leInteiroPositivo();
        int exp=leInteiroPositivo();
        System.out.println(potencia(base,exp));
    }

    public static int potencia(int base, int exp) {
        if(exp==1)
            return base;
        return base* potencia(base,exp-1);
    }
}
