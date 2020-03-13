/*
 10) Implemente uma função iterativa e outra função recursiva que
receba um número inteiro positivo na base decimal e o converta para a
base binária.
 */
package Aula_05_recursao;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_10_Dec2Bin {
     public static void main(String[] args) {
        int decimal = leInteiroPositivo();
        System.out.println("Versão Iterativa: ");
        System.out.println(dec2BinIt(decimal));
        System.out.println("Versão Recursiva: ");
        System.out.println(dec2BinR(decimal));
    }

    public static int dec2BinIt(int decimal) {
        int binario=0;
        int cont=0;
        while(decimal>0){
            int resto=decimal%2;
            binario+=resto*(int)Math.pow(10,cont);
            decimal=decimal/2;
            cont++;
        }
        return binario;
    }

    public static int dec2BinR(int decimal) {
        
        if(decimal<2)
            return decimal;
        
        return (decimal%2)+ 10*dec2BinR(decimal/2);
        
    }
    
}
