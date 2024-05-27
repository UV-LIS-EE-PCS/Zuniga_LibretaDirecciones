package act2;

public class ClienteCorporativo extends Cliente {
    private String cuenta;

    public ClienteCorporativo(String nombre, String cuenta) {
        super(nombre);
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }
}
