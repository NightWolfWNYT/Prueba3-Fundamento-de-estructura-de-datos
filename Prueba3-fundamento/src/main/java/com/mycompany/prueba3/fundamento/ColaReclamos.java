import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class ColaReclamos {
    private Queue<Reclamo> cola;

    public ColaReclamos() {
        cola = new LinkedList<>();
    }

    public void registrarReclamo(Reclamo reclamo) {
        cola.add(reclamo);
        System.out.println("Reclamo registrado correctamente en la cola de espera.");
    }

    public Reclamo buscarReclamoPorNombre(String nombre) {
        for (Reclamo reclamo : cola) {
            if (reclamo.getNombre().equalsIgnoreCase(nombre)) {
                return reclamo;
            }
        }
        return null;
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public void mostrarReclamos() {
        if (cola.isEmpty()) {
            System.out.println("No hay reclamos registrados en la cola de espera.");
        } else {
            System.out.println("Reclamos en espera:");
            for (Reclamo reclamo : cola) {
                System.out.println(reclamo);
            }
        }
    }
}