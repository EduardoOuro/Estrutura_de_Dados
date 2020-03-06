/*
06) Implemente uma função recursiva para calcular a soma dos dígitos
de um número inteiro e positivo.
 */
package Aula_04_recursao;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_06_SomaDigitos {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        System.out.println(" versão interativa "+somaDigitosIt(n));
        System.out.println(" versão recursiva "+somaDigitosR(n));
        
    }

    public static int somaDigitosR(int n) {
        if(n<10)
            return n;
        return (n%10)+somaDigitosR(n/10);
    }
    public static int somaDigitosIt(int n){
        int cont=0;
        while(n>0){
            int resto=n%10;
            cont += resto;
            n=n/10;
        }
        return cont;    
    }
         
}
