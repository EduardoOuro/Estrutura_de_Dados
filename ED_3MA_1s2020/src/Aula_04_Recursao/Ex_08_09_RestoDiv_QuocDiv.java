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
public class Ex_08_09_RestoDiv_QuocDiv {
    public static void main(String[] args) {
        int x=leInteiroPositivo();
        int y=leInteiroPositivo();
        System.out.printf("Resto da divisao: %d %% %d = ",x,y);
        System.out.print(restoDiv(x,y));
        System.out.println();
        System.out.printf("Quociente da divisão: %d / %d = ",x,y);
        System.out.print(quocDiv(x,y));

    }

    public static int restoDiv(int x, int y) {
        if (x<y)return x;
        return restoDiv(x-y,y);
    }
     public static int quocDiv(int x, int y) {
        if (x<y)return 0;
        return 1+quocDiv(x-y,y);
    }   
}
