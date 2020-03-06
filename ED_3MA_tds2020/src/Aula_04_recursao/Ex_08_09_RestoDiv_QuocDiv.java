/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_recursao;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_08_09_RestoDiv_QuocDiv {
    public static void main(String[] args) {
        
        int x=leInteiroPositivo();
        int y=leInteiroPositivo();
        System.out.printf("Resto da divisão: %d %% %d =",x,y);
        System.out.println(restodivisao(x,y));
        System.out.printf("Quociente da divisão: %d %% %d =",x,y);
        System.out.println(quocientedivisao(x,y));
    }
    public static int restodivisao(int x, int y) {
        if(x<y)
        return x;
        return restodivisao(x-y,y);
    }
    public static int quocientedivisao(int x, int y) {
      if(x<y)
        return 0;
        return 1+quocientedivisao(x-y,y);
    }
}
