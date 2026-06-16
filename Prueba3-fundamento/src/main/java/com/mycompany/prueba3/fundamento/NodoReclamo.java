public class NodoReclamo {
    private Reclamo reclamo;
    private NodoReclamo izquierdo;
    private NodoReclamo derecho;

    public NodoReclamo(Reclamo reclamo) {
        this.reclamo = reclamo;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Reclamo getReclamo() {
        return reclamo;
    }

    public NodoReclamo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoReclamo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoReclamo getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoReclamo derecho) {
        this.derecho = derecho;
    }
}