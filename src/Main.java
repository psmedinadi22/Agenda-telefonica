import java.util.ArrayList;
import java.util.Scanner;

class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contacto contacto = (Contacto) obj;
        return nombre.equals(contacto.nombre);
    }
}

class Agenda {
    private ArrayList<Contacto> contactos;
    private int capacidad;

    public Agenda() {
        this(10);
    }

    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        contactos = new ArrayList<>(capacidad);
    }

    public void añadirContacto(Contacto c) {
        if (!agendaLlena() && !existeContacto(c)) {
            contactos.add(c);
            System.out.println("Contacto añadido correctamente.");
        } else {
            System.out.println("No se puede añadir el contacto.");
        }
    }

    public boolean existeContacto(Contacto c) {
        return contactos.contains(c);
    }

    public void listarContactos() {
        for (Contacto c : contactos) {
            System.out.println("Nombre: " + c.getNombre() + ", Teléfono: " + c.getTelefono());
        }
    }

    public void buscarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equals(nombre)) {
                System.out.println("Teléfono de " + nombre + ": " + c.getTelefono());
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    public void eliminarContacto(Contacto c) {
        if (contactos.remove(c)) {
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("El contacto no existe en la agenda.");
        }
    }

    public boolean agendaLlena() {
        return contactos.size() >= capacidad;
    }

    public int espaciosLibres() {
        return capacidad - contactos.size();
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la Agenda Telefonica");
        System.out.print("¿Desea definir la capacidad de la agenda? (s/n): ");
        String respuesta = scanner.nextLine();
        int capacidad = 10; // Capacidad por defecto

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Ingrese la capacidad deseada para la agenda: ");
            capacidad = scanner.nextInt();
            scanner.nextLine();
        }

        Agenda agenda = new Agenda(capacidad);

        int opcion;
        do {
            System.out.println("\nMenú de Agenda Telefónica:");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Listar contactos");
            System.out.println("5. Espacios libres");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono);
                    agenda.añadirContacto(nuevoContacto);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    agenda.buscarContacto(nombreBuscar);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    Contacto contactoEliminar = new Contacto(nombreEliminar, "");
                    agenda.eliminarContacto(contactoEliminar);
                    break;
                case 4:
                    System.out.println("Lista de contactos:");
                    agenda.listarContactos();
                    break;
                case 5:
                    System.out.println("Espacios libres: " + agenda.espaciosLibres());
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}

