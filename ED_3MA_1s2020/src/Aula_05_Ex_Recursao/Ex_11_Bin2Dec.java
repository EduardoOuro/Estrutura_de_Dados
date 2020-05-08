/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Ex_Recursao;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;


/**
 *
 * @author ana.csantos119
 */
public class Ex_11_Bin2Dec {
    public static void main(String[] args) {
        int decimal=leInteiroPositivo();
        System.out.println("Versão iterativa: ");
        System.out.println(bin2DecIt(decimal));
        System.out.println("Versão recursiva: ");
        System.out.println(bin2DecR(decimal));  
    }

    public static int bin2DecIt(int binario) {
      int decimal=0;
      int cont=0;
      while(binario>0){
          int resto=binario%10;
          decimal+= resto*(int)Math.pow(2,cont);
          binario=binario/10; //atualização
          cont++;
      }
      return decimal;
    }
    public static int bin2DecR(int binario) {
      if(binario<10)
          return binario;
   
      return (binario%10) + 2*bin2DecR(binario/10);
    }
}
