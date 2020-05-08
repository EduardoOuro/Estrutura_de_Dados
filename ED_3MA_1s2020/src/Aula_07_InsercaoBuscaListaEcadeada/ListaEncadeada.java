package Aula_07_InsercaoBuscaListaEcadeada;

import Aula_06_Intr_ListaEncadeada.No;

public class ListaEncadeada {

    private No ini;

    //Criar uma lista vazia
    public ListaEncadeada() {
        this.ini = null;
    }

    //verificar se alista esta vazia
    public boolean vazia() {
        return ini == null;
    }

    //insere no inicio
    public void insereInicio(int elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }

    public void insereFinal(int elemento) {
        //inserir no final
        No novo = new No(elemento, null);
        No temp = ini;

        if (vazia()) {    //temp=null
            //ListaVazia
            ini = novo;
        } else {
            //percorrer prar chegar ao final para inserir

            while (temp.getProx() != null) {
                temp = temp.getProx();
            }
            temp.setProx(novo);
        }

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

    public void insereOrdenado(int elemento) {
        No novo = new No(elemento, ini);
        No temp = ini;
        No anterior = null;
        while (temp != null && temp.getElemento() < novo.getElemento()) {
            anterior = temp;
            temp = temp.getProx();
        }
        if (anterior == null) {    //temp=null
            //ListaVazia
            ini = novo;
        } else {
            novo.setProx(temp);
            anterior.setProx(novo);
        }
    }

    public void insereOrdenadoR(int elemento) {
        insereOrdenadoR(null, ini, elemento);
    }

    public void insereOrdenadoR(No anterior, No temp, int elemento){
        //Caso 1: Lista vazia
        if(temp==null){
             No novo = new No(elemento,ini);
            ini=novo;
        } else {
            No novo = new No(elemento,null);
            //Caso 2: Inserir entre dois nÃ³s
            if(anterior!=null && temp.getElemento()>novo.getElemento()){
                novo.setProx(temp);
                anterior.setProx(novo);
            } else {
                //Caso 3: Inserir no final
                if(anterior.getProx()==null){
                    anterior.setProx(novo);
                } else {   
                       //Caso 4: Inserir no inÃ­cio
                       if(anterior==null && temp.getElemento()>
                                                      novo.getElemento()){
                            novo.setProx(ini);
                            ini=novo;
                        } else {
                            insereOrdenadoR(temp,temp.getProx(),elemento);
                        }
                    }
                }
            }
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

    public No buscaLinearIt2(int x) {//retorna a lista encadeada
        No temp = ini;

        while (temp != null) {
            if (temp.getElemento() == x) {
                return temp;
            }
            temp = temp.getProx();
        }
        return null;
    }

    public boolean buscaLinearR(int x) {
        return buscaLinearR(ini, x);
    }

    public boolean buscaLinearR(No temp, int x) {
        if (temp == null) {
            return false;
        }
        if (temp.getElemento() == x) {
            return true;
        }

        return buscaLinearR(temp.getProx(), x);
    }

    public No buscaLinearR2(int x) {
        return buscaLinearR2(ini, x);
    }

    public No buscaLinearR2(No temp, int x) {
        if (temp == null || temp.getElemento() == x) {
            return temp;
        }

        return buscaLinearR2(temp.getProx(), x);
    }
    public void removeInicio(No temp){
        //verificar se a lista esta vazia
        if(vazia()){
            System.out.println("Lista Vazia");
        }else{
            //Existe ao menos um No
            ini=ini.getProx();
        }
    }
     public void removeFinal(){
       if(vazia()){
           System.out.println("lista vazia");
       }else{
           No temp=ini;
           No anterior =null;
           
           while (temp.getProx()==null){
               anterior=temp;
               temp=temp.getProx();
           }
           //se a lista tem apenas um só
           if (anterior==null){
               ini=null;
           }else{
               anterior.setProx(null);
           }
       }
   }
   public void removeOrdenado(int elemento){
          if(vazia()){
           System.out.println("lista vazia");
       }else{
           No temp=ini;
           No anterior =null;
           
           while(temp !=null && temp.getElemento()!=elemento){
               anterior=temp;
               temp=temp.getProx();
               //se a lista tem apenas um nó
              if(anterior==null){
                  ini=ini.getProx();//1.remove o inicio
              }else{
                  if(temp !=null && temp.getElemento()==elemento){
                      anterior.setProx(temp.getProx());
                  }else{
                      System.out.println(elemento + "não esta na lista");
                  }
              } 
           }
          }   
   }
   public int quantidadeNo(){
      No temp =ini;
      int cont=0;
      while(temp != null){
          temp=temp.getProx();
          cont++;
      }
      return cont;
   }
}

