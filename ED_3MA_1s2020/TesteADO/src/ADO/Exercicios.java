/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

/**
 *
 * @author EdUaRdO
 */
public class Exercicios {
    public static void main(String[] args) {

        ListaEncadeada listaA = new ListaEncadeada();
        ListaEncadeada listaB = new ListaEncadeada();
        ListaEncadeada listaIntercalada = new ListaEncadeada();
        ListaEncadeada listaUniao = new ListaEncadeada();
        ListaEncadeada listaInterseccao = new ListaEncadeada();
        // inserindo listaA
        listaA.inserirFinal(1);
        listaA.inserirFinal(2);
        listaA.inserirFinal(3);
        listaA.inserirFinal(5);
        listaA.inserirFinal(7);
        listaA.inserirFinal(9);
        // inserindo listaB
        listaB.inserirFinal(2);
        listaB.inserirFinal(4);
        listaB.inserirFinal(6);
        listaB.inserirFinal(8);
        System.out.println("Lista A: " + listaA);
        System.out.println("Lista B: " + listaB);
        listaIntercalada = intercalar(listaA, listaB);
        System.out.println("Lista intercalada: " + listaIntercalada);
        listaUniao = uniao(listaA, listaB);
        System.out.println("União: " + listaUniao);
        listaInterseccao = interseccao(listaA, listaB);
        System.out.println("Interseccao: " + listaInterseccao);
    }

    public static ListaEncadeada interseccao(ListaEncadeada listaA, ListaEncadeada listaB) {

        ListaEncadeada listaC = new ListaEncadeada();
        No atualA = listaA.getIni();
        No atualB = listaB.getIni();

        while (atualA != null) {

            //Verificamos se na lista B existe o elemento da lista A
            // Se sim adicionamos e vamos a próxima comapração
            if (listaB.buscaLinearIterativa(atualA.getElemento())) {
                listaC.inserirFinal(atualA.getElemento());
            }
            atualA = atualA.getProximo();
        }

        return listaC;
    }

    public static ListaEncadeada uniao(ListaEncadeada listaA, ListaEncadeada listaB) {

        ListaEncadeada listaC = new ListaEncadeada();
        No atualA = listaA.getIni();
        No atualB = listaB.getIni();

        //Preenchemos a listaC com os elementos da lista A
        while (atualA != null) {
            listaC.inserirFinal(atualA.getElemento());
            atualA = atualA.getProximo();
        }

        //Preencheremso a listaC com os elementos da lista B
        while (atualB != null) {
            No atualC = listaC.getIni();

            //Verificamos se na lista C já existe o elemento a ser inserido vindo da lista B com busca linear
            // Se if == false inserimos, se não pulamos ao próximo nó
            if (listaC.buscaLinearIterativa(atualB.getElemento()) == false) {
                listaC.inserirFinal(atualB.getElemento());
            }
            atualB = atualB.getProximo();
        }

        return listaC;
    }

    public static ListaEncadeada intercalar(ListaEncadeada listaA, ListaEncadeada listaB) {

        ListaEncadeada listaC = new ListaEncadeada();
        No atualA = listaA.getIni();
        No atualB = listaB.getIni();

        while (atualA != null && atualB != null) {
            // Se o elemento da lista a for maior que o da lsita B adicionamos na lista C
            if (atualA.getElemento() < atualB.getElemento()) {
                listaC.inserirFinal(atualA.getElemento());

                // Caso não haja mais nós na lista A preenchemos a lista C com o restante da lista B
                if (atualA.getProximo() == null) {
                    while (atualB != null) {
                        listaC.inserirFinal(atualB.getElemento());
                        atualB = atualB.getProximo();
                    }
                } else {
                    atualA = atualA.getProximo();
                }

            } else {
                listaC.inserirFinal(atualB.getElemento());

                // Caso não haja mais nós na lista B preenchemos a lista C com o restante da lista A
                if (atualB.getProximo() == null) {
                    while (atualA != null) {
                        listaC.inserirFinal(atualA.getElemento());
                        atualA = atualA.getProximo();
                    }
                } else {
                    atualB = atualB.getProximo();
                }
            }
        }

        return listaC;
    }
}
