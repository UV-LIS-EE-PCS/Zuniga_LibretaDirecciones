package act3;

public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public boolean hacerTarea(Tarea tarea) {
        System.out.println(nombre + " está realizando la tarea: " + tarea.getNombre());
        return true;
    }
}
