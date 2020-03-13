/*
 11) Implemente uma função iterativa e outra função recursiva que
receba um número inteiro positivo na base binária e o converta para a
base decimal.
 */
package Aula_05_recursao;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_11_Bin2Dec {
    public static void main(String[] args) {
        int decimal = leInteiroPositivo();
        System.out.println("Versão Iterativa: ");
        System.out.println(bin2DecIt(decimal));
        System.out.println("Versão Recursiva: ");
        System.out.println(bin2DecR(decimal));
    }
    public static int bin2DecIt(int binario) {
        int decimal=0;
        int cont=0;
        while(binario>0){
            int resto=binario%2;
            decimal+=resto*(int)Math.pow(2,cont);
            binario=binario/10;
            cont++;
        }
        return decimal;
    }

    public static int bin2DecR(int binario) {
        
        if(binario<10)
            return binario;
        
        return (binario%10)+ 2*bin2DecR(binario/10);
        
    }
    
}
