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
public class ListaEncadeada {
    private No ini;

    //Construtor -- Criar lista vazia
    public ListaEncadeada() {

        this.ini = null;

    }

    public boolean eVazia() {
        return (this.ini == null);
    }

    //Método inserir no firstcio
    public void inserirInicio(int elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }

    //Metodo inserir no final
    public void inserirFinal(int elemento) {
        No novo = new No(elemento, null);
        No temp = ini;

        if (eVazia()) {
            ini = novo;
        } else {
            //Percorrer até chegar no ultimo Nó
            while (temp.getProximo() != null) {
                temp = temp.getProximo();
            }
            temp.setProximo(novo);
        }

    }

    // busca linear
    public boolean buscaLinearIterativa(int val) {

        No temp = ini;

        while (temp != null) {
            if (temp.getElemento() == val) {
                return true;
            }
            temp = temp.getProximo();
        }
        return false;
    }

    public No buscaLinearIterativav2(int val) {
        No temp = ini;

        while (temp != null) {
            if (temp.getElemento() == val) {
                return temp;
            }
            temp = temp.getProximo();
        }
        return null;
    }

    //Remover o primeiro
    public void removeInicio() {

        if (eVazia()) {
            System.out.println("A lista é vazia!");
        } else {
            ini = ini.getProximo();
        }

    }

    //Remoção do final
    public void removerFinal() {

        if (eVazia()) {
            System.out.println("A lista é vazia!");
        } else {

            No temp = ini;
            No anterior = null;

            while (temp.getProximo() != null) {
                anterior = temp;
                temp = temp.getProximo();
            }
            //Se a lista tem apenas um nó
            if (anterior == null) {
                ini = null; //tornar a lista vazia
            } else {
                anterior.setProximo(null);
            }

        }
    }

    public int contaNos() {
        No temp = ini;
        int cont = 0;

        while (temp != null) {
            temp = temp.getProximo();
            cont++;
        }
        return cont;

    }

    @Override
    public String toString() {

        String strLista = "";
        No temp = ini;

        while (temp != null) {
            strLista = strLista + temp.getElemento() + " ";
            temp = temp.getProximo();
        }
        return strLista;
    }

    public No getIni() {
        return ini;
    }

    public void setIni(No first) {
        this.ini = first;
    }
}
