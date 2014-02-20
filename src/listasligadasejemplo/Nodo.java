/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasligadasejemplo;

/**
 *
 * @author Alumnos
 */
public class Nodo<T> {
    //valor
    private T valor;
    //liga
    private Nodo liga;

    /**
     * @return the valor
     */
    public T getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(T valor) {
        this.valor = valor;
    }

    /**
     * @return the liga
     */
    public Nodo getLiga() {
        return liga;
    }

    /**
     * @param liga the liga to set
     */
    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
}
