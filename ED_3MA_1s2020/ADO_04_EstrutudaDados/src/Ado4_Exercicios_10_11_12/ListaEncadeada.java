package Ado4_Exercicios_10_11_12;

public class ListaEncadeada {

    private No ini;

    public boolean vazia() {
        return ini == null;
    }

    public boolean buscaLinearIt(int x) {
        No temp = ini;

        while (temp != null) {
            if (temp.getElemento() == x) {
                return true;
            }
            temp = temp.getProx();
        }
        return false;
    }

    public void insereInicio(int elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }

    public void insereFinalR(int elemento) {
        insereFinalR(ini, elemento);
    }

    public void insereFinalR(No temp, int elemento) {
        //lista vazia
        if (temp == null) {
            No novo = new No(elemento, ini);
            ini = novo;
        } else {
            //ja estou no ultimo No
            if (temp.getProx() == null) {
                No novo = new No(elemento, null);
                temp.setProx(novo);
            } else {
                insereFinalR(temp.getProx(), elemento);

            }
        }

    }

    public void insereOrdenadoR(int elemento) {
        insereOrdenadoR(ini, elemento);
    }

    public void insereOrdenadoR(No temp, int elemento) {
        //lista vazia ou inserir no inicio
        if (vazia() || ini.getElemento() > elemento) {
//            No novo =new No(elemento,ini);
//            ini=novo;
            insereInicio(elemento);
            return;
        }
        //inserir no final
        if (temp.getProx() == null) {
            No novo = new No(elemento, null);
            temp.setProx(novo);
            return;
        }
        //inserir entre dois NOS
        if (temp.getElemento() < elemento && temp.getElemento() >= elemento) {
            No novo = new No(elemento, ini);
            novo.setProx(temp.getProx());
            temp.setProx(novo);
            return;

        }
        insereOrdenadoR(temp.getProx(), elemento);
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;//temp é um contador

        while (temp != null) {
            strLista += temp.getElemento() + " ";
            temp = temp.getProx();
        }

        return strLista;
    }



    public ListaEncadeada intercalaListas(ListaEncadeada lstA, ListaEncadeada lstB,ListaEncadeada lstC) {

        No temp1 = lstA.ini;
        No temp2 = lstB.ini;

        while (temp1 != null && temp2 != null) {

            if (temp1.getElemento() < temp2.getElemento()) {
                lstC.insereFinalR(temp1.getElemento());

                if (temp1.getProx() == null) {
                    while (temp2 != null) {
                        lstC.insereFinalR(temp2.getElemento());
                        temp2 = temp2.getProx();
                    }
                } else {
                    temp1 = temp1.getProx();
                }

            } else {
                lstC.insereFinalR(temp2.getElemento());

                if (temp2.getProx() == null) {
                    while (temp1 != null) {
                        lstC.insereFinalR(temp1.getElemento());
                        temp1 = temp1.getProx();
                    }
                } else {
                    temp2 = temp2.getProx();
                }
            }
        }

        return lstC;
    }

    public ListaEncadeada uniaoListaEncadeada(ListaEncadeada lstA, ListaEncadeada lstB,ListaEncadeada lstC) {

        No temp1 = lstA.ini;
        No temp2 = lstB.ini;

        while (temp1 != null) {
            lstC.insereFinalR(temp1.getElemento());//insere na lista lstC elemntos de temp1
            temp1 = temp1.getProx();
        }

        while (temp2 != null) {
            if (lstC.buscaLinearIt(temp2.getElemento()) != true) {// ou == fasle
                lstC.insereFinalR(temp2.getElemento());
            }
            temp2 = temp2.getProx();
        }

        return lstC;
    }

    public ListaEncadeada interseccaoListaEncadeada(ListaEncadeada lstA, ListaEncadeada lstB, ListaEncadeada lstC) {

        No temp1 = lstA.ini;
        No temp2 = lstB.ini;
        

        while (temp1 != null) {

            if (lstB.buscaLinearIt(temp1.getElemento())) {
                lstC.insereFinalR(temp1.getElemento());
            }
            temp1 = temp1.getProx();
        }

        return lstC;
    }
}
