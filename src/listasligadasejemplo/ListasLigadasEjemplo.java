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
public class ListasLigadasEjemplo {

    
        
        
    public static void main(String[] args) {
        
        ListaLigada<String> lista = new ListaLigada<>();
        
        lista.mostrarLista();
        lista.insertaInicio("1");
        lista.insertaInicio("2");
        lista.insertaInicio("3");
        lista.mostrarLista();
        lista.invierteLista().mostrarLista();
        
        
        
    }
    
    
  
    
}
