
package listasligadasejemplo;

/**
 *
 * @author Alumnos
 * @param <T>
 */
public class ListaLigada<T> {
    
    //inicio de la lista
    private Nodo<T> p = null;
    
    public void mostrarLista(){
    //variable auxiliar
        Nodo<T> q = p;
        // ciclo para recorrer la lista
        while(q!=null){
            System.out.println(q.getValor());
            q=q.getLiga();
        }
    }
    
    public void insertaInicio(T obj){
        Nodo <T> t = new Nodo<>();
        t.setValor(obj);
        t.setLiga(p);
        p=t;
    }
    
    public void insertaFinal(T obj){
        Nodo<T> q= p; //el nodo auxiliar
        Nodo<T> t = new Nodo<>(); //el nuevo nodo a insertar
        t.setValor(obj);
        t.setLiga(null);
        
        if (p == null) {
            p = t;

        } else {
            while (q.getLiga() != null) {
                q = q.getLiga();
            }
            q.setLiga(t);//asignamos a la liga del ultimo elemento el ultimo elemento
        }
    }
    
    public ListaLigada<T> invierteLista(){
    //variable auxiliar
        Nodo<T> q = p;
        ListaLigada<T> lista02 = new ListaLigada<>();
        
        // ciclo para recorrer la lista
        while(q!=null){
            lista02.insertaInicio(q.getValor());
            q=q.getLiga();
        }
        return lista02;
        
    }
    

}
