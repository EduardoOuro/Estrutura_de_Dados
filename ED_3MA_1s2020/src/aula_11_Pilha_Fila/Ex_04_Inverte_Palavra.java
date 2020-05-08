/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_11_Pilha_Fila;


import aula_10_Pilha.Pilha;
import java.util.Scanner;

/**
 *
 * @author EdUaRdO
 */
public class Ex_04_Inverte_Palavra {
    public static void main(String[] args) throws Exception {
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um texto (final com .): ");
        String texto = entrada.nextLine();
        System.out.println("O texto com letras inertidas: ");
        System.out.println(inverteLetras(texto));
    }   

    private static String inverteLetras(String texto) throws Exception {
        Pilha p=new Pilha();
        String inv="";
        
        for (int i = 0; i < texto.length(); i++) {
            char caracter =texto.charAt(i);
            
            if(caracter== ' '|| caracter =='.'){
                while (!p.vazia()){
                    inv= inv + p.pop();
                }
                inv = inv + caracter;//Insere o caracter de espaço ou ponto
            }else{
                p.push(caracter);
            }
        }
        return inv;
    }
}
