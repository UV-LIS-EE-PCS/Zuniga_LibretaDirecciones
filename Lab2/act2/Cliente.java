package act2;

public class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    protected void pagar(Pedido pedido) {
        System.out.println(nombre + " ha pagado " + pedido.getPrecio() + " por el pedido realizado en " + pedido.getFecha());
    }

    public String getNombre() {
        return nombre;
    }
}
