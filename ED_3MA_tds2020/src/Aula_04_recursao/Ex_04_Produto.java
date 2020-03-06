/*
 04) Escreva uma função recursiva que calcula o produto de a * b, em
que a e b são inteiros maiores que zero. considere que o produto pode
ser definido como a somado a si mesmo b vezes, usando uma definição
recursiva temos
a * b = a se b = 1
a * b = a * ( b – 1 ) + a se b > 1
 */
package Aula_04_recursao;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_04_Produto {
    public static void main(String[] args) {
        int a=leInteiroPositivo();
        int b=leInteiroPositivo();
        System.out.println(produto2Numeros(a,b));
    }

    public static int produto2Numeros(int a, int b) {
        if(b==1)
            return a;
        return a+produto2Numeros(a,b-1);
    }
    
}
