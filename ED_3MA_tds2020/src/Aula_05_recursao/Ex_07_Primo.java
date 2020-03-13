/*
 07) Implemente uma função recursiva para verificar se um determinado
     número natural, maior ou igual a 2, é primo.
 */
package Aula_05_recursao;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_04_recursao.Ex_04_Produto.produto2Numeros;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_07_Primo {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        System.out.println("Versão Iterativa: ");
        System.out.println(ehPrimoIt(n));
        System.out.println("Versão Recursiva: ");
        System.out.println(ehPrimoR(n));
    }

    public static boolean ehPrimoIt(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {//tem divisores no (2,n-1)
                return false;
            }
        }
        return true;
    }

    public static boolean ehPrimoR(int n) {
        return ehPrimoR(n, n - 1);

    }

    public static boolean ehPrimoR(int n, int i) {
        if(i==1)
            return true;
        if (n % i == 0) //tem divisores no (2,n-1)
            return false;
        
        return ehPrimoR(n,i-1);

    }

}
