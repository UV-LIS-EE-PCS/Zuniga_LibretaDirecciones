package act2;

public class Pedido {
    private int precio;
    private String fecha;

    public Pedido(String fecha, int precio) {
        this.fecha = fecha;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fecha;
    }
}
