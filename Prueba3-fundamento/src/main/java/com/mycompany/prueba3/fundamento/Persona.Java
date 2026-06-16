public class Persona {
    private int rut;
    private String nombre;
    private Reclamo reclamo;

    public Persona(int rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
        this.reclamo = null;
    }

    public int getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public Reclamo getReclamo() {
        return reclamo;
    }

    public void setReclamo(Reclamo reclamo) {
        this.reclamo = reclamo;
    }

    @Override
    public String toString() {
        String nombreReclamo = (reclamo != null)
                ? reclamo.getNombre() 
                : "Sin reclamo asignado";

        return "RUT: " + rut
                + " | Nombre: " + nombre
                + " | Reclamo: " + nombreReclamo;
    }
}