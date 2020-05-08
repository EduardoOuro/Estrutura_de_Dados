
package Ado4_Exercicios_10_11_12;


public class TestaLista {
    public static void main(String[] args) {
        ListaEncadeada lstA =new ListaEncadeada();
        ListaEncadeada lstB =new ListaEncadeada();
        ListaEncadeada lstIntercala =new ListaEncadeada();
        ListaEncadeada lstUniao =new ListaEncadeada();
        ListaEncadeada lstInterseccao =new ListaEncadeada();
         
          //inserindo na lista encadeada A  
          lstA.insereOrdenadoR(1);
          lstA.insereOrdenadoR(12);
          lstA.insereOrdenadoR(14);
          lstA.insereOrdenadoR(21);
          lstA.insereOrdenadoR(41);
          lstA.insereOrdenadoR(56);
          lstA.insereOrdenadoR(57);
          lstA.insereOrdenadoR(85);
          lstA.insereOrdenadoR(103);
          System.out.println("lista encadeada A");
          System.out.println(lstA);
          
          //inserindo na lista encadeada B
          lstB.insereOrdenadoR(10);
          lstB.insereOrdenadoR(57);
          lstB.insereOrdenadoR(85);
          lstB.insereOrdenadoR(115);
          System.out.println("lista encadeada B");
          System.out.println(lstB);
          
          System.out.println("listaIntercalada");
          lstIntercala.intercalaListas(lstA,lstB,lstIntercala);//passando 3 parametros para voltar 1
          System.out.println(lstIntercala);//imprimindo o parametro da volta
          
          System.out.println("Lista Uniao");
          lstUniao.uniaoListaEncadeada(lstA,lstB,lstUniao);
          System.out.println(lstUniao);
          
          System.out.println("Lista Interseccao");
          lstInterseccao.interseccaoListaEncadeada(lstA,lstB,lstInterseccao);
          System.out.println(lstInterseccao);
          
        
          
          
          
    }
}
