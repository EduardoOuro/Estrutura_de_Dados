/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_11_Pilha_Fila;

/**
 *
 * @author EdUaRdO
 */
public class Batata_Quente {
    public static void main(String[] args) throws Exception {
        Fila q =new Fila();
        
        q.enqueue("Felipe");
        q.enqueue("Gabriel");
        q.enqueue("Luciana");
        q.enqueue("Conrado");
        q.enqueue("Antonio");
        q.enqueue("Makoto");
        q.enqueue("Rapha");
        
        System.out.println(q);
        Object vencedor =batataQuente(q,3);
        System.out.println("O Vencedor = "+vencedor);
        
       
    }

    private static Object batataQuente(Fila q, int k) throws Exception {
            Fila filaTemp =q;
            
            while(filaTemp.size()>1){
                for (int i=0; i<k;i++){
                    filaTemp.enqueue(filaTemp.dequeue());
                }
                System.out.println("saindo: "+filaTemp.dequeue());
            }
            return filaTemp.dequeue();
    }
    
}
