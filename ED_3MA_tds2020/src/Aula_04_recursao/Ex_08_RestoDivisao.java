/*
08) Implemente uma função recursiva para calcular o resto da divisão
    inteira de X por Y, supondo X e Y números inteiros.
 */
package Aula_04_recursao;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_08_RestoDivisao {
    public static void main(String[] args) {
        int x=leInteiroPositivo();
        int y=leInteiroPositivo();
        System.out.printf("Resto da divisão: %d %% %d =",x,y);
        System.out.println(restodivisao(x,y));
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
