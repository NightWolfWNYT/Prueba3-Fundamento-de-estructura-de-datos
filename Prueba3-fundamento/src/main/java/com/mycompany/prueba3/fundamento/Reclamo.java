public class Reclamo {
    private int vencimiento;
    private String nombre;

    public Reclamo(int vencimiento, String nombre) {
        this.vencimiento = vencimiento;
        this.nombre = nombre;
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return vencimiento + " - " + nombre;
    }
}