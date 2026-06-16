package com.mycompany;

public class Consultamedica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    private static void mostrarMenu() {System.out.println("===== SISTEMA DE RECLAMOS =====");
    System.out.println("1. Registrar persona en cola de espera");
    System.out.println("2. Asignar reclamo a persona");
    System.out.println("3. Mostrar cola de personas");
    System.out.println("4. Mostrar reclamos");
    System.out.println("5. Finalizar");
    }

    private static void cargarEspecialidades(ArbolEspecialidades arbol) {
    arbol.insertar(new Reclamo());
    arbol.insertar(new Reclamo());
    arbol.insertar(new Reclamo());
   
    }
    private static void registrarPersona(Scanner teclado, ColaPersonas colaPersonas) {
    System.out.print("Ingrese RUT de la persona: ");
    int rut = leerEntero(teclado);

    teclado.nextLine();

    System.out.print("Ingrese nombre de la persona: ");
    String nombre = teclado.nextLine();

    Persona persona = new Persona(rut, nombre);
    colaPersonas.registrarPersona(persona);
    }
    

    
    
}
