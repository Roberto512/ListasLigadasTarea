package listasligadasejemplo;

/**
 *
 * @author Alumnos
 * @param <T>
 */
public class ListaLigada<T> {

    //inicio de la lista
    private Nodo<T> p = null;

    public void mostrarLista() {
        //variable auxiliar
        Nodo<T> q = p;
        // ciclo para recorrer la lista
        while (q != null) {
            System.out.println(q.getValor());
            q = q.getLiga();
        }
    }

    public void insertaInicio(T obj) {
        Nodo<T> t = new Nodo<>();
        t.setValor(obj);
        t.setLiga(p);
        p = t;
    }

    public void insertaFinal(T obj) {
        Nodo<T> q = p; //el nodo auxiliar
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

    public ListaLigada<T> invierteLista() {
        //variable auxiliar
        Nodo<T> q = p;
        ListaLigada<T> lista02 = new ListaLigada<>();

        // ciclo para recorrer la lista
        while (q != null) {
            lista02.insertaInicio(q.getValor());
            q = q.getLiga();
        }
        return lista02;

    }

    public boolean buscar(T dato) {
        //variable auxiliar
        boolean resultado = false;
        Nodo<T> q = p;
        // ciclo para recorrer la lista
        while (q != null) {
            if (q.getValor().equals(dato)) {
                resultado = true;
            }
            q = q.getLiga();
        }
        return resultado;
    }

    public void insertaAntesDeX(T obj, T dato) {
        boolean ban = false;
        Nodo<T> t = new Nodo<>(dato);
        Nodo<T> s = new Nodo<>();
        Nodo<T> q = p;
        while ((!q.getValor().equals(obj)) && (!ban)) {
            if (q.getLiga() != null) {
                s = q;
                q = q.getLiga();
            } else {
                ban = true;
            }
        }
        if (!ban) {
            if (p == q) {
                t.setLiga(p);
                p = t;
            } else {
                s.setLiga(t);
                t.setLiga(q);
            }
        } else {
            System.out.println("No lo encontro");
        }
    }

    public void insertaDespuesDeX(T obj, T dato) {
        boolean ban = false;
        Nodo<T> t = new Nodo<>(dato);
        Nodo<T> s;
        Nodo<T> q = p;
        while ((q != null) && (!ban)) {
            if (q.getValor().equals(obj)) {
                ban = true;
            } else {
                q = q.getLiga();
            }
        }
        if (ban) {
            if (q.getLiga() != null) {
                s = q.getLiga();
                q.setLiga(t);
                t.setLiga(s);
            } else {
                q.setLiga(t);
                t.setLiga(null);
            }
        }
    }

    public void dividir(Integer num) {
        int cont = 0;
        Nodo<T> q = p;
        while (q != null) {
            q = q.getLiga();
            cont++;
        }
        q = p;
        int primeraParte = cont - cont / 2;
        cont = 0;
        if (num == 1) {
            while (cont != primeraParte) {
                System.out.println(q.getValor());
                q = q.getLiga();
                cont++;
            }
        } else {
            while (cont != primeraParte) {
                q = q.getLiga();
                cont++;
            }
            while (q != null) {
                System.out.println(q.getValor());
                q = q.getLiga();
            }
        }
    }

    public void eliminarDuplicados() {
        Nodo<T> q = p;
        Nodo<T> r;
        Nodo<T> s = q;
        boolean ban;
        while (q != null && s.getLiga() != null) {
            ban = false;
            r = q;
            s = q.getLiga();
            while (s.getValor() != q.getValor() && !ban) {
                if (s.getLiga() != null) {
                    r = s;
                    s = s.getLiga();
                } else {
                    ban = true;
                }
            }
            if (!ban) {
                if (s.getLiga() != null) {
                    s = s.getLiga();
                    r.setLiga(s);
                } else {
                    r.setLiga(null);
                }
            }
            q = q.getLiga();
        }
    }
}
