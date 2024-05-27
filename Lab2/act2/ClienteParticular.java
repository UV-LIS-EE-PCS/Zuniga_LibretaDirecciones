package act2;

public class ClienteParticular extends Cliente {
    private String tarjeta;

    public ClienteParticular(String nombre, String tarjeta) {
        super(nombre);
        this.tarjeta = tarjeta;
    }

    public String getTarjeta() {
        return tarjeta;
    }
}
