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
public class No {
   

    private int elemento;
    private No proximo;

    public No(int elemento, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {

        return "No{ elemento -> " + elemento + ", próximo -> " + proximo + "}";

    }
}
