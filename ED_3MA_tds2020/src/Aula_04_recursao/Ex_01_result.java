/*
 01) Considere a seguinte função abaixo:

    public int result( int n ){
         if (n == 1)
             return 2;
         else
         return 2 * result(n - 1);
    }
    Qual será o valor retornado com a execução de result(5)?

 */
package Aula_04_recursao;

/**
 *
 * @author luis.eoconrado
 */
public class Ex_01_result {

    public static void main(String[] args) {
    }

    public int result(int n) {
        if (n == 1) 
            return 2;
        return 2 * result(n - 1);

    }

}
